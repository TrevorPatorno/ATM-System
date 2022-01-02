package ATM_Package;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.border.BevelBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.SystemColor;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LoanWindow extends JFrame {
	
	JFrame LoanWinFrame;
	private JPanel contentPanel;
	private JTextField txtDisplay;
	private JTextField txtInterestRate;
	private JTextField txtNumOfYears;
	private JTextField txtLoanAmt;
	private JTextField txtMonthlyPay;
	private JTextField txtTotalPay;
	private JTextField txtReceipt;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoanWindow window = new LoanWindow();
					window.LoanWinFrame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public LoanWindow() {
		getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(139, 24, 231, 122);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_1.setLayout(null);
		panel_1.setBackground(new Color(152, 251, 152));
		panel_1.setBounds(0, 0, 231, 122);
		panel.add(panel_1);
		
		JLabel lblBalance = new JLabel("Balance");
		lblBalance.setEnabled(false);
		lblBalance.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblBalance.setBounds(18, 11, 85, 24);
		panel_1.add(lblBalance);
		
		JLabel lblDeposit = new JLabel("Deposit");
		lblDeposit.setEnabled(false);
		lblDeposit.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblDeposit.setBounds(163, 11, 52, 24);
		panel_1.add(lblDeposit);
		
		JLabel lblLoan = new JLabel("Loan");
		lblLoan.setEnabled(false);
		lblLoan.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblLoan.setBounds(181, 84, 34, 24);
		panel_1.add(lblLoan);
		
		JLabel lblWithdrawal = new JLabel("Withdrawal");
		lblWithdrawal.setEnabled(false);
		lblWithdrawal.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblWithdrawal.setBounds(17, 84, 85, 24);
		panel_1.add(lblWithdrawal);
		
		txtDisplay = new JTextField();
		txtDisplay.setEditable(false);
		txtDisplay.setHorizontalAlignment(SwingConstants.CENTER);
		txtDisplay.setFont(new Font("Tahoma", Font.BOLD, 14));
		txtDisplay.setColumns(10);
		txtDisplay.setBackground(new Color(152, 251, 152));
		txtDisplay.setBounds(15, 46, 200, 30);
		panel_1.add(txtDisplay);
		txtDisplay.setText("Hit Cancel to Cancel Loan");
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(10, 24, 119, 122);
		getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		JPanel panel_3 = new JPanel();
		panel_3.setLayout(null);
		panel_3.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_3.setBackground(Color.WHITE);
		panel_3.setBounds(0, 0, 119, 122);
		panel_2.add(panel_3);
		
		JButton btnBalance = new JButton("");
		btnBalance.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnBalance.setEnabled(false);
		btnBalance.setIcon(new ImageIcon(LoanWindow.class.getResource("/ATM_Package/lArrow.png")));
		btnBalance.setBackground(SystemColor.menu);
		btnBalance.setBounds(16, 4, 85, 50);
		panel_3.add(btnBalance);
		
		JButton btnWithdrawal = new JButton("");
		btnWithdrawal.setEnabled(false);
		btnWithdrawal.setIcon(new ImageIcon(LoanWindow.class.getResource("/ATM_Package/lArrow.png")));
		btnWithdrawal.setBounds(16, 70, 85, 50);
		panel_3.add(btnWithdrawal);
		
		JPanel panel_3_1 = new JPanel();
		panel_3_1.setLayout(null);
		panel_3_1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_3_1.setBackground(Color.WHITE);
		panel_3_1.setBounds(380, 24, 119, 122);
		getContentPane().add(panel_3_1);
		
		JButton btnDeposit = new JButton("");
		btnDeposit.setEnabled(false);
		btnDeposit.setIcon(new ImageIcon(LoanWindow.class.getResource("/ATM_Package/rArrow.png")));
		btnDeposit.setBackground(SystemColor.menu);
		btnDeposit.setBounds(16, 4, 85, 50);
		panel_3_1.add(btnDeposit);
		
		JButton btnArrowLoan = new JButton("");
		btnArrowLoan.setEnabled(false);
		btnArrowLoan.setIcon(new ImageIcon(LoanWindow.class.getResource("/ATM_Package/rArrow.png")));
		btnArrowLoan.setBounds(16, 70, 85, 50);
		panel_3_1.add(btnArrowLoan);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBounds(10, 157, 489, 310);
		getContentPane().add(panel_4);
		panel_4.setLayout(null);
		
		JPanel panel_3_2 = new JPanel();
		panel_3_2.setLayout(null);
		panel_3_2.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_3_2.setBackground(Color.WHITE);
		panel_3_2.setBounds(0, 0, 489, 310);
		panel_4.add(panel_3_2);
		
		JButton btn1 = new JButton("");
		btn1.setEnabled(false);
		btn1.setIcon(new ImageIcon(LoanWindow.class.getResource("/ATM_Package/one.png")));
		btn1.setBounds(40, 22, 85, 50);
		panel_3_2.add(btn1);
		
		JButton btn2 = new JButton("");
		btn2.setEnabled(false);
		btn2.setIcon(new ImageIcon(LoanWindow.class.getResource("/ATM_Package/two.png")));
		btn2.setBounds(148, 22, 85, 50);
		panel_3_2.add(btn2);
		
		JButton btn3 = new JButton("");
		btn3.setEnabled(false);
		btn3.setIcon(new ImageIcon(LoanWindow.class.getResource("/ATM_Package/three.png")));
		btn3.setBounds(256, 22, 85, 50);
		panel_3_2.add(btn3);
		
		JButton btnCancel = new JButton("");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				dispose();
				ATM ATM_Main = new ATM();
				ATM_Main.frame.setVisible(true);
		
				
			}
		});
		btnCancel.setIcon(new ImageIcon(LoanWindow.class.getResource("/ATM_Package/cancel.png")));
		btnCancel.setBounds(364, 22, 85, 50);
		panel_3_2.add(btnCancel);
		
		JButton btn5 = new JButton("");
		btn5.setEnabled(false);
		btn5.setIcon(new ImageIcon(LoanWindow.class.getResource("/ATM_Package/five.png")));
		btn5.setBounds(148, 90, 85, 50);
		panel_3_2.add(btn5);
		
		JButton btn4 = new JButton("");
		btn4.setEnabled(false);
		btn4.setIcon(new ImageIcon(LoanWindow.class.getResource("/ATM_Package/four.png")));
		btn4.setBounds(40, 90, 85, 50);
		panel_3_2.add(btn4);
		
		JButton btn6 = new JButton("");
		btn6.setEnabled(false);
		btn6.setIcon(new ImageIcon(LoanWindow.class.getResource("/ATM_Package/six.png")));
		btn6.setBounds(256, 90, 85, 50);
		panel_3_2.add(btn6);
		
		JButton btnClear = new JButton("");
		btnClear.setEnabled(false);
		btnClear.setIcon(new ImageIcon(LoanWindow.class.getResource("/ATM_Package/clear.png")));
		btnClear.setBounds(364, 90, 85, 50);
		panel_3_2.add(btnClear);
		
		JButton btn8 = new JButton("");
		btn8.setEnabled(false);
		btn8.setIcon(new ImageIcon(LoanWindow.class.getResource("/ATM_Package/eight.png")));
		btn8.setBounds(148, 158, 85, 50);
		panel_3_2.add(btn8);
		
		JButton btn7 = new JButton("");
		btn7.setEnabled(false);
		btn7.setIcon(new ImageIcon(LoanWindow.class.getResource("/ATM_Package/seven.png")));
		btn7.setBounds(40, 158, 85, 50);
		panel_3_2.add(btn7);
		
		JButton btn9 = new JButton("");
		btn9.setEnabled(false);
		btn9.setIcon(new ImageIcon(LoanWindow.class.getResource("/ATM_Package/nine.png")));
		btn9.setBounds(256, 158, 85, 50);
		panel_3_2.add(btn9);
		
		JButton btnEnter = new JButton("");
		btnEnter.setEnabled(false);
		btnEnter.setIcon(new ImageIcon(LoanWindow.class.getResource("/ATM_Package/enter.png")));
		btnEnter.setBounds(364, 158, 85, 50);
		panel_3_2.add(btnEnter);
		
		JButton btn0 = new JButton("");
		btn0.setEnabled(false);
		btn0.setIcon(new ImageIcon(LoanWindow.class.getResource("/ATM_Package/zero.png")));
		btn0.setBounds(148, 226, 85, 50);
		panel_3_2.add(btn0);
		
		JButton btnNewButton_3 = new JButton("");
		btnNewButton_3.setBounds(40, 226, 85, 50);
		panel_3_2.add(btnNewButton_3);
		
		JButton btnNewButton_5_3 = new JButton("");
		btnNewButton_5_3.setBounds(256, 226, 85, 50);
		panel_3_2.add(btnNewButton_5_3);
		
		JButton btnNewButton_6_3 = new JButton("");
		btnNewButton_6_3.setBounds(364, 226, 85, 50);
		panel_3_2.add(btnNewButton_6_3);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBounds(509, 24, 915, 443);
		getContentPane().add(panel_5);
		panel_5.setLayout(null);
		
		JPanel panel_4_1 = new JPanel();
		panel_4_1.setLayout(null);
		panel_4_1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_4_1.setBackground(new Color(192, 192, 192));
		panel_4_1.setBounds(0, 0, 915, 443);
		panel_5.add(panel_4_1);
		
		JLabel lblInterestRate = new JLabel("Interest Rate");
		lblInterestRate.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblInterestRate.setBounds(35, 31, 159, 29);
		panel_4_1.add(lblInterestRate);
		
		txtInterestRate = new JTextField();
		txtInterestRate.setColumns(10);
		txtInterestRate.setBounds(256, 34, 86, 24);
		panel_4_1.add(txtInterestRate);
		
		txtNumOfYears = new JTextField();
		txtNumOfYears.setColumns(10);
		txtNumOfYears.setBounds(256, 102, 86, 22);
		panel_4_1.add(txtNumOfYears);
		
		JLabel lblNumOfYears = new JLabel("Number of Years");
		lblNumOfYears.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblNumOfYears.setBounds(35, 97, 200, 29);
		panel_4_1.add(lblNumOfYears);
		
		txtLoanAmt = new JTextField();
		txtLoanAmt.setColumns(10);
		txtLoanAmt.setBounds(256, 166, 86, 24);
		panel_4_1.add(txtLoanAmt);
		
		JLabel lblLoanAmt = new JLabel("Loan Amount");
		lblLoanAmt.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblLoanAmt.setBounds(35, 163, 159, 29);
		panel_4_1.add(lblLoanAmt);
		
		txtMonthlyPay = new JTextField();
		txtMonthlyPay.setColumns(10);
		txtMonthlyPay.setBounds(256, 232, 86, 24);
		panel_4_1.add(txtMonthlyPay);
		
		JLabel lblMonthlyPay = new JLabel("Monthly Payment");
		lblMonthlyPay.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblMonthlyPay.setBounds(35, 229, 211, 29);
		panel_4_1.add(lblMonthlyPay);
		
		txtTotalPay = new JTextField();
		txtTotalPay.setColumns(10);
		txtTotalPay.setBounds(256, 298, 86, 24);
		panel_4_1.add(txtTotalPay);
		
		JLabel lblTotalPay = new JLabel("Total Payment");
		lblTotalPay.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblTotalPay.setBounds(35, 295, 174, 29);
		panel_4_1.add(lblTotalPay);
		
		txtReceipt = new JTextField();
		txtReceipt.setColumns(10);
		txtReceipt.setBounds(377, 34, 495, 288);
		panel_4_1.add(txtReceipt);
		
		JButton btnLoan = new JButton("Loan");
		btnLoan.setFont(new Font("Tahoma", Font.BOLD, 24));
		btnLoan.setBounds(35, 357, 174, 50);
		panel_4_1.add(btnLoan);
		
		JButton btnReceipt = new JButton("Receipt");
		btnReceipt.setFont(new Font("Tahoma", Font.BOLD, 24));
		btnReceipt.setBounds(256, 357, 174, 50);
		panel_4_1.add(btnReceipt);
		
		JButton btnReset = new JButton("Reset");
		btnReset.setFont(new Font("Tahoma", Font.BOLD, 24));
		btnReset.setBounds(477, 357, 174, 50);
		panel_4_1.add(btnReset);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				LoanWinFrame = new JFrame("Exit");
				if (JOptionPane.showConfirmDialog(LoanWinFrame, "Confirm if you want to exit",
						"ATM System",
						JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
							System.exit(0);
				}
				
			}
		});
		btnExit.setFont(new Font("Tahoma", Font.BOLD, 24));
		btnExit.setBounds(698, 357, 174, 50);
		panel_4_1.add(btnExit);
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		LoanWinFrame = new JFrame();
		LoanWinFrame.setBounds(0, 0, 1450, 533);
		LoanWinFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
