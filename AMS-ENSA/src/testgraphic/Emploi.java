package testgraphic;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.sql.Statement;

import javax.swing.JLabel;
import javax.swing.JPanel;

import CLASSES.EnsaClass;
import CLASSES.Etudiant;
import CLASSES.Prof;
import CLASSES.Seance;

public class Emploi extends JPanel {
	final String url ="jdbc:mysql://localhost:3306/amsdb";
	
	/**
	 * Create the panel.
	 */
	public Emploi(Prof current) {
		setFont(new Font("Myriad Pro", Font.PLAIN, 12));
		setBackground(new Color(208, 233, 242));
		setBounds(60,60, 754, 424);
		
	//	System.out.println(" emploi cree");
		setLayout(new GridLayout(6, 6, 0, 10));
		
		


		

		
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(new Color(141, 189, 218));
		FlowLayout flowLayout = (FlowLayout) panel_4.getLayout();
		flowLayout.setVgap(20);
		flowLayout.setHgap(85);
		flowLayout.setAlignment(FlowLayout.LEFT);
		add(panel_4);
		
		
		JLabel lblNewLabel = new JLabel("8H                   10H                   12H");
		lblNewLabel.setFont(new Font("Fredoka Light", Font.PLAIN, 20));
		panel_4.add(lblNewLabel);
		
		JLabel lblhhh_1 = new JLabel("14H                   16H                   18H");
		lblhhh_1.setFont(new Font("Fredoka Light", Font.PLAIN, 20));
		panel_4.add(lblhhh_1);
		
		
		
		
		//-------------------- lundi pnl -----------------
		 final JPanel panel_5 = new JPanel();
		panel_5.setBackground(new Color(141, 189, 218));
		FlowLayout flowLayout_1 = (FlowLayout) panel_5.getLayout();
		flowLayout_1.setAlignment(FlowLayout.LEFT);
		add(panel_5);
		
		JLabel LUNDI = new JLabel("LUN");
		LUNDI.setPreferredSize(new Dimension(75, 20));
		LUNDI.setFont(new Font("Fredoka Light", Font.PLAIN, 20));
		panel_5.add(LUNDI);
		
		final JPanel lundist = new JPanel();
		lundist.setPreferredSize(new Dimension(280, 50));
		lundist.setBackground(new Color(47, 85, 115));
		FlowLayout fl_lundist = (FlowLayout) lundist.getLayout();
		fl_lundist.setHgap(10);
		fl_lundist.setVgap(10);
		fl_lundist.setAlignment(FlowLayout.LEFT);
		

		 
		 
		
		 
		 panel_5.add(lundist);
		 
		 JLabel lblNewLabel_1 = new JLabel("");
		 lblNewLabel_1.setPreferredSize(new Dimension(85, 50));
		 panel_5.add(lblNewLabel_1);
		 
		 final JPanel lundi2nd = new JPanel();
		 FlowLayout flowLayout_10 = (FlowLayout) lundi2nd.getLayout();
		 flowLayout_10.setVgap(10);
		 flowLayout_10.setHgap(10);
		 flowLayout_10.setAlignment(FlowLayout.LEFT);
		 lundi2nd.setPreferredSize(new Dimension(280, 50));
		 lundi2nd.setBackground(new Color(47, 85, 115));
		 panel_5.add(lundi2nd);
		 
		
		 
	
		

		
		//  ------------------mardi pnl --------------------
		
		JPanel panel_5_1 = new JPanel();
		panel_5_1.setBackground(new Color(141, 189, 218));
		FlowLayout flowLayout_2 = (FlowLayout) panel_5_1.getLayout();
		flowLayout_2.setAlignment(FlowLayout.LEFT);
		add(panel_5_1);
		
		JLabel LUNDI_1 = new JLabel("MAR");
		LUNDI_1.setPreferredSize(new Dimension(75, 20));
		LUNDI_1.setFont(new Font("Fredoka Light", Font.PLAIN, 20));
		panel_5_1.add(LUNDI_1);
		
		final JPanel mardist = new JPanel();
		FlowLayout flowLayout_6 = (FlowLayout) mardist.getLayout();
		flowLayout_6.setVgap(10);
		flowLayout_6.setHgap(10);
		flowLayout_6.setAlignment(FlowLayout.LEFT);
		mardist.setPreferredSize(new Dimension(280, 50));
		mardist.setBackground(new Color(47, 85, 115));
		panel_5_1.add(mardist);
		

		
		JLabel lblNewLabel_1_1 = new JLabel("");
		lblNewLabel_1_1.setPreferredSize(new Dimension(85, 50));
		panel_5_1.add(lblNewLabel_1_1);
		
		final JPanel mardind = new JPanel();
		FlowLayout flowLayout_11 = (FlowLayout) mardind.getLayout();
		flowLayout_11.setVgap(10);
		flowLayout_11.setHgap(10);
		flowLayout_11.setAlignment(FlowLayout.LEFT);
		mardind.setPreferredSize(new Dimension(280, 50));
		mardind.setBackground(new Color(47, 85, 115));
		panel_5_1.add(mardind);
		

		
		JPanel panel_5_2 = new JPanel();
		panel_5_2.setBackground(new Color(141, 189, 218));
		FlowLayout flowLayout_3 = (FlowLayout) panel_5_2.getLayout();
		flowLayout_3.setAlignment(FlowLayout.LEFT);
		add(panel_5_2);
		
		JLabel LUNDI_2 = new JLabel("MER");
		LUNDI_2.setPreferredSize(new Dimension(75, 20));
		LUNDI_2.setFont(new Font("Fredoka Light", Font.PLAIN, 20));
		panel_5_2.add(LUNDI_2);
		
		final JPanel mercst = new JPanel();
		FlowLayout flowLayout_7 = (FlowLayout) mercst.getLayout();
		flowLayout_7.setVgap(10);
		flowLayout_7.setHgap(10);
		flowLayout_7.setAlignment(FlowLayout.LEFT);
		mercst.setPreferredSize(new Dimension(280, 50));
		mercst.setBackground(new Color(47, 85, 115));
		panel_5_2.add(mercst);
		

		
		JLabel lblNewLabel_1_1_1 = new JLabel("");
		lblNewLabel_1_1_1.setPreferredSize(new Dimension(85, 50));
		panel_5_2.add(lblNewLabel_1_1_1);
		
		final JPanel mercnd = new JPanel();
		FlowLayout flowLayout_12 = (FlowLayout) mercnd.getLayout();
		flowLayout_12.setVgap(10);
		flowLayout_12.setHgap(10);
		flowLayout_12.setAlignment(FlowLayout.LEFT);
		mercnd.setPreferredSize(new Dimension(280, 50));
		mercnd.setBackground(new Color(47, 85, 115));
		panel_5_2.add(mercnd);
		
	
		
		JPanel panel_5_3 = new JPanel();
		panel_5_3.setBackground(new Color(141, 189, 218));
		FlowLayout flowLayout_4 = (FlowLayout) panel_5_3.getLayout();
		flowLayout_4.setAlignment(FlowLayout.LEFT);
		add(panel_5_3);
		
		JLabel LUNDI_3 = new JLabel("JEU");
		LUNDI_3.setPreferredSize(new Dimension(75, 20));
		LUNDI_3.setFont(new Font("Fredoka Light", Font.PLAIN, 20));
		panel_5_3.add(LUNDI_3);
		
		final JPanel jeudist = new JPanel();
		FlowLayout flowLayout_8 = (FlowLayout) jeudist.getLayout();
		flowLayout_8.setVgap(10);
		flowLayout_8.setHgap(10);
		flowLayout_8.setAlignment(FlowLayout.LEFT);
		jeudist.setPreferredSize(new Dimension(280, 50));
		jeudist.setBackground(new Color(47, 85, 115));
		panel_5_3.add(jeudist);
		

		
		JLabel lblNewLabel_1_1_2 = new JLabel("");
		lblNewLabel_1_1_2.setPreferredSize(new Dimension(85, 50));
		panel_5_3.add(lblNewLabel_1_1_2);
		
		final JPanel jeudind = new JPanel();
		FlowLayout flowLayout_13 = (FlowLayout) jeudind.getLayout();
		flowLayout_13.setVgap(10);
		flowLayout_13.setHgap(10);
		flowLayout_13.setAlignment(FlowLayout.LEFT);
		jeudind.setPreferredSize(new Dimension(280, 50));
		jeudind.setBackground(new Color(47, 85, 115));
		panel_5_3.add(jeudind);
		

		
		JPanel panel_5_4 = new JPanel();
		panel_5_4.setBackground(new Color(141, 189, 218));
		FlowLayout flowLayout_5 = (FlowLayout) panel_5_4.getLayout();
		flowLayout_5.setAlignment(FlowLayout.LEFT);
		add(panel_5_4);
		
		JLabel LUNDI_4 = new JLabel("VEN");
		LUNDI_4.setPreferredSize(new Dimension(75, 20));
		LUNDI_4.setFont(new Font("Fredoka Light", Font.PLAIN, 20));
		panel_5_4.add(LUNDI_4);
		
		final JPanel vendst = new JPanel();
		FlowLayout flowLayout_9 = (FlowLayout) vendst.getLayout();
		flowLayout_9.setVgap(10);
		flowLayout_9.setHgap(10);
		flowLayout_9.setAlignment(FlowLayout.LEFT);
		vendst.setPreferredSize(new Dimension(280, 50));
		vendst.setBackground(new Color(47, 85, 115));
		panel_5_4.add(vendst);
		
	
		
		JLabel lblNewLabel_1_1_3 = new JLabel("");
		lblNewLabel_1_1_3.setPreferredSize(new Dimension(85, 50));
		panel_5_4.add(lblNewLabel_1_1_3);
		
		final JPanel vendnd = new JPanel();
		FlowLayout flowLayout_14 = (FlowLayout) vendnd.getLayout();
		flowLayout_14.setVgap(10);
		flowLayout_14.setHgap(10);
		flowLayout_14.setAlignment(FlowLayout.LEFT);
		vendnd.setPreferredSize(new Dimension(280, 50));
		vendnd.setBackground(new Color(47, 85, 115));
		panel_5_4.add(vendnd);
		

		//-----------------------------espace emploi --------------------------
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try {
			Connection con = DriverManager.getConnection(url,"root","PFH#23kgrw9");
			String empquery = "select distinct *,dayname(sdate)  from seance where code_prof=%s and sdate between CURDATE() - INTERVAL (WEEKDAY(CURDATE())+1) DAY  and  CURDATE() - INTERVAL (WEEKDAY(CURDATE())-4) DAY ;";
			final ResultSet empset;
			//System.out.println("ACCES SUCCES");
			Statement empstat = con.createStatement();
			empset = empstat.executeQuery(String.format(empquery, current.getCode_prof()));
			//System.out.println(String.format(empquery, current.getCode_prof()));
			while (empset.next()) {
				if(empset.getString("dayname(sdate)").equals("Monday") )
					{
						System.out.println("in monday");
						if(empset.getString("HDEP").equals("08:00:00"))
							{	
	
							 final JLabel numlbl = new JLabel();
							 numlbl.setFont(new Font("Fredoka Light", Font.PLAIN, 18));
							 numlbl.setBackground(new Color(208, 233, 242));
							 lundist.add(numlbl);
							 
							 final JLabel modulelbl = new JLabel();
							 modulelbl.setFont(new Font("Fredoka Light", Font.PLAIN, 18));
							 modulelbl.setBackground(new Color(208, 233, 242));
							 lundist.add(modulelbl); 
							 
							 final JLabel classlbl = new JLabel();
							 classlbl.setFont(new Font("Fredoka Light", Font.PLAIN, 18));
							 classlbl.setBackground(new Color(208, 233, 242));
							 lundist.add(classlbl); 
							 
								System.out.println("8:00:00");
								numlbl.setForeground(new Color(154,199,217));
								modulelbl.setForeground(new Color(154,199,217));
								classlbl.setForeground(new Color(154,199,217));
								
								numlbl.setText("  seance :"+empset.getString("num"));
								modulelbl.setText("   | "+empset.getString("module"));
								classlbl.setText("   | "+empset.getString("nom_cl"));	
								final String nom_cl = empset.getString("nom_cl");
								
								//------------- instanciation seance ----------
								final Seance sc = new Seance(Integer.parseInt(empset.getString("num")), empset.getString("sdate"), empset.getString("duree"), empset.getString("module"),Integer.parseInt(empset.getString("code_prof")), nom_cl, empset.getString("HDEP"));

								
								 lundist.add(numlbl);
								 lundist.add(modulelbl);
								 lundist.add(classlbl);
									
									lundist.addMouseListener(new MouseAdapter() {
										@Override
										public void mouseEntered(MouseEvent e) {
											lundist.setBackground(new Color(208, 233, 242));
											numlbl.setForeground(new Color(47, 85, 115));
											modulelbl.setForeground(new Color(47, 85, 115));
											classlbl.setForeground(new Color(47, 85, 115));
										}
										@Override
										public void mouseExited(MouseEvent e) {
											lundist.setBackground(new Color(47, 85, 115));
											numlbl.setForeground(new Color(255, 255,255));
											modulelbl.setForeground(new Color(255, 255,255));
											classlbl.setForeground(new Color(255, 255,255));
										}
										@Override
										public void mouseClicked(MouseEvent e) {
											
											setVisible(false);
											EnsaClass currentcl = new EnsaClass (nom_cl);
											
											
											
											
												System.out.println("seance instancie");
												Espace_prof.etudlst.add(currentcl.listetud(sc));
											
											
											Espace_prof.etudlst.setVisible(true);
										
											
										}
									});
									
									FlowLayout fl_seancepnl = (FlowLayout) panel_5.getLayout();
									fl_seancepnl.setAlignment(FlowLayout.LEFT);
									
								
							}else 
								{
								 final JLabel numlbl = new JLabel();
								 numlbl.setFont(new Font("Fredoka Light", Font.PLAIN, 18));
								 numlbl.setBackground(new Color(208, 233, 242));
								 lundi2nd.add(numlbl);
								 
								 final JLabel modulelbl = new JLabel();
								 modulelbl.setFont(new Font("Fredoka Light", Font.PLAIN, 18));
								 modulelbl.setBackground(new Color(208, 233, 242));
								 lundi2nd.add(modulelbl); 
								 
								 final JLabel classlbl = new JLabel();
								 classlbl.setFont(new Font("Fredoka Light", Font.PLAIN, 18));
								 classlbl.setBackground(new Color(208, 233, 242));
								 lundi2nd.add(classlbl); 
								 
								System.out.println("14:00:00");
								numlbl.setForeground(new Color(154,199,217));
								modulelbl.setForeground(new Color(154,199,217));
								classlbl.setForeground(new Color(154,199,217));
								
								numlbl.setText("  seance :"+empset.getString("num"));
								modulelbl.setText("   | "+empset.getString("module"));
								classlbl.setText("   | "+empset.getString("nom_cl"));
								
								final String nom_cl1 = empset.getString("nom_cl");
								//------------- instanciation seance ----------
								final Seance sc = new Seance(Integer.parseInt(empset.getString("num")), empset.getString("sdate"), empset.getString("duree"), empset.getString("module"),Integer.parseInt(empset.getString("code_prof")), nom_cl1, empset.getString("HDEP"));

							
								
								 lundi2nd.add(numlbl);
								 lundi2nd.add(modulelbl);
								 lundi2nd.add(classlbl);
								 
									lundi2nd.addMouseListener(new MouseAdapter() {
										@Override
										public void mouseEntered(MouseEvent e) {
											lundi2nd.setBackground(new Color(208, 233, 242));
											numlbl.setForeground(new Color(47, 85, 115));
											modulelbl.setForeground(new Color(47, 85, 115));
											classlbl.setForeground(new Color(47, 85, 115));
										}
										@Override
										public void mouseExited(MouseEvent e) {
											lundi2nd.setBackground(new Color(47, 85, 115));
											numlbl.setForeground(new Color(255, 255,255));
											modulelbl.setForeground(new Color(255, 255,255));
											classlbl.setForeground(new Color(255, 255,255));
										}
										@Override
										public void mouseClicked(MouseEvent e) {
											
											setVisible(false);
											EnsaClass currentcl1 = new EnsaClass (nom_cl1);
											
											

											
											System.out.println("seance instancie");
											Espace_prof.etudlst.add(currentcl1.listetud(sc));
										
											Espace_prof.etudlst.setVisible(true);
											
										}
									});
								}
							
					}
				
				 if(empset.getString("dayname(sdate)").equals("Tuesday") )
					{
					if(empset.getString("HDEP").equals("08:00:00"))
					{	
						 final JLabel numlbl = new JLabel();
						 numlbl.setFont(new Font("Fredoka Light", Font.PLAIN, 18));
						 numlbl.setBackground(new Color(208, 233, 242));
						 mardist.add(numlbl);
						 
						 final JLabel modulelbl = new JLabel();
						 modulelbl.setFont(new Font("Fredoka Light", Font.PLAIN, 18));
						 modulelbl.setBackground(new Color(208, 233, 242));
						 mardist.add(modulelbl); 
						 
						 final JLabel classlbl = new JLabel();
						 classlbl.setFont(new Font("Fredoka Light", Font.PLAIN, 18));
						 classlbl.setBackground(new Color(208, 233, 242));
						 mardist.add(classlbl); 
						 
						System.out.println("8:00:00");
						numlbl.setForeground(new Color(154,199,217));
						modulelbl.setForeground(new Color(154,199,217));
						classlbl.setForeground(new Color(154,199,217));
						
						numlbl.setText("  seance :"+empset.getString("num"));
						modulelbl.setText("   | "+empset.getString("module"));
						classlbl.setText("   | "+empset.getString("nom_cl"));	
						
						final String nom_cl2 = empset.getString("nom_cl");
						//------------- instanciation seance ----------
						final Seance sc = new Seance(Integer.parseInt(empset.getString("num")), empset.getString("sdate"), empset.getString("duree"), empset.getString("module"),Integer.parseInt(empset.getString("code_prof")), nom_cl2, empset.getString("HDEP"));

					
						
						 mardist.add(numlbl);
						 mardist.add(modulelbl);
						 mardist.add(classlbl);
						 
							mardist.addMouseListener(new MouseAdapter() {
								@Override
								public void mouseEntered(MouseEvent e) {
									mardist.setBackground(new Color(208, 233, 242));
									numlbl.setForeground(new Color(47, 85, 115));
									modulelbl.setForeground(new Color(47, 85, 115));
									classlbl.setForeground(new Color(47, 85, 115));
								}
								@Override
								public void mouseExited(MouseEvent e) {
									mardist.setBackground(new Color(47, 85, 115));
									numlbl.setForeground(new Color(255, 255,255));
									modulelbl.setForeground(new Color(255, 255,255));
									classlbl.setForeground(new Color(255, 255,255));
								}
								@Override
								public void mouseClicked(MouseEvent e) {
									
									setVisible(false);
									EnsaClass currentcl2 = new EnsaClass (nom_cl2);
									

									
									System.out.println("seance instancie");
									Espace_prof.etudlst.add(currentcl2.listetud(sc));
								
									
									Espace_prof.etudlst.setVisible(true);
									
								}
							});
						
					}else 
						{
						 final JLabel numlbl = new JLabel();
						 numlbl.setFont(new Font("Fredoka Light", Font.PLAIN, 18));
						 numlbl.setBackground(new Color(208, 233, 242));
						 mardind.add(numlbl);
						 
						 final JLabel modulelbl = new JLabel();
						 modulelbl.setFont(new Font("Fredoka Light", Font.PLAIN, 18));
						 modulelbl.setBackground(new Color(208, 233, 242));
						 mardind.add(modulelbl); 
						 
						 final JLabel classlbl = new JLabel();
						 classlbl.setFont(new Font("Fredoka Light", Font.PLAIN, 18));
						 classlbl.setBackground(new Color(208, 233, 242));
						 mardind.add(classlbl); 
						System.out.println("14:00:00");
						numlbl.setForeground(new Color(154,199,217));
						modulelbl.setForeground(new Color(154,199,217));
						classlbl.setForeground(new Color(154,199,217));
						
						numlbl.setText("  seance :"+empset.getString("num"));
						modulelbl.setText("   | "+empset.getString("module"));
						classlbl.setText("   | "+empset.getString("nom_cl"));
						final String nom_cl3 = empset.getString("nom_cl");
						//------------- instanciation seance ----------
						final Seance sc = new Seance(Integer.parseInt(empset.getString("num")), empset.getString("sdate"), empset.getString("duree"), empset.getString("module"),Integer.parseInt(empset.getString("code_prof")), nom_cl3, empset.getString("HDEP"));

					
						
						 mardind.add(numlbl);
						 mardind.add(modulelbl);
						 mardind.add(classlbl);
						 
							mardind.addMouseListener(new MouseAdapter() {
								@Override
								public void mouseEntered(MouseEvent e) {
									mardind.setBackground(new Color(208, 233, 242));
									numlbl.setForeground(new Color(47, 85, 115));
									modulelbl.setForeground(new Color(47, 85, 115));
									classlbl.setForeground(new Color(47, 85, 115));
								}
								@Override
								public void mouseExited(MouseEvent e) {
									mardind.setBackground(new Color(47, 85, 115));
									numlbl.setForeground(new Color(255, 255,255));
									modulelbl.setForeground(new Color(255, 255,255));
									classlbl.setForeground(new Color(255, 255,255));
								}
								@Override
								public void mouseClicked(MouseEvent e) {
									
									setVisible(false);
									EnsaClass currentcl3 = new EnsaClass (nom_cl3);
								

									
									System.out.println("seance instancie");
									Espace_prof.etudlst.add(currentcl3.listetud(sc));
								
									Espace_prof.etudlst.setVisible(true);
									
									
								}
							});
						}
					}
				 
				 if(empset.getString("dayname(sdate)").equals("Wednesday") )
					{
					if(empset.getString("HDEP").equals("08:00:00"))
					{	
						 final JLabel numlbl = new JLabel();
						 numlbl.setFont(new Font("Fredoka Light", Font.PLAIN, 18));
						 numlbl.setBackground(new Color(208, 233, 242));
						 mercst.add(numlbl);
						 
						 final JLabel modulelbl = new JLabel();
						 modulelbl.setFont(new Font("Fredoka Light", Font.PLAIN, 18));
						 modulelbl.setBackground(new Color(208, 233, 242));
						 mercst.add(modulelbl); 
						 
						 final JLabel classlbl = new JLabel();
						 classlbl.setFont(new Font("Fredoka Light", Font.PLAIN, 18));
						 classlbl.setBackground(new Color(208, 233, 242));
						 mercst.add(classlbl); 
						 
						System.out.println("8:00:00");
						numlbl.setForeground(new Color(154,199,217));
						modulelbl.setForeground(new Color(154,199,217));
						classlbl.setForeground(new Color(154,199,217));
						
						numlbl.setText("  seance :"+empset.getString("num"));
						modulelbl.setText("   | "+empset.getString("module"));
						classlbl.setText("   | "+empset.getString("nom_cl"));
						
						final String nom_cl4 = empset.getString("nom_cl");
						//------------- instanciation seance ----------
						final Seance sc = new Seance(Integer.parseInt(empset.getString("num")), empset.getString("sdate"), empset.getString("duree"), empset.getString("module"),Integer.parseInt(empset.getString("code_prof")), nom_cl4, empset.getString("HDEP"));

					
						
						 mercst.add(numlbl);
						 mercst.add(modulelbl);
						 mercst.add(classlbl);
						 
							mercst.addMouseListener(new MouseAdapter() {
								@Override
								public void mouseEntered(MouseEvent e) {
									mercst.setBackground(new Color(208, 233, 242));
									numlbl.setForeground(new Color(47, 85, 115));
									modulelbl.setForeground(new Color(47, 85, 115));
									classlbl.setForeground(new Color(47, 85, 115));
								}
								@Override
								public void mouseExited(MouseEvent e) {
									mercst.setBackground(new Color(47, 85, 115));
									numlbl.setForeground(new Color(255, 255,255));
									modulelbl.setForeground(new Color(255, 255,255));
									classlbl.setForeground(new Color(255, 255,255));
								}
								@Override
								public void mouseClicked(MouseEvent e) {
									
									setVisible(false);
									
									EnsaClass currentcl4 = new EnsaClass (nom_cl4);

									
									System.out.println("seance instancie");
									Espace_prof.etudlst.add(currentcl4.listetud(sc));
								
									Espace_prof.etudlst.setVisible(true);
								}
							});
						
					}else 
						{
						 final JLabel numlbl = new JLabel();
						 numlbl.setFont(new Font("Fredoka Light", Font.PLAIN, 18));
						 numlbl.setBackground(new Color(208, 233, 242));
						 mercnd.add(numlbl);
						 
						 final JLabel modulelbl = new JLabel();
						 modulelbl.setFont(new Font("Fredoka Light", Font.PLAIN, 18));
						 modulelbl.setBackground(new Color(208, 233, 242));
						 mercnd.add(modulelbl); 
						 
						 final JLabel classlbl = new JLabel();
						 classlbl.setFont(new Font("Fredoka Light", Font.PLAIN, 18));
						 classlbl.setBackground(new Color(208, 233, 242));
						 mercnd.add(classlbl); 
						System.out.println("14:00:00");
						numlbl.setForeground(new Color(154,199,217));
						modulelbl.setForeground(new Color(154,199,217));
						classlbl.setForeground(new Color(154,199,217));
						
						numlbl.setText("  seance :"+empset.getString("num"));
						modulelbl.setText("   | "+empset.getString("module"));
						classlbl.setText("   | "+empset.getString("nom_cl"));
						
						final String nom_cl5 = empset.getString("nom_cl");
						//------------- instanciation seance ----------
						final Seance sc = new Seance(Integer.parseInt(empset.getString("num")), empset.getString("sdate"), empset.getString("duree"), empset.getString("module"),Integer.parseInt(empset.getString("code_prof")), nom_cl5, empset.getString("HDEP"));

					
						
						 mercnd.add(numlbl);
						 mercnd.add(modulelbl);
						 mercnd.add(classlbl);
						 
							mercnd.addMouseListener(new MouseAdapter() {
								@Override
								public void mouseEntered(MouseEvent e) {
									mercnd.setBackground(new Color(208, 233, 242));
									numlbl.setForeground(new Color(47, 85, 115));
									modulelbl.setForeground(new Color(47, 85, 115));
									classlbl.setForeground(new Color(47, 85, 115));
								}
								@Override
								public void mouseExited(MouseEvent e) {
									mercnd.setBackground(new Color(47, 85, 115));
									numlbl.setForeground(new Color(255, 255,255));
									modulelbl.setForeground(new Color(255, 255,255));
									classlbl.setForeground(new Color(255, 255,255));
								}
								@Override
								public void mouseClicked(MouseEvent e) {
									
									setVisible(false);
									EnsaClass currentcl5 = new EnsaClass (nom_cl5);

									
									System.out.println("seance instancie");
									Espace_prof.etudlst.add(currentcl5.listetud(sc));
								
									Espace_prof.etudlst.setVisible(true);
									
								}
							});
						}
					}
				 if(empset.getString("dayname(sdate)").equals("Thursday") )
					{
					if(empset.getString("HDEP").equals("08:00:00"))
					{	
						 final JLabel numlbl = new JLabel();
						 numlbl.setFont(new Font("Fredoka Light", Font.PLAIN, 18));
						 numlbl.setBackground(new Color(208, 233, 242));
						 jeudist.add(numlbl);
						 
						 final JLabel modulelbl = new JLabel();
						 modulelbl.setFont(new Font("Fredoka Light", Font.PLAIN, 18));
						 modulelbl.setBackground(new Color(208, 233, 242));
						 jeudist.add(modulelbl); 
						 
						 final JLabel classlbl = new JLabel();
						 classlbl.setFont(new Font("Fredoka Light", Font.PLAIN, 18));
						 classlbl.setBackground(new Color(208, 233, 242));
						 jeudist.add(classlbl); 
						 
						System.out.println("8:00:00");
						numlbl.setForeground(new Color(154,199,217));
						modulelbl.setForeground(new Color(154,199,217));
						classlbl.setForeground(new Color(154,199,217));
						
						numlbl.setText("  seance :"+empset.getString("num"));
						modulelbl.setText("   | "+empset.getString("module"));
						classlbl.setText("   | "+empset.getString("nom_cl"));	
						
						final String nom_cl6 = empset.getString("nom_cl");
						//------------- instanciation seance ----------
						final Seance sc = new Seance(Integer.parseInt(empset.getString("num")), empset.getString("sdate"), empset.getString("duree"), empset.getString("module"),Integer.parseInt(empset.getString("code_prof")), nom_cl6, empset.getString("HDEP"));

					
						
						 jeudist.add(numlbl);
						 jeudist.add(modulelbl);
						 jeudist.add(classlbl);
						 
							jeudist.addMouseListener(new MouseAdapter() {
								@Override
								public void mouseEntered(MouseEvent e) {
									jeudist.setBackground(new Color(208, 233, 242));
									numlbl.setForeground(new Color(47, 85, 115));
									modulelbl.setForeground(new Color(47, 85, 115));
									classlbl.setForeground(new Color(47, 85, 115));
								}
								@Override
								public void mouseExited(MouseEvent e) {
									jeudist.setBackground(new Color(47, 85, 115));
									numlbl.setForeground(new Color(255, 255,255));
									modulelbl.setForeground(new Color(255, 255,255));
									classlbl.setForeground(new Color(255, 255,255));
								}
								@Override
								public void mouseClicked(MouseEvent e) {
									
									setVisible(false);
									EnsaClass currentcl6 = new EnsaClass (nom_cl6);

									
									System.out.println("seance instancie");
									Espace_prof.etudlst.add(currentcl6.listetud(sc));
								
									Espace_prof.etudlst.setVisible(true);
									
								}
							});
						
					}else 
						{
						 final JLabel numlbl = new JLabel();
						 numlbl.setFont(new Font("Fredoka Light", Font.PLAIN, 18));
						 numlbl.setBackground(new Color(208, 233, 242));
						jeudind.add(numlbl);
						 
						 final JLabel modulelbl = new JLabel();
						 modulelbl.setFont(new Font("Fredoka Light", Font.PLAIN, 18));
						 modulelbl.setBackground(new Color(208, 233, 242));
						 jeudind.add(modulelbl); 
						 
						 final JLabel classlbl = new JLabel();
						 classlbl.setFont(new Font("Fredoka Light", Font.PLAIN, 18));
						 classlbl.setBackground(new Color(208, 233, 242));
						 jeudind.add(classlbl); 
						System.out.println("14:00:00");
						numlbl.setForeground(new Color(154,199,217));
						modulelbl.setForeground(new Color(154,199,217));
						classlbl.setForeground(new Color(154,199,217));
						
						numlbl.setText("  seance :"+empset.getString("num"));
						modulelbl.setText("   | "+empset.getString("module"));
						classlbl.setText("   | "+empset.getString("nom_cl"));
						
						final String nom_cl7 = empset.getString("nom_cl");
						//------------- instanciation seance ----------
						final Seance sc = new Seance(Integer.parseInt(empset.getString("num")), empset.getString("sdate"), empset.getString("duree"), empset.getString("module"),Integer.parseInt(empset.getString("code_prof")), nom_cl7, empset.getString("HDEP"));

					
						
						 jeudind.add(numlbl);
						jeudind.add(modulelbl);
						 jeudind.add(classlbl);
						 
							jeudind.addMouseListener(new MouseAdapter() {
								@Override
								public void mouseEntered(MouseEvent e) {
									jeudind.setBackground(new Color(208, 233, 242));
									numlbl.setForeground(new Color(47, 85, 115));
									modulelbl.setForeground(new Color(47, 85, 115));
									classlbl.setForeground(new Color(47, 85, 115));
								}
								@Override
								public void mouseExited(MouseEvent e) {
									jeudind.setBackground(new Color(47, 85, 115));
									numlbl.setForeground(new Color(255, 255,255));
									modulelbl.setForeground(new Color(255, 255,255));
									classlbl.setForeground(new Color(255, 255,255));
								}
								@Override
								public void mouseClicked(MouseEvent e) {
									
									setVisible(false);
									EnsaClass currentcl7 = new EnsaClass (nom_cl7);

									
									System.out.println("seance instancie");
									Espace_prof.etudlst.add(currentcl7.listetud(sc));
								
									Espace_prof.etudlst.setVisible(true);
									
								}
							});
						}
					}
				 if(empset.getString("dayname(sdate)").equals("Friday") )
					{
					if(empset.getString("HDEP").equals("08:00:00"))
					{	
						 final JLabel numlbl = new JLabel();
						 numlbl.setFont(new Font("Fredoka Light", Font.PLAIN, 18));
						 numlbl.setBackground(new Color(208, 233, 242));
						 vendst.add(numlbl);
						 
						 final JLabel modulelbl = new JLabel();
						 modulelbl.setFont(new Font("Fredoka Light", Font.PLAIN, 18));
						 modulelbl.setBackground(new Color(208, 233, 242));
						 vendst.add(modulelbl); 
						 
						 final JLabel classlbl = new JLabel();
						 classlbl.setFont(new Font("Fredoka Light", Font.PLAIN, 18));
						 classlbl.setBackground(new Color(208, 233, 242));
						 vendst.add(classlbl); 
						 
						System.out.println("8:00:00");
						numlbl.setForeground(new Color(154,199,217));
						modulelbl.setForeground(new Color(154,199,217));
						classlbl.setForeground(new Color(154,199,217));
						
						numlbl.setText("  seance :"+empset.getString("num"));
						modulelbl.setText("   | "+empset.getString("module"));
						classlbl.setText("   | "+empset.getString("nom_cl"));	
						
						final String nom_cl8 = empset.getString("nom_cl");
						//------------- instanciation seance ----------
						final Seance sc = new Seance(Integer.parseInt(empset.getString("num")), empset.getString("sdate"), empset.getString("duree"), empset.getString("module"),Integer.parseInt(empset.getString("code_prof")), nom_cl8, empset.getString("HDEP"));

					
						
						 vendst.add(numlbl);
						 vendst.add(modulelbl);
						 vendst.add(classlbl);
						 
							vendst.addMouseListener(new MouseAdapter() {
								@Override
								public void mouseEntered(MouseEvent e) {
									vendst.setBackground(new Color(208, 233, 242));
									numlbl.setForeground(new Color(47, 85, 115));
									modulelbl.setForeground(new Color(47, 85, 115));
									classlbl.setForeground(new Color(47, 85, 115));
								}
								@Override
								public void mouseExited(MouseEvent e) {
									lundist.setBackground(new Color(47, 85, 115));
									numlbl.setForeground(new Color(255, 255,255));
									modulelbl.setForeground(new Color(255, 255,255));
									classlbl.setForeground(new Color(255, 255,255));
								}
								@Override
								public void mouseClicked(MouseEvent e) {
									
									setVisible(false);
									EnsaClass currentcl8 = new EnsaClass (nom_cl8);

									
									System.out.println("seance instancie");
									Espace_prof.etudlst.add(currentcl8.listetud(sc));
								
									Espace_prof.etudlst.setVisible(true);
									
								}
							});
						
					}else 
						{
						 final JLabel numlbl = new JLabel();
						 numlbl.setFont(new Font("Fredoka Light", Font.PLAIN, 18));
						 numlbl.setBackground(new Color(208, 233, 242));
						 vendnd.add(numlbl);
						 
						 final JLabel modulelbl = new JLabel();
						 modulelbl.setFont(new Font("Fredoka Light", Font.PLAIN, 18));
						 modulelbl.setBackground(new Color(208, 233, 242));
						 vendnd.add(modulelbl); 
						 
						 final JLabel classlbl = new JLabel();
						 classlbl.setFont(new Font("Fredoka Light", Font.PLAIN, 18));
						 classlbl.setBackground(new Color(208, 233, 242));
						 vendnd.add(classlbl); 
						System.out.println("14:00:00");
						numlbl.setForeground(new Color(154,199,217));
						modulelbl.setForeground(new Color(154,199,217));
						classlbl.setForeground(new Color(154,199,217));
						
						numlbl.setText("  seance :"+empset.getString("num"));
						modulelbl.setText("   | "+empset.getString("module"));
						classlbl.setText("   | "+empset.getString("nom_cl"));
						
						final String nom_cl9 = empset.getString("nom_cl");
						//------------- instanciation seance ----------
						final Seance sc = new Seance(Integer.parseInt(empset.getString("num")), empset.getString("sdate"), empset.getString("duree"), empset.getString("module"),Integer.parseInt(empset.getString("code_prof")), nom_cl9, empset.getString("HDEP"));

					
						
						 vendnd.add(numlbl);
						vendnd.add(modulelbl);
						 vendnd.add(classlbl);
						 
							vendnd.addMouseListener(new MouseAdapter() {
								@Override
								public void mouseEntered(MouseEvent e) {
									vendnd.setBackground(new Color(208, 233, 242));
									numlbl.setForeground(new Color(47, 85, 115));
									modulelbl.setForeground(new Color(47, 85, 115));
									classlbl.setForeground(new Color(47, 85, 115));
								}
								@Override
								public void mouseExited(MouseEvent e) {
									lundist.setBackground(new Color(47, 85, 115));
									numlbl.setForeground(new Color(255, 255,255));
									modulelbl.setForeground(new Color(255, 255,255));
									classlbl.setForeground(new Color(255, 255,255));
								}
								@Override
								public void mouseClicked(MouseEvent e) {
									
									setVisible(false);
									EnsaClass currentcl9 = new EnsaClass (nom_cl9);

									
									System.out.println("seance instancie");
									Espace_prof.etudlst.add(currentcl9.listetud(sc));
								
									Espace_prof.etudlst.setVisible(true);
									
									
								}
							});
						}
					}
			
				
			
			}
				
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		


	}

	/**
	 * @wbp.parser.constructor
	 */
	public Emploi(EnsaClass cl) {
		setFont(new Font("Myriad Pro", Font.PLAIN, 12));
		setBackground(new Color(208, 233, 242));
		setPreferredSize(new Dimension( 754, 424));
		
	//	System.out.println(" emploi cree");
		setLayout(new GridLayout(6, 6, 0, 10));
		
		


		

		
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(new Color(141, 189, 218));
		FlowLayout flowLayout = (FlowLayout) panel_4.getLayout();
		flowLayout.setVgap(20);
		flowLayout.setHgap(85);
		flowLayout.setAlignment(FlowLayout.LEFT);
		add(panel_4);
		
		
		JLabel lblNewLabel = new JLabel("8H                   10H                   12H");
		lblNewLabel.setFont(new Font("Fredoka Light", Font.PLAIN, 20));
		panel_4.add(lblNewLabel);
		
		JLabel lblhhh_1 = new JLabel("14H                   16H                   18H");
		lblhhh_1.setFont(new Font("Fredoka Light", Font.PLAIN, 20));
		panel_4.add(lblhhh_1);
	
		
		//-------------------- lundi pnl -----------------
		 final JPanel panel_5 = new JPanel();
		panel_5.setBackground(new Color(141, 189, 218));
		FlowLayout flowLayout_1 = (FlowLayout) panel_5.getLayout();
		flowLayout_1.setAlignment(FlowLayout.LEFT);
		add(panel_5);
		
		JLabel LUNDI = new JLabel("LUN");
		LUNDI.setPreferredSize(new Dimension(75, 20));
		LUNDI.setFont(new Font("Fredoka Light", Font.PLAIN, 20));
		panel_5.add(LUNDI);
		
		final JPanel lundist = new JPanel();
		lundist.setPreferredSize(new Dimension(280, 50));
		lundist.setBackground(new Color(47, 85, 115));
		FlowLayout fl_lundist = (FlowLayout) lundist.getLayout();
		fl_lundist.setHgap(10);
		fl_lundist.setVgap(10);
		fl_lundist.setAlignment(FlowLayout.LEFT);
		

		 
		 
		
		 
		 panel_5.add(lundist);
		 
		 JLabel lblNewLabel_1 = new JLabel("");
		 lblNewLabel_1.setPreferredSize(new Dimension(85, 50));
		 panel_5.add(lblNewLabel_1);
		 
		 final JPanel lundi2nd = new JPanel();
		 FlowLayout flowLayout_10 = (FlowLayout) lundi2nd.getLayout();
		 flowLayout_10.setVgap(10);
		 flowLayout_10.setHgap(10);
		 flowLayout_10.setAlignment(FlowLayout.LEFT);
		 lundi2nd.setPreferredSize(new Dimension(280, 50));
		 lundi2nd.setBackground(new Color(47, 85, 115));
		 panel_5.add(lundi2nd);
		 
		
		 
	
		

		
		//  ------------------mardi pnl --------------------
		
		JPanel panel_5_1 = new JPanel();
		panel_5_1.setBackground(new Color(141, 189, 218));
		FlowLayout flowLayout_2 = (FlowLayout) panel_5_1.getLayout();
		flowLayout_2.setAlignment(FlowLayout.LEFT);
		add(panel_5_1);
		
		JLabel LUNDI_1 = new JLabel("MAR");
		LUNDI_1.setPreferredSize(new Dimension(75, 20));
		LUNDI_1.setFont(new Font("Fredoka Light", Font.PLAIN, 20));
		panel_5_1.add(LUNDI_1);
		
		final JPanel mardist = new JPanel();
		FlowLayout flowLayout_6 = (FlowLayout) mardist.getLayout();
		flowLayout_6.setVgap(10);
		flowLayout_6.setHgap(10);
		flowLayout_6.setAlignment(FlowLayout.LEFT);
		mardist.setPreferredSize(new Dimension(280, 50));
		mardist.setBackground(new Color(47, 85, 115));
		panel_5_1.add(mardist);
		

		
		JLabel lblNewLabel_1_1 = new JLabel("");
		lblNewLabel_1_1.setPreferredSize(new Dimension(85, 50));
		panel_5_1.add(lblNewLabel_1_1);
		
		final JPanel mardind = new JPanel();
		FlowLayout flowLayout_11 = (FlowLayout) mardind.getLayout();
		flowLayout_11.setVgap(10);
		flowLayout_11.setHgap(10);
		flowLayout_11.setAlignment(FlowLayout.LEFT);
		mardind.setPreferredSize(new Dimension(280, 50));
		mardind.setBackground(new Color(47, 85, 115));
		panel_5_1.add(mardind);
		

		
		JPanel panel_5_2 = new JPanel();
		panel_5_2.setBackground(new Color(141, 189, 218));
		FlowLayout flowLayout_3 = (FlowLayout) panel_5_2.getLayout();
		flowLayout_3.setAlignment(FlowLayout.LEFT);
		add(panel_5_2);
		
		JLabel LUNDI_2 = new JLabel("MER");
		LUNDI_2.setPreferredSize(new Dimension(75, 20));
		LUNDI_2.setFont(new Font("Fredoka Light", Font.PLAIN, 20));
		panel_5_2.add(LUNDI_2);
		
		final JPanel mercst = new JPanel();
		FlowLayout flowLayout_7 = (FlowLayout) mercst.getLayout();
		flowLayout_7.setVgap(10);
		flowLayout_7.setHgap(10);
		flowLayout_7.setAlignment(FlowLayout.LEFT);
		mercst.setPreferredSize(new Dimension(280, 50));
		mercst.setBackground(new Color(47, 85, 115));
		panel_5_2.add(mercst);
		

		
		JLabel lblNewLabel_1_1_1 = new JLabel("");
		lblNewLabel_1_1_1.setPreferredSize(new Dimension(85, 50));
		panel_5_2.add(lblNewLabel_1_1_1);
		
		final JPanel mercnd = new JPanel();
		FlowLayout flowLayout_12 = (FlowLayout) mercnd.getLayout();
		flowLayout_12.setVgap(10);
		flowLayout_12.setHgap(10);
		flowLayout_12.setAlignment(FlowLayout.LEFT);
		mercnd.setPreferredSize(new Dimension(280, 50));
		mercnd.setBackground(new Color(47, 85, 115));
		panel_5_2.add(mercnd);
		
	
		
		JPanel panel_5_3 = new JPanel();
		panel_5_3.setBackground(new Color(141, 189, 218));
		FlowLayout flowLayout_4 = (FlowLayout) panel_5_3.getLayout();
		flowLayout_4.setAlignment(FlowLayout.LEFT);
		add(panel_5_3);
		
		JLabel LUNDI_3 = new JLabel("JEU");
		LUNDI_3.setPreferredSize(new Dimension(75, 20));
		LUNDI_3.setFont(new Font("Fredoka Light", Font.PLAIN, 20));
		panel_5_3.add(LUNDI_3);
		
		final JPanel jeudist = new JPanel();
		FlowLayout flowLayout_8 = (FlowLayout) jeudist.getLayout();
		flowLayout_8.setVgap(10);
		flowLayout_8.setHgap(10);
		flowLayout_8.setAlignment(FlowLayout.LEFT);
		jeudist.setPreferredSize(new Dimension(280, 50));
		jeudist.setBackground(new Color(47, 85, 115));
		panel_5_3.add(jeudist);
		

		
		JLabel lblNewLabel_1_1_2 = new JLabel("");
		lblNewLabel_1_1_2.setPreferredSize(new Dimension(85, 50));
		panel_5_3.add(lblNewLabel_1_1_2);
		
		final JPanel jeudind = new JPanel();
		FlowLayout flowLayout_13 = (FlowLayout) jeudind.getLayout();
		flowLayout_13.setVgap(10);
		flowLayout_13.setHgap(10);
		flowLayout_13.setAlignment(FlowLayout.LEFT);
		jeudind.setPreferredSize(new Dimension(280, 50));
		jeudind.setBackground(new Color(47, 85, 115));
		panel_5_3.add(jeudind);
		

		
		JPanel panel_5_4 = new JPanel();
		panel_5_4.setBackground(new Color(141, 189, 218));
		FlowLayout flowLayout_5 = (FlowLayout) panel_5_4.getLayout();
		flowLayout_5.setAlignment(FlowLayout.LEFT);
		add(panel_5_4);
		
		JLabel LUNDI_4 = new JLabel("VEN");
		LUNDI_4.setPreferredSize(new Dimension(75, 20));
		LUNDI_4.setFont(new Font("Fredoka Light", Font.PLAIN, 20));
		panel_5_4.add(LUNDI_4);
		
		final JPanel vendst = new JPanel();
		FlowLayout flowLayout_9 = (FlowLayout) vendst.getLayout();
		flowLayout_9.setVgap(10);
		flowLayout_9.setHgap(10);
		flowLayout_9.setAlignment(FlowLayout.LEFT);
		vendst.setPreferredSize(new Dimension(280, 50));
		vendst.setBackground(new Color(47, 85, 115));
		panel_5_4.add(vendst);
		
	
		
		JLabel lblNewLabel_1_1_3 = new JLabel("");
		lblNewLabel_1_1_3.setPreferredSize(new Dimension(85, 50));
		panel_5_4.add(lblNewLabel_1_1_3);
		
		final JPanel vendnd = new JPanel();
		FlowLayout flowLayout_14 = (FlowLayout) vendnd.getLayout();
		flowLayout_14.setVgap(10);
		flowLayout_14.setHgap(10);
		flowLayout_14.setAlignment(FlowLayout.LEFT);
		vendnd.setPreferredSize(new Dimension(280, 50));
		vendnd.setBackground(new Color(47, 85, 115));
		panel_5_4.add(vendnd);
		

		//-----------------------------espace emploi --------------------------
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try {
			Connection con = DriverManager.getConnection(url,"root","PFH#23kgrw9");
			String empquery = "select distinct *,dayname(sdate)  from seance where nom_cl='%s' and sdate between CURDATE() - INTERVAL (WEEKDAY(CURDATE())+1) DAY  and  CURDATE() - INTERVAL (WEEKDAY(CURDATE())-4) DAY ;";
			final ResultSet empset;
			//System.out.println("ACCES SUCCES");
			Statement empstat = con.createStatement();
			empset = empstat.executeQuery(String.format(empquery, cl.getNom()));
			//System.out.println(String.format(empquery, current.getCode_prof()));
			while (empset.next()) {
				if(empset.getString("dayname(sdate)").equals("Monday") )
					{
						System.out.println("in monday");
						if(empset.getString("HDEP").equals("08:00:00"))
							{	
	
							 final JLabel numlbl = new JLabel();
							 numlbl.setFont(new Font("Fredoka Light", Font.PLAIN, 18));
							 numlbl.setBackground(new Color(208, 233, 242));
							 lundist.add(numlbl);
							 
							 final JLabel modulelbl = new JLabel();
							 modulelbl.setFont(new Font("Fredoka Light", Font.PLAIN, 18));
							 modulelbl.setBackground(new Color(208, 233, 242));
							 lundist.add(modulelbl); 
							 
							 final JLabel classlbl = new JLabel();
							 classlbl.setFont(new Font("Fredoka Light", Font.PLAIN, 18));
							 classlbl.setBackground(new Color(208, 233, 242));
							 lundist.add(classlbl); 
							 
								System.out.println("8:00:00");
								numlbl.setForeground(new Color(154,199,217));
								modulelbl.setForeground(new Color(154,199,217));
								classlbl.setForeground(new Color(154,199,217));
								
								numlbl.setText("  seance :"+empset.getString("num"));
								modulelbl.setText("   | "+empset.getString("module"));
								classlbl.setText("   | "+empset.getString("nom_cl"));	
								final String nom_cl = empset.getString("nom_cl");
								
								//------------- instanciation seance ----------
								final Seance sc = new Seance(Integer.parseInt(empset.getString("num")), empset.getString("sdate"), empset.getString("duree"), empset.getString("module"),Integer.parseInt(empset.getString("code_prof")), nom_cl, empset.getString("HDEP"));

								
								 lundist.add(numlbl);
								 lundist.add(modulelbl);
								 lundist.add(classlbl);
									
									lundist.addMouseListener(new MouseAdapter() {
										@Override
										public void mouseEntered(MouseEvent e) {
											lundist.setBackground(new Color(208, 233, 242));
											numlbl.setForeground(new Color(47, 85, 115));
											modulelbl.setForeground(new Color(47, 85, 115));
											classlbl.setForeground(new Color(47, 85, 115));
										}
										@Override
										public void mouseExited(MouseEvent e) {
											lundist.setBackground(new Color(47, 85, 115));
											numlbl.setForeground(new Color(255, 255,255));
											modulelbl.setForeground(new Color(255, 255,255));
											classlbl.setForeground(new Color(255, 255,255));
										}
										@Override
										public void mouseClicked(MouseEvent e) {
											
											setVisible(false);
											EnsaClass currentcl = new EnsaClass (nom_cl);
											
											
											Espace_Admin.etudlst.setVisible(false);

											Espace_Admin.etudlst.removeAll();
												System.out.println("seance instancie");
												Espace_Admin.etudlst.add(currentcl.listetud(sc));
											
											
											Espace_Admin.etudlst.setVisible(true);
										
											
										}
									});
									
									FlowLayout fl_seancepnl = (FlowLayout) panel_5.getLayout();
									fl_seancepnl.setAlignment(FlowLayout.LEFT);
									
								
							}else 
								{
								 final JLabel numlbl = new JLabel();
								 numlbl.setFont(new Font("Fredoka Light", Font.PLAIN, 18));
								 numlbl.setBackground(new Color(208, 233, 242));
								 lundi2nd.add(numlbl);
								 
								 final JLabel modulelbl = new JLabel();
								 modulelbl.setFont(new Font("Fredoka Light", Font.PLAIN, 18));
								 modulelbl.setBackground(new Color(208, 233, 242));
								 lundi2nd.add(modulelbl); 
								 
								 final JLabel classlbl = new JLabel();
								 classlbl.setFont(new Font("Fredoka Light", Font.PLAIN, 18));
								 classlbl.setBackground(new Color(208, 233, 242));
								 lundi2nd.add(classlbl); 
								 
								System.out.println("14:00:00");
								numlbl.setForeground(new Color(154,199,217));
								modulelbl.setForeground(new Color(154,199,217));
								classlbl.setForeground(new Color(154,199,217));
								
								numlbl.setText("  seance :"+empset.getString("num"));
								modulelbl.setText("   | "+empset.getString("module"));
								classlbl.setText("   | "+empset.getString("nom_cl"));
								
								final String nom_cl1 = empset.getString("nom_cl");
								//------------- instanciation seance ----------
								final Seance sc = new Seance(Integer.parseInt(empset.getString("num")), empset.getString("sdate"), empset.getString("duree"), empset.getString("module"),Integer.parseInt(empset.getString("code_prof")), nom_cl1, empset.getString("HDEP"));

							
								
								 lundi2nd.add(numlbl);
								 lundi2nd.add(modulelbl);
								 lundi2nd.add(classlbl);
								 
									lundi2nd.addMouseListener(new MouseAdapter() {
										@Override
										public void mouseEntered(MouseEvent e) {
											lundi2nd.setBackground(new Color(208, 233, 242));
											numlbl.setForeground(new Color(47, 85, 115));
											modulelbl.setForeground(new Color(47, 85, 115));
											classlbl.setForeground(new Color(47, 85, 115));
										}
										@Override
										public void mouseExited(MouseEvent e) {
											lundi2nd.setBackground(new Color(47, 85, 115));
											numlbl.setForeground(new Color(255, 255,255));
											modulelbl.setForeground(new Color(255, 255,255));
											classlbl.setForeground(new Color(255, 255,255));
										}
										@Override
										public void mouseClicked(MouseEvent e) {
											
											setVisible(false);
											EnsaClass currentcl1 = new EnsaClass (nom_cl1);
											
											

											
											System.out.println("seance instancie");
											Espace_Admin.etudlst.removeAll();
											Espace_Admin.etudlst.add(currentcl1.listetud(sc));
										
											Espace_Admin.etudlst.setVisible(true);
											
										}
									});
								}
							
					}
				
				 if(empset.getString("dayname(sdate)").equals("Tuesday") )
					{
					if(empset.getString("HDEP").equals("08:00:00"))
					{	
						 final JLabel numlbl = new JLabel();
						 numlbl.setFont(new Font("Fredoka Light", Font.PLAIN, 18));
						 numlbl.setBackground(new Color(208, 233, 242));
						 mardist.add(numlbl);
						 
						 final JLabel modulelbl = new JLabel();
						 modulelbl.setFont(new Font("Fredoka Light", Font.PLAIN, 18));
						 modulelbl.setBackground(new Color(208, 233, 242));
						 mardist.add(modulelbl); 
						 
						 final JLabel classlbl = new JLabel();
						 classlbl.setFont(new Font("Fredoka Light", Font.PLAIN, 18));
						 classlbl.setBackground(new Color(208, 233, 242));
						 mardist.add(classlbl); 
						 
						System.out.println("8:00:00");
						numlbl.setForeground(new Color(154,199,217));
						modulelbl.setForeground(new Color(154,199,217));
						classlbl.setForeground(new Color(154,199,217));
						
						numlbl.setText("  seance :"+empset.getString("num"));
						modulelbl.setText("   | "+empset.getString("module"));
						classlbl.setText("   | "+empset.getString("nom_cl"));	
						
						final String nom_cl2 = empset.getString("nom_cl");
						//------------- instanciation seance ----------
						final Seance sc = new Seance(Integer.parseInt(empset.getString("num")), empset.getString("sdate"), empset.getString("duree"), empset.getString("module"),Integer.parseInt(empset.getString("code_prof")), nom_cl2, empset.getString("HDEP"));

					
						
						 mardist.add(numlbl);
						 mardist.add(modulelbl);
						 mardist.add(classlbl);
						 
							mardist.addMouseListener(new MouseAdapter() {
								@Override
								public void mouseEntered(MouseEvent e) {
									mardist.setBackground(new Color(208, 233, 242));
									numlbl.setForeground(new Color(47, 85, 115));
									modulelbl.setForeground(new Color(47, 85, 115));
									classlbl.setForeground(new Color(47, 85, 115));
								}
								@Override
								public void mouseExited(MouseEvent e) {
									mardist.setBackground(new Color(47, 85, 115));
									numlbl.setForeground(new Color(255, 255,255));
									modulelbl.setForeground(new Color(255, 255,255));
									classlbl.setForeground(new Color(255, 255,255));
								}
								@Override
								public void mouseClicked(MouseEvent e) {
									
									setVisible(false);
									EnsaClass currentcl2 = new EnsaClass (nom_cl2);
									

									
									System.out.println("seance instancie");
									Espace_Admin.etudlst.removeAll();
									Espace_Admin.etudlst.add(currentcl2.listetud(sc));
								
									
									Espace_Admin.etudlst.setVisible(true);
									
								}
							});
						
					}else 
						{
						 final JLabel numlbl = new JLabel();
						 numlbl.setFont(new Font("Fredoka Light", Font.PLAIN, 18));
						 numlbl.setBackground(new Color(208, 233, 242));
						 mardind.add(numlbl);
						 
						 final JLabel modulelbl = new JLabel();
						 modulelbl.setFont(new Font("Fredoka Light", Font.PLAIN, 18));
						 modulelbl.setBackground(new Color(208, 233, 242));
						 mardind.add(modulelbl); 
						 
						 final JLabel classlbl = new JLabel();
						 classlbl.setFont(new Font("Fredoka Light", Font.PLAIN, 18));
						 classlbl.setBackground(new Color(208, 233, 242));
						 mardind.add(classlbl); 
						System.out.println("14:00:00");
						numlbl.setForeground(new Color(154,199,217));
						modulelbl.setForeground(new Color(154,199,217));
						classlbl.setForeground(new Color(154,199,217));
						
						numlbl.setText("  seance :"+empset.getString("num"));
						modulelbl.setText("   | "+empset.getString("module"));
						classlbl.setText("   | "+empset.getString("nom_cl"));
						final String nom_cl3 = empset.getString("nom_cl");
						//------------- instanciation seance ----------
						final Seance sc = new Seance(Integer.parseInt(empset.getString("num")), empset.getString("sdate"), empset.getString("duree"), empset.getString("module"),Integer.parseInt(empset.getString("code_prof")), nom_cl3, empset.getString("HDEP"));

					
						
						 mardind.add(numlbl);
						 mardind.add(modulelbl);
						 mardind.add(classlbl);
						 
							mardind.addMouseListener(new MouseAdapter() {
								@Override
								public void mouseEntered(MouseEvent e) {
									mardind.setBackground(new Color(208, 233, 242));
									numlbl.setForeground(new Color(47, 85, 115));
									modulelbl.setForeground(new Color(47, 85, 115));
									classlbl.setForeground(new Color(47, 85, 115));
								}
								@Override
								public void mouseExited(MouseEvent e) {
									mardind.setBackground(new Color(47, 85, 115));
									numlbl.setForeground(new Color(255, 255,255));
									modulelbl.setForeground(new Color(255, 255,255));
									classlbl.setForeground(new Color(255, 255,255));
								}
								@Override
								public void mouseClicked(MouseEvent e) {
									
									setVisible(false);
									EnsaClass currentcl3 = new EnsaClass (nom_cl3);
								

									
									System.out.println("seance instancie");
									Espace_Admin.etudlst.removeAll();
									Espace_Admin.etudlst.add(currentcl3.listetud(sc));
								
									Espace_Admin.etudlst.setVisible(true);
									
									
								}
							});
						}
					}
				 
				 if(empset.getString("dayname(sdate)").equals("Wednesday") )
					{
					if(empset.getString("HDEP").equals("08:00:00"))
					{	
						 final JLabel numlbl = new JLabel();
						 numlbl.setFont(new Font("Fredoka Light", Font.PLAIN, 18));
						 numlbl.setBackground(new Color(208, 233, 242));
						 mercst.add(numlbl);
						 
						 final JLabel modulelbl = new JLabel();
						 modulelbl.setFont(new Font("Fredoka Light", Font.PLAIN, 18));
						 modulelbl.setBackground(new Color(208, 233, 242));
						 mercst.add(modulelbl); 
						 
						 final JLabel classlbl = new JLabel();
						 classlbl.setFont(new Font("Fredoka Light", Font.PLAIN, 18));
						 classlbl.setBackground(new Color(208, 233, 242));
						 mercst.add(classlbl); 
						 
						System.out.println("8:00:00");
						numlbl.setForeground(new Color(154,199,217));
						modulelbl.setForeground(new Color(154,199,217));
						classlbl.setForeground(new Color(154,199,217));
						
						numlbl.setText("  seance :"+empset.getString("num"));
						modulelbl.setText("   | "+empset.getString("module"));
						classlbl.setText("   | "+empset.getString("nom_cl"));
						
						final String nom_cl4 = empset.getString("nom_cl");
						//------------- instanciation seance ----------
						final Seance sc = new Seance(Integer.parseInt(empset.getString("num")), empset.getString("sdate"), empset.getString("duree"), empset.getString("module"),Integer.parseInt(empset.getString("code_prof")), nom_cl4, empset.getString("HDEP"));

					
						
						 mercst.add(numlbl);
						 mercst.add(modulelbl);
						 mercst.add(classlbl);
						 
							mercst.addMouseListener(new MouseAdapter() {
								@Override
								public void mouseEntered(MouseEvent e) {
									mercst.setBackground(new Color(208, 233, 242));
									numlbl.setForeground(new Color(47, 85, 115));
									modulelbl.setForeground(new Color(47, 85, 115));
									classlbl.setForeground(new Color(47, 85, 115));
								}
								@Override
								public void mouseExited(MouseEvent e) {
									mercst.setBackground(new Color(47, 85, 115));
									numlbl.setForeground(new Color(255, 255,255));
									modulelbl.setForeground(new Color(255, 255,255));
									classlbl.setForeground(new Color(255, 255,255));
								}
								@Override
								public void mouseClicked(MouseEvent e) {
									
									setVisible(false);
									
									EnsaClass currentcl4 = new EnsaClass (nom_cl4);

									
									System.out.println("seance instancie");
									Espace_Admin.etudlst.removeAll();
									Espace_Admin.etudlst.add(currentcl4.listetud(sc));
								
									Espace_Admin.etudlst.setVisible(true);
								}
							});
						
					}else 
						{
						 final JLabel numlbl = new JLabel();
						 numlbl.setFont(new Font("Fredoka Light", Font.PLAIN, 18));
						 numlbl.setBackground(new Color(208, 233, 242));
						 mercnd.add(numlbl);
						 
						 final JLabel modulelbl = new JLabel();
						 modulelbl.setFont(new Font("Fredoka Light", Font.PLAIN, 18));
						 modulelbl.setBackground(new Color(208, 233, 242));
						 mercnd.add(modulelbl); 
						 
						 final JLabel classlbl = new JLabel();
						 classlbl.setFont(new Font("Fredoka Light", Font.PLAIN, 18));
						 classlbl.setBackground(new Color(208, 233, 242));
						 mercnd.add(classlbl); 
						System.out.println("14:00:00");
						numlbl.setForeground(new Color(154,199,217));
						modulelbl.setForeground(new Color(154,199,217));
						classlbl.setForeground(new Color(154,199,217));
						
						numlbl.setText("  seance :"+empset.getString("num"));
						modulelbl.setText("   | "+empset.getString("module"));
						classlbl.setText("   | "+empset.getString("nom_cl"));
						
						final String nom_cl5 = empset.getString("nom_cl");
						//------------- instanciation seance ----------
						final Seance sc = new Seance(Integer.parseInt(empset.getString("num")), empset.getString("sdate"), empset.getString("duree"), empset.getString("module"),Integer.parseInt(empset.getString("code_prof")), nom_cl5, empset.getString("HDEP"));

					
						
						 mercnd.add(numlbl);
						 mercnd.add(modulelbl);
						 mercnd.add(classlbl);
						 
							mercnd.addMouseListener(new MouseAdapter() {
								@Override
								public void mouseEntered(MouseEvent e) {
									mercnd.setBackground(new Color(208, 233, 242));
									numlbl.setForeground(new Color(47, 85, 115));
									modulelbl.setForeground(new Color(47, 85, 115));
									classlbl.setForeground(new Color(47, 85, 115));
								}
								@Override
								public void mouseExited(MouseEvent e) {
									mercnd.setBackground(new Color(47, 85, 115));
									numlbl.setForeground(new Color(255, 255,255));
									modulelbl.setForeground(new Color(255, 255,255));
									classlbl.setForeground(new Color(255, 255,255));
								}
								@Override
								public void mouseClicked(MouseEvent e) {
									
									setVisible(false);
									EnsaClass currentcl5 = new EnsaClass (nom_cl5);

									
									System.out.println("seance instancie");
									Espace_Admin.etudlst.removeAll();
									Espace_Admin.etudlst.add(currentcl5.listetud(sc));
								
									Espace_Admin.etudlst.setVisible(true);
									
								}
							});
						}
					}
				 if(empset.getString("dayname(sdate)").equals("Thursday") )
					{
					if(empset.getString("HDEP").equals("08:00:00"))
					{	
						 final JLabel numlbl = new JLabel();
						 numlbl.setFont(new Font("Fredoka Light", Font.PLAIN, 18));
						 numlbl.setBackground(new Color(208, 233, 242));
						 jeudist.add(numlbl);
						 
						 final JLabel modulelbl = new JLabel();
						 modulelbl.setFont(new Font("Fredoka Light", Font.PLAIN, 18));
						 modulelbl.setBackground(new Color(208, 233, 242));
						 jeudist.add(modulelbl); 
						 
						 final JLabel classlbl = new JLabel();
						 classlbl.setFont(new Font("Fredoka Light", Font.PLAIN, 18));
						 classlbl.setBackground(new Color(208, 233, 242));
						 jeudist.add(classlbl); 
						 
						System.out.println("8:00:00");
						numlbl.setForeground(new Color(154,199,217));
						modulelbl.setForeground(new Color(154,199,217));
						classlbl.setForeground(new Color(154,199,217));
						
						numlbl.setText("  seance :"+empset.getString("num"));
						modulelbl.setText("   | "+empset.getString("module"));
						classlbl.setText("   | "+empset.getString("nom_cl"));	
						
						final String nom_cl6 = empset.getString("nom_cl");
						//------------- instanciation seance ----------
						final Seance sc = new Seance(Integer.parseInt(empset.getString("num")), empset.getString("sdate"), empset.getString("duree"), empset.getString("module"),Integer.parseInt(empset.getString("code_prof")), nom_cl6, empset.getString("HDEP"));

					
						
						 jeudist.add(numlbl);
						 jeudist.add(modulelbl);
						 jeudist.add(classlbl);
						 
							jeudist.addMouseListener(new MouseAdapter() {
								@Override
								public void mouseEntered(MouseEvent e) {
									jeudist.setBackground(new Color(208, 233, 242));
									numlbl.setForeground(new Color(47, 85, 115));
									modulelbl.setForeground(new Color(47, 85, 115));
									classlbl.setForeground(new Color(47, 85, 115));
								}
								@Override
								public void mouseExited(MouseEvent e) {
									jeudist.setBackground(new Color(47, 85, 115));
									numlbl.setForeground(new Color(255, 255,255));
									modulelbl.setForeground(new Color(255, 255,255));
									classlbl.setForeground(new Color(255, 255,255));
								}
								@Override
								public void mouseClicked(MouseEvent e) {
									
									setVisible(false);
									EnsaClass currentcl6 = new EnsaClass (nom_cl6);

									
									System.out.println("seance instancie");
									Espace_Admin.etudlst.removeAll();
									Espace_Admin.etudlst.add(currentcl6.listetud(sc));
								
									Espace_Admin.etudlst.setVisible(true);
									
								}
							});
						
					}else 
						{
						 final JLabel numlbl = new JLabel();
						 numlbl.setFont(new Font("Fredoka Light", Font.PLAIN, 18));
						 numlbl.setBackground(new Color(208, 233, 242));
						jeudind.add(numlbl);
						 
						 final JLabel modulelbl = new JLabel();
						 modulelbl.setFont(new Font("Fredoka Light", Font.PLAIN, 18));
						 modulelbl.setBackground(new Color(208, 233, 242));
						 jeudind.add(modulelbl); 
						 
						 final JLabel classlbl = new JLabel();
						 classlbl.setFont(new Font("Fredoka Light", Font.PLAIN, 18));
						 classlbl.setBackground(new Color(208, 233, 242));
						 jeudind.add(classlbl); 
						System.out.println("14:00:00");
						numlbl.setForeground(new Color(154,199,217));
						modulelbl.setForeground(new Color(154,199,217));
						classlbl.setForeground(new Color(154,199,217));
						
						numlbl.setText("  seance :"+empset.getString("num"));
						modulelbl.setText("   | "+empset.getString("module"));
						classlbl.setText("   | "+empset.getString("nom_cl"));
						
						final String nom_cl7 = empset.getString("nom_cl");
						//------------- instanciation seance ----------
						final Seance sc = new Seance(Integer.parseInt(empset.getString("num")), empset.getString("sdate"), empset.getString("duree"), empset.getString("module"),Integer.parseInt(empset.getString("code_prof")), nom_cl7, empset.getString("HDEP"));

					
						
						 jeudind.add(numlbl);
						jeudind.add(modulelbl);
						 jeudind.add(classlbl);
						 
							jeudind.addMouseListener(new MouseAdapter() {
								@Override
								public void mouseEntered(MouseEvent e) {
									jeudind.setBackground(new Color(208, 233, 242));
									numlbl.setForeground(new Color(47, 85, 115));
									modulelbl.setForeground(new Color(47, 85, 115));
									classlbl.setForeground(new Color(47, 85, 115));
								}
								@Override
								public void mouseExited(MouseEvent e) {
									jeudind.setBackground(new Color(47, 85, 115));
									numlbl.setForeground(new Color(255, 255,255));
									modulelbl.setForeground(new Color(255, 255,255));
									classlbl.setForeground(new Color(255, 255,255));
								}
								@Override
								public void mouseClicked(MouseEvent e) {
									
									setVisible(false);
									EnsaClass currentcl7 = new EnsaClass (nom_cl7);

									
									System.out.println("seance instancie");
									Espace_Admin.etudlst.removeAll();
									Espace_Admin.etudlst.removeAll();
									Espace_Admin.etudlst.add(currentcl7.listetud(sc));
								
									Espace_Admin.etudlst.setVisible(true);
									
								}
							});
						}
					}
				 if(empset.getString("dayname(sdate)").equals("Friday") )
					{
					if(empset.getString("HDEP").equals("08:00:00"))
					{	
						 final JLabel numlbl = new JLabel();
						 numlbl.setFont(new Font("Fredoka Light", Font.PLAIN, 18));
						 numlbl.setBackground(new Color(208, 233, 242));
						 vendst.add(numlbl);
						 
						 final JLabel modulelbl = new JLabel();
						 modulelbl.setFont(new Font("Fredoka Light", Font.PLAIN, 18));
						 modulelbl.setBackground(new Color(208, 233, 242));
						 vendst.add(modulelbl); 
						 
						 final JLabel classlbl = new JLabel();
						 classlbl.setFont(new Font("Fredoka Light", Font.PLAIN, 18));
						 classlbl.setBackground(new Color(208, 233, 242));
						 vendst.add(classlbl); 
						 
						System.out.println("8:00:00");
						numlbl.setForeground(new Color(154,199,217));
						modulelbl.setForeground(new Color(154,199,217));
						classlbl.setForeground(new Color(154,199,217));
						
						numlbl.setText("  seance :"+empset.getString("num"));
						modulelbl.setText("   | "+empset.getString("module"));
						classlbl.setText("   | "+empset.getString("nom_cl"));	
						
						final String nom_cl8 = empset.getString("nom_cl");
						//------------- instanciation seance ----------
						final Seance sc = new Seance(Integer.parseInt(empset.getString("num")), empset.getString("sdate"), empset.getString("duree"), empset.getString("module"),Integer.parseInt(empset.getString("code_prof")), nom_cl8, empset.getString("HDEP"));

					
						
						 vendst.add(numlbl);
						 vendst.add(modulelbl);
						 vendst.add(classlbl);
						 
							vendst.addMouseListener(new MouseAdapter() {
								@Override
								public void mouseEntered(MouseEvent e) {
									vendst.setBackground(new Color(208, 233, 242));
									numlbl.setForeground(new Color(47, 85, 115));
									modulelbl.setForeground(new Color(47, 85, 115));
									classlbl.setForeground(new Color(47, 85, 115));
								}
								@Override
								public void mouseExited(MouseEvent e) {
									lundist.setBackground(new Color(47, 85, 115));
									numlbl.setForeground(new Color(255, 255,255));
									modulelbl.setForeground(new Color(255, 255,255));
									classlbl.setForeground(new Color(255, 255,255));
								}
								@Override
								public void mouseClicked(MouseEvent e) {
									
									setVisible(false);
									EnsaClass currentcl8 = new EnsaClass (nom_cl8);

									
									System.out.println("seance instancie");
									Espace_Admin.etudlst.removeAll();
									Espace_Admin.etudlst.add(currentcl8.listetud(sc));
								
									Espace_Admin.etudlst.setVisible(true);
									
								}
							});
						
					}else 
						{
						 final JLabel numlbl = new JLabel();
						 numlbl.setFont(new Font("Fredoka Light", Font.PLAIN, 18));
						 numlbl.setBackground(new Color(208, 233, 242));
						 vendnd.add(numlbl);
						 
						 final JLabel modulelbl = new JLabel();
						 modulelbl.setFont(new Font("Fredoka Light", Font.PLAIN, 18));
						 modulelbl.setBackground(new Color(208, 233, 242));
						 vendnd.add(modulelbl); 
						 
						 final JLabel classlbl = new JLabel();
						 classlbl.setFont(new Font("Fredoka Light", Font.PLAIN, 18));
						 classlbl.setBackground(new Color(208, 233, 242));
						 vendnd.add(classlbl); 
						System.out.println("14:00:00");
						numlbl.setForeground(new Color(154,199,217));
						modulelbl.setForeground(new Color(154,199,217));
						classlbl.setForeground(new Color(154,199,217));
						
						numlbl.setText("  seance :"+empset.getString("num"));
						modulelbl.setText("   | "+empset.getString("module"));
						classlbl.setText("   | "+empset.getString("nom_cl"));
						
						final String nom_cl9 = empset.getString("nom_cl");
						//------------- instanciation seance ----------
						final Seance sc = new Seance(Integer.parseInt(empset.getString("num")), empset.getString("sdate"), empset.getString("duree"), empset.getString("module"),Integer.parseInt(empset.getString("code_prof")), nom_cl9, empset.getString("HDEP"));

					
						
						 vendnd.add(numlbl);
						vendnd.add(modulelbl);
						 vendnd.add(classlbl);
						 
							vendnd.addMouseListener(new MouseAdapter() {
								@Override
								public void mouseEntered(MouseEvent e) {
									vendnd.setBackground(new Color(208, 233, 242));
									numlbl.setForeground(new Color(47, 85, 115));
									modulelbl.setForeground(new Color(47, 85, 115));
									classlbl.setForeground(new Color(47, 85, 115));
								}
								@Override
								public void mouseExited(MouseEvent e) {
									lundist.setBackground(new Color(47, 85, 115));
									numlbl.setForeground(new Color(255, 255,255));
									modulelbl.setForeground(new Color(255, 255,255));
									classlbl.setForeground(new Color(255, 255,255));
								}
								@Override
								public void mouseClicked(MouseEvent e) {
									
									setVisible(false);
									EnsaClass currentcl9 = new EnsaClass (nom_cl9);

									Espace_Admin.etudlst.removeAll();
									System.out.println("seance instancie");
									
										
										Espace_Admin.etudlst.add(currentcl9.listetud(sc));
									
								
									Espace_Admin.etudlst.setVisible(true);
									
									
								}
							});
						}
					}
			
				
			
			}
				
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		


	}

	
	public Emploi(Etudiant et) {
		setFont(new Font("Myriad Pro", Font.PLAIN, 12));
		setBackground(new Color(208, 233, 242));
		setPreferredSize(new Dimension( 754, 424));
		
	//	System.out.println(" emploi cree");
		setLayout(new GridLayout(6, 6, 0, 10));
		
		


		

		
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(new Color(141, 189, 218));
		FlowLayout flowLayout = (FlowLayout) panel_4.getLayout();
		flowLayout.setVgap(20);
		flowLayout.setHgap(85);
		flowLayout.setAlignment(FlowLayout.LEFT);
		add(panel_4);
		
		
		JLabel lblNewLabel = new JLabel("8H                   10H                   12H");
		lblNewLabel.setFont(new Font("Fredoka Light", Font.PLAIN, 20));
		panel_4.add(lblNewLabel);
		
		JLabel lblhhh_1 = new JLabel("14H                   16H                   18H");
		lblhhh_1.setFont(new Font("Fredoka Light", Font.PLAIN, 20));
		panel_4.add(lblhhh_1);
	
		
		//-------------------- lundi pnl -----------------
		 final JPanel panel_5 = new JPanel();
		panel_5.setBackground(new Color(141, 189, 218));
		FlowLayout flowLayout_1 = (FlowLayout) panel_5.getLayout();
		flowLayout_1.setAlignment(FlowLayout.LEFT);
		add(panel_5);
		
		JLabel LUNDI = new JLabel("LUN");
		LUNDI.setPreferredSize(new Dimension(75, 20));
		LUNDI.setFont(new Font("Fredoka Light", Font.PLAIN, 20));
		panel_5.add(LUNDI);
		
		final JPanel lundist = new JPanel();
		lundist.setPreferredSize(new Dimension(280, 50));
		lundist.setBackground(new Color(47, 85, 115));
		FlowLayout fl_lundist = (FlowLayout) lundist.getLayout();
		fl_lundist.setHgap(10);
		fl_lundist.setVgap(10);
		fl_lundist.setAlignment(FlowLayout.LEFT);
		

		 
		 
		
		 
		 panel_5.add(lundist);
		 
		 JLabel lblNewLabel_1 = new JLabel("");
		 lblNewLabel_1.setPreferredSize(new Dimension(85, 50));
		 panel_5.add(lblNewLabel_1);
		 
		 final JPanel lundi2nd = new JPanel();
		 FlowLayout flowLayout_10 = (FlowLayout) lundi2nd.getLayout();
		 flowLayout_10.setVgap(10);
		 flowLayout_10.setHgap(10);
		 flowLayout_10.setAlignment(FlowLayout.LEFT);
		 lundi2nd.setPreferredSize(new Dimension(280, 50));
		 lundi2nd.setBackground(new Color(47, 85, 115));
		 panel_5.add(lundi2nd);
		 
		
		 
	
		

		
		//  ------------------mardi pnl --------------------
		
		JPanel panel_5_1 = new JPanel();
		panel_5_1.setBackground(new Color(141, 189, 218));
		FlowLayout flowLayout_2 = (FlowLayout) panel_5_1.getLayout();
		flowLayout_2.setAlignment(FlowLayout.LEFT);
		add(panel_5_1);
		
		JLabel LUNDI_1 = new JLabel("MAR");
		LUNDI_1.setPreferredSize(new Dimension(75, 20));
		LUNDI_1.setFont(new Font("Fredoka Light", Font.PLAIN, 20));
		panel_5_1.add(LUNDI_1);
		
		final JPanel mardist = new JPanel();
		FlowLayout flowLayout_6 = (FlowLayout) mardist.getLayout();
		flowLayout_6.setVgap(10);
		flowLayout_6.setHgap(10);
		flowLayout_6.setAlignment(FlowLayout.LEFT);
		mardist.setPreferredSize(new Dimension(280, 50));
		mardist.setBackground(new Color(47, 85, 115));
		panel_5_1.add(mardist);
		

		
		JLabel lblNewLabel_1_1 = new JLabel("");
		lblNewLabel_1_1.setPreferredSize(new Dimension(85, 50));
		panel_5_1.add(lblNewLabel_1_1);
		
		final JPanel mardind = new JPanel();
		FlowLayout flowLayout_11 = (FlowLayout) mardind.getLayout();
		flowLayout_11.setVgap(10);
		flowLayout_11.setHgap(10);
		flowLayout_11.setAlignment(FlowLayout.LEFT);
		mardind.setPreferredSize(new Dimension(280, 50));
		mardind.setBackground(new Color(47, 85, 115));
		panel_5_1.add(mardind);
		

		
		JPanel panel_5_2 = new JPanel();
		panel_5_2.setBackground(new Color(141, 189, 218));
		FlowLayout flowLayout_3 = (FlowLayout) panel_5_2.getLayout();
		flowLayout_3.setAlignment(FlowLayout.LEFT);
		add(panel_5_2);
		
		JLabel LUNDI_2 = new JLabel("MER");
		LUNDI_2.setPreferredSize(new Dimension(75, 20));
		LUNDI_2.setFont(new Font("Fredoka Light", Font.PLAIN, 20));
		panel_5_2.add(LUNDI_2);
		
		final JPanel mercst = new JPanel();
		FlowLayout flowLayout_7 = (FlowLayout) mercst.getLayout();
		flowLayout_7.setVgap(10);
		flowLayout_7.setHgap(10);
		flowLayout_7.setAlignment(FlowLayout.LEFT);
		mercst.setPreferredSize(new Dimension(280, 50));
		mercst.setBackground(new Color(47, 85, 115));
		panel_5_2.add(mercst);
		

		
		JLabel lblNewLabel_1_1_1 = new JLabel("");
		lblNewLabel_1_1_1.setPreferredSize(new Dimension(85, 50));
		panel_5_2.add(lblNewLabel_1_1_1);
		
		final JPanel mercnd = new JPanel();
		FlowLayout flowLayout_12 = (FlowLayout) mercnd.getLayout();
		flowLayout_12.setVgap(10);
		flowLayout_12.setHgap(10);
		flowLayout_12.setAlignment(FlowLayout.LEFT);
		mercnd.setPreferredSize(new Dimension(280, 50));
		mercnd.setBackground(new Color(47, 85, 115));
		panel_5_2.add(mercnd);
		
	
		
		JPanel panel_5_3 = new JPanel();
		panel_5_3.setBackground(new Color(141, 189, 218));
		FlowLayout flowLayout_4 = (FlowLayout) panel_5_3.getLayout();
		flowLayout_4.setAlignment(FlowLayout.LEFT);
		add(panel_5_3);
		
		JLabel LUNDI_3 = new JLabel("JEU");
		LUNDI_3.setPreferredSize(new Dimension(75, 20));
		LUNDI_3.setFont(new Font("Fredoka Light", Font.PLAIN, 20));
		panel_5_3.add(LUNDI_3);
		
		final JPanel jeudist = new JPanel();
		FlowLayout flowLayout_8 = (FlowLayout) jeudist.getLayout();
		flowLayout_8.setVgap(10);
		flowLayout_8.setHgap(10);
		flowLayout_8.setAlignment(FlowLayout.LEFT);
		jeudist.setPreferredSize(new Dimension(280, 50));
		jeudist.setBackground(new Color(47, 85, 115));
		panel_5_3.add(jeudist);
		

		
		JLabel lblNewLabel_1_1_2 = new JLabel("");
		lblNewLabel_1_1_2.setPreferredSize(new Dimension(85, 50));
		panel_5_3.add(lblNewLabel_1_1_2);
		
		final JPanel jeudind = new JPanel();
		FlowLayout flowLayout_13 = (FlowLayout) jeudind.getLayout();
		flowLayout_13.setVgap(10);
		flowLayout_13.setHgap(10);
		flowLayout_13.setAlignment(FlowLayout.LEFT);
		jeudind.setPreferredSize(new Dimension(280, 50));
		jeudind.setBackground(new Color(47, 85, 115));
		panel_5_3.add(jeudind);
		

		
		JPanel panel_5_4 = new JPanel();
		panel_5_4.setBackground(new Color(141, 189, 218));
		FlowLayout flowLayout_5 = (FlowLayout) panel_5_4.getLayout();
		flowLayout_5.setAlignment(FlowLayout.LEFT);
		add(panel_5_4);
		
		JLabel LUNDI_4 = new JLabel("VEN");
		LUNDI_4.setPreferredSize(new Dimension(75, 20));
		LUNDI_4.setFont(new Font("Fredoka Light", Font.PLAIN, 20));
		panel_5_4.add(LUNDI_4);
		
		final JPanel vendst = new JPanel();
		FlowLayout flowLayout_9 = (FlowLayout) vendst.getLayout();
		flowLayout_9.setVgap(10);
		flowLayout_9.setHgap(10);
		flowLayout_9.setAlignment(FlowLayout.LEFT);
		vendst.setPreferredSize(new Dimension(280, 50));
		vendst.setBackground(new Color(47, 85, 115));
		panel_5_4.add(vendst);
		
	
		
		JLabel lblNewLabel_1_1_3 = new JLabel("");
		lblNewLabel_1_1_3.setPreferredSize(new Dimension(85, 50));
		panel_5_4.add(lblNewLabel_1_1_3);
		
		final JPanel vendnd = new JPanel();
		FlowLayout flowLayout_14 = (FlowLayout) vendnd.getLayout();
		flowLayout_14.setVgap(10);
		flowLayout_14.setHgap(10);
		flowLayout_14.setAlignment(FlowLayout.LEFT);
		vendnd.setPreferredSize(new Dimension(280, 50));
		vendnd.setBackground(new Color(47, 85, 115));
		panel_5_4.add(vendnd);
		

		//-----------------------------espace emploi --------------------------
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try {
			Connection con = DriverManager.getConnection(url,"root","PFH#23kgrw9");
			String empquery = "select distinct *,dayname(sdate)  from seance where nom_cl='%s' and sdate between CURDATE() - INTERVAL (WEEKDAY(CURDATE())+1) DAY  and  CURDATE() - INTERVAL (WEEKDAY(CURDATE())-4) DAY ;";
			final ResultSet empset;
			//System.out.println("ACCES SUCCES");
			Statement empstat = con.createStatement();
			empset = empstat.executeQuery(String.format(empquery, et.getNom_cl()));
			//System.out.println(String.format(empquery, current.getCode_prof()));
			while (empset.next()) {
				if(empset.getString("dayname(sdate)").equals("Monday") )
					{
						System.out.println("in monday");
						if(empset.getString("HDEP").equals("08:00:00"))
							{	
	
							 final JLabel numlbl = new JLabel();
							 numlbl.setFont(new Font("Fredoka Light", Font.PLAIN, 18));
							 numlbl.setBackground(new Color(208, 233, 242));
							 lundist.add(numlbl);
							 
							 final JLabel modulelbl = new JLabel();
							 modulelbl.setFont(new Font("Fredoka Light", Font.PLAIN, 18));
							 modulelbl.setBackground(new Color(208, 233, 242));
							 lundist.add(modulelbl); 
							 
							 final JLabel classlbl = new JLabel();
							 classlbl.setFont(new Font("Fredoka Light", Font.PLAIN, 18));
							 classlbl.setBackground(new Color(208, 233, 242));
							 lundist.add(classlbl); 
							 
								System.out.println("8:00:00");
								numlbl.setForeground(new Color(154,199,217));
								modulelbl.setForeground(new Color(154,199,217));
								classlbl.setForeground(new Color(154,199,217));
								
								numlbl.setText("  seance :"+empset.getString("num"));
								modulelbl.setText("   | "+empset.getString("module"));
								classlbl.setText("   | "+empset.getString("nom_cl"));	
								
								
								 lundist.add(numlbl);
								 lundist.add(modulelbl);
								 lundist.add(classlbl);
									
							
									
									FlowLayout fl_seancepnl = (FlowLayout) panel_5.getLayout();
									fl_seancepnl.setAlignment(FlowLayout.LEFT);
									
								
							}else 
								{
								 final JLabel numlbl = new JLabel();
								 numlbl.setFont(new Font("Fredoka Light", Font.PLAIN, 18));
								 numlbl.setBackground(new Color(208, 233, 242));
								 lundi2nd.add(numlbl);
								 
								 final JLabel modulelbl = new JLabel();
								 modulelbl.setFont(new Font("Fredoka Light", Font.PLAIN, 18));
								 modulelbl.setBackground(new Color(208, 233, 242));
								 lundi2nd.add(modulelbl); 
								 
								 final JLabel classlbl = new JLabel();
								 classlbl.setFont(new Font("Fredoka Light", Font.PLAIN, 18));
								 classlbl.setBackground(new Color(208, 233, 242));
								 lundi2nd.add(classlbl); 
								 
								System.out.println("14:00:00");
								numlbl.setForeground(new Color(154,199,217));
								modulelbl.setForeground(new Color(154,199,217));
								classlbl.setForeground(new Color(154,199,217));
								
								numlbl.setText("  seance :"+empset.getString("num"));
								modulelbl.setText("   | "+empset.getString("module"));
								classlbl.setText("   | "+empset.getString("nom_cl"));
								
							
								
								 lundi2nd.add(numlbl);
								 lundi2nd.add(modulelbl);
								 lundi2nd.add(classlbl);
								 
									
								}
							
					}
				
				 if(empset.getString("dayname(sdate)").equals("Tuesday") )
					{
					if(empset.getString("HDEP").equals("08:00:00"))
					{	
						 final JLabel numlbl = new JLabel();
						 numlbl.setFont(new Font("Fredoka Light", Font.PLAIN, 18));
						 numlbl.setBackground(new Color(208, 233, 242));
						 mardist.add(numlbl);
						 
						 final JLabel modulelbl = new JLabel();
						 modulelbl.setFont(new Font("Fredoka Light", Font.PLAIN, 18));
						 modulelbl.setBackground(new Color(208, 233, 242));
						 mardist.add(modulelbl); 
						 
						 final JLabel classlbl = new JLabel();
						 classlbl.setFont(new Font("Fredoka Light", Font.PLAIN, 18));
						 classlbl.setBackground(new Color(208, 233, 242));
						 mardist.add(classlbl); 
						 
						System.out.println("8:00:00");
						numlbl.setForeground(new Color(154,199,217));
						modulelbl.setForeground(new Color(154,199,217));
						classlbl.setForeground(new Color(154,199,217));
						
						numlbl.setText("  seance :"+empset.getString("num"));
						modulelbl.setText("   | "+empset.getString("module"));
						classlbl.setText("   | "+empset.getString("nom_cl"));	
						
					
					
						
						 mardist.add(numlbl);
						 mardist.add(modulelbl);
						 mardist.add(classlbl);
						 
							
						
					}else 
						{
						 final JLabel numlbl = new JLabel();
						 numlbl.setFont(new Font("Fredoka Light", Font.PLAIN, 18));
						 numlbl.setBackground(new Color(208, 233, 242));
						 mardind.add(numlbl);
						 
						 final JLabel modulelbl = new JLabel();
						 modulelbl.setFont(new Font("Fredoka Light", Font.PLAIN, 18));
						 modulelbl.setBackground(new Color(208, 233, 242));
						 mardind.add(modulelbl); 
						 
						 final JLabel classlbl = new JLabel();
						 classlbl.setFont(new Font("Fredoka Light", Font.PLAIN, 18));
						 classlbl.setBackground(new Color(208, 233, 242));
						 mardind.add(classlbl); 
						System.out.println("14:00:00");
						numlbl.setForeground(new Color(154,199,217));
						modulelbl.setForeground(new Color(154,199,217));
						classlbl.setForeground(new Color(154,199,217));
						
						numlbl.setText("  seance :"+empset.getString("num"));
						modulelbl.setText("   | "+empset.getString("module"));
						classlbl.setText("   | "+empset.getString("nom_cl"));
					
					
						
						 mardind.add(numlbl);
						 mardind.add(modulelbl);
						 mardind.add(classlbl);
						 
							
						}
					}
				 
				 if(empset.getString("dayname(sdate)").equals("Wednesday") )
					{
					if(empset.getString("HDEP").equals("08:00:00"))
					{	
						 final JLabel numlbl = new JLabel();
						 numlbl.setFont(new Font("Fredoka Light", Font.PLAIN, 18));
						 numlbl.setBackground(new Color(208, 233, 242));
						 mercst.add(numlbl);
						 
						 final JLabel modulelbl = new JLabel();
						 modulelbl.setFont(new Font("Fredoka Light", Font.PLAIN, 18));
						 modulelbl.setBackground(new Color(208, 233, 242));
						 mercst.add(modulelbl); 
						 
						 final JLabel classlbl = new JLabel();
						 classlbl.setFont(new Font("Fredoka Light", Font.PLAIN, 18));
						 classlbl.setBackground(new Color(208, 233, 242));
						 mercst.add(classlbl); 
						 
						System.out.println("8:00:00");
						numlbl.setForeground(new Color(154,199,217));
						modulelbl.setForeground(new Color(154,199,217));
						classlbl.setForeground(new Color(154,199,217));
						
						numlbl.setText("  seance :"+empset.getString("num"));
						modulelbl.setText("   | "+empset.getString("module"));
						classlbl.setText("   | "+empset.getString("nom_cl"));
						
						
						
						 mercst.add(numlbl);
						 mercst.add(modulelbl);
						 mercst.add(classlbl);
						 
							
						
					}else 
						{
						 final JLabel numlbl = new JLabel();
						 numlbl.setFont(new Font("Fredoka Light", Font.PLAIN, 18));
						 numlbl.setBackground(new Color(208, 233, 242));
						 mercnd.add(numlbl);
						 
						 final JLabel modulelbl = new JLabel();
						 modulelbl.setFont(new Font("Fredoka Light", Font.PLAIN, 18));
						 modulelbl.setBackground(new Color(208, 233, 242));
						 mercnd.add(modulelbl); 
						 
						 final JLabel classlbl = new JLabel();
						 classlbl.setFont(new Font("Fredoka Light", Font.PLAIN, 18));
						 classlbl.setBackground(new Color(208, 233, 242));
						 mercnd.add(classlbl); 
						System.out.println("14:00:00");
						numlbl.setForeground(new Color(154,199,217));
						modulelbl.setForeground(new Color(154,199,217));
						classlbl.setForeground(new Color(154,199,217));
						
						numlbl.setText("  seance :"+empset.getString("num"));
						modulelbl.setText("   | "+empset.getString("module"));
						classlbl.setText("   | "+empset.getString("nom_cl"));
						
					
					
						
						 mercnd.add(numlbl);
						 mercnd.add(modulelbl);
						 mercnd.add(classlbl);
						 
							
						}
					}
				 if(empset.getString("dayname(sdate)").equals("Thursday") )
					{
					if(empset.getString("HDEP").equals("08:00:00"))
					{	
						 final JLabel numlbl = new JLabel();
						 numlbl.setFont(new Font("Fredoka Light", Font.PLAIN, 18));
						 numlbl.setBackground(new Color(208, 233, 242));
						 jeudist.add(numlbl);
						 
						 final JLabel modulelbl = new JLabel();
						 modulelbl.setFont(new Font("Fredoka Light", Font.PLAIN, 18));
						 modulelbl.setBackground(new Color(208, 233, 242));
						 jeudist.add(modulelbl); 
						 
						 final JLabel classlbl = new JLabel();
						 classlbl.setFont(new Font("Fredoka Light", Font.PLAIN, 18));
						 classlbl.setBackground(new Color(208, 233, 242));
						 jeudist.add(classlbl); 
						 
						System.out.println("8:00:00");
						numlbl.setForeground(new Color(154,199,217));
						modulelbl.setForeground(new Color(154,199,217));
						classlbl.setForeground(new Color(154,199,217));
						
						numlbl.setText("  seance :"+empset.getString("num"));
						modulelbl.setText("   | "+empset.getString("module"));
						classlbl.setText("   | "+empset.getString("nom_cl"));	
						
				
						
						 jeudist.add(numlbl);
						 jeudist.add(modulelbl);
						 jeudist.add(classlbl);
						 
							
						
					}else 
						{
						 final JLabel numlbl = new JLabel();
						 numlbl.setFont(new Font("Fredoka Light", Font.PLAIN, 18));
						 numlbl.setBackground(new Color(208, 233, 242));
						jeudind.add(numlbl);
						 
						 final JLabel modulelbl = new JLabel();
						 modulelbl.setFont(new Font("Fredoka Light", Font.PLAIN, 18));
						 modulelbl.setBackground(new Color(208, 233, 242));
						 jeudind.add(modulelbl); 
						 
						 final JLabel classlbl = new JLabel();
						 classlbl.setFont(new Font("Fredoka Light", Font.PLAIN, 18));
						 classlbl.setBackground(new Color(208, 233, 242));
						 jeudind.add(classlbl); 
						System.out.println("14:00:00");
						numlbl.setForeground(new Color(154,199,217));
						modulelbl.setForeground(new Color(154,199,217));
						classlbl.setForeground(new Color(154,199,217));
						
						numlbl.setText("  seance :"+empset.getString("num"));
						modulelbl.setText("   | "+empset.getString("module"));
						classlbl.setText("   | "+empset.getString("nom_cl"));
						
					
					
						
						 jeudind.add(numlbl);
						jeudind.add(modulelbl);
						 jeudind.add(classlbl);
						 
							
						}
					}
				 if(empset.getString("dayname(sdate)").equals("Friday") )
					{
					if(empset.getString("HDEP").equals("08:00:00"))
					{	
						 final JLabel numlbl = new JLabel();
						 numlbl.setFont(new Font("Fredoka Light", Font.PLAIN, 18));
						 numlbl.setBackground(new Color(208, 233, 242));
						 vendst.add(numlbl);
						 
						 final JLabel modulelbl = new JLabel();
						 modulelbl.setFont(new Font("Fredoka Light", Font.PLAIN, 18));
						 modulelbl.setBackground(new Color(208, 233, 242));
						 vendst.add(modulelbl); 
						 
						 final JLabel classlbl = new JLabel();
						 classlbl.setFont(new Font("Fredoka Light", Font.PLAIN, 18));
						 classlbl.setBackground(new Color(208, 233, 242));
						 vendst.add(classlbl); 
						 
						System.out.println("8:00:00");
						numlbl.setForeground(new Color(154,199,217));
						modulelbl.setForeground(new Color(154,199,217));
						classlbl.setForeground(new Color(154,199,217));
						
						numlbl.setText("  seance :"+empset.getString("num"));
						modulelbl.setText("   | "+empset.getString("module"));
						classlbl.setText("   | "+empset.getString("nom_cl"));	
						
						
					
						
						 vendst.add(numlbl);
						 vendst.add(modulelbl);
						 vendst.add(classlbl);
						 
							
						
					}else 
						{
						 final JLabel numlbl = new JLabel();
						 numlbl.setFont(new Font("Fredoka Light", Font.PLAIN, 18));
						 numlbl.setBackground(new Color(208, 233, 242));
						 vendnd.add(numlbl);
						 
						 final JLabel modulelbl = new JLabel();
						 modulelbl.setFont(new Font("Fredoka Light", Font.PLAIN, 18));
						 modulelbl.setBackground(new Color(208, 233, 242));
						 vendnd.add(modulelbl); 
						 
						 final JLabel classlbl = new JLabel();
						 classlbl.setFont(new Font("Fredoka Light", Font.PLAIN, 18));
						 classlbl.setBackground(new Color(208, 233, 242));
						 vendnd.add(classlbl); 
						System.out.println("14:00:00");
						numlbl.setForeground(new Color(154,199,217));
						modulelbl.setForeground(new Color(154,199,217));
						classlbl.setForeground(new Color(154,199,217));
						
						numlbl.setText("  seance :"+empset.getString("num"));
						modulelbl.setText("   | "+empset.getString("module"));
						classlbl.setText("   | "+empset.getString("nom_cl"));
						
						//------------- instanciation seance ----------

					
						
						 vendnd.add(numlbl);
						vendnd.add(modulelbl);
						 vendnd.add(classlbl);
						 
							
						}
					}
			
				
			
			}
				
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		


	}

}
