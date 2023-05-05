package CLASSES;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;

public class Filier {
	private int code_fil ;
	private String nom ;
	private int code_chef ;
	private String nom_dep ;
	
	public Filier (String nom , String nom_dep) {
		this.nom=nom;
		this.nom_dep=nom_dep;
	}
	public Filier(String nom) {
		super();
		this.nom = nom;
	}
	public int getCode_fil() {
		return code_fil;
	}
	public void setCode_fil(int code_fil) {
		this.code_fil = code_fil;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public int getCode_chef() {
		return code_chef;
	}
	public void setCode_chef(int code_chef) {
		this.code_chef = code_chef;
	}
	public String getNom_dep() {
		return nom_dep;
	}
	public void setNom_dep(String nom_dep) {
		this.nom_dep = nom_dep;
	}
	public Filier(int code_fil, String nom, int code_chef, String nom_dep) {

		this.code_fil = code_fil;
		this.nom = nom;
		this.code_chef = code_chef;
		this.nom_dep = nom_dep;
	}
	
	public JScrollPane listprof() {

		JPanel pnlist = new JPanel();
		int height = 50 ;
		pnlist.setPreferredSize(new Dimension(754,height+250));
		
		
		
		
		Connection conn;
		ResultSet etudset = null ;
		final String url ="jdbc:mysql://localhost:3306/amsdb";
		
		
		try {
			
			conn = DriverManager.getConnection(url,"root","PFH#23kgrw9");
		
		
		String etquery = "select* from prof where code_prof in(select prof_mod from module where nom in(select nom_mod from etudier where nom_cl in ( select nom from class where nom_fil ='%s')));\r\n"
				+ "";
			Statement st = conn.createStatement();
			System.out.println(String.format(etquery,this.nom));
			etudset = st.executeQuery(String.format(etquery,this.nom));
			
			
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		//mod.setVisible(false);
		
		JPanel panel_3 = new JPanel();
		panel_3.setPreferredSize(new Dimension(110, height));
		panel_3.setBackground(new Color(47,85,115));
		pnlist.add(panel_3);
		panel_3.setLayout(new BoxLayout(panel_3, BoxLayout.Y_AXIS));
		
		JLabel blank_2 = new JLabel("                             ");
		panel_3.add(blank_2);
		
		JLabel lblNewLabel_1 = new JLabel("CODE");
		lblNewLabel_1.setForeground(new Color(255,255,255));
		lblNewLabel_1.setFont(new Font("Fredoka One", Font.PLAIN, 16));
		panel_3.add(lblNewLabel_1);
		
		JLabel blank_1_2 = new JLabel("                             ");
		panel_3.add(blank_1_2);
		
		JPanel panel_3_1 = new JPanel();
		panel_3_1.setPreferredSize(new Dimension(110, height));
		panel_3_1.setAutoscrolls(true);
		panel_3_1.setLayout(new BoxLayout(panel_3_1, BoxLayout.Y_AXIS));
		panel_3_1.setBackground(new Color(47,85,115));
		pnlist.add(panel_3_1);
		
		JLabel blank_1 = new JLabel("                             ");
		panel_3_1.add(blank_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("NOM");
		lblNewLabel_1_2.setForeground(new Color(255,255,255));
		lblNewLabel_1_2.setFont(new Font("Fredoka One", Font.PLAIN, 16));

		panel_3_1.add(lblNewLabel_1_2);
		
		JLabel blank_1_1 = new JLabel("                             ");
		panel_3_1.add(blank_1_1);
		
		JPanel panel_3_2 = new JPanel();
		panel_3_2.setPreferredSize(new Dimension(110, height));
		panel_3_2.setBackground(new Color(47,85,115));
		pnlist.add(panel_3_2);
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
		nbhpnl.setPreferredSize(new Dimension(110, height));
		nbhpnl.setBackground(new Color(47,85,115));
		nbhpnl.add(new JLabel("                             "));
		nbhpnl.setLayout(new BoxLayout(nbhpnl, BoxLayout.Y_AXIS));
		
		JLabel nbhabslbl = new JLabel("TEL");
		nbhabslbl.setForeground(new Color(255,255,255));
		nbhabslbl.setFont(new Font("Fredoka One", Font.PLAIN, 16));
		nbhpnl.add(nbhabslbl);
		
		JLabel blankt = new JLabel("                             ");
		nbhpnl.add(blankt);
		
		
		pnlist.setBackground(new Color (47,85,115));
		
		ArrayList list = new ArrayList();
		
		
		try {
			
			
			while(etudset.next()) {
				
				height+=60;
				pnlist.setPreferredSize(new Dimension(754,150+height));
				panel_3.setPreferredSize(new Dimension(110, height));
				panel_3_1.setPreferredSize(new Dimension(110, height));
				panel_3_2.setPreferredSize(new Dimension(110, height));
				nbhpnl.setPreferredSize(new Dimension(110, height));
				
				list.add(etudset.getString("code_prof"));
				
				JLabel applbl =new JLabel(etudset.getString("code_prof"));
				applbl.setFont(new Font("Fredoka One", Font.PLAIN, 14));
				applbl.setForeground(new Color(208,233,242));
				panel_3.add(applbl);
				
				JLabel vide = new JLabel(" ");
				panel_3.add(vide);
				
				JLabel nomlbl = new JLabel(etudset.getString("nom"));
				nomlbl.setFont(new Font("Fredoka One", Font.PLAIN, 14));
				nomlbl.setForeground(new Color(208,233,242));
				panel_3_1.add(nomlbl);
				
				JLabel vide1 = new JLabel(" ");
				panel_3_1.add(vide1);
				
				
				JLabel prnlbl = new JLabel(etudset.getString("prenom"));
				prnlbl.setFont(new Font("Fredoka One", Font.PLAIN, 14));
				prnlbl.setForeground(new Color(208,233,242));
				panel_3_2.add(prnlbl);
				
				JLabel vide2 = new JLabel(" ");
				panel_3_2.add(vide2);
				
				JLabel tellbl = new JLabel(etudset.getString("tel"));
				tellbl.setFont(new Font("Fredoka One", Font.PLAIN, 14));
				tellbl.setForeground(new Color(208,233,242));
				nbhpnl.add(tellbl);
				
				JLabel vide3 = new JLabel(" ");
				nbhpnl.add(vide3);
				
				
				
				
			}
			pnlist.add(panel_3);
			pnlist.add(panel_3_1);
			pnlist.add(panel_3_2);
			pnlist.add(nbhpnl);
			


			
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		
		
	
		
		JScrollPane seancescrol = new JScrollPane(pnlist);
		seancescrol.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
	seancescrol.setPreferredSize(new Dimension(734,270));
	
	
	return seancescrol;
	
	
}
	
	public void ajouprof(Prof prf,String modul,String clas)  {
		
		Connection conn;
		ResultSet nbprset = null ;
		final String url ="jdbc:mysql://localhost:3306/amsdb";
		
		
		
			
			try {
				conn = DriverManager.getConnection(url,"root","PFH#23kgrw9");
				String querymod = "insert into module (nom,prof_mod) values('%s',%s);";
				String query2 = "insert into etudier values('%s','%s');";

				String query = "insert into prof values(%s,'%s','%s','%s',%s,'%s','%s',%s,'%s');";
				Statement st;
				st = conn.createStatement();
				System.out.println(String.format(query,prf.getCode_prof(),prf.getCne(),prf.getNom(),prf.getPrenom(),prf.getTel(),prf.getPwd(),prf.getStatut(),prf.getSalaire(),prf.getNom_dep()));
				System.out.println(String.format(querymod,modul,prf.getCode_prof()));
				System.out.println(String.format(query2,modul,clas));

				
				try {
					
				
				 st.executeUpdate(String.format(query,prf.getCode_prof(),prf.getCne(),prf.getNom(),prf.getPrenom(),prf.getTel(),prf.getPwd(),prf.getStatut(),prf.getSalaire(),prf.getNom_dep()));
				 st.executeUpdate(String.format(querymod,modul,prf.getCode_prof()));
				 st.executeUpdate(String.format(query2,modul,clas));

				}catch(SQLIntegrityConstraintViolationException e) {
					System.out.println(e.getMessage());
				}

			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		

			
			
			
			
		
	}
	
	public void suppprof(int code,String modul,String clas)  {
		
		Connection conn;
		ResultSet nbprset = null ;
		final String url ="jdbc:mysql://localhost:3306/amsdb";
		
		
		
			
			try {
				conn = DriverManager.getConnection(url,"root","PFH#23kgrw9");
				String querymod = "delete from module where prof_mod=%s;";
				String query2 = "delete from etudier where nom_mod='%s';";

				String query = "delete from prof where code_prof= %s;";
				Statement st;
				st = conn.createStatement();
				
				
				
				

				
				try {
					
					System.out.println(String.format(query2,modul));
					 st.executeUpdate(String.format(query2,modul));
					 
					System.out.println(String.format(querymod,code));
					st.executeUpdate(String.format(querymod,code));
					
				
					
				 System.out.println(String.format(query,code));
				 st.executeUpdate(String.format(query,code));

				}catch(SQLIntegrityConstraintViolationException e) {
					System.out.println(e.getMessage());
				}

			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		

			
			
			
			
		
	}


	
	public ArrayList getClasses() {
		
		ArrayList classlist = new ArrayList();
		Connection conn;
		ResultSet etudset = null ;
		final String url ="jdbc:mysql://localhost:3306/amsdb";
		
		
		
			
			try {
				conn = DriverManager.getConnection(url,"root","PFH#23kgrw9");
				String query = "select nom from class where nom_fil ='%s';";
				Statement st;
				st = conn.createStatement();
				System.out.println(String.format(query,this.nom));

				etudset= st.executeQuery(String.format(query,this.nom));
				
				while(etudset.next()) {
					classlist.add(etudset.getString("nom"));
					
				}
				
				
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return classlist;
		
	
		
		
	}
	
	
		public JPanel control() {
		
		
		final JPanel conpanel = new JPanel();
		conpanel.setPreferredSize(new Dimension(754,470));
		conpanel.setBackground(new Color(86,135,166));
		final JScrollPane list=this.listprof();
		conpanel.add(list);
		
		final JPanel fields = new JPanel();
		fields.setBackground(new Color(86,135,166));
		
		FlowLayout fldlay = new FlowLayout(FlowLayout.LEFT, 15, 15);
		conpanel.setLayout(fldlay);
		

		
	
		
		JLabel appoge = new JLabel("CodeProf");
		appoge.setFont(new Font("Fredoka Light", Font.PLAIN, 16));
		final JTextField apptxt = new JTextField();
		apptxt.setPreferredSize(new Dimension(appoge.getPreferredSize()));
		apptxt.setFont(new Font("Fredoka Light", Font.PLAIN, 14));
		
		appoge.setForeground(new Color(208,233,242));
		apptxt.setForeground(new Color(47,85,115));
		apptxt.setBackground(new Color(208,233,242));
		
		JPanel appnl = new JPanel();
		appnl.add(appoge);
		appnl.add(apptxt);
		appnl.setBackground(new Color(86,135,166));
		
		JLabel cne = new JLabel("CNE");
		cne.setFont(new Font("Fredoka Light", Font.PLAIN, 16));
		cne.setPreferredSize(new Dimension(appoge.getPreferredSize()));

		final JTextField cnetxt = new JTextField();
		cnetxt.setPreferredSize(new Dimension(appoge.getPreferredSize()));
		cnetxt.setFont(new Font("Fredoka Light", Font.PLAIN, 14));

		cne.setForeground(new Color(208,233,242));
		cnetxt.setForeground(new Color(47,85,115));
		cnetxt.setBackground(new Color(208,233,242));
		
		JPanel cnepnl = new JPanel();
		cnepnl.add(cne);
		cnepnl.add(cnetxt);
		cnepnl.setBackground(new Color(86,135,166));
		
		JPanel box = new JPanel();
		box.setLayout(new BoxLayout(box, BoxLayout.Y_AXIS));
		box.setBackground(new Color(86,135,166));
		
		box.add(appnl);
		box.add(cnepnl);
		
		fields.add(box);

		
		JLabel nom = new JLabel("nom");
		nom.setFont(new Font("Fredoka Light", Font.PLAIN, 16));
		nom.setPreferredSize(new Dimension(appoge.getPreferredSize()));

		final JTextField nomtxt = new JTextField();
		nomtxt.setPreferredSize(new Dimension(appoge.getPreferredSize()));
		nomtxt.setFont(new Font("Fredoka Light", Font.PLAIN, 14));
		
		nom.setForeground(new Color(208,233,242));
		nomtxt.setForeground(new Color(47,85,115));
		nomtxt.setBackground(new Color(208,233,242));
		
		JPanel nompnl = new JPanel();
		nompnl.add(nom);
		nompnl.add(nomtxt);
		nompnl.setBackground(new Color(86,135,166));
		
		
		
		
		JLabel prenom = new JLabel("Prenom");
		prenom.setFont(new Font("Fredoka Light", Font.PLAIN, 16));
		prenom.setPreferredSize(new Dimension(appoge.getPreferredSize()));

		final JTextField prenomtxt = new JTextField();
		prenomtxt.setPreferredSize(new Dimension(appoge.getPreferredSize()));
		prenomtxt.setFont(new Font("Fredoka Light", Font.PLAIN, 14));

		prenom.setForeground(new Color(208,233,242));
		prenomtxt.setForeground(new Color(47,85,115));
		prenomtxt.setBackground(new Color(208,233,242));
		
		JPanel prnpnl = new JPanel();
		prnpnl.add(prenom);
		prnpnl.add(prenomtxt);
		prnpnl.setBackground(new Color(86,135,166));
		

		
		JLabel tel = new JLabel("TEL");
		tel.setFont(new Font("Fredoka Light", Font.PLAIN, 16));
		tel.setPreferredSize(new Dimension(appoge.getPreferredSize()));

		final JTextField teltxt = new JTextField();
		teltxt.setPreferredSize(new Dimension(appoge.getPreferredSize()));
		teltxt.setFont(new Font("Fredoka Light", Font.PLAIN, 14));

		tel.setForeground(new Color(208,233,242));
		teltxt.setForeground(new Color(47,85,115));
		teltxt.setBackground(new Color(208,233,242));
		
		JPanel telpnl = new JPanel();
		telpnl.add(tel);
		telpnl.add(teltxt);
		telpnl.setBackground(new Color(86,135,166));
		
		JLabel pwd = new JLabel("PWD");
		pwd.setFont(new Font("Fredoka Light", Font.PLAIN, 16));
		pwd.setPreferredSize(new Dimension(appoge.getPreferredSize()));

		final JTextField pwdtxt = new JTextField();
		pwdtxt.setPreferredSize(new Dimension(appoge.getPreferredSize()));
		pwdtxt.setFont(new Font("Fredoka Light", Font.PLAIN, 14));

		pwd.setForeground(new Color(208,233,242));
		pwdtxt.setForeground(new Color(47,85,115));
		pwdtxt.setBackground(new Color(208,233,242));
		
		JLabel statut = new JLabel("statut");
		statut.setFont(new Font("Fredoka Light", Font.PLAIN, 16));
		statut.setPreferredSize(new Dimension(appoge.getPreferredSize()));

		final JTextField statuttxt = new JTextField();
		statuttxt.setPreferredSize(new Dimension(appoge.getPreferredSize()));
		statuttxt.setFont(new Font("Fredoka Light", Font.PLAIN, 14));

		statut.setForeground(new Color(208,233,242));
		statuttxt.setForeground(new Color(47,85,115));
		statuttxt.setBackground(new Color(208,233,242));
		
		JLabel sal = new JLabel("salaire");
		sal.setFont(new Font("Fredoka Light", Font.PLAIN, 16));
		sal.setPreferredSize(new Dimension(appoge.getPreferredSize()));

		final JTextField saltxt = new JTextField();
		saltxt.setPreferredSize(new Dimension(appoge.getPreferredSize()));
		saltxt.setFont(new Font("Fredoka Light", Font.PLAIN, 14));

		sal.setForeground(new Color(208,233,242));
		saltxt.setForeground(new Color(47,85,115));
		saltxt.setBackground(new Color(208,233,242));
		
		JPanel statpnl = new JPanel();
		statpnl.setBackground(new Color(86,135,166));
		statpnl.add(statut);
		statpnl.add(statuttxt);
		box.add(statpnl);
		
		
		
		
		JPanel pwdpnl = new JPanel();
		pwdpnl.add(pwd);
		pwdpnl.add(pwdtxt);
		pwdpnl.setBackground(new Color(86,135,166));
		


		
		JPanel box1 = new JPanel();
		
		box1.setLayout(new BoxLayout(box1, BoxLayout.Y_AXIS));
		box1.setBackground(new Color(86,135,166));
		
		box1.add(nompnl);
		box1.add(prnpnl);
		
		JPanel salpnl = new JPanel();
		salpnl.setBackground(new Color(86,135,166));
		salpnl.add(sal);
		salpnl.add(saltxt);
		
		box1.add(salpnl);
		
		fields.add(box1);
		
		JPanel box2 = new JPanel();
		box2.setLayout(new BoxLayout(box2, BoxLayout.Y_AXIS));
		box2.setAlignmentX(1);
		box2.setAlignmentY(1);
		box2.setBackground(new Color(86,135,166));
		
		JLabel vide= new JLabel();
		vide.setPreferredSize(appoge.getPreferredSize());
		
		JLabel vide2= new JLabel();
		vide2.setPreferredSize(appoge.getPreferredSize());
		
		
		pwdpnl.add(vide);
		
		
		
		
		telpnl.add(vide2);
		
		
		
		box2.add(telpnl);
		box2.add(pwdpnl);
		
		JPanel modpnl = new JPanel();
		modpnl.setBackground(new Color(86,135,166));
		
		JLabel mod = new JLabel("module");
		mod.setFont(new Font("Fredoka Light", Font.PLAIN, 16));
		mod.setPreferredSize(new Dimension(appoge.getPreferredSize()));
		mod.setForeground(new Color(208,233,242));

		final JTextField modtxt = new JTextField();
		modtxt.setPreferredSize(new Dimension(appoge.getPreferredSize()));
		modtxt.setFont(new Font("Fredoka Light", Font.PLAIN, 14));
		modtxt.setForeground(new Color(47,85,115));
		modtxt.setBackground(new Color(208,233,242));
		
		modpnl.add(mod);
		modpnl.add(modtxt);
		
		box.add(modpnl);
		
		JPanel clapnl = new JPanel();
		clapnl.setBackground(new Color(86,135,166));
		JLabel cla = new JLabel("classe");
		cla.setFont(new Font("Fredoka Light", Font.PLAIN, 16));
		cla.setPreferredSize(new Dimension(appoge.getPreferredSize()));
		cla.setForeground(new Color(208,233,242));

		final JComboBox clacom = new JComboBox(getClasses().toArray());
		clacom.setPreferredSize(new Dimension(appoge.getPreferredSize()));
		clacom.setFont(new Font("Fredoka Light", Font.PLAIN, 14));
		clapnl.add(cla);
		clapnl.add(clacom);
		
		box1.add(clapnl);
		
		
		

		JPanel box3 = new JPanel();
		box3.setLayout(new BoxLayout(box3, BoxLayout.Y_AXIS));
		
		box3.setBackground(new Color(86,135,166));
		
		JPanel fu = new JPanel();
		fu.setBackground(new Color(86,135,166));
		
		JButton updbtn = new JButton("UPDATE");
		updbtn.setPreferredSize(new Dimension(appoge.getPreferredSize()));
		updbtn.setBorder(null);
		updbtn.setBackground(new Color(47, 85, 115));
		updbtn.setForeground(new Color(255,255,255));
		updbtn.setFont(new Font("Fredoka LIGHT", Font.PLAIN, 14));
		
		fu.add(updbtn);
		
		updbtn.addActionListener(new ActionListener() {
			
			
			public void actionPerformed(ActionEvent e) {
				
				Prof pr =new Prof(
						cnetxt.getText(),
						Integer.parseInt(apptxt.getText()),
						nomtxt.getText(),
						prenomtxt.getText(),
						Integer.parseInt(teltxt.getText()),
						pwdtxt.getText(),
						
						statuttxt.getText(),
						Float.valueOf(saltxt.getText()),
						nom_dep
						);
				pr.update();
				
				conpanel.setVisible(false);
				conpanel.removeAll();
				conpanel.setVisible(true);
				conpanel.add(listprof());
				conpanel.add(fields);
				
			}
		
			});
		
		JPanel ad = new JPanel();
		ad.setBackground(new Color(86,135,166));
		
		JButton addbtn = new JButton("ADD");
		addbtn.setPreferredSize(new Dimension(appoge.getPreferredSize()));
		addbtn.setBorder(null);
		addbtn.setBackground(new Color(47, 85, 115));
		addbtn.setForeground(new Color(255, 255, 255));
		addbtn.setFont(new Font("Fredoka Light", Font.PLAIN, 14));
		ad.add(addbtn);
		
		
		addbtn.addActionListener(new ActionListener() {
			
		
			public void actionPerformed(ActionEvent e) {
				
				ajouprof(new Prof(
						cnetxt.getText(),
						Integer.parseInt(apptxt.getText()),
						nomtxt.getText(),
						prenomtxt.getText(),
						Integer.parseInt(teltxt.getText()),
						pwdtxt.getText(),
						statuttxt.getText(),
						Integer.parseInt(saltxt.getText()),
						nom_dep
						
						),modtxt.getText() , clacom.getSelectedItem().toString());
				
				EnsaClass cl = new EnsaClass(clacom.getSelectedItem().toString());
				ArrayList <Integer>ls = cl.listapp();
				EtudMod etm = new EtudMod(modtxt.getText());
				 for(int i=0;i<ls.size();i++) {
					 etm.SetAllZero(ls.get(i));
				 }
				 
				conpanel.setVisible(false);
				conpanel.removeAll();
				conpanel.setVisible(true);
				conpanel.add(listprof());
				conpanel.add(fields);
				
			}
		
			});
		
		JPanel af = new JPanel();
		af.setBackground(new Color (86,135,166));
		
		JButton affecterbtn = new JButton("Affecter");
		affecterbtn.setPreferredSize(new Dimension(appoge.getPreferredSize()));
		affecterbtn.setBorder(null);
		affecterbtn.setBackground(new Color(47, 85, 115));
		affecterbtn.setForeground(new Color(255, 255, 255));
		affecterbtn.setFont(new Font("Fredoka Light", Font.PLAIN, 14));
		 af.add(affecterbtn);
		
		box3.add(ad);
		box3.add(fu);
		box3.add(af);
		
		fields.add(box2);
		fields.add(box3);
		
		
		
		affecterbtn.addActionListener(new ActionListener() {
			
		
			public void actionPerformed(ActionEvent e) {
			
			Module md = new Module(modtxt.getText(),Integer.parseInt(apptxt.getText()));
			md.savemod();
			Etudier ed =	new Etudier(modtxt.getText(), clacom.getSelectedItem().toString());
			ed.SaveEtudier();
			 EnsaClass cl = new EnsaClass(clacom.getSelectedItem().toString());
			ArrayList<Integer> ls = cl.listapp();
			EtudMod etm = new EtudMod(modtxt.getText());
			for(int i=0;i<ls.size();i++) {
				 etm.SetAllZero(ls.get(i));
			 }
			
			
				conpanel.setVisible(false);
				conpanel.removeAll();
				conpanel.setVisible(true);
				conpanel.add(listprof());
				conpanel.add(fields);
				
			}
		
			});
		
		JButton suppbtn = new JButton("DELETE");
		suppbtn.setPreferredSize(new Dimension(appoge.getPreferredSize()));
		suppbtn.setBorder(null);
		suppbtn.setBackground(new Color(222,31,39));
		suppbtn.setForeground(new Color(255,255,255));
		suppbtn.setFont(new Font("Fredoka LIGHT", Font.PLAIN, 14));
		ad.add(suppbtn);
		
		suppbtn.addActionListener(new ActionListener() {
			
			
			public void actionPerformed(ActionEvent e) {
				
				suppprof(
						Integer.parseInt(apptxt.getText()),
						modtxt.getText(),
						clacom.getSelectedItem().toString()
						);
				conpanel.setVisible(false);
				conpanel.removeAll();
				conpanel.setVisible(true);
				conpanel.add(listprof());
				conpanel.add(fields);
				
			}
		
			});
		
		
		
		JButton srcbtn = new JButton("FIND");
		srcbtn.setPreferredSize(new Dimension(appoge.getPreferredSize()));
		srcbtn.setBorder(null);
		srcbtn.setBackground(new Color(47, 85, 115));
		srcbtn.setForeground(new Color(255, 255, 255));
		srcbtn.setFont(new Font("Fredoka Light", Font.PLAIN, 14));
		fu.add(srcbtn);
		
		srcbtn.addActionListener(new ActionListener() {
			
		
			public void actionPerformed(ActionEvent e) {
				
			Prof pr = new Prof(Integer.parseInt(apptxt.getText()));	
			ArrayList al=pr.find();
			cnetxt.setText((String) al.get(0));
			nomtxt.setText((String) al.get(1));
			prenomtxt.setText((String) al.get(2));
			teltxt.setText((String) al.get(3));
			pwdtxt.setText((String) al.get(4));
			statuttxt.setText((String) al.get(5));
			saltxt.setText((String) al.get(6));
		
			}
		
			});
		
		
	
		
		
		
		conpanel.add(fields);
		
		
		return conpanel;
		
	}

	
	
}
