package testgraphic;

import javax.swing.JPanel;

import CLASSES.EnsaClass;
import CLASSES.EtudMod;
import CLASSES.Etudier;
import CLASSES.Prof;

import java.awt.Color;
import java.awt.Rectangle;
import javax.swing.JLayeredPane;
import java.awt.Dimension;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.BoxLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.GridLayout;
import javax.swing.ImageIcon;
import java.awt.FlowLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;

import java.awt.Component;
import javax.swing.SwingConstants;

import javax.swing.Box;

import org.eclipse.wb.swing.FocusTraversalOnArray;
import org.eclipse.wb.swing.InfoPnl;


public class Espace_prof extends JPanel   {

	protected static final JPanel contentPane1 = null;
	final String url ="jdbc:mysql://localhost:3306/amsdb";
	public  JPanel seancecont= new JPanel() ;
	protected static  JPanel etudlst = new JPanel();

	final JPanel controlclass = new JPanel();

	/**
	 * Create the panel.
	 */
	public Espace_prof(Prof current) {
		setName("Esp_p");
		setSize(new Dimension(1120, 700));
		setBounds(new Rectangle(0, 0, 1120, 700));
		setBackground(new Color(208, 233, 242));
		setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(47, 85, 115));
		panel.setBounds(0, 0, 247, 700);
		add(panel);
		panel.setLayout(null);
		
		

		etudlst.setBackground(new Color(208, 233, 242));
		controlclass.setBackground(new Color(208, 233, 242));


		
		final JLabel lblNewLabel_2 = new JLabel("");
		final JPanel modulepnl = new JPanel();
		final JLabel lblmodule = new JLabel(" MODULES");
		final JLabel seancelbl = new JLabel("SEANCES");
		seancelbl.setHorizontalAlignment(SwingConstants.LEFT);
		 final JLayeredPane layeredPane = new JLayeredPane(); 

		
		layeredPane.setBounds(246, 138, 874, 562);
		add(layeredPane);
		
		final Emploi Emp = new Emploi(current);
		Emp.setVisible(true);
		layeredPane.add(Emp);
		
		
		etudlst.setBounds(30,11,834,529);
		etudlst.setVisible(true);
		layeredPane.add(etudlst);
		
		
		//final JPanel seancecont = new JPanel();
		
		
		
		seancecont.setBackground(new Color(208, 233, 242));
		seancecont.setFont(new Font("Myriad Pro", Font.PLAIN, 12));
		seancecont.setBounds(30, 11, 834, 529);
		
		seancecont.setLayout(new FlowLayout(FlowLayout.LEFT, 60, 40));
		layeredPane.add(seancecont);
		
		layeredPane.add(controlclass);


		//------------- classes container ------------------
		
		final JPanel classescont = new JPanel();
		classescont.setBackground(new Color(208, 233, 242));
		classescont.setFont(new Font("Myriad Pro", Font.PLAIN, 12));
		classescont.setBounds(30, 11, 834, 529);
		layeredPane.add(classescont);
		classescont.setLayout(new FlowLayout(FlowLayout.LEFT, 38, 30));
		
		final JPanel modulecont = new JPanel();
		modulecont.setBackground(new Color(208, 233, 242));
		modulecont.setFont(new Font("Myriad Pro", Font.PLAIN, 12));
		layeredPane.setLayer(modulecont,1);
		modulecont.setBounds(30, 11, 834, 529);
		layeredPane.add(modulecont);
		modulecont.setLayout(new FlowLayout(FlowLayout.LEFT, 30, 30));
		
		final JPanel infopers = new JPanel();
		infopers.setFont(new Font("Myriad Pro", Font.PLAIN, 12));
		infopers.setBackground(new Color(208, 233, 242));
		infopers.setBounds(30, 11, 834, 529);
		
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
				classescont.setVisible(false);
				controlclass.setVisible(false);

				modulecont.setVisible(true);
				seancecont.setVisible(false);
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
		

		

		
		
		final JPanel seancepnl = new JPanel();

		seancepnl.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				seancepnl.setBackground(new Color(208, 233, 242));
				seancelbl.setForeground(new Color(47, 85, 115));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				seancepnl.setBackground(new Color(47, 85, 115));
				seancelbl.setForeground(new Color(255, 255, 255));
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				classescont.setVisible(false);
				controlclass.setVisible(false);

				modulecont.setVisible(false);
				seancecont.setVisible(true);
				Emp.setVisible(false);
				etudlst.setVisible(false);
				infopers.setVisible(false);
				
				
			}
		});
		seancepnl.setBackground(new Color(47, 85, 115));
		FlowLayout fl_seancepnl = (FlowLayout) seancepnl.getLayout();
		fl_seancepnl.setVgap(10);
		fl_seancepnl.setHgap(10);
		fl_seancepnl.setAlignment(FlowLayout.LEFT);
		seancepnl.setBounds(10, 325, 227, 60);
		panel.add(seancepnl);
		
		JLabel lblNewLabel_4 = new JLabel("");
		//lblNewLabel_4.setIcon(new ImageIcon(Espace_prof.class.getResource("/icons/calendar (2) (1).png")));
		seancepnl.add(lblNewLabel_4);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(Espace_prof.class.getResource("/icons/clock.png")));
		seancepnl.add(lblNewLabel_1);
		
		
		seancelbl.setForeground(new Color(255, 255, 255));
		seancelbl.setFont(new Font("Fredoka Light", Font.PLAIN, 20));
		seancepnl.add(seancelbl);
		
		final JPanel classpnl = new JPanel();
		
		classpnl.setBackground(new Color(47, 85, 115));
		FlowLayout fl_classpnl = (FlowLayout) classpnl.getLayout();
		fl_classpnl.setAlignment(FlowLayout.LEFT);
		fl_classpnl.setHgap(10);
		fl_classpnl.setVgap(10);
		classpnl.setBounds(10, 396, 227, 60);
		panel.add(classpnl);
		
		JLabel lblNewLabel_8_1_1 = new JLabel("");
		classpnl.add(lblNewLabel_8_1_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("");
		lblNewLabel_1_1.setIcon(new ImageIcon(Espace_prof.class.getResource("/icons/students-cap.png")));
		classpnl.add(lblNewLabel_1_1);
		
		final JLabel classeslbl = new JLabel("CLASSES");
		classeslbl.setHorizontalAlignment(SwingConstants.LEFT);
		classeslbl.setForeground(Color.WHITE);
		classeslbl.setFont(new Font("Fredoka Light", Font.PLAIN, 20));
		classpnl.add(classeslbl);
		
		classpnl.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				classpnl.setBackground(new Color(208, 233, 242));
				classeslbl.setForeground(new Color(47, 85, 115));
				
			}
			@Override
			public void mouseExited(MouseEvent e) {
				classpnl.setBackground(new Color(47, 85, 115));
				classeslbl.setForeground(new Color(255, 255, 255));
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				classescont.setVisible(true);
				controlclass.setVisible(false);

				modulecont.setVisible(false);
				seancecont.setVisible(false);
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
				classescont.setVisible(false);
				controlclass.setVisible(false);

				modulecont.setVisible(false);
				infopers.setVisible(true);
				seancecont.setVisible(false);
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
				classescont.setVisible(false);
				controlclass.setVisible(false);
				modulecont.setVisible(false);
				infopers.setVisible(false);
				seancecont.setVisible(false);
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
		empnl.setBounds(10, 467, 227, 60);
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
		setFocusTraversalPolicy(new FocusTraversalOnArray(new Component[]{panel, modulepnl, lblNewLabel_2, lblmodule, seancepnl, lblNewLabel_4, seancelbl, classpnl, panel_1_3_1, lblNewLabel_2_1, lblNewLabel_9, lblNewLabel_5_1_1, panel_1, lblNewLabel_10, lblNewLabel_11, lblNewLabel_12, panel_2, layeredPane}));
		
		
	

		//----------------------------- classes space -----------------------
		Connection con1 = null;
		try {
			con1 = DriverManager.getConnection(url,"root","PFH#23kgrw9");
		} catch (SQLException e4) {
			// TODO Auto-generated catch block
			e4.printStackTrace();
		}
		String cquery = "select distinct* from module inner join etudier on nom = nom_mod  inner join  class on nom_cl= class.nom inner join filier on nom_fil = filier.nom where prof_mod=%s; ";
		ResultSet claset = null;
		Statement stat1 = null;
		try {
			stat1 = con1.createStatement();
		} catch (SQLException e3) {
			// TODO Auto-generated catch block
			e3.printStackTrace();
		}
		try {
			claset = stat1.executeQuery(String.format(cquery, current.getCode_prof()));
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
				singlecl.setText(claset.getString("nom_cl"));
				singlecl.setForeground(new Color(249,249,249));
				cla.setPreferredSize(new Dimension(200, 100));
				
				final JLabel dep = new JLabel("new");
				dep.setText(claset.getString("nom_mod"));
				dep.setFont(new Font("Myriad Pro", Font.PLAIN, 18));
				dep.setForeground(new Color(154,199,217));
				
				JLabel line = new JLabel();
				line.setIcon(new ImageIcon(Espace_prof.class.getResource("/icons/line.png")));
				

				cbox.setBackground(new Color(86, 135, 166));
				cbox.add(singlecl);
				
				cbox.add(Box.createRigidArea(new Dimension(10, 10)));
				cbox.add(line);
				cbox.add(Box.createRigidArea(new Dimension(10, 10)));
				
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
						 int i = 0 ;
						 
						Etudier et = new Etudier(dep.getText() , singlecl.getText());
						EnsaClass cl = new EnsaClass(singlecl.getText());
						EtudMod etm = new EtudMod(dep.getText());
						classescont.setVisible(false);
						
						controlclass.removeAll();
						
						controlclass.add(etm.profcontrol(cl));
						controlclass.setBounds(30, 11, 834, 529);
						controlclass.setBackground(new Color(208, 233, 242));


						
					
						controlclass.setVisible(true);

						
					}
					
				});
				

				
				classescont.add(cla);
				
				
				
			
			}
		} catch (SQLException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
		
		// -------------------------- seance space ---------------
		

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
					/*
						Connection conn;
						ResultSet etudset = null ;
						
						
						try {
							
							conn = DriverManager.getConnection(url,"root","PFH#23kgrw9");
						
						
						String etquery = "select * from etudiant   where nom_cl = (select nom_cl from seance where seance.num = %s and module = '%s') ;";
							Statement st = conn.createStatement();
							etudset = st.executeQuery(String.format(etquery,num1,modl));
						
							
						} catch (SQLException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
						
						mod.setVisible(false);
						
						JPanel panel_3 = new JPanel();
						panel_3.setPreferredSize(new Dimension(110, 340));
						panel_3.setBackground(new Color(47,85,115));
						seancecont.add(panel_3);
						panel_3.setLayout(new BoxLayout(panel_3, BoxLayout.Y_AXIS));
						
						JLabel blank_2 = new JLabel("                             ");
						panel_3.add(blank_2);
						
						JLabel lblNewLabel_1 = new JLabel("APPOGEE");
						lblNewLabel_1.setForeground(new Color(255,255,255));
						lblNewLabel_1.setFont(new Font("Fredoka One", Font.PLAIN, 16));
						panel_3.add(lblNewLabel_1);
						
						JLabel blank_1_2 = new JLabel("                             ");
						panel_3.add(blank_1_2);
						
						JPanel panel_3_1 = new JPanel();
						panel_3_1.setPreferredSize(new Dimension(110, 340));
						panel_3_1.setAutoscrolls(true);
						panel_3_1.setLayout(new BoxLayout(panel_3_1, BoxLayout.Y_AXIS));
						panel_3_1.setBackground(new Color(47,85,115));
						seancescrol.add(panel_3_1);
						
						JLabel blank_1 = new JLabel("                             ");
						panel_3_1.add(blank_1);
						
						JLabel lblNewLabel_1_2 = new JLabel("NOM");
						lblNewLabel_1_2.setForeground(new Color(255,255,255));
						lblNewLabel_1_2.setFont(new Font("Fredoka One", Font.PLAIN, 16));
				
						panel_3_1.add(lblNewLabel_1_2);
						
						JLabel blank_1_1 = new JLabel("                             ");
						panel_3_1.add(blank_1_1);
						
						JPanel panel_3_2 = new JPanel();
						panel_3_2.setPreferredSize(new Dimension(110, 340));
						panel_3_2.setBackground(new Color(47,85,115));
						seancescrol.add(panel_3_2);
						panel_3_2.setLayout(new BoxLayout(panel_3_2, BoxLayout.Y_AXIS));
						
						JLabel blank = new JLabel("                             ");
						panel_3_2.add(blank);
						
						JLabel lblNewLabel_1_3 = new JLabel("PRENOM");
						lblNewLabel_1_3.setForeground(new Color(255,255,255));
						lblNewLabel_1_3.setFont(new Font("Fredoka One", Font.PLAIN, 16));
						panel_3_2.add(lblNewLabel_1_3);
						
						JLabel blank_1_3 = new JLabel("                             ");
						panel_3_2.add(blank_1_3);
						
						JPanel nbhpnl = new JPanel();
						nbhpnl.setPreferredSize(new Dimension(110, 340));
						nbhpnl.setBackground(new Color(47,85,115));
						nbhpnl.add(new JLabel("                             "));
						nbhpnl.setLayout(new BoxLayout(nbhpnl, BoxLayout.Y_AXIS));
						
						JLabel nbhabslbl = new JLabel("nbh_abs/mdl");
						nbhabslbl.setForeground(new Color(255,255,255));
						nbhabslbl.setFont(new Font("Fredoka One", Font.PLAIN, 16));
						nbhpnl.add(nbhabslbl);
						
						seancescrol.setBackground(new Color (47,85,115));
						
						seancescrol.setAutoscrolls(true);
						
						try {
							
							
							while(etudset.next()) {
								JLabel applbl =new JLabel(etudset.getString("appogee"));
								applbl.setFont(new Font("Fredoka One", Font.PLAIN, 14));
								applbl.setForeground(new Color(208,233,242));
								panel_3.add(applbl);
								
								JLabel nomlbl = new JLabel(etudset.getString("nom"));
								nomlbl.setFont(new Font("Fredoka One", Font.PLAIN, 14));
								nomlbl.setForeground(new Color(208,233,242));
								panel_3_1.add(nomlbl);
								
								JLabel prnlbl = new JLabel(etudset.getString("prenom"));
								prnlbl.setFont(new Font("Fredoka One", Font.PLAIN, 14));
								prnlbl.setForeground(new Color(208,233,242));
								panel_3_2.add(prnlbl);
								
								
								
								
							}
							seancescrol.add(panel_3);
							seancescrol.add(panel_3_1);
							seancescrol.add(panel_3_2);
							seancescrol.add(nbhpnl);
							


							
						} catch (SQLException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
						*/
						
					}
					
				});
				
				
				seancecont.add(mod);
				
			
			}
		} catch (SQLException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}

		
		
		
		// ------------------------------------------ module space --------------------------------
	
		try {
			Connection con = DriverManager.getConnection(url,"root","PFH#23kgrw9");
			String query = "select* from module where prof_mod=%s ;";
			ResultSet modset;
			Statement stat = con.createStatement();
			modset = stat.executeQuery(String.format(query, current.getCode_prof()));
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
				singlemod.setText(modset.getString("nom"));
				singlemod.setForeground(new Color(249,249,249));
				mod.setPreferredSize(new Dimension(200, 100));
				
				JLabel nbhmod = new JLabel("new");
				nbhmod.setText(modset.getString("nbh")+" Hr");
				nbhmod.setFont(new Font("Myriad Pro", Font.PLAIN, 18));
				nbhmod.setForeground(new Color(154,199,217));
				
				JLabel line = new JLabel();
				line.setIcon(new ImageIcon(Espace_prof.class.getResource("/icons/line.png")));
				

				box.setBackground(new Color(86, 135, 166));
				box.add(singlemod);
				
				box.add(Box.createRigidArea(new Dimension(10, 10)));
				box.add(line);
				box.add(Box.createRigidArea(new Dimension(10, 10)));
				
				box.add(nbhmod);
				mod.add(box);
				modulecont.add(mod);
				
			
			}
				
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		

		}
	}

