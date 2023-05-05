package testgraphic;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Rectangle;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import org.eclipse.wb.swing.FocusTraversalOnArray;
import org.eclipse.wb.swing.InfoPnl;

import CLASSES.EnsaClass;
import CLASSES.Etudiant;
import CLASSES.Prof;

public class Espace_Etudiant extends JPanel {

	protected static final JPanel contentPane1 = null;
	final String url ="jdbc:mysql://localhost:3306/amsdb";
	protected static  JPanel etudlst = new JPanel();

	/**
	 * Create the panel.
	 */
	public Espace_Etudiant(Etudiant current) {
		setName("Esp_Etud");
		setSize(new Dimension(1120, 700));
		setBounds(new Rectangle(0, 0, 1120, 700));
		setBackground(new Color(208, 233, 242));
		setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(47, 85, 115));
		panel.setBounds(0, 0, 247, 700);
		add(panel);
		panel.setLayout(null);
		
		

		
		

		
		final JLabel lblNewLabel_2 = new JLabel("");
		final JPanel modulepnl = new JPanel();
		final JLabel lblmodule = new JLabel(" MODULES");
		 JLayeredPane layeredPane = new JLayeredPane(); 

		
		layeredPane.setBounds(246, 138, 874, 562);
		add(layeredPane);
		
		final Emploi Emp = new Emploi(current);
		Emp.setVisible(true);
		Emp.setBounds(60, 60, 754, 424);
		layeredPane.add(Emp);
		
		
		etudlst.setBounds(60,60,754,424);
		etudlst.setVisible(true);
		layeredPane.add(etudlst);
		

		//------------- classes container ------------------
		
		final JPanel sanctcont = new JPanel();
		sanctcont.setBackground(new Color(208, 233, 242));
		sanctcont.setFont(new Font("Myriad Pro", Font.PLAIN, 12));
		sanctcont.setBounds(60, 60, 754, 424);
		layeredPane.add(sanctcont);
		sanctcont.setLayout(new FlowLayout(FlowLayout.LEFT, 38, 30));
		
		final JPanel modulecont = new JPanel();
		modulecont.setBackground(new Color(208, 233, 242));
		modulecont.setFont(new Font("Myriad Pro", Font.PLAIN, 12));
		layeredPane.setLayer(modulecont,1);
		modulecont.setBounds(60, 60, 754, 424);
		layeredPane.add(modulecont);
		modulecont.setLayout(new FlowLayout(FlowLayout.LEFT, 30, 30));
		
		final JPanel infopers = new JPanel();
		infopers.setFont(new Font("Myriad Pro", Font.PLAIN, 12));
		infopers.setBackground(new Color(208, 233, 242));
		infopers.setBounds(60, 60, 754, 424);
		
		infopers.add(new InfoPnl(current));
		layeredPane.add(infopers);
		infopers.setLayout(new FlowLayout(FlowLayout.LEFT, 38, 30));
		
		modulepnl.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				modulepnl.setBackground(new Color(208, 233, 242));
				lblmodule.setForeground(new Color(47, 85, 115));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				modulepnl.setBackground(new Color(47, 85, 115));
				lblmodule.setForeground(new Color(255, 255, 255));
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				sanctcont.setVisible(false);
				modulecont.setVisible(true);
				Emp.setVisible(false);
				etudlst.setVisible(false);
				infopers.setVisible(false);
				modulepnl.setBackground(new Color(154,199,217));
				lblmodule.setForeground(new Color(255,255,255));
			}
		});
		
		modulepnl.setBackground(new Color(47, 85, 115));
		modulepnl.setBounds(10, 254, 227, 60);
		panel.add(modulepnl);
		modulepnl.setLayout(new FlowLayout(FlowLayout.LEFT, 10, 10));
		
		JLabel lblNewLabel_4_1 = new JLabel("");
		modulepnl.add(lblNewLabel_4_1);
		
		
		lblNewLabel_2.setFont(new Font("Fredoka One", Font.PLAIN, 22));
		lblNewLabel_2.setIcon(new ImageIcon(Espace_prof.class.getResource("/icons/book-of-black-cover-closed.png")));
		modulepnl.add(lblNewLabel_2);
		
		

		
		lblmodule.setForeground(new Color(255, 255, 255));
		lblmodule.setFont(new Font("Fredoka Light", Font.PLAIN, 20));
		modulepnl.add(lblmodule);
		
		final JPanel sancpnl = new JPanel();
		
		sancpnl.setBackground(new Color(47, 85, 115));
		FlowLayout fl_sancpnl = (FlowLayout) sancpnl.getLayout();
		fl_sancpnl.setAlignment(FlowLayout.LEFT);
		fl_sancpnl.setHgap(10);
		fl_sancpnl.setVgap(10);
		sancpnl.setBounds(10, 396, 227, 60);
		panel.add(sancpnl);
		
		JLabel lblNewLabel_8_1_1 = new JLabel("");
		sancpnl.add(lblNewLabel_8_1_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("");
		lblNewLabel_1_1.setIcon(new ImageIcon(Espace_Etudiant.class.getResource("/icons/hammer.png")));
		sancpnl.add(lblNewLabel_1_1);
		
		final JLabel classeslbl = new JLabel("SANCTIONS");
		classeslbl.setHorizontalAlignment(SwingConstants.LEFT);
		classeslbl.setForeground(Color.WHITE);
		classeslbl.setFont(new Font("Fredoka Light", Font.PLAIN, 20));
		sancpnl.add(classeslbl);
		
		sancpnl.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				sancpnl.setBackground(new Color(208, 233, 242));
				classeslbl.setForeground(new Color(47, 85, 115));
				
			}
			@Override
			public void mouseExited(MouseEvent e) {
				sancpnl.setBackground(new Color(47, 85, 115));
				classeslbl.setForeground(new Color(255, 255, 255));
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				sanctcont.setVisible(true);
				modulecont.setVisible(false);
				Emp.setVisible(false);
				etudlst.setVisible(false);
				infopers.setVisible(false);
			}
		});

		
		final JPanel panel_1_3_1 = new JPanel();
		final JLabel lblNewLabel_5_1_1 = new JLabel(" LOGOUT");
		panel_1_3_1.addMouseListener(new MouseAdapter() {

			@Override
			public void mouseEntered(MouseEvent e) {
				panel_1_3_1.setBackground(new Color(208, 233, 242));
				lblNewLabel_5_1_1.setForeground(new Color(47, 85, 115));
				
				
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				panel_1_3_1.setBackground(new Color(47, 85, 115));
				lblNewLabel_5_1_1.setForeground(new Color(255, 255, 255));
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				setVisible(false);
				test.frame.setContentPane(test.contentPane1);
				
				
			}
		});
		
		
		panel_1_3_1.setBackground(new Color(47, 85, 115));
		panel_1_3_1.setBounds(10, 615, 227, 60);
		panel.add(panel_1_3_1);
		panel_1_3_1.setLayout(new FlowLayout(FlowLayout.LEFT, 10, 10));
		
		JLabel lblNewLabel_2_1 = new JLabel("");
		lblNewLabel_2_1.setFont(new Font("Fredoka One", Font.PLAIN, 22));
		panel_1_3_1.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_9 = new JLabel("");
		lblNewLabel_9.setIcon(new ImageIcon(Espace_prof.class.getResource("/icons/logout (3).png")));
		panel_1_3_1.add(lblNewLabel_9);
		
		
		lblNewLabel_5_1_1.setForeground(Color.WHITE);
		lblNewLabel_5_1_1.setFont(new Font("Fredoka Light", Font.PLAIN, 20));
		panel_1_3_1.add(lblNewLabel_5_1_1);
		
		
		
		
		final JPanel panel_1 = new JPanel();
		final JLabel lblNewLabel_11 = new JLabel("New label");
		lblNewLabel_11.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				lblNewLabel_11.setForeground(new Color(208, 233, 242));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				lblNewLabel_11.setForeground(new Color(255, 255, 255));

			}
			@Override
			public void mouseClicked(MouseEvent e) {
				sanctcont.setVisible(false);
				modulecont.setVisible(false);
				infopers.setVisible(true);
				Emp.setVisible(false);
				etudlst.setVisible(false);
			}});
				
	

		panel_1.setBackground(new Color(47, 85, 115));
		panel_1.setFont(new Font("Fredoka One", Font.PLAIN, 26));
		panel_1.setForeground(new Color(255, 255, 255));
		panel_1.setBounds(10, 11, 227, 130);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_10 = new JLabel("");
		lblNewLabel_10.setBounds(81, 0, 64, 64);
		lblNewLabel_10.setIcon(new ImageIcon(Espace_prof.class.getResource("/icons/profile (2).png")));
		lblNewLabel_10.setAlignmentX(Component.CENTER_ALIGNMENT);
		panel_1.add(lblNewLabel_10);
		
		
		lblNewLabel_11.setForeground(new Color(255, 255, 255));
		lblNewLabel_11.setFont(new Font("Fredoka One", Font.PLAIN, 14));
		lblNewLabel_11.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_11.setBounds(10, 85, 207, 34);
		lblNewLabel_11.setText("MR "+current.getNom()+" "+current.getPrenom());
		panel_1.add(lblNewLabel_11);
		
		JLabel lblNewLabel_12 = new JLabel("");
		lblNewLabel_12.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_12.setIcon(new ImageIcon(Espace_prof.class.getResource("/icons/remove (2).png")));
		lblNewLabel_12.setBounds(10, 152, 227, 37);
		panel.add(lblNewLabel_12);
		
		final JPanel empnl = new JPanel();
		FlowLayout fl_empnl = (FlowLayout) empnl.getLayout();
		fl_empnl.setVgap(10);
		fl_empnl.setHgap(10);
		fl_empnl.setAlignment(FlowLayout.LEFT);
		
		JLabel lblNewLabel_8_1 = new JLabel("");
		empnl.add(lblNewLabel_8_1);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(Espace_prof.class.getResource("/icons/calendar (4).png")));
		empnl.add(lblNewLabel);
		
		final JLabel lblEmploi = new JLabel("EMPLOI");
		lblEmploi.setForeground(Color.WHITE);
		lblEmploi.setFont(new Font("Fredoka Light", Font.PLAIN, 20));
		empnl.add(lblEmploi);
		empnl.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				sanctcont.setVisible(false);
				modulecont.setVisible(false);
				infopers.setVisible(false);
				Emp.setVisible(true);
				etudlst.removeAll();
				etudlst.setVisible(false);
				infopers.setVisible(false);
				
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				empnl.setBackground(new Color(208, 233, 242));
				lblEmploi.setForeground(new Color(47, 85, 115));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				empnl.setBackground(new Color(47, 85, 115));
				lblEmploi.setForeground(new Color(255, 255, 255));
			}
		});
		empnl.setBackground(new Color(47, 85, 115));
		empnl.setBounds(10, 325, 227, 60);
		panel.add(empnl);
		
		
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(208, 233, 242));
		panel_2.setBounds(246, 0, 874, 50);
		add(panel_2);
		panel_2.setLayout(null);
		JLabel date = new JLabel("New label");
		date.setFont(new Font("Fredoka Light", Font.PLAIN, 20));
		date.setBounds(59, 11, 130, 28);
		date.setForeground(new Color(47, 85, 115));
		
		//------------- date --------
		  Date currentDate = new Date();

	        // Create a SimpleDateFormat object with the desired format
	        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

	        // Format the current date as a string
	        String dateString = dateFormat.format(currentDate);
		date.setText(dateString);
		panel_2.add(date);
		setFocusTraversalPolicy(new FocusTraversalOnArray(new Component[]{panel, modulepnl, lblNewLabel_2, lblmodule, sancpnl, panel_1_3_1, lblNewLabel_2_1, lblNewLabel_9, lblNewLabel_5_1_1, panel_1, lblNewLabel_10, lblNewLabel_11, lblNewLabel_12, panel_2, layeredPane}));
		

		//----------------------------- sanct space -----------------------
		
		Connection con1 = null;
		try {
			con1 = DriverManager.getConnection(url,"root","PFH#23kgrw9");
		} catch (SQLException e4) {
			// TODO Auto-generated catch block
			e4.printStackTrace();
		}
		String cquery = "select * from etudmod where appogee=%s and sanction is not null ;";
		ResultSet claset = null;
		Statement stat1 = null;
		try {
			stat1 = con1.createStatement();
		} catch (SQLException e3) {
			// TODO Auto-generated catch block
			e3.printStackTrace();
		}
		try {
			claset = stat1.executeQuery(String.format(cquery, current.getAppogee()));
		} catch (SQLException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
		try {
			while (claset.next()) {
				final JPanel cla = new JPanel();
				cla.setBounds(ALLBITS, ABORT, 200, 100);
				cla.setBackground(new Color(86, 135, 166));
				
				
				cla.setLayout(new FlowLayout());
				
				
				
				final JPanel cbox = new JPanel();
				cbox.setLayout(new BoxLayout(cbox, BoxLayout.Y_AXIS));
				
				
				final JLabel singlecl = new JLabel("New label");
				singlecl.setHorizontalAlignment(SwingConstants.CENTER);
				singlecl.setFont(new Font("Fredoka One", Font.PLAIN, 18));
				singlecl.setBackground(new Color(86, 135, 166));
				singlecl.setBounds(ALLBITS, ABORT, 200, 100);
				singlecl.setText(claset.getString("nom_mod"));
				singlecl.setForeground(new Color(249,249,249));
				cla.setPreferredSize(new Dimension(200, 100));
				
				final JLabel dep = new JLabel("new");
				dep.setText(claset.getString("nbh_abs"));
				dep.setFont(new Font("Myriad Pro", Font.PLAIN, 18));
				dep.setForeground(new Color(154,199,217));
				
				JLabel line = new JLabel();
				line.setIcon(new ImageIcon(Espace_prof.class.getResource("/icons/line.png")));
				
				
				JLabel sanc = new JLabel("new");
				sanc.setText(claset.getString("sanction"));
				sanc.setFont(new Font("Myriad Pro", Font.PLAIN, 18));
				sanc.setForeground(new Color(222,31,39));

				cbox.setBackground(new Color(86, 135, 166));
				cbox.add(singlecl);
				
				cbox.add(Box.createRigidArea(new Dimension(10, 10)));
				cbox.add(line);
				cbox.add(Box.createRigidArea(new Dimension(10, 10)));
				
				cbox.add(Box.createRigidArea(new Dimension(5, 5)));
				cbox.add(sanc);
				
				cbox.add(dep);
				cla.add(cbox);
				
				
				cla.addMouseListener(new MouseAdapter() {

					@Override
					public void mouseEntered(MouseEvent e) {
					
						cla.setBackground(new Color(154, 199, 217));
						cbox.setBackground(new Color(154, 199, 217));
						
						singlecl.setForeground(new Color(47, 85, 115));
						
					//	nbhmod.setForeground(new Color(255,255,255));
						dep.setForeground(new Color(255,255,255));
						
					
						
						
					}
					public void mouseExited(MouseEvent e) {
						
						cla.setBackground(new Color(86, 135, 166));
						cbox.setBackground(new Color(86, 135, 166));
						singlecl.setForeground(new Color(255, 255, 255));
						
					//	nbhmod.setForeground(new Color(154,199,217));
						dep.setForeground(new Color(154,199,217));
					}
					
					   
					public void mouseClicked(MouseEvent e) {
						
						
					}
					
				});
				
				
				
				sanctcont.add(cla);
				
				
				
			
			}
		} catch (SQLException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
		
		// -------------------------- seance space ---------------
		
/*
		String Squery = "select * from seance where sdate= (SELECT DATE(NOW()) as currentDate) and code_prof = %s;";
		 ResultSet seaset = null;
		Statement stat2 = null;

		
		try {
			stat2 = con1.createStatement();
		} catch (SQLException e3) {
			// TODO Auto-generated catch block
			e3.printStackTrace();
		}
		try {
			seaset = stat2.executeQuery(String.format(Squery, current.getCode_prof()));
			
		} catch (SQLException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
		try {
			while (seaset.next()) {
				final JPanel mod = new JPanel();
				mod.setBounds(ALLBITS, ABORT, 200, 100);
				mod.setBackground(new Color(86, 135, 166));
				mod.setLayout(new FlowLayout());
				
				final JPanel box = new JPanel();
				box.setLayout(new BoxLayout(box, BoxLayout.Y_AXIS));
				
				
				final JLabel singlemod = new JLabel("New label");
				singlemod.setHorizontalAlignment(SwingConstants.CENTER);
				singlemod.setFont(new Font("Fredoka One", Font.PLAIN, 18));
				singlemod.setBackground(new Color(86, 135, 166));
				singlemod.setBounds(ALLBITS, ABORT, 200, 100);
				singlemod.setText("Seance : "+seaset.getString("num")+" / "+seaset.getString("module"));
				singlemod.setForeground(new Color(249,249,249));
				mod.setPreferredSize(new Dimension(200, 100));
				
				final String num1 = seaset.getString("num");
				final String modl = seaset.getString("module");
				
				final JLabel nbhmod = new JLabel("new");
				nbhmod.setText(seaset.getString("nom_cl")+"  :  "+seaset.getString("HDEP"));
				nbhmod.setFont(new Font("Myriad Pro", Font.PLAIN, 16));
				nbhmod.setForeground(new Color(154,199,217));
				
				JLabel line = new JLabel();
				line.setIcon(new ImageIcon(Espace_prof.class.getResource("/icons/line.png")));
				

				box.setBackground(new Color(86, 135, 166));
				box.add(singlemod);
				
				box.add(Box.createRigidArea(new Dimension(10, 10)));
				box.add(line);
				box.add(Box.createRigidArea(new Dimension(10, 10)));
				
				box.add(nbhmod);
				final JLabel dure = new JLabel();
				dure.setText("duree  :  "+seaset.getString("duree"));
				dure.setFont(new Font("Myriad Pro", Font.PLAIN, 16));
				dure.setForeground(new Color(154,199,217));
				box.add(dure);
				mod.add(box);
				
				
				
				
				mod.addMouseListener(new MouseAdapter() {

					@Override
					public void mouseEntered(MouseEvent e) {
						mod.setBackground(new Color(154, 199, 217));
						box.setBackground(new Color(154, 199, 217));
						
						singlemod.setForeground(new Color(47, 85, 115));
						
						nbhmod.setForeground(new Color(255,255,255));
						dure.setForeground(new Color(255,255,255));
						
						
						
						
					}

					@Override
					public void mouseExited(MouseEvent e) {
						
						mod.setBackground(new Color(86, 135, 166));
						box.setBackground(new Color(86, 135, 166));
						singlemod.setForeground(new Color(255, 255, 255));
						
						nbhmod.setForeground(new Color(154,199,217));
						dure.setForeground(new Color(154,199,217));
					}
					
					@Override
					public void mouseClicked(MouseEvent e) {
					
						
					}
					
				});
				
				
				seancecont.add(mod);
				
			
			}
		} catch (SQLException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}

		*/
		
		
		// ------------------------------------------ module space --------------------------------
	
		try {
			Connection con = DriverManager.getConnection(url,"root","PFH#23kgrw9");
			String query = "select* from etudmod where appogee=%s ;";
			ResultSet modset;
			Statement stat = con.createStatement();
			modset = stat.executeQuery(String.format(query, current.getAppogee()));
			while (modset.next()) {
				JPanel mod = new JPanel();
				mod.setBounds(ALLBITS, ABORT, 200, 100);
				mod.setBackground(new Color(86, 135, 166));
				mod.setLayout(new FlowLayout());
				
				JPanel box = new JPanel();
				box.setLayout(new BoxLayout(box, BoxLayout.Y_AXIS));
				
				
				JLabel singlemod = new JLabel("New label");
				singlemod.setHorizontalAlignment(SwingConstants.CENTER);
				singlemod.setFont(new Font("Fredoka One", Font.PLAIN, 18));
				singlemod.setBackground(new Color(86, 135, 166));
				singlemod.setBounds(ALLBITS, ABORT, 200, 100);
				singlemod.setText(modset.getString("nom_mod"));
				singlemod.setForeground(new Color(249,249,249));
				mod.setPreferredSize(new Dimension(200, 100));
				
				JLabel nbhmod = new JLabel("new");
				nbhmod.setText(modset.getString("nbh_abs")+" Hr_abs");
				System.out.println(Float.valueOf(modset.getString("nbh_abs")));
				if(Float.valueOf(modset.getString("nbh_abs"))>12.0) {
					
					nbhmod.setForeground(new Color(222,31,39));

				}else {nbhmod.setForeground(new Color(154,199,217));}
				nbhmod.setFont(new Font("Myriad Pro", Font.PLAIN, 18));
				
				
				JLabel note = new JLabel("new");
				note.setText(modset.getString("note")+"/20");
				note.setFont(new Font("Myriad Pro", Font.PLAIN, 18));
				note.setForeground(new Color(154,199,217));
				
				JLabel line = new JLabel();
				line.setIcon(new ImageIcon(Espace_prof.class.getResource("/icons/line.png")));
				

				box.setBackground(new Color(86, 135, 166));
				box.add(singlemod);
				
				box.add(Box.createRigidArea(new Dimension(10, 10)));
				box.add(line);
				box.add(Box.createRigidArea(new Dimension(10, 10)));
				
				box.add(nbhmod);
				box.add(Box.createRigidArea(new Dimension(5, 5)));
				box.add(note);
				
				mod.add(box);
				modulecont.add(mod);
				
			
			}
				
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		

		}

}
