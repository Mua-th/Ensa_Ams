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

import CLASSES.Admin;
import CLASSES.EnsaClass;
import CLASSES.Filier;




public class Espace_Admin extends JPanel {
	
	protected static final JPanel contentPane1 = null;
	final String url ="jdbc:mysql://localhost:3306/amsdb";
	public static JPanel seancecont= new JPanel() ;
	protected static  JPanel etudlst = new JPanel();
	final JPanel controlpnl =new JPanel();


	/**
	 * Create the panel.
	 */
	public Espace_Admin(final Admin current) {
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
		controlpnl.setBackground(new Color(208, 233, 242));
		
		

		
		final JLabel lblNewLabel_2 = new JLabel("");
		final JPanel modulepnl = new JPanel();
		final JLabel lblmodule = new JLabel("PROF");
		final JLabel seancelbl = new JLabel("Etudiants");
		seancelbl.setHorizontalAlignment(SwingConstants.LEFT);
		 final JLayeredPane layeredPane = new JLayeredPane(); 

		
		layeredPane.setBounds(246, 138, 874, 562);
		add(layeredPane);
		
		/*final Emploi Emp = new Emploi(current);
		Emp.setVisible(true);
		layeredPane.add(Emp);
		*/
		
		etudlst.setBounds(0,0,874,530);
		etudlst.setVisible(true);
		layeredPane.add(etudlst);
		
		
		//final JPanel seancecont = new JPanel();
		
		
		
		seancecont.setBackground(new Color(208, 233, 242));
		seancecont.setFont(new Font("Myriad Pro", Font.PLAIN, 12));
		seancecont.setBounds(0, 0, 874, 530);
		
		seancecont.setLayout(new FlowLayout(FlowLayout.LEFT, 60, 40));
		layeredPane.add(seancecont);
		

		//------------- classes container ------------------
		
		final JPanel classescont = new JPanel();
	
		classescont.setBackground(new Color(208, 233, 242));
		classescont.setFont(new Font("Myriad Pro", Font.PLAIN, 12));
		classescont.setBounds(0, 0, 874, 530);
		layeredPane.add(classescont);
		classescont.setLayout(new FlowLayout(FlowLayout.LEFT, 38, 30));
		
		final JPanel modulecont = new JPanel();
		modulecont.setBackground(new Color(208, 233, 242));
		modulecont.setFont(new Font("Myriad Pro", Font.PLAIN, 12));
		layeredPane.setLayer(modulecont,1);
		modulecont.setBounds(0, 0, 874, 530);
		layeredPane.add(modulecont);
		modulecont.setLayout(new FlowLayout(FlowLayout.LEFT, 30, 30));
		
		final JPanel infopers = new JPanel();
		infopers.setFont(new Font("Myriad Pro", Font.PLAIN, 12));
		infopers.setBackground(new Color(208, 233, 242));
		infopers.setBounds(0, 0, 874, 530);
		
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
				modulecont.setVisible(true);
				seancecont.setVisible(false);
				//Emp.setVisible(false);
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
		lblNewLabel_2.setIcon(new ImageIcon(Espace_Admin.class.getResource("/icons/teacher (1).png")));
		modulepnl.add(lblNewLabel_2);
		
		

		
		lblmodule.setForeground(new Color(255, 255, 255));
		lblmodule.setFont(new Font("Fredoka Light", Font.PLAIN, 20));
		modulepnl.add(lblmodule);
		

		

		
		
		final JPanel etudpnl = new JPanel();

		etudpnl.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				etudpnl.setBackground(new Color(208, 233, 242));
				seancelbl.setForeground(new Color(47, 85, 115));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				etudpnl.setBackground(new Color(47, 85, 115));
				seancelbl.setForeground(new Color(255, 255, 255));
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				classescont.setVisible(false);
				modulecont.setVisible(false);
				seancecont.setVisible(true);
				//Emp.setVisible(false);
				etudlst.setVisible(false);
				infopers.setVisible(false);
				
				
			}
		});
		etudpnl.setBackground(new Color(47, 85, 115));
		FlowLayout fl_etudpnl = (FlowLayout) etudpnl.getLayout();
		fl_etudpnl.setVgap(10);
		fl_etudpnl.setHgap(10);
		fl_etudpnl.setAlignment(FlowLayout.LEFT);
		etudpnl.setBounds(10, 325, 227, 60);
		panel.add(etudpnl);
		
		JLabel lblNewLabel_4 = new JLabel("");
		//lblNewLabel_4.setIcon(new ImageIcon(Espace_prof.class.getResource("/icons/calendar (2) (1).png")));
		etudpnl.add(lblNewLabel_4);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(Espace_Admin.class.getResource("/icons/student-with-graduation-cap.png")));
		etudpnl.add(lblNewLabel_1);
		
		
		seancelbl.setForeground(new Color(255, 255, 255));
		seancelbl.setFont(new Font("Fredoka Light", Font.PLAIN, 20));
		etudpnl.add(seancelbl);
		
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
				controlpnl.removeAll();
				
				modulecont.setVisible(false);
				seancecont.setVisible(false);
				//Emp.setVisible(false);
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
				modulecont.setVisible(false);
				infopers.setVisible(true);
				seancecont.setVisible(false);
				//Emp.setVisible(false);
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
		
		final JPanel adminmod = new JPanel();
		FlowLayout fl_adminmod = (FlowLayout) adminmod.getLayout();
		fl_adminmod.setVgap(10);
		fl_adminmod.setHgap(10);
		fl_adminmod.setAlignment(FlowLayout.LEFT);
		
		JLabel lblNewLabel_8_1 = new JLabel("");
		adminmod.add(lblNewLabel_8_1);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(Espace_Admin.class.getResource("/icons/book-of-black-cover-closed.png")));
		adminmod.add(lblNewLabel);
		
		final JPanel admodcont = new JPanel();
		admodcont.setFont(new Font("Myriad Pro", Font.PLAIN, 12));
		admodcont.setBackground(new Color(208, 233, 242));
		admodcont.setBounds(0, 0, 874, 530);
		layeredPane.add(admodcont);
		admodcont.setLayout(new FlowLayout(FlowLayout.LEFT, 30, 30));
		
		final JLabel admod = new JLabel("MODULES");
		admod.setForeground(Color.WHITE);
		admod.setFont(new Font("Fredoka Light", Font.PLAIN, 20));
		adminmod.add(admod);
		adminmod.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				admodcont.setVisible(false);
				admodcont.removeAll();
				
				try {
					Connection con = DriverManager.getConnection(url,"root","PFH#23kgrw9");
					String query = "select nom_cl, module.nom, prof.nom as pnom from  etudier ,prof, module where module.nom = etudier.nom_mod and nom_cl in (select nom from class where nom_fil='%s') and prof.code_prof = module.prof_mod; \r\n"
							+ "" ;
					ResultSet modset;
					Statement stat = con.createStatement();
					modset = stat.executeQuery(String.format(query, current.getNom_fil()));
					while (modset.next()) {
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
						singlemod.setText(modset.getString("nom"));
						singlemod.setForeground(new Color(249,249,249));
						mod.setPreferredSize(new Dimension(200, 100));
						
						final JLabel nbhmod = new JLabel("new");
						nbhmod.setText(modset.getString("nom_cl"));
						nbhmod.setFont(new Font("Myriad Pro", Font.PLAIN, 18));
						nbhmod.setForeground(new Color(154,199,217));
						
						final JLabel prof = new JLabel("new");
						prof.setText(modset.getString("pnom"));
						prof.setFont(new Font("Myriad Pro", Font.PLAIN, 18));
						prof.setForeground(new Color(154,199,217));
						
						JLabel line = new JLabel();
						line.setIcon(new ImageIcon(Espace_prof.class.getResource("/icons/line.png")));
						

						box.setBackground(new Color(86, 135, 166));
						box.add(singlemod);
						
						box.add(Box.createRigidArea(new Dimension(10, 10)));
						box.add(line);
						box.add(Box.createRigidArea(new Dimension(10, 10)));
						
						box.add(nbhmod);
						box.add(prof);
						mod.add(box);
						
						admodcont.add(mod);
						
						mod.addMouseListener(new MouseAdapter() {
							public void  mouseEntered(MouseEvent e) {
								mod.setBackground(new Color(154, 199, 217));
								box.setBackground(new Color(154, 199, 217));
								singlemod.setForeground(new Color(47, 85, 115));
								
								nbhmod.setForeground(new Color(255,255,255));
								prof.setForeground(new Color(255,255,255));
							}
							@Override
							public void mouseExited(MouseEvent e) {
								mod.setBackground(new Color(86, 135, 166));
								box.setBackground(new Color(86, 135, 166));
								singlemod.setForeground(new Color(255,255,255));
								
								nbhmod.setForeground(new Color(154,199,217));
								prof.setForeground(new Color(255,255,255));
							}
							public void mouseClicked(MouseEvent e) {
								
							}
						});
						
					
					}
						
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				classescont.setVisible(false);
				modulecont.setVisible(false);
				infopers.setVisible(false);
				seancecont.setVisible(false);
				admodcont.setVisible(true);
				etudlst.removeAll();
				etudlst.setVisible(false);
				infopers.setVisible(false);
				
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				adminmod.setBackground(new Color(208, 233, 242));
				admod.setForeground(new Color(47, 85, 115));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				adminmod.setBackground(new Color(47, 85, 115));
				admod.setForeground(new Color(255, 255, 255));
			}
		});
		adminmod.setBackground(new Color(47, 85, 115));
		adminmod.setBounds(10, 467, 227, 60);
		panel.add(adminmod);
		
		
		
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
		setFocusTraversalPolicy(new FocusTraversalOnArray(new Component[]{panel, modulepnl, lblNewLabel_2, lblmodule, etudpnl, lblNewLabel_4, seancelbl, classpnl, panel_1_3_1, lblNewLabel_2_1, lblNewLabel_9, lblNewLabel_5_1_1, panel_1, lblNewLabel_10, lblNewLabel_11, lblNewLabel_12, panel_2, layeredPane}));
		

		//----------------------------- classes space -----------------------
		
		Connection con1 = null;
		try {
			con1 = DriverManager.getConnection(url,"root","PFH#23kgrw9");
		} catch (SQLException e4) {
			// TODO Auto-generated catch block
			e4.printStackTrace();
		}
		String cquery = "select * from class  where nom_fil =(select nom_fil from admin where code_ad='%s' );";
		ResultSet claset = null;
		Statement stat1 = null;
		try {
			stat1 = con1.createStatement();
		} catch (SQLException e3) {
			// TODO Auto-generated catch block
			e3.printStackTrace();
		}
		try {
			claset = stat1.executeQuery(String.format(cquery, current.getCode_ad()));
			System.out.println(String.format(cquery, current.getCode_ad()));
		} catch (SQLException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
		try {
			while (claset.next()) {
				final JPanel cla = new JPanel();
				cla.setBounds(ALLBITS, ABORT, 200, 100);
				cla.setBackground(new Color(86, 135, 166));
				
				FlowLayout flowlay = new FlowLayout();
				flowlay.setHgap(20);
				cla.setLayout(flowlay);
				
				
				final EnsaClass currentcl = new EnsaClass(claset.getString("nom"),claset.getString("nom_fil"));
				
				final JPanel cbox = new JPanel();
				cbox.setLayout(new BoxLayout(cbox, BoxLayout.Y_AXIS));
				
				
				final JLabel singlecl = new JLabel("New label");
				singlecl.setHorizontalAlignment(SwingConstants.CENTER);
				singlecl.setFont(new Font("Fredoka One", Font.PLAIN, 18));
				singlecl.setBackground(new Color(86, 135, 166));
				singlecl.setBounds(ALLBITS, ABORT, 200, 100);
				
				singlecl.setText(claset.getString("nom"));
				singlecl.setForeground(new Color(249,249,249));
				cla.setPreferredSize(new Dimension(200, 100));
				
				
				
				final JLabel dep = new JLabel("new");
				dep.setText(String.valueOf(currentcl.getinfo().get(0)+" profs"));
				dep.setFont(new Font("Myriad Pro", Font.PLAIN, 16));
				dep.setForeground(new Color(154,199,217)); 
				
				JLabel line = new JLabel();
				line.setIcon(new ImageIcon(Espace_prof.class.getResource("/icons/line.png")));
				
				final JLabel nbetd = new JLabel("new");
				nbetd.setText(String.valueOf(currentcl.getinfo().get(1)+" etud"));
				nbetd.setFont(new Font("Myriad Pro", Font.PLAIN, 16));
				nbetd.setForeground(new Color(154,199,217)); 

				cbox.setBackground(new Color(86, 135, 166));
				cbox.add(singlecl);
				
				cbox.add(Box.createRigidArea(new Dimension(10, 10)));
				cbox.add(line);
				cbox.add(Box.createRigidArea(new Dimension(10, 10)));
				
				
				
				cbox.add(dep);
				cbox.add(nbetd);
				
				cla.add(cbox);
				
				
				
				classescont.add(cla);
			
		

				cla.addMouseListener(new MouseAdapter() {

					@Override
					public void mouseEntered(MouseEvent e) {
					
						cla.setBackground(new Color(154, 199, 217));
						cbox.setBackground(new Color(154, 199, 217));
						singlecl.setForeground(new Color(47, 85, 115));
						
					//	nbhmod.setForeground(new Color(255,255,255));
						dep.setForeground(new Color(255,255,255));
						nbetd.setForeground(new Color(255,255,255));
						
						
						
						
						
					}
					
					public void mouseExited(MouseEvent e) {
						/*
						System.out.println("rrrrrrrrrrr");
						cla.setVisible(false);
						cla.removeAll();
						
						cla.add(cbox);
						cla.setVisible(true);*/
						
						cla.setBackground(new Color(86, 135, 166));
						cbox.setBackground(new Color(86, 135, 166));
						singlecl.setForeground(new Color(255, 255, 255));
					//	nbhmod.setForeground(new Color(154,199,217));
						dep.setForeground(new Color(154,199,217));
						nbetd.setForeground(new Color(154,199,217));
						
					}
					
					   
					public void mouseClicked(MouseEvent e) {
						
						classescont.addMouseListener(new MouseAdapter() {
							@Override
							public void mouseClicked(MouseEvent e) {
								cla.setVisible(false);
								cla.removeAll();
								cla.add(cbox);
								
								cla.setVisible(true);

							}
						});
						
						
					
						cla.setVisible(false);
						cla.removeAll();
						final JPanel addstupnl = new JPanel();
						addstupnl.setBackground(new Color(86, 135, 166));
						FlowLayout flx = (FlowLayout) addstupnl.getLayout();
						flx.setVgap(5);
						flx.setHgap(5);
						flx.setAlignment(FlowLayout.LEFT);
						addstupnl.setLayout(flx);
						
						JLabel addlbl = new JLabel();
						addlbl.setIcon(new ImageIcon(Espace_Admin.class.getResource("/icons/add (1).png")));
						
						addstupnl.add(addlbl);
						
						//addstupnl.add(new JLabel("  "));
						
						final JLabel ajou = new JLabel();
						addstupnl.setAlignmentY(SwingConstants.BOTTOM);
						ajou.setText("AJOUTER");
						ajou.setBackground(cbox.getBackground());
						ajou.setForeground(new Color(154, 199, 217));
						ajou.setFont(new Font("Myriad Pro", Font.PLAIN, 18));
						addstupnl.add(ajou);
						
						addstupnl.addMouseListener(new MouseAdapter()
								{
							@Override 
							public void mouseEntered(MouseEvent e) {
								ajou.setForeground(new Color(255,255,255));
								
							}
							@Override 
							public void mouseExited(MouseEvent e) {
								ajou.setForeground(new Color(154,199,217));
								
							}
							@Override
							public void mouseClicked(MouseEvent e1) {
								System.out.println("clic");
								
								layeredPane.remove(controlpnl);
								
								
								
								controlpnl .add(currentcl.control());
								System.out.println("added"+currentcl.getNom());
								
								controlpnl.setBounds(60, 50, 754, 470);
								
								layeredPane.add(controlpnl);
								
								classescont.setVisible(false);
								admodcont.setVisible(false);
							
								controlpnl.setVisible(true);
								
								modulecont.setVisible(false);
								seancecont.setVisible(false);
								//Emp.setVisible(false);
								etudlst.setVisible(false);
								infopers.setVisible(false);
								
								
							}
						
									
								});
						
						final JPanel cbox1 = new JPanel();
						cbox1.setLayout(new BoxLayout(cbox1, BoxLayout.Y_AXIS));
						cbox1.setBackground(new Color(86, 135, 166));
						
						cbox1.add(addstupnl);
						
						final JPanel em = new JPanel();
						em.setBackground(new Color(86, 135, 166));
						
						JLabel emlbl = new JLabel();
						emlbl.setIcon(new ImageIcon(Espace_Admin.class.getResource("/icons/calendar (5).png")));

						em.add(emlbl);
						//em.add(new JLabel("  "));
						
						final JLabel emt = new JLabel();
						em.setAlignmentY(SwingConstants.BOTTOM);
						emt.setText("EMPLOI");
						emt.setBackground(cbox.getBackground());
						emt.setForeground(new Color(154, 199, 217));
						emt.setFont(new Font("Myriad Pro", Font.PLAIN, 18));
						em.add(emt);
						
						em.addMouseListener(new MouseAdapter()
						{
					@Override 
					public void mouseEntered(MouseEvent e) {
						emt.setForeground(new Color(255,255,255));
						
					}
					@Override 
					public void mouseExited(MouseEvent e) {
						emt.setForeground(new Color(154,199,217));
						
					}
					@Override
					public void mouseClicked(MouseEvent e1) {
						System.out.println("clic emt");
						controlpnl.removeAll();
						layeredPane.remove(controlpnl);
						
					
						
						controlpnl .add(new Emploi(currentcl));
						System.out.println("added"+currentcl.getNom());
						
						controlpnl.setBounds(60, 60, 754, 470);;
						
						layeredPane.add(controlpnl);
						
						classescont.setVisible(false);
						admodcont.setVisible(false);
					
						controlpnl.setVisible(true);
						
						modulecont.setVisible(false);
						seancecont.setVisible(false);
						//Emp.setVisible(false);
						etudlst.setVisible(false);
						infopers.setVisible(false);
						
					}});
					
						cbox1.add(Box.createRigidArea(new Dimension(10, 10)));
						cbox1.add(em);
						
						cla.add(cbox1);
						
						cla.addMouseListener(new MouseAdapter() {

							@Override
							public void mouseEntered(MouseEvent e) {
								addstupnl.setBackground(new Color(154, 199, 217));
								em.setBackground(new Color(154, 199, 217));
								cbox1.setBackground(new Color(154, 199, 217));
								emt.setForeground(new Color(255,255,255));
								ajou.setForeground(new Color(255,255,255));
							}
							public void mouseExited(MouseEvent e) {
								addstupnl.setBackground(new Color(86, 135, 166));
								em.setBackground(new Color(86, 135, 166));
								cbox1.setBackground(new Color(86, 135, 166));
								emt.setForeground(new Color(154, 199, 217));
								ajou.setForeground(new Color(154, 199, 217));
								
							}
							});
						cla.setVisible(true);
						
						//------------------
						/*
						layeredPane.remove(controlpnl);
						
						
						
						controlpnl .add(currentcl.control());
						System.out.println("added"+currentcl.getNom());
						
						controlpnl.setBounds(60, 50, 754, 470);
						layeredPane.add(controlpnl);
						
*/
					
						classescont.setVisible(true);
						admodcont.setVisible(false);
					
					//	controlpnl.setVisible(true);
						
						modulecont.setVisible(false);
						seancecont.setVisible(false);
						//Emp.setVisible(false);
						etudlst.setVisible(false);
						infopers.setVisible(false);
						
						
					}
					
				});
				
			
			
				
				
				
			
			}
		} catch (SQLException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
		
		// -------------------------- seance space ---------------
		

		
		
		// ------------------------------------------ module space --------------------------------
		
		
		
		//--------------------------------- prof -----------------------------------
		Filier fil = new Filier(current.getNom_fil(),current.getNom_dep());
		
		modulecont.add(fil.control());
		
		
		

		}
}
