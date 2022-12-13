package Project;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.MatteBorder;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JComboBox;
import java.awt.Dimension;
import javax.swing.JEditorPane;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JCheckBox;
import javax.swing.JToggleButton;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import javax.swing.DefaultComboBoxModel;

public class CarBuilder extends JFrame {

	private JPanel contentPane;
	private JTextField jtxtZip;
	private JTextField jtxtDOB;
	private JTextField jtxtFirstName;
	private JTextField jtxtLastName;
	private JTextField jtxtPhone;
	private JTextField jtxtEmail;
	private JTextField jtxtAddress;
	private JTextField jtxtTax;
	private JTextField jtxtSubTotal;
	private JTextField jtxtTotal;
	private JFrame frame;
	
	String iTax, iSubTotal, iTotal;
	double[] itemcost = new double [20];
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CarBuilder frame = new CarBuilder();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public CarBuilder() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 840,635);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(192, 192, 192));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(128, 128, 128));
		panel.setBorder(new MatteBorder(14, 14, 14, 14, (Color) new Color(128, 128, 128)));
		panel.setBounds(10, 11, 806,589);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(28, 25, 765, 160);
		panel_2.setBorder(new MatteBorder(14, 14, 14, 14, (Color) new Color(128, 128, 128)));
		panel.add(panel_2);
		GridBagLayout gbl_panel_2 = new GridBagLayout();
		gbl_panel_2.columnWidths = new int[]{52, 121, 40, 136, 85, 137, 85, 224, 0};
		gbl_panel_2.rowHeights = new int[]{20, 25, 25, 22, 0};
		gbl_panel_2.columnWeights = new double[]{0.0, 0.0, 0.0, 1.0, 0.0, 1.0, 0.0, 1.0, Double.MIN_VALUE};
		gbl_panel_2.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel_2.setLayout(gbl_panel_2);
		
		JLabel lblNewLabel = new JLabel(" Customer Information");
		lblNewLabel.setHorizontalTextPosition(SwingConstants.CENTER);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setPreferredSize(new Dimension(850, 20));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.anchor = GridBagConstraints.NORTHWEST;
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.gridwidth = 3;
		gbc_lblNewLabel.gridx = 3;
		gbc_lblNewLabel.gridy = 0;
		panel_2.add(lblNewLabel, gbc_lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("First Name");
		lblNewLabel_1.setPreferredSize(new Dimension(85, 14));
		lblNewLabel_1.setHorizontalTextPosition(SwingConstants.CENTER);
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_1.gridx = 1;
		gbc_lblNewLabel_1.gridy = 1;
		panel_2.add(lblNewLabel_1, gbc_lblNewLabel_1);
		
		jtxtFirstName = new JTextField();
		jtxtFirstName.setFont(new Font("Tahoma", Font.PLAIN, 15));
		jtxtFirstName.setColumns(10);
		GridBagConstraints gbc_jtxtFirstName = new GridBagConstraints();
		gbc_jtxtFirstName.insets = new Insets(0, 0, 5, 5);
		gbc_jtxtFirstName.fill = GridBagConstraints.HORIZONTAL;
		gbc_jtxtFirstName.gridx = 3;
		gbc_jtxtFirstName.gridy = 1;
		panel_2.add(jtxtFirstName, gbc_jtxtFirstName);
		
		JLabel lblNewLabel_2 = new JLabel("Last Name");
		lblNewLabel_2.setPreferredSize(new Dimension(85, 14));
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		GridBagConstraints gbc_lblNewLabel_2 = new GridBagConstraints();
		gbc_lblNewLabel_2.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_2.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_2.gridx = 4;
		gbc_lblNewLabel_2.gridy = 1;
		panel_2.add(lblNewLabel_2, gbc_lblNewLabel_2);
		
		jtxtLastName = new JTextField();
		jtxtLastName.setFont(new Font("Tahoma", Font.PLAIN, 15));
		jtxtLastName.setColumns(10);
		GridBagConstraints gbc_jtxtLastName = new GridBagConstraints();
		gbc_jtxtLastName.insets = new Insets(0, 0, 5, 5);
		gbc_jtxtLastName.fill = GridBagConstraints.HORIZONTAL;
		gbc_jtxtLastName.gridx = 5;
		gbc_jtxtLastName.gridy = 1;
		panel_2.add(jtxtLastName, gbc_jtxtLastName);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("Email");
		lblNewLabel_1_1_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1_1_1_1.setPreferredSize(new Dimension(85, 14));
		lblNewLabel_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		GridBagConstraints gbc_lblNewLabel_1_1_1_1 = new GridBagConstraints();
		gbc_lblNewLabel_1_1_1_1.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_1_1_1_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_1_1_1_1.gridx = 6;
		gbc_lblNewLabel_1_1_1_1.gridy = 1;
		panel_2.add(lblNewLabel_1_1_1_1, gbc_lblNewLabel_1_1_1_1);
		
		jtxtEmail = new JTextField();
		jtxtEmail.setFont(new Font("Tahoma", Font.PLAIN, 15));
		jtxtEmail.setColumns(10);
		GridBagConstraints gbc_jtxtEmail = new GridBagConstraints();
		gbc_jtxtEmail.insets = new Insets(0, 0, 5, 0);
		gbc_jtxtEmail.fill = GridBagConstraints.HORIZONTAL;
		gbc_jtxtEmail.gridx = 7;
		gbc_jtxtEmail.gridy = 1;
		panel_2.add(jtxtEmail, gbc_jtxtEmail);
		
		JLabel lblNewLabel_1_1 = new JLabel("D.O.B.");
		lblNewLabel_1_1.setPreferredSize(new Dimension(85, 14));
		lblNewLabel_1_1.setHorizontalTextPosition(SwingConstants.CENTER);
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		GridBagConstraints gbc_lblNewLabel_1_1 = new GridBagConstraints();
		gbc_lblNewLabel_1_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_1_1.gridx = 1;
		gbc_lblNewLabel_1_1.gridy = 2;
		panel_2.add(lblNewLabel_1_1, gbc_lblNewLabel_1_1);
		
		jtxtDOB = new JTextField();
		jtxtDOB.setFont(new Font("Tahoma", Font.PLAIN, 15));
		jtxtDOB.setColumns(10);
		GridBagConstraints gbc_jtxtDOB = new GridBagConstraints();
		gbc_jtxtDOB.insets = new Insets(0, 0, 5, 5);
		gbc_jtxtDOB.fill = GridBagConstraints.HORIZONTAL;
		gbc_jtxtDOB.gridx = 3;
		gbc_jtxtDOB.gridy = 2;
		panel_2.add(jtxtDOB, gbc_jtxtDOB);
		
		JLabel lblNewLabel_2_1 = new JLabel("Phone #");
		lblNewLabel_2_1.setPreferredSize(new Dimension(85, 14));
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		GridBagConstraints gbc_lblNewLabel_2_1 = new GridBagConstraints();
		gbc_lblNewLabel_2_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_2_1.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_2_1.gridx = 4;
		gbc_lblNewLabel_2_1.gridy = 2;
		panel_2.add(lblNewLabel_2_1, gbc_lblNewLabel_2_1);
		
		jtxtPhone = new JTextField();
		jtxtPhone.setFont(new Font("Tahoma", Font.PLAIN, 15));
		jtxtPhone.setColumns(10);
		GridBagConstraints gbc_jtxtPhone = new GridBagConstraints();
		gbc_jtxtPhone.insets = new Insets(0, 0, 5, 5);
		gbc_jtxtPhone.fill = GridBagConstraints.HORIZONTAL;
		gbc_jtxtPhone.gridx = 5;
		gbc_jtxtPhone.gridy = 2;
		panel_2.add(jtxtPhone, gbc_jtxtPhone);
		
		JLabel lblNewLabel_1_1_1_1_1_1 = new JLabel("Address");
		lblNewLabel_1_1_1_1_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1_1_1_1_1_1.setHorizontalTextPosition(SwingConstants.LEFT);
		lblNewLabel_1_1_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		GridBagConstraints gbc_lblNewLabel_1_1_1_1_1_1 = new GridBagConstraints();
		gbc_lblNewLabel_1_1_1_1_1_1.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_1_1_1_1_1_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_1_1_1_1_1_1.gridx = 6;
		gbc_lblNewLabel_1_1_1_1_1_1.gridy = 2;
		panel_2.add(lblNewLabel_1_1_1_1_1_1, gbc_lblNewLabel_1_1_1_1_1_1);
		
		jtxtAddress = new JTextField();
		jtxtAddress.setFont(new Font("Tahoma", Font.PLAIN, 15));
		jtxtAddress.setColumns(10);
		GridBagConstraints gbc_jtxtAddress = new GridBagConstraints();
		gbc_jtxtAddress.insets = new Insets(0, 0, 5, 0);
		gbc_jtxtAddress.fill = GridBagConstraints.HORIZONTAL;
		gbc_jtxtAddress.gridx = 7;
		gbc_jtxtAddress.gridy = 2;
		panel_2.add(jtxtAddress, gbc_jtxtAddress);
		
		JLabel lblNewLabel_1_2 = new JLabel("ZipCode");
		lblNewLabel_1_2.setPreferredSize(new Dimension(85, 14));
		lblNewLabel_1_2.setHorizontalTextPosition(SwingConstants.CENTER);
		lblNewLabel_1_2.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		GridBagConstraints gbc_lblNewLabel_1_2 = new GridBagConstraints();
		gbc_lblNewLabel_1_2.insets = new Insets(0, 0, 0, 5);
		gbc_lblNewLabel_1_2.gridx = 1;
		gbc_lblNewLabel_1_2.gridy = 3;
		panel_2.add(lblNewLabel_1_2, gbc_lblNewLabel_1_2);
		
		jtxtZip = new JTextField();
		jtxtZip.setFont(new Font("Tahoma", Font.PLAIN, 15));
		jtxtZip.setColumns(10);
		GridBagConstraints gbc_jtxtZip = new GridBagConstraints();
		gbc_jtxtZip.fill = GridBagConstraints.BOTH;
		gbc_jtxtZip.insets = new Insets(0, 0, 0, 5);
		gbc_jtxtZip.gridx = 3;
		gbc_jtxtZip.gridy = 3;
		panel_2.add(jtxtZip, gbc_jtxtZip);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(521, 37, 1, 1);
		panel_1.setBorder(new MatteBorder(14, 14, 14, 14, (Color) new Color(128, 128, 128)));
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JPanel panel_2_1 = new JPanel();
		panel_2_1.setBorder(new MatteBorder(14, 14, 14, 14, (Color) new Color(128, 128, 128)));
		panel_2_1.setBounds(28, 178, 765, 146);
		panel.add(panel_2_1);
		GridBagLayout gbl_panel_2_1 = new GridBagLayout();
		gbl_panel_2_1.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_panel_2_1.rowHeights = new int[]{0, 0, 0, 0, 0};
		gbl_panel_2_1.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_panel_2_1.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel_2_1.setLayout(gbl_panel_2_1);
		
		JLabel lblNewLabel_5 = new JLabel("Returning Customer?");
		GridBagConstraints gbc_lblNewLabel_5 = new GridBagConstraints();
		gbc_lblNewLabel_5.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_5.gridx = 1;
		gbc_lblNewLabel_5.gridy = 1;
		panel_2_1.add(lblNewLabel_5, gbc_lblNewLabel_5);
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		JComboBox comboBox_3 = new JComboBox();
		comboBox_3.setModel(new DefaultComboBoxModel(new String[] {"", "Yes", "No"}));
		GridBagConstraints gbc_comboBox_3 = new GridBagConstraints();
		gbc_comboBox_3.insets = new Insets(0, 0, 5, 5);
		gbc_comboBox_3.gridx = 3;
		gbc_comboBox_3.gridy = 1;
		panel_2_1.add(comboBox_3, gbc_comboBox_3);
		comboBox_3.setPreferredSize(new Dimension(120, 22));
		
		JLabel lblNewLabel_1_1_1_1_1_1_1 = new JLabel("Annual Income ");
		GridBagConstraints gbc_lblNewLabel_1_1_1_1_1_1_1 = new GridBagConstraints();
		gbc_lblNewLabel_1_1_1_1_1_1_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_1_1_1_1_1_1_1.gridx = 5;
		gbc_lblNewLabel_1_1_1_1_1_1_1.gridy = 1;
		panel_2_1.add(lblNewLabel_1_1_1_1_1_1_1, gbc_lblNewLabel_1_1_1_1_1_1_1);
		lblNewLabel_1_1_1_1_1_1_1.setHorizontalTextPosition(SwingConstants.LEADING);
		lblNewLabel_1_1_1_1_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_1_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"", "<$45,000", "$45,000-55,000", "$56,000-65,000", "$66,000-75,000", "$76,000-85,000", "$86,000-95,000", ">$100,000"}));
		GridBagConstraints gbc_comboBox = new GridBagConstraints();
		gbc_comboBox.insets = new Insets(0, 0, 5, 0);
		gbc_comboBox.gridx = 7;
		gbc_comboBox.gridy = 1;
		panel_2_1.add(comboBox, gbc_comboBox);
		comboBox.setPreferredSize(new Dimension(120, 22));
		comboBox.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		JLabel lblNewLabel_4 = new JLabel("Preffered Mechanic?");
		GridBagConstraints gbc_lblNewLabel_4 = new GridBagConstraints();
		gbc_lblNewLabel_4.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_4.gridx = 1;
		gbc_lblNewLabel_4.gridy = 2;
		panel_2_1.add(lblNewLabel_4, gbc_lblNewLabel_4);
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"", "Yes", "No"}));
		GridBagConstraints gbc_comboBox_2 = new GridBagConstraints();
		gbc_comboBox_2.insets = new Insets(0, 0, 5, 5);
		gbc_comboBox_2.gridx = 3;
		gbc_comboBox_2.gridy = 2;
		panel_2_1.add(comboBox_2, gbc_comboBox_2);
		comboBox_2.setPreferredSize(new Dimension(120, 22));
		comboBox_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		JLabel lblNewLabel_3 = new JLabel("Type of Vehicle ");
		GridBagConstraints gbc_lblNewLabel_3 = new GridBagConstraints();
		gbc_lblNewLabel_3.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_3.gridx = 5;
		gbc_lblNewLabel_3.gridy = 2;
		panel_2_1.add(lblNewLabel_3, gbc_lblNewLabel_3);
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"", "Sedan", "Converible", "SUV", "Truck", "CUV", "Pick-Up"}));
		GridBagConstraints gbc_comboBox_1 = new GridBagConstraints();
		gbc_comboBox_1.insets = new Insets(0, 0, 5, 0);
		gbc_comboBox_1.gridx = 7;
		gbc_comboBox_1.gridy = 2;
		panel_2_1.add(comboBox_1, gbc_comboBox_1);
		comboBox_1.setPreferredSize(new Dimension(120, 22));
		comboBox_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		JLabel lblNewLabel_7 = new JLabel("Brought own Parts?");
		GridBagConstraints gbc_lblNewLabel_7 = new GridBagConstraints();
		gbc_lblNewLabel_7.insets = new Insets(0, 0, 0, 5);
		gbc_lblNewLabel_7.gridx = 1;
		gbc_lblNewLabel_7.gridy = 3;
		panel_2_1.add(lblNewLabel_7, gbc_lblNewLabel_7);
		lblNewLabel_7.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		JComboBox comboBox_5 = new JComboBox();
		comboBox_5.setModel(new DefaultComboBoxModel(new String[] {"", "Yes", "No"}));
		GridBagConstraints gbc_comboBox_5 = new GridBagConstraints();
		gbc_comboBox_5.insets = new Insets(0, 0, 0, 5);
		gbc_comboBox_5.gridx = 3;
		gbc_comboBox_5.gridy = 3;
		panel_2_1.add(comboBox_5, gbc_comboBox_5);
		comboBox_5.setPreferredSize(new Dimension(120, 22));
		
		JLabel lblNewLabel_6 = new JLabel("Have A Rental?  ");
		GridBagConstraints gbc_lblNewLabel_6 = new GridBagConstraints();
		gbc_lblNewLabel_6.insets = new Insets(0, 0, 0, 5);
		gbc_lblNewLabel_6.gridx = 5;
		gbc_lblNewLabel_6.gridy = 3;
		panel_2_1.add(lblNewLabel_6, gbc_lblNewLabel_6);
		lblNewLabel_6.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		JComboBox comboBox_4 = new JComboBox();
		comboBox_4.setModel(new DefaultComboBoxModel(new String[] {"", "Yes", "No"}));
		GridBagConstraints gbc_comboBox_4 = new GridBagConstraints();
		gbc_comboBox_4.gridx = 7;
		gbc_comboBox_4.gridy = 3;
		panel_2_1.add(comboBox_4, gbc_comboBox_4);
		comboBox_4.setPreferredSize(new Dimension(120, 22));
		
		JPanel panel_2_2 = new JPanel();
		panel_2_2.setBorder(new MatteBorder(14, 14, 14, 14, (Color) new Color(221, 34, 38)));
		panel_2_2.setBounds(28, 562, 765, 16);
		panel.add(panel_2_2);
		
		JTextArea jtxtReceipt = new JTextArea();
		jtxtReceipt.setColumns(75);
		jtxtReceipt.setTabSize(15);
		jtxtReceipt.setRows(14);
		jtxtReceipt.setFont(new Font("Monospaced", Font.PLAIN, 15));
		panel_2_2.add(jtxtReceipt);
		
		JPanel panel_2_3 = new JPanel();
		panel_2_3.setBorder(new MatteBorder(14, 14, 14, 14, (Color) new Color(128, 128, 128)));
		panel_2_3.setBounds(386, 337, 364, 146);
		panel.add(panel_2_3);
		GridBagLayout gbl_panel_2_3 = new GridBagLayout();
		gbl_panel_2_3.columnWidths = new int[]{0, 0, 0, 0};
		gbl_panel_2_3.rowHeights = new int[]{0, 0, 0, 0, 0};
		gbl_panel_2_3.columnWeights = new double[]{0.0, 0.0, 1.0, Double.MIN_VALUE};
		gbl_panel_2_3.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel_2_3.setLayout(gbl_panel_2_3);
		
		JLabel jlblTax = new JLabel("Tax");
		jlblTax.setPreferredSize(new Dimension(85, 14));
		jlblTax.setHorizontalTextPosition(SwingConstants.CENTER);
		jlblTax.setHorizontalAlignment(SwingConstants.LEFT);
		jlblTax.setFont(new Font("Tahoma", Font.BOLD, 15));
		GridBagConstraints gbc_jlblTax = new GridBagConstraints();
		gbc_jlblTax.insets = new Insets(0, 0, 5, 5);
		gbc_jlblTax.anchor = GridBagConstraints.EAST;
		gbc_jlblTax.gridx = 1;
		gbc_jlblTax.gridy = 1;
		panel_2_3.add(jlblTax, gbc_jlblTax);
		
		jtxtTax = new JTextField();
		jtxtTax.setFont(new Font("Tahoma", Font.PLAIN, 15));
		jtxtTax.setColumns(10);
		GridBagConstraints gbc_jtxtTax = new GridBagConstraints();
		gbc_jtxtTax.insets = new Insets(0, 0, 5, 0);
		gbc_jtxtTax.fill = GridBagConstraints.HORIZONTAL;
		gbc_jtxtTax.gridx = 2;
		gbc_jtxtTax.gridy = 1;
		panel_2_3.add(jtxtTax, gbc_jtxtTax);
		
		JLabel jlblSubTotal = new JLabel("SubTotal");
		jlblSubTotal.setPreferredSize(new Dimension(85, 14));
		jlblSubTotal.setHorizontalTextPosition(SwingConstants.CENTER);
		jlblSubTotal.setHorizontalAlignment(SwingConstants.LEFT);
		jlblSubTotal.setFont(new Font("Tahoma", Font.BOLD, 15));
		GridBagConstraints gbc_jlblSubTotal = new GridBagConstraints();
		gbc_jlblSubTotal.insets = new Insets(0, 0, 5, 5);
		gbc_jlblSubTotal.anchor = GridBagConstraints.EAST;
		gbc_jlblSubTotal.gridx = 1;
		gbc_jlblSubTotal.gridy = 2;
		panel_2_3.add(jlblSubTotal, gbc_jlblSubTotal);
		
		jtxtSubTotal = new JTextField();
		jtxtSubTotal.setFont(new Font("Tahoma", Font.PLAIN, 15));
		jtxtSubTotal.setColumns(10);
		GridBagConstraints gbc_jtxtSubTotal = new GridBagConstraints();
		gbc_jtxtSubTotal.insets = new Insets(0, 0, 5, 0);
		gbc_jtxtSubTotal.fill = GridBagConstraints.HORIZONTAL;
		gbc_jtxtSubTotal.gridx = 2;
		gbc_jtxtSubTotal.gridy = 2;
		panel_2_3.add(jtxtSubTotal, gbc_jtxtSubTotal);
		
		JLabel jlblTotal = new JLabel("Total");
		jlblTotal.setPreferredSize(new Dimension(85, 14));
		jlblTotal.setHorizontalTextPosition(SwingConstants.CENTER);
		jlblTotal.setHorizontalAlignment(SwingConstants.LEFT);
		jlblTotal.setFont(new Font("Tahoma", Font.BOLD, 15));
		GridBagConstraints gbc_jlblTotal = new GridBagConstraints();
		gbc_jlblTotal.insets = new Insets(0, 0, 0, 5);
		gbc_jlblTotal.anchor = GridBagConstraints.EAST;
		gbc_jlblTotal.gridx = 1;
		gbc_jlblTotal.gridy = 3;
		panel_2_3.add(jlblTotal, gbc_jlblTotal);
		
		jtxtTotal = new JTextField();
		jtxtTotal.setFont(new Font("Tahoma", Font.PLAIN, 15));
		jtxtTotal.setColumns(10);
		GridBagConstraints gbc_jtxtTotal = new GridBagConstraints();
		gbc_jtxtTotal.fill = GridBagConstraints.HORIZONTAL;
		gbc_jtxtTotal.gridx = 2;
		gbc_jtxtTotal.gridy = 3;
		panel_2_3.add(jtxtTotal, gbc_jtxtTotal);
		
		JPanel panel_2_3_1 = new JPanel();
		panel_2_3_1.setBorder(new MatteBorder(14, 14, 14, 14, (Color) new Color(128, 128, 128)));
		panel_2_3_1.setBounds(28, 337, 345, 232);
		panel.add(panel_2_3_1);
		GridBagLayout gbl_panel_2_3_1 = new GridBagLayout();
		gbl_panel_2_3_1.columnWidths = new int[]{0, 0, 167, 0, 0, 0, 0};
		gbl_panel_2_3_1.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0};
		gbl_panel_2_3_1.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		gbl_panel_2_3_1.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel_2_3_1.setLayout(gbl_panel_2_3_1);
		
		JLabel lblServices = new JLabel("Services");
		lblServices.setPreferredSize(new Dimension(850, 20));
		lblServices.setHorizontalTextPosition(SwingConstants.CENTER);
		lblServices.setHorizontalAlignment(SwingConstants.CENTER);
		lblServices.setFont(new Font("Tahoma", Font.BOLD, 20));
		GridBagConstraints gbc_lblServices = new GridBagConstraints();
		gbc_lblServices.gridwidth = 2;
		gbc_lblServices.insets = new Insets(0, 0, 5, 5);
		gbc_lblServices.gridx = 1;
		gbc_lblServices.gridy = 0;
		panel_2_3_1.add(lblServices, gbc_lblServices);
		
		JCheckBox chkDark = new JCheckBox("Dark Tint");
		chkDark.setHorizontalAlignment(SwingConstants.LEFT);
		GridBagConstraints gbc_chkDark = new GridBagConstraints();
		gbc_chkDark.insets = new Insets(0, 0, 5, 5);
		gbc_chkDark.gridx = 1;
		gbc_chkDark.gridy = 1;
		panel_2_3_1.add(chkDark, gbc_chkDark);
		
		JCheckBox chktAir = new JCheckBox("New Air Filter");
		chktAir.setHorizontalAlignment(SwingConstants.LEFT);
		GridBagConstraints gbc_chktAir = new GridBagConstraints();
		gbc_chktAir.insets = new Insets(0, 0, 5, 5);
		gbc_chktAir.gridx = 2;
		gbc_chktAir.gridy = 1;
		panel_2_3_1.add(chktAir, gbc_chktAir);
		
		JCheckBox chkTint = new JCheckBox("Tint Headlights");
		GridBagConstraints gbc_chkTint = new GridBagConstraints();
		gbc_chkTint.insets = new Insets(0, 0, 5, 5);
		gbc_chkTint.gridx = 1;
		gbc_chkTint.gridy = 2;
		panel_2_3_1.add(chkTint, gbc_chkTint);
		
		JCheckBox chkSpark = new JCheckBox("Replace Spark plugs");
		GridBagConstraints gbc_chkSpark = new GridBagConstraints();
		gbc_chkSpark.insets = new Insets(0, 0, 5, 5);
		gbc_chkSpark.gridx = 2;
		gbc_chkSpark.gridy = 2;
		panel_2_3_1.add(chkSpark, gbc_chkSpark);
		
		JCheckBox chkBlack = new JCheckBox("Black Rims");
		GridBagConstraints gbc_chkBlack = new GridBagConstraints();
		gbc_chkBlack.insets = new Insets(0, 0, 5, 5);
		gbc_chkBlack.gridx = 1;
		gbc_chkBlack.gridy = 3;
		panel_2_3_1.add(chkBlack, gbc_chkBlack);
		
		JCheckBox chkTail = new JCheckBox("Replace Tail Lights");
		GridBagConstraints gbc_chkTail = new GridBagConstraints();
		gbc_chkTail.insets = new Insets(0, 0, 5, 5);
		gbc_chkTail.gridx = 2;
		gbc_chkTail.gridy = 3;
		panel_2_3_1.add(chkTail, gbc_chkTail);
		
		JCheckBox chkTires = new JCheckBox("New tires");
		GridBagConstraints gbc_chkTires = new GridBagConstraints();
		gbc_chkTires.insets = new Insets(0, 0, 5, 5);
		gbc_chkTires.gridx = 1;
		gbc_chkTires.gridy = 4;
		panel_2_3_1.add(chkTires, gbc_chkTires);
		
		JCheckBox chkRadio = new JCheckBox("Radio Upgrade");
		GridBagConstraints gbc_chkRadio = new GridBagConstraints();
		gbc_chkRadio.insets = new Insets(0, 0, 5, 5);
		gbc_chkRadio.gridx = 2;
		gbc_chkRadio.gridy = 4;
		panel_2_3_1.add(chkRadio, gbc_chkRadio);
		
		JCheckBox chkSus = new JCheckBox("New Suspension");
		GridBagConstraints gbc_chkSus = new GridBagConstraints();
		gbc_chkSus.insets = new Insets(0, 0, 5, 5);
		gbc_chkSus.gridx = 1;
		gbc_chkSus.gridy = 5;
		panel_2_3_1.add(chkSus, gbc_chkSus);
		
		JCheckBox chkWing = new JCheckBox("Rear Wing Upgrade");
		GridBagConstraints gbc_chkWing = new GridBagConstraints();
		gbc_chkWing.insets = new Insets(0, 0, 5, 5);
		gbc_chkWing.gridx = 2;
		gbc_chkWing.gridy = 5;
		panel_2_3_1.add(chkWing, gbc_chkWing);
		
		JCheckBox chkBrakes = new JCheckBox("New Brakes");
		GridBagConstraints gbc_chkBrakes = new GridBagConstraints();
		gbc_chkBrakes.insets = new Insets(0, 0, 0, 5);
		gbc_chkBrakes.gridx = 1;
		gbc_chkBrakes.gridy = 6;
		panel_2_3_1.add(chkBrakes, gbc_chkBrakes);
		
		JCheckBox chkUnderglow = new JCheckBox("Underglow");
		GridBagConstraints gbc_chkUnderglow = new GridBagConstraints();
		gbc_chkUnderglow.insets = new Insets(0, 0, 0, 5);
		gbc_chkUnderglow.gridx = 2;
		gbc_chkUnderglow.gridy = 6;
		panel_2_3_1.add(chkUnderglow, gbc_chkUnderglow);
		
		JPanel panel_2_2_2 = new JPanel();
		panel_2_2_2.setBorder(new MatteBorder(14, 14, 14, 14, (Color) new Color(128, 128, 128)));
		panel_2_2_2.setBounds(386, 494, 364, 75);
		panel.add(panel_2_2_2);
		
		JButton btnTotal = new JButton("Total");
		btnTotal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (chkDark.isSelected())
				{
					itemcost[0]=150;
				} else {
					itemcost[0] = 0; 
				}
				if (chktAir.isSelected())
				{
					itemcost[1]=50;
				}else {
					itemcost[1] = 0;
				}
				if (chkTint.isSelected())
				{
					itemcost[2]=100;
				}else {
					itemcost[2] = 0;
				}
				if (chkSpark.isSelected())
				{
					itemcost[3]=250;
				}
				else {
					itemcost[3] = 0;
				}
				if (chkBlack.isSelected())
				{
					itemcost[4]=450;
				}else {
					itemcost[4] = 0;
				}
				if (chkTail.isSelected())
				{
					itemcost[5]=180;
				}else {
					itemcost[5] = 0;
				}
				if (chkTires.isSelected())
				{
					itemcost[6]=600;
				}else {
					itemcost[6] = 0;
				}
				if (chkRadio.isSelected())
				{
					itemcost[7]=850;
				}else {
					itemcost[7] = 0;
				}
				if (chkSus.isSelected())
				{
					itemcost[8]=750;
				}else {
					itemcost[8] = 0;
				}
				if (chkWing.isSelected())
				{
					itemcost[9]=1000;
				}else {
					itemcost[9] = 0;
				}
				if (chkBrakes.isSelected())
				{
					itemcost[10]=300;
				}else {
					itemcost[10] = 0;
				}
				if (chkUnderglow.isSelected())
				{
					itemcost[11]=100;
				}else {
					itemcost[11] = 0;
				}
				itemcost[12] = itemcost[0]+ itemcost[1]+itemcost[2]+itemcost[3]+itemcost[4]+itemcost[5]+itemcost[6]+ itemcost[7]+ itemcost[8]+ itemcost[9]+ itemcost[10]+ itemcost[11];
				
				iTax = String.format("$ %.2f", itemcost [12]/100);
				iSubTotal = String.format("$ %.2f", itemcost [12]);
				iTotal= String.format("$ %.2f", itemcost [12]+ (itemcost[12]/100));
				
				jtxtTax.setText(iTax);
				jtxtSubTotal.setText(iSubTotal);
				jtxtTotal.setText(iTotal);
				
			
				
			}
		});
		btnTotal.setFont(new Font("Tahoma", Font.PLAIN, 15));
		panel_2_2_2.add(btnTotal);
		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				jtxtFirstName.setText("");
				jtxtLastName.setText("");
				jtxtEmail.setText("");
				jtxtDOB.setText("");
				jtxtPhone.setText("");
				jtxtAddress.setText("");
				jtxtZip.setText("");
				
				jtxtTax.setText("");
				jtxtSubTotal.setText("");
				jtxtTotal.setText("");
				
				comboBox_3.setSelectedIndex(0); 
				comboBox_1.setSelectedIndex(0); 
				comboBox_2.setSelectedIndex(0); 
				comboBox_4.setSelectedIndex(0); 
				comboBox_5.setSelectedIndex(0); 
				comboBox.setSelectedIndex(0); 
				
				chkDark.setSelected(false);
				chkTint.setSelected(false);
				chkBlack.setSelected(false);
				chkTires.setSelected(false);
				chkSus.setSelected(false);
				chkBrakes.setSelected(false);
				chktAir.setSelected(false);
				chkSpark.setSelected(false);
				chkTail.setSelected(false);
				chkRadio.setSelected(false);
				chkWing.setSelected(false);
				chkUnderglow.setSelected(false);
			}
		});
		btnReset.setFont(new Font("Tahoma", Font.PLAIN, 15));
		panel_2_2_2.add(btnReset);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					
				frame = new JFrame();
				if (JOptionPane.showConfirmDialog(frame,"Confirm Exit", "Customer Billing",
						JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
					System.exit(0);
				}
				
			}
		});
		btnExit.setFont(new Font("Tahoma", Font.PLAIN, 15));
		panel_2_2_2.add(btnExit);
	}
		}