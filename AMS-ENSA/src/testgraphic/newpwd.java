package testgraphic;

import javax.swing.JPanel;

import CLASSES.Admin;
import CLASSES.Etudiant;
import CLASSES.Personne;
import CLASSES.Prof;

import javax.swing.BoxLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Dimension;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;

import org.eclipse.wb.swing.InfoPnl;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class newpwd extends JPanel {
	private JTextField newmdp;
	
	final String url ="jdbc:mysql://localhost:3306/amsdb";

	/**
	 * Create the panel.
	 */
	public newpwd(final Personne current) {
		setPreferredSize(new Dimension(300, 240));
		setBackground(new Color(141, 189, 218));
		setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(141, 189, 218));
		panel.setPreferredSize(new Dimension(150, 220));
		add(panel);
		panel.setLayout(null);
		
		JPanel changer = new JPanel();
		changer.setBackground(new Color(47, 85, 115));
		changer.setBounds(13, 137, 127, 30);
		panel.add(changer);
		
		JLabel lblNewLabel = new JLabel("CHANGER");
		lblNewLabel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				try {
					//Class.forName("com.mysql.jdbc.Driver");
					
					Connection con1 = null;
					
					con1 = DriverManager.getConnection(url,"root","PFH#23kgrw9");
					Statement stat1 = con1.createStatement();
					String upquery = "";
					if(current instanceof Prof) {
						
						 upquery=String.format("update Prof set pwd='%s' where code_prof =%s;",newmdp.getText(),((Prof) current).getCode_prof());
						 System.out.println(upquery);
					}
					
					if(current instanceof Admin) {
						
						 upquery=String.format("update Admin set pwd='%s' where code_ad ='%s';",newmdp.getText(),((Admin) current).getCode_ad());
						 System.out.println(upquery);
					}
					
					if(current instanceof Etudiant) {
						
						 upquery=String.format("update etudiant set pwd='%s' where appogee =%s;",newmdp.getText(),((Etudiant) current).getAppogee());
						 System.out.println(upquery);
					}
				
					stat1.executeUpdate(upquery);
					setVisible(false);
					test.frame.setContentPane(test.contentPane1);
				} 
				 catch (SQLException e4) {
					// TODO Auto-generated catch block
					e4.printStackTrace();
				 }
				
			}
		});
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Fredoka Light", Font.PLAIN, 18));
		lblNewLabel.setBackground(new Color(47, 85, 115));
		changer.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel(" nouveau password");
		lblNewLabel_1.setBounds(3, 31, 147, 20);
		lblNewLabel_1.setFont(new Font("Fredoka Light", Font.PLAIN, 16));
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_4 = new JLabel("     ");
		lblNewLabel_4.setBounds(3, 62, 15, 14);
		panel.add(lblNewLabel_4);
		
		newmdp = new JTextField();
		newmdp.setBackground(new Color(208, 233, 242));
		newmdp.setFont(new Font("Fredoka Light", Font.PLAIN, 18));
		newmdp.setBounds(13, 76, 127, 30);
		newmdp.setPreferredSize(new Dimension(150, 30));
		panel.add(newmdp);
		newmdp.setColumns(10);
		
		

	}

}
