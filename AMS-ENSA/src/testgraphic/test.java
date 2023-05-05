package testgraphic;
import java.sql.*;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JLabel;
import CLASSES.Admin;
import CLASSES.Etudiant;
import CLASSES.Prof;
import MESEXCEPTIONS.LoginExcep;

import java.awt.Font;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JPasswordField;
import javax.swing.border.MatteBorder;
import java.awt.Cursor;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;
import org.eclipse.wb.swing.FocusTraversalOnArray;
import java.awt.Component;

@SuppressWarnings("serial")
public class test extends JFrame {
	
	public  static JPanel contentPane1;
	private JTextField txtId;
	private JPasswordField pwdPassword;
	public static test  frame ;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					 frame = new test();
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
	public test() {
		setForeground(new Color(208, 233, 242));
		setFont(new Font("Fredoka Light", Font.PLAIN, 12));
		setTitle("ENSA");
		setAutoRequestFocus(true);
		setIconImage(Toolkit.getDefaultToolkit().getImage(test.class.getResource("/icons/ICON.png")));
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(10, 10, 1128, 739);
		
		contentPane1 = new JPanel();
		contentPane1.setToolTipText("");
		contentPane1.setBorder(new MatteBorder(6, 1, 1, 1, (Color) new Color(0, 0, 0)));
		
		
		setContentPane(contentPane1);
		contentPane1.setLayout(null);
		final JLabel invalid = new JLabel("invalid user or password");
		
		invalid.setHorizontalAlignment(SwingConstants.CENTER);
		invalid.setFont(new Font("Fredoka One", Font.PLAIN, 16));
		invalid.setForeground(new Color(227, 31, 63));
		invalid.setBounds(440, 383, 237, 24);
		invalid.setVisible(false);
		contentPane1.add(invalid);
		
		final JLabel hidelbl = new JLabel("");
		hidelbl.setBorder(null);
		hidelbl.setBackground(new Color(239, 68, 102));
		hidelbl.setVisible(false);
		
		pwdPassword = new JPasswordField();
		pwdPassword.setFont(new Font("Fredoka One", Font.PLAIN, 16));
		pwdPassword.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				invalid.setVisible(false);
				pwdPassword.setText("");
			}
		});
		pwdPassword.setText("PASSWORD");

		
		pwdPassword.setToolTipText("");
		pwdPassword.setForeground(new Color(255, 255, 255));
		pwdPassword.setBorder(null);

		
		txtId = new JTextField();
		txtId.setText("ID");
		txtId.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				txtId.setText("");
				invalid.setVisible(false);
			}
			
		
		});
		

		

		final JLabel showlbl = new JLabel("");
		showlbl.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				pwdPassword.setEchoChar( (char) 0);
				hidelbl.setVisible(true);
				hidelbl.setEnabled(true);
				showlbl.setEnabled(false);
				showlbl.setVisible(false);
			}
		});
		

		
		final JButton loginbtn = new JButton("LOGIN");
		loginbtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				loginbtn.setBackground(new Color(208, 233, 242));
				loginbtn.setForeground(new Color(47, 85, 115));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				loginbtn.setBackground(new Color(47, 85, 115));
				loginbtn.setForeground(new Color(255, 255, 255));
			}
		});
		
		//---------------------------------------LOGIN ACTION -----------------------------
		loginbtn.addActionListener(new ActionListener() {
			
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent e) {
				String url ="jdbc:mysql://localhost:3306/amsdb";
				try {
					Class.forName("com.mysql.cj.jdbc.Driver");
					try {
						Connection con = DriverManager.getConnection(url,"root","PFH#23kgrw9");
						Statement stat = con.createStatement();
						String user = txtId.getText();
						String pwdlog = "";

						String query ="select count(code_prof ) , pwd from  prof where code_prof ='%s'; ";
						
						System.out.println(String.format(query,user));
						ResultSet ProfSet = stat.executeQuery(String.format(query,user));
						int count=0 ;
						while (ProfSet.next()) { count= ProfSet.getInt(1);
						pwdlog = ProfSet.getString("pwd");
						 }
						System.out.println(pwdlog);
						
						// ----------- select for etudiant ------
						
						String query2 ="select count(appogee) , pwd from  etudiant where appogee ='%s'; ";
		
						System.out.println(String.format(query2,user));
						
						ResultSet EtudSet = stat.executeQuery(String.format(query2,user));
						String pwdlog2 = "";
						int count2=0 ;
						
						while (EtudSet.next()) { count2= EtudSet.getInt(1);
						pwdlog2 = EtudSet.getString("pwd");
						 }
						System.out.println(pwdlog2);
						
						//----------- select for admin -----------
						String query3 ="select count(code_ad ) , pwd from  admin where code_ad ='%s'; ";
						
						System.out.println(String.format(query3,user));
						ResultSet adminSet = stat.executeQuery(String.format(query3,user));
						String pwdlog3 = "";
						int count3=0 ;
						
						while (adminSet.next()) { count3= adminSet.getInt(1);
						pwdlog3 = adminSet.getString("pwd");
						 }
						System.out.println(pwdlog3);
						

							if (count>0 && pwdPassword.getText().equals(pwdlog) ) {
							query =String.format("select* from prof where code_prof=%s;",user);
							ProfSet =stat.executeQuery(query);
							System.out.println("en prof");
							String nom ="";
							String prenom ="";
							String cne="" ;
							int tel = 0 ;
							float Salaire= 0 ;
							String statut="" ;
							String nom_dep="";
							int code_prof =0;
							while(ProfSet.next()) {
								nom = ProfSet.getString("nom");
								prenom = ProfSet.getString("prenom");
								cne =ProfSet.getString("cne");
								tel = ProfSet.getInt("tel");
								Salaire = ProfSet.getFloat("salaire");
								statut = ProfSet.getString("statut");
								code_prof = ProfSet.getInt("code_prof");
								nom_dep = ProfSet.getString("nom_dep");
								
							}
							System.out.println(statut);
							Prof current = new Prof(cne,code_prof ,nom ,prenom,tel,pwdlog ,statut ,Salaire,nom_dep);
							System.out.println(current);
							
							//contentPane1.setVisible(false);
							Espace_prof EP =new Espace_prof( current);
							setContentPane(EP);
							}else
								//System.out.println(count2);
							//System.out.println(pwdlog2);
								if(count2>0 && pwdPassword.getText().equals(pwdlog2))
								{
									query =String.format("select* from Etudiant where appogee=%s;",user);
									EtudSet =stat.executeQuery(query);
									System.out.println("en etudiant");
									String nom ="";
									String prenom ="";
									String cne="" ;
									int tel = 0 ;
									int appogee =0 ;
									String nom_cl ="";
									while(EtudSet.next()) {
										nom = EtudSet.getString("nom");
										prenom = EtudSet.getString("prenom");
										cne =EtudSet.getString("cne");
										tel = EtudSet.getInt("tel");
										appogee = EtudSet.getInt("appogee");
										pwdlog = EtudSet.getString("pwd");
										nom_cl = EtudSet.getString("nom_cl");
										
										
									}
									System.out.println(nom_cl);
									Etudiant current = new Etudiant(cne,nom ,prenom,tel,pwdlog ,appogee ,nom_cl);
									System.out.println(current);
									
									//contentPane1.setVisible(false);
									Espace_Etudiant EP =new Espace_Etudiant( current);
									//setContentPane(EP);
									setContentPane(EP);
								
								}
								else
									if (count3>0 && pwdPassword.getText().equals(pwdlog3) ) 
										{
										System.out.println(user);
										query =String.format("select* from admin where code_ad='%s';",user);
										System.out.println(query);
										adminSet =stat.executeQuery(query);
										System.out.println("en admin");
										String nom ="";
										String prenom ="";
										String cne="" ;
										int tel = 0 ;
										String code_ad ="" ;
										String nom_fil ="";
										while(adminSet.next()) {
											nom = adminSet.getString("nom");
											prenom = adminSet.getString("prenom");
											cne =adminSet.getString("cne");
											tel = adminSet.getInt("tel");
											pwdlog = adminSet.getString("pwd");
											code_ad= adminSet.getString("code_ad");
											nom_fil = adminSet.getString("nom_fil");
											
											
										}
										System.out.println(nom_fil);
										Admin current = new Admin(cne,nom ,prenom,tel,pwdlog ,code_ad,nom_fil);
										System.out.println(current);
										
										
										Espace_Admin EP =new Espace_Admin( current);
										setContentPane(EP);
										
										//contentPane1.setVisible(false);
									
										}else throw new LoginExcep();
							
						
						} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					} catch (LoginExcep e1) {
							// TODO Auto-generated catch block
						System.out.println(e1.getMessage());
							//JOptionPane.showMessageDialog(null, "INVALID USER OR PASSWORD");
						invalid.setVisible(true);

							}
				} catch (ClassNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

				
			}
		});
		
		

		

		
		JLabel lblNewLabel_2_1_1 = new JLabel(" ALI AFECHTAL");
		lblNewLabel_2_1_1.setForeground(new Color(227, 31, 63));
		lblNewLabel_2_1_1.setFont(new Font("Fredoka Medium", Font.PLAIN, 12));
		lblNewLabel_2_1_1.setBounds(30, 621, 151, 32);
		contentPane1.add(lblNewLabel_2_1_1);
		
		JLabel lblNewLabel_2_1 = new JLabel(" YOUSSEF ELRHADIR");
		lblNewLabel_2_1.setForeground(new Color(227, 31, 63));
		lblNewLabel_2_1.setFont(new Font("Fredoka Medium", Font.PLAIN, 12));
		lblNewLabel_2_1.setBounds(30, 602, 151, 32);
		contentPane1.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2 = new JLabel("© MOUAD ELRHARBI");
		lblNewLabel_2.setForeground(new Color(227, 31, 63));
		lblNewLabel_2.setFont(new Font("Fredoka Medium", Font.PLAIN, 12));
		lblNewLabel_2.setBounds(20, 583, 151, 32);
		contentPane1.add(lblNewLabel_2);
		


		loginbtn.setBorder(null);
		loginbtn.setBackground(new Color(47, 85, 115));
		loginbtn.setForeground(new Color(255, 255, 255));
		loginbtn.setFont(new Font("Fredoka One", Font.PLAIN, 22));
		loginbtn.setBounds(482, 445, 145, 43);
		contentPane1.add(loginbtn);
		
		showlbl.setBorder(null);
		showlbl.setBackground(new Color(239, 68, 102));
		showlbl.setIcon(new ImageIcon(test.class.getResource("/icons/icons8_eye_24px.png")));
		showlbl.setBounds(681, 334, 24, 24);
		contentPane1.add(showlbl);
		hidelbl.setIcon(new ImageIcon(test.class.getResource("/icons/icons8_hide_24px.png")));
		hidelbl.setBounds(681, 334, 24, 24);
		contentPane1.add(hidelbl);
		txtId.setForeground(new Color(255, 255, 255));
		txtId.setBorder(null);
		txtId.setCursor(Cursor.getPredefinedCursor(Cursor.TEXT_CURSOR));
		txtId.setBackground(new Color(47, 85, 115));
		txtId.setFont(new Font("Fredoka One", Font.PLAIN, 16));
		txtId.setBounds(440, 266, 237, 20);
		contentPane1.add(txtId);
		
		
		hidelbl.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				pwdPassword.setEchoChar((char ) 8226);
				hidelbl.setVisible(false);
				hidelbl.setEnabled(false);
				showlbl.setEnabled(true);
				showlbl.setVisible(true);
				
			}
		});
		
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(test.class.getResource("/icons/LOGO-ENSAK-800.png")));
		lblNewLabel_1.setForeground(new Color(239, 68, 102));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Fredoka One", Font.PLAIN, 26));
		lblNewLabel_1.setBounds(482, 546, 145, 91);
		contentPane1.add(lblNewLabel_1);
		pwdPassword.setBackground(new Color(47, 85, 115));
		pwdPassword.setBounds(440, 334, 237, 20);
		contentPane1.add(pwdPassword);
	
		
		JLabel userloginlbl = new JLabel("USER LOGIN");
		userloginlbl.setForeground(new Color(47, 85, 115));
		userloginlbl.setHorizontalAlignment(SwingConstants.CENTER);
		userloginlbl.setFont(new Font("Fredoka One", Font.PLAIN, 28));
		userloginlbl.setBounds(440, 151, 202, 52);
		contentPane1.add(userloginlbl);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setFont(new Font("Fredoka One", Font.PLAIN, 26));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(0, 0, 1120, 700);
		lblNewLabel.setIcon(new ImageIcon(test.class.getResource("/icons/login2.png")));
		contentPane1.add(lblNewLabel);
		setFocusTraversalPolicy(new FocusTraversalOnArray(new Component[]{contentPane1, loginbtn, showlbl, hidelbl, txtId, lblNewLabel_1, pwdPassword, userloginlbl, lblNewLabel}));
	}


	
}
