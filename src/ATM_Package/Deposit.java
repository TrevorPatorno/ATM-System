package ATM_Package;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.border.BevelBorder;
import javax.swing.JButton;
import java.awt.SystemColor;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class Deposit {

	JFrame DepositFrame;
	private JTextField txtDisplayAction;
	private JTextField txtDisplayQuestion;
	String operation = "Deposit", displayBalance;
	double newBalance, balance;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Deposit window = new Deposit();
					window.DepositFrame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Deposit() {
		initialize();
		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		DepositFrame = new JFrame();
		DepositFrame.setBounds(0, 0, 533, 572);
		DepositFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		DepositFrame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel.setBackground(Color.WHITE);
		panel.setBounds(10, 49, 119, 135);
		DepositFrame.getContentPane().add(panel);
		
		JButton btnBalance = new JButton("");
		btnBalance.setEnabled(false);
		btnBalance.setIcon(new ImageIcon(Deposit.class.getResource("/ATM_Package/lArrow.png")));
		btnBalance.setBackground(SystemColor.menu);
		btnBalance.setBounds(16, 13, 85, 50);
		panel.add(btnBalance);
		
		JButton btnWithdrawal = new JButton("");
		btnWithdrawal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnWithdrawal.setIcon(new ImageIcon(Deposit.class.getResource("/ATM_Package/lArrow.png")));
		btnWithdrawal.setBounds(16, 74, 85, 50);
		panel.add(btnWithdrawal);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_1.setBackground(new Color(152, 251, 152));
		panel_1.setBounds(139, 49, 239, 135);
		DepositFrame.getContentPane().add(panel_1);
		
		JLabel lblBalance = new JLabel("Balance");
		lblBalance.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblBalance.setEnabled(false);
		lblBalance.setBounds(17, 7, 53, 24);
		panel_1.add(lblBalance);
		
		JLabel lblDeposit = new JLabel("Deposit");
		lblDeposit.setEnabled(false);
		lblDeposit.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblDeposit.setBounds(170, 7, 52, 24);
		panel_1.add(lblDeposit);
		
		JLabel lblLoan = new JLabel("Loan");
		lblLoan.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblLoan.setBounds(188, 100, 34, 24);
		panel_1.add(lblLoan);
		
		JLabel lblWithdrawal = new JLabel("Withdrawal");
		lblWithdrawal.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblWithdrawal.setBounds(17, 100, 85, 24);
		panel_1.add(lblWithdrawal);
		
		txtDisplayAction = new JTextField();
		txtDisplayAction.setHorizontalAlignment(SwingConstants.CENTER);
		txtDisplayAction.setFont(new Font("Tahoma", Font.BOLD, 14));
		txtDisplayAction.setColumns(10);
		txtDisplayAction.setBackground(new Color(152, 251, 152));
		txtDisplayAction.setBounds(17, 64, 205, 34);
		panel_1.add(txtDisplayAction);
		
		txtDisplayQuestion = new JTextField();
		txtDisplayQuestion.setText("Amount to Deposit?");
		txtDisplayQuestion.setEditable(false);
		txtDisplayQuestion.setHorizontalAlignment(SwingConstants.CENTER);
		txtDisplayQuestion.setFont(new Font("Tahoma", Font.BOLD, 14));
		txtDisplayQuestion.setColumns(10);
		txtDisplayQuestion.setBackground(new Color(152, 251, 152));
		txtDisplayQuestion.setBounds(17, 32, 205, 29);
		panel_1.add(txtDisplayQuestion);
		
		if (operation == "Deposit") {
			txtDisplayQuestion.setText("Amount to Deposit?");
		}
		
		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_2.setBackground(Color.WHITE);
		panel_2.setBounds(388, 49, 119, 135);
		DepositFrame.getContentPane().add(panel_2);
		
		JButton btnDeposit = new JButton("");
		btnDeposit.setEnabled(false);
		btnDeposit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				operation = "";
				
				txtDisplayQuestion.setText("");
				txtDisplayQuestion.setText("Amount to Deposit?");
			}
		});
		btnDeposit.setIcon(new ImageIcon(Deposit.class.getResource("/ATM_Package/rArrow.png")));
		btnDeposit.setBackground(SystemColor.menu);
		btnDeposit.setBounds(16, 13, 85, 50);
		panel_2.add(btnDeposit);
		
		JButton btnLoan = new JButton("");
		btnLoan.setIcon(new ImageIcon(Deposit.class.getResource("/ATM_Package/rArrow.png")));
		btnLoan.setBounds(16, 74, 85, 50);
		panel_2.add(btnLoan);
		
		JPanel panel_3 = new JPanel();
		panel_3.setLayout(null);
		panel_3.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_3.setBackground(Color.WHITE);
		panel_3.setBounds(10, 195, 497, 310);
		DepositFrame.getContentPane().add(panel_3);
		
		JButton btn1 = new JButton("");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String NumberEntered = txtDisplayAction.getText() + "1";
				txtDisplayAction.setText(NumberEntered);
				
			}
		});
		btn1.setIcon(new ImageIcon(Deposit.class.getResource("/ATM_Package/one.png")));
		btn1.setBounds(35, 22, 85, 50);
		panel_3.add(btn1);
		
		JButton btn2 = new JButton("");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String NumberEntered = txtDisplayAction.getText() + "2";
				txtDisplayAction.setText(NumberEntered);
			}
		});
		btn2.setIcon(new ImageIcon(Deposit.class.getResource("/ATM_Package/two.png")));
		btn2.setBounds(146, 22, 85, 50);
		panel_3.add(btn2);
		
		JButton btn3 = new JButton("");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String NumberEntered = txtDisplayAction.getText() + "3";
				txtDisplayAction.setText(NumberEntered);
			}
		});
		btn3.setIcon(new ImageIcon(Deposit.class.getResource("/ATM_Package/three.png")));
		btn3.setBounds(257, 22, 85, 50);
		panel_3.add(btn3);
		
		JButton btnCancel = new JButton("");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				DepositFrame.dispose();
				ATM ATM_Main = new ATM();
				ATM_Main.frame.setVisible(true);		
				
			}
		});
		btnCancel.setIcon(new ImageIcon(Deposit.class.getResource("/ATM_Package/cancel.png")));
		btnCancel.setBounds(368, 22, 85, 50);
		panel_3.add(btnCancel);
		
		JButton btn5 = new JButton("");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String NumberEntered = txtDisplayAction.getText() + "5";
				txtDisplayAction.setText(NumberEntered);
			}
		});
		btn5.setIcon(new ImageIcon(Deposit.class.getResource("/ATM_Package/five.png")));
		btn5.setBounds(146, 90, 85, 50);
		panel_3.add(btn5);
		
		JButton btn4 = new JButton("");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String NumberEntered = txtDisplayAction.getText() + "4";
				txtDisplayAction.setText(NumberEntered);
			}
		});
		btn4.setIcon(new ImageIcon(Deposit.class.getResource("/ATM_Package/four.png")));
		btn4.setBounds(35, 90, 85, 50);
		panel_3.add(btn4);
		
		JButton btn6 = new JButton("");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String NumberEntered = txtDisplayAction.getText() + "6";
				txtDisplayAction.setText(NumberEntered);
			}
		});
		btn6.setIcon(new ImageIcon(Deposit.class.getResource("/ATM_Package/six.png")));
		btn6.setBounds(257, 90, 85, 50);
		panel_3.add(btn6);
		
		JButton btnClear = new JButton("");
		btnClear.setIcon(new ImageIcon(Deposit.class.getResource("/ATM_Package/clear.png")));
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtDisplayAction.setText("");
			}
		});
		btnClear.setBounds(368, 90, 85, 50);
		panel_3.add(btnClear);
		
		JButton btn8 = new JButton("");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String NumberEntered = txtDisplayAction.getText() + "8";
				txtDisplayAction.setText(NumberEntered);
			}
		});
		btn8.setIcon(new ImageIcon(Deposit.class.getResource("/ATM_Package/eight.png")));
		btn8.setBounds(146, 158, 85, 50);
		panel_3.add(btn8);
		
		JButton btn7 = new JButton("");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String NumberEntered = txtDisplayAction.getText() + "7";
				txtDisplayAction.setText(NumberEntered);
			}
		});
		btn7.setIcon(new ImageIcon(Deposit.class.getResource("/ATM_Package/seven.png")));
		btn7.setBounds(35, 158, 85, 50);
		panel_3.add(btn7);
		
		JButton btn9 = new JButton("");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String NumberEntered = txtDisplayAction.getText() + "9";
				txtDisplayAction.setText(NumberEntered);
			}
		});
		btn9.setIcon(new ImageIcon(Deposit.class.getResource("/ATM_Package/nine.png")));
		btn9.setBounds(257, 158, 85, 50);
		panel_3.add(btn9);
		
		JButton btnEnter = new JButton("");
		btnEnter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (operation == "Deposit") {
					newBalance = balance + Double.valueOf(txtDisplayAction.getText());
					
					balance = newBalance;
					displayBalance = String.format("%.2f", balance);
					
					txtDisplayQuestion.setText("");
					txtDisplayQuestion.setText("Deposit Successful");
					txtDisplayAction.setText("");
					txtDisplayAction.setText("New Balance: $" + displayBalance);
				}
			}
		});
		btnEnter.setIcon(new ImageIcon(Deposit.class.getResource("/ATM_Package/enter.png")));
		btnEnter.setBounds(368, 158, 85, 50);
		panel_3.add(btnEnter);
		
		JButton btn0 = new JButton("");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String NumberEntered = txtDisplayAction.getText() + "0";
				txtDisplayAction.setText(NumberEntered);
			}
		});
		btn0.setIcon(new ImageIcon(Deposit.class.getResource("/ATM_Package/zero.png")));
		btn0.setBounds(146, 226, 85, 50);
		panel_3.add(btn0);
		
		JButton btnNewButton_3 = new JButton("");
		btnNewButton_3.setBounds(35, 226, 85, 50);
		panel_3.add(btnNewButton_3);
		
		JButton btnNewButton_5_3 = new JButton("");
		btnNewButton_5_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_5_3.setBounds(257, 226, 85, 50);
		panel_3.add(btnNewButton_5_3);
		
		JButton btnExit = new JButton("EXIT");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DepositFrame = new JFrame("Exit");
				if (JOptionPane.showConfirmDialog(DepositFrame, "Are you sure you want to exit?",
						"ATM System",
						JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
							System.exit(0);
				}
			}
		});
		btnExit.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnExit.setBounds(368, 226, 85, 50);
		panel_3.add(btnExit);
		
		JLabel lblNewLabel = new JLabel("Deposit");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		lblNewLabel.setBounds(217, 21, 83, 27);
		DepositFrame.getContentPane().add(lblNewLabel);
	}
}
