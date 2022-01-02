package ATM_Package;

import java.util.Scanner;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;
import javax.swing.JButton;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.EtchedBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import javax.swing.border.SoftBevelBorder;
import javax.swing.UIManager;
import javax.swing.border.LineBorder;

public class ATM extends JFrame {

	public JFrame frame;
	private JPanel contentPanel;
	private JTextField txtDisplay;
	
	private JButton btnLoan, btnReceipt, btnReset, btnExit;
	private JButton btnBalance, btnDeposit, btnWithdrawal, btnArrowLoan;
	
	public String operation = "", displayBalance;
	double balance;
	double amountDeposit, amountWithdrawal, newBalance;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ATM window = new ATM();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ATM() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(0, 0, 533, 521);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 255));
		panel.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel.setBounds(10, 24, 119, 122);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(152, 251, 152));
		panel_1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_1.setBounds(139, 24, 231, 122);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(255, 255, 255));
		panel_2.setLayout(null);
		panel_2.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_2.setBounds(380, 24, 119, 122);
		frame.getContentPane().add(panel_2);
		
		final JButton btnBalance = new JButton("");
		btnBalance.setEnabled(false);
		btnBalance.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				operation = "Balance";
				
				displayBalance = String.format("%.2f", balance);
				
				txtDisplay.setText("");
				txtDisplay.setText("Balance: $" + displayBalance);
			}
		});
		btnBalance.setBackground(new Color(240, 240, 240));
		btnBalance.setIcon(new ImageIcon(ATM.class.getResource("/ATM_Package/lArrow.png")));
		btnBalance.setBounds(16, 4, 85, 50);
		panel.add(btnBalance);
		
		final JButton btnDeposit = new JButton("");
		btnDeposit.setEnabled(false);
		btnDeposit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				operation = "Deposit";
				
				frame.dispose();
				Deposit DepositWin = new Deposit();
				DepositWin.DepositFrame.setVisible(true);
				
			}
		});
		btnDeposit.setIcon(new ImageIcon(ATM.class.getResource("/ATM_Package/rArrow.png")));
		btnDeposit.setBounds(18, 4, 85, 50);
		panel_2.add(btnDeposit);
		
		final JButton btnWithdrawal = new JButton("");
		btnWithdrawal.setEnabled(false);
		btnWithdrawal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				operation = "Withdrawal";
				txtDisplay.setFont(new Font("Tahoma", Font.BOLD, 14));
				txtDisplay.setText("Amount to Withdrawal?"); //Clear to type amount; wont work if string is entered				
				
			}
		});
		btnWithdrawal.setIcon(new ImageIcon(ATM.class.getResource("/ATM_Package/lArrow.png")));
		btnWithdrawal.setBounds(16, 70, 85, 50);
		panel.add(btnWithdrawal);
		
		final JButton btnArrowLoan = new JButton("");
		btnArrowLoan.setEnabled(false);
		btnArrowLoan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				operation = "Loan";
				
				frame.dispose();
				LoanWindow LoanWin = new LoanWindow();
				LoanWin.setVisible(true);
				LoanWin.setBounds(0, 0, 1450, 533);
//				btnLoan.setEnabled(true);
//				btnReceipt.setEnabled(true);
//				btnReset.setEnabled(true);
//				btnExit.setEnabled(true);
			}
		});
		btnArrowLoan.setIcon(new ImageIcon(ATM.class.getResource("/ATM_Package/rArrow.png")));
		btnArrowLoan.setBounds(18, 70, 85, 50);
		panel_2.add(btnArrowLoan);
		
		final JLabel lblBalance = new JLabel("Balance");
		lblBalance.setEnabled(false);
		lblBalance.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblBalance.setBounds(18, 11, 85, 24);
		panel_1.add(lblBalance);
		
		final JLabel lblDeposit = new JLabel("Deposit");
		lblDeposit.setEnabled(false);
		lblDeposit.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblDeposit.setBounds(163, 11, 52, 24);
		panel_1.add(lblDeposit);
		
		final JLabel lblLoan = new JLabel("Loan");
		lblLoan.setEnabled(false);
		lblLoan.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblLoan.setBounds(181, 84, 34, 24);
		panel_1.add(lblLoan);
		
		final JLabel lblWithdrawal = new JLabel("Withdrawal");
		lblWithdrawal.setEnabled(false);
		lblWithdrawal.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblWithdrawal.setBounds(17, 84, 85, 24);
		panel_1.add(lblWithdrawal);
		
		txtDisplay = new JTextField();
		txtDisplay.setHorizontalAlignment(SwingConstants.CENTER);
		txtDisplay.setBackground(new Color(152, 251, 152));
		txtDisplay.setFont(new Font("Tahoma", Font.BOLD, 14));
		txtDisplay.setBounds(15, 46, 200, 30);
		panel_1.add(txtDisplay);
		txtDisplay.setColumns(10);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(255, 255, 255));
		panel_3.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_3.setBounds(10, 157, 489, 310);
		frame.getContentPane().add(panel_3);
		panel_3.setLayout(null);
		
		JButton btn1 = new JButton("");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String NumberEntered = txtDisplay.getText() + "1";
				txtDisplay.setText(NumberEntered);
				
			}
		});
		btn1.setIcon(new ImageIcon(ATM.class.getResource("/ATM_Package/one.png")));
		btn1.setBounds(40, 22, 85, 50);
		panel_3.add(btn1);
		
		JButton btn2 = new JButton("");
		btn2.setIcon(new ImageIcon(ATM.class.getResource("/ATM_Package/two.png")));
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String NumberEntered = txtDisplay.getText() + "2";
				txtDisplay.setText(NumberEntered);
				
			}
		});
		btn2.setBounds(148, 22, 85, 50);
		panel_3.add(btn2);
		
		JButton btn3 = new JButton("");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String NumberEntered = txtDisplay.getText() + "3";
				txtDisplay.setText(NumberEntered);
				
			}
		});
		btn3.setIcon(new ImageIcon(ATM.class.getResource("/ATM_Package/three.png")));
		btn3.setBounds(256, 22, 85, 50);
		panel_3.add(btn3);
		
		JButton btnCancel = new JButton("");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnCancel.setIcon(new ImageIcon(ATM.class.getResource("/ATM_Package/cancel.png")));
		btnCancel.setBounds(364, 22, 85, 50);
		panel_3.add(btnCancel);
		
		JButton btn5 = new JButton("");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String NumberEntered = txtDisplay.getText() + "5";
				txtDisplay.setText(NumberEntered);
				
			}
		});
		btn5.setIcon(new ImageIcon(ATM.class.getResource("/ATM_Package/five.png")));
		btn5.setBounds(148, 90, 85, 50);
		panel_3.add(btn5);
		
		JButton btn4 = new JButton("");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String NumberEntered = txtDisplay.getText() + "4";
				txtDisplay.setText(NumberEntered);
				
			}
		});
		btn4.setIcon(new ImageIcon(ATM.class.getResource("/ATM_Package/four.png")));
		btn4.setBounds(40, 90, 85, 50);
		panel_3.add(btn4);
		
		JButton btn6 = new JButton("");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String NumberEntered = txtDisplay.getText() + "6";
				txtDisplay.setText(NumberEntered);
				
			}
		});
		btn6.setIcon(new ImageIcon(ATM.class.getResource("/ATM_Package/six.png")));
		btn6.setBounds(256, 90, 85, 50);
		panel_3.add(btn6);
		
		JButton btnClear = new JButton("");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtDisplay.setText("");
				
//				lblBalance.setEnabled(false);
//				lblDeposit.setEnabled(false);
//				lblWithdrawal.setEnabled(false);
//				lblLoan.setEnabled(false);
//				
			}
		});
		btnClear.setIcon(new ImageIcon(ATM.class.getResource("/ATM_Package/clear.png")));
		btnClear.setBounds(364, 90, 85, 50);
		panel_3.add(btnClear);
		
		JButton btn8 = new JButton("");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String NumberEntered = txtDisplay.getText() + "8";
				txtDisplay.setText(NumberEntered);
				
			}
		});
		btn8.setIcon(new ImageIcon(ATM.class.getResource("/ATM_Package/eight.png")));
		btn8.setBounds(148, 158, 85, 50);
		panel_3.add(btn8);
		
		JButton btn7 = new JButton("");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String NumberEntered = txtDisplay.getText() + "7";
				txtDisplay.setText(NumberEntered);
				
			}
		});
		btn7.setIcon(new ImageIcon(ATM.class.getResource("/ATM_Package/seven.png")));
		btn7.setBounds(40, 158, 85, 50);
		panel_3.add(btn7);
		
		JButton btn9 = new JButton("");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String NumberEntered = txtDisplay.getText() + "9";
				txtDisplay.setText(NumberEntered);
				
			}
		});
		btn9.setIcon(new ImageIcon(ATM.class.getResource("/ATM_Package/nine.png")));
		btn9.setBounds(256, 158, 85, 50);
		panel_3.add(btn9);
		
		JButton btnEnter = new JButton("");
		btnEnter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (operation == "") {
					
					int pin = Integer.parseInt(txtDisplay.getText());
					
					if (pin == 1234) {
						txtDisplay.setText("");
						btnBalance.setEnabled(true);
						btnDeposit.setEnabled(true);
						btnWithdrawal.setEnabled(true);
						btnArrowLoan.setEnabled(true);
						
						lblBalance.setEnabled(true);
						lblDeposit.setEnabled(true);
						lblWithdrawal.setEnabled(true);
						lblLoan.setEnabled(true);	
					}
					else if (pin == 9876) {
						txtDisplay.setText("");
						btnBalance.setEnabled(true);
						btnDeposit.setEnabled(true);
						btnWithdrawal.setEnabled(true);
						btnArrowLoan.setEnabled(true);
						
						lblBalance.setEnabled(true);
						lblDeposit.setEnabled(true);
						lblWithdrawal.setEnabled(true);
						lblLoan.setEnabled(true);	
					}
					else {
						txtDisplay.setText("Invalid Pin");
					}
				}
				else if (operation == "Withdrawal") {
					
					if (balance >= Double.valueOf(txtDisplay.getText())) {
						newBalance = balance - Double.valueOf(txtDisplay.getText());
						
						txtDisplay.setText("");
						txtDisplay.setText("Withdrawal Successful");
						
						balance = newBalance;
					}
					else {
						txtDisplay.setText("Insufficient Funds");
					}
					
				}
//				else if (operation == "Deposit") {
//					newBalance = balance + Double.valueOf(txtDisplay.getText());
//					
//					balance = newBalance;
//					
//					txtDisplay.setText("");
//					txtDisplay.setText("Deposit Successful");
//				}
				
			}
		});
		btnEnter.setIcon(new ImageIcon(ATM.class.getResource("/ATM_Package/enter.png")));
		btnEnter.setBounds(364, 158, 85, 50);
		panel_3.add(btnEnter);
		
		JButton btn0 = new JButton("");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String NumberEntered = txtDisplay.getText() + "0";
				txtDisplay.setText(NumberEntered);
				
			}
		});
		btn0.setIcon(new ImageIcon(ATM.class.getResource("/ATM_Package/zero.png")));
		btn0.setBounds(148, 226, 85, 50);
		panel_3.add(btn0);
		
		JButton btnNewButton_3 = new JButton("");
		btnNewButton_3.setIcon(new ImageIcon(ATM.class.getResource("/ATM_Package/empty.png")));
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_3.setBounds(40, 226, 85, 50);
		panel_3.add(btnNewButton_3);
		
		JButton btnNewButton_5_3 = new JButton("");
		btnNewButton_5_3.setIcon(new ImageIcon(ATM.class.getResource("/ATM_Package/empty.png")));
		btnNewButton_5_3.setBounds(256, 226, 85, 50);
		panel_3.add(btnNewButton_5_3);
		
		JButton btnNewButton_6_3 = new JButton("EXIT");
		btnNewButton_6_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				frame = new JFrame("Exit");
				if (JOptionPane.showConfirmDialog(frame, "Confirm if you want to exit",
						"ATM System",
						JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
							System.exit(0);
				}
				
			}
		});
		btnNewButton_6_3.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton_6_3.setBounds(364, 226, 85, 50);
		panel_3.add(btnNewButton_6_3);
	}
}
