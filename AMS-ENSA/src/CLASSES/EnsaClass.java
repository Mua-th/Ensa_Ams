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

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;

import testgraphic.Emploi;
import testgraphic.Espace_prof;

public class EnsaClass {

	
	private String nom;
	private String nom_fil ;
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getNom_fil() {
		return nom_fil;
	}
	public void setNom_fil(String nom_fil) {
		this.nom_fil = nom_fil;
	}
	
	public EnsaClass(String nom, String nom_fil) {
	
		this.nom = nom;
		this.nom_fil = nom_fil;
	}
	
	public EnsaClass(String nom) {
		this.nom = nom;
		this.nom_fil = "";
	}
	
	public EnsaClass()
	 {
		this.nom = "";
		this.nom_fil = "";
	}
	
	public JScrollPane listetud() {

			JPanel pnlist = new JPanel();
			int height = 100 ;
			pnlist.setPreferredSize(new Dimension(754,height+200));
			
			
			
			
			Connection conn;
			ResultSet etudset = null ;
			final String url ="jdbc:mysql://localhost:3306/amsdb";
			
			
			try {
				
				conn = DriverManager.getConnection(url,"root","PFH#23kgrw9");
			
			
			String etquery = "select * from etudiant   where nom_cl ='%s' ;";
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
			
			JLabel lblNewLabel_1 = new JLabel("APPOGEE");
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
					
					height+=100;
					pnlist.setPreferredSize(new Dimension(754,height));
					panel_3.setPreferredSize(new Dimension(110, height));
					panel_3_1.setPreferredSize(new Dimension(110, height));
					panel_3_2.setPreferredSize(new Dimension(110, height));
					nbhpnl.setPreferredSize(new Dimension(110, height));
					
					list.add(etudset.getString("appogee"));
					
					JLabel applbl =new JLabel(etudset.getString("appogee"));
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
	
	//------------------------ liste etud seance-----------
	
	public JScrollPane listetud(final Seance sc)  {

		JPanel pnlist = new JPanel();
		
		int height = 0 ;
		pnlist.setPreferredSize(new Dimension(754,height+100));
		
		
		
		
		Connection conn;
		ResultSet etudset = null ;
		final String url ="jdbc:mysql://localhost:3306/amsdb";
		
		
		try {
			
			conn = DriverManager.getConnection(url,"root","PFH#23kgrw9");
		
		
		String etquery = "select * from etudiant   where nom_cl ='%s' ;";
		
		
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
		
		JLabel lblNewLabel_1 = new JLabel("APPOGEE");
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
		pnlist.add(nbhpnl);
		
		nbhpnl.setLayout(new BoxLayout(nbhpnl, BoxLayout.Y_AXIS));
		nbhpnl.add(new JLabel("                             "));
		
		JLabel nbhabslbl = new JLabel("nbh_abs/mdl");
		nbhabslbl.setForeground(new Color(255,255,255));
		nbhabslbl.setFont(new Font("Fredoka One", Font.PLAIN, 16));
		nbhpnl.add(nbhabslbl);
		
		JLabel bla = new JLabel("                             ");
		nbhpnl.add(bla);
		
		JPanel etatpnl = new JPanel();
		etatpnl.setPreferredSize(new Dimension(110, height));
		etatpnl.setBackground(new Color(47,85,115));
		pnlist.add(etatpnl);
		etatpnl.setLayout(new BoxLayout(etatpnl, BoxLayout.Y_AXIS));
		
		etatpnl.add(new JLabel("                             "));
		
		JLabel etatlbl = new JLabel("ETAT");
		etatlbl.setForeground(new Color(255,255,255));
		etatlbl.setFont(new Font("Fredoka One", Font.PLAIN, 16));
		etatpnl.add(etatlbl);
		
		etatpnl.add(new JLabel("                             "));
		
		
		pnlist.setBackground(new Color (00,85,115));
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		
		try {
			
			
			while(etudset.next()) {
				
				
				
				height+=40;
				pnlist.setPreferredSize(new Dimension(754,100+height));
				panel_3.setPreferredSize(new Dimension(110, height));
				panel_3_1.setPreferredSize(new Dimension(110, height));
				panel_3_2.setPreferredSize(new Dimension(110, height));
				nbhpnl.setPreferredSize(new Dimension(110, height));
				etatpnl.setPreferredSize(new Dimension(110, height));
				
				list.add(etudset.getInt("appogee"));
				
				JLabel applbl =new JLabel(etudset.getString("appogee"));
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
				
				conn = DriverManager.getConnection(url,"root","PFH#23kgrw9");
				String prsquery = "select present from assister where appogee=%s and num_s=%s and module='%s' ; ";
				Statement st = conn.createStatement();
				System.out.println(String.format(prsquery,etudset.getString("appogee"),sc.getNum(),sc.getModule()));
				ResultSet preset = st.executeQuery(String.format(prsquery,etudset.getString("appogee"),sc.getNum(),sc.getModule()));
				
				
				while(preset.next()) {
				System.out.println(preset.getInt("present"));
				if(preset.getInt("present")==1) {
					
				JLabel etalbl = new JLabel("PRESENT");
				etalbl.setFont(new Font("Fredoka One", Font.PLAIN, 14));
				
				etalbl.setForeground(new Color(208,233,242));
				etatpnl.add(etalbl);
				
				JLabel vide3 = new JLabel(" ");
				etatpnl.add(vide3);
				
				}else {
					JLabel etalbl = new JLabel("ABSENT");
					etalbl.setFont(new Font("Fredoka One", Font.PLAIN, 14));
					etalbl.setForeground(new Color(222,31,39));
					etatpnl.add(etalbl);
					etatpnl.add(new JLabel("                             "));
					}
				}
				String nbhq = "select nbh_abs from etudmod where appogee = %s  and nom_mod ='%s'";
				ResultSet nbhset = st.executeQuery(String.format(nbhq,etudset.getString("appogee"),sc.getModule()));
				while (nbhset.next()) {
					JLabel nbhlbl =new JLabel(nbhset.getString("nbh_abs"));
					nbhlbl.setFont(new Font("Fredoka One", Font.PLAIN, 14));
					nbhlbl.setForeground(new Color(208,233,242));
					nbhpnl.add(nbhlbl);
					
					JLabel vide3 = new JLabel(" ");
					nbhpnl.add(vide3);
				}
				
				try {
				 Assister assi = new Assister(Integer.parseInt(etudset.getString("appogee")),sc.getNum(),sc.getModule(),1);
				 
				assi.savedb() ;}
				catch(SQLIntegrityConstraintViolationException e1) {
					e1.printStackTrace();
				}
				
				
				
			}
			pnlist.add(panel_3);
			pnlist.add(panel_3_1);
			pnlist.add(panel_3_2);
			pnlist.add(nbhpnl);
			pnlist.add(etatpnl);
			


			
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		JPanel abspnl = new JPanel();
		abspnl.setBackground(new Color(47,84,115));
		
		FlowLayout flowLayout_14 = (FlowLayout) abspnl.getLayout();
		flowLayout_14.setVgap(10);
		flowLayout_14.setHgap(10);
		flowLayout_14.setAlignment(FlowLayout.LEFT);
		
		JLabel applbl = new JLabel("APPOGEE :");
		applbl.setForeground(new Color(208,233,242));
		applbl.setFont(new Font("Fredoka Light", Font.PLAIN, 16));
		
		abspnl.add(applbl);
		
		final JComboBox insert = new JComboBox(list.toArray());
		
		insert.setBackground(new Color(208, 233, 242));
		insert.setFont(new Font("Fredoka Light", Font.PLAIN, 18));
		
		insert.setPreferredSize(new Dimension(150, 30));
		
		abspnl.add(insert);
		
		 final JButton ok = new JButton("ABSENT");
		ok.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				ok.setBackground(new Color(208, 233, 242));
				ok.setForeground(new Color(47, 85, 115));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				ok.setBackground(new Color(47, 85, 115));
				ok.setForeground(new Color(255, 255, 255));
			}
		});
		
		//---------------------------------------LOGIN ACTION -----------------------------
		ok.addActionListener(new ActionListener() {
			
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent e) {
				
				Assister assi = new Assister(sc,((Integer) insert.getSelectedItem()).intValue(),0);
				
				assi.updatetatetud();
				
				
				
				
		
			}});
	
		
		
		
		
		
		abspnl.add(ok);
		
		pnlist.add(abspnl);
		
		JScrollPane seancescrol = new JScrollPane(pnlist);
	seancescrol.setPreferredSize(new Dimension(754,470));
	
	
	return seancescrol;
	
	
}
	
	public ArrayList getinfo() {
		
		ArrayList infols = new ArrayList();
		
		Connection conn;
		ResultSet nbprset = null ;
		final String url ="jdbc:mysql://localhost:3306/amsdb";
		
		
		try {
			
			conn = DriverManager.getConnection(url,"root","PFH#23kgrw9");
		
		//--------------------- count(prof)---------------
		String query = "select count(prof_mod) \r\n"
				+ "from module , etudier \r\n"
				+ "where module.nom=etudier.nom_mod and etudier.nom_cl ='%s';";
			Statement st = conn.createStatement();
			System.out.println(String.format(query,this.nom));
			try {
			nbprset = st.executeQuery(String.format(query,this.nom));
			
			while(nbprset.next()) {
			infols.add(nbprset.getString("count(prof_mod)"));
			
			}
			}
			catch(SQLIntegrityConstraintViolationException e)
			{
				System.out.println(e.getMessage());
			}
			
			//--------------------- count(etud)---------------
			String nbetquery = "select count(appogee) \r\n"
					+ "from etudiant\r\n"
					+ "where nom_cl ='%s';";
				Statement nbetst = conn.createStatement();
				System.out.println(String.format(nbetquery,this.nom));
				try {
					nbprset = nbetst.executeQuery(String.format(nbetquery,this.nom));
				
				while(nbprset.next()) {
				infols.add(nbprset.getString("count(appogee)"));
				
				}
				}
				catch(SQLIntegrityConstraintViolationException e)
				{
					System.out.println(e.getMessage());
				}

		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		return infols;
		
				
	}
	
	public ArrayList find(int app) {
		ArrayList etdlist = new ArrayList();
		
		Connection conn;
		ResultSet etudset = null ;
		final String url ="jdbc:mysql://localhost:3306/amsdb";
		
		
		
			
			try {
				conn = DriverManager.getConnection(url,"root","PFH#23kgrw9");
				String query = "select* from etudiant where appogee=%s and nom_cl = '%s';";
				Statement st;
				st = conn.createStatement();
				System.out.println(String.format(query,app,this.nom));

				etudset= st.executeQuery(String.format(query,app,this.nom));
				
				while(etudset.next()) {
					etdlist.add(etudset.getString("cne"));
					etdlist.add(etudset.getString("nom"));
					etdlist.add(etudset.getString("prenom"));
					
					etdlist.add(etudset.getString("tel"));
					etdlist.add(etudset.getString("pwd"));
				}
				
				
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return etdlist;
		

	}
	
	
	public void updetd(Etudiant etud) {
		Connection conn;
		ResultSet nbprset = null ;
		final String url ="jdbc:mysql://localhost:3306/amsdb";
		
		
		
			
			try {
				conn = DriverManager.getConnection(url,"root","PFH#23kgrw9");
				String query = "update etudiant set cne= '%s',nom='%s',prenom='%s',tel=%s,pwd='%s' where appogee=%s and nom_cl='%s';";
				Statement st;
				st = conn.createStatement();
				System.out.println(String.format(query,etud.getCne(),etud.getNom(),etud.getPrenom(),etud.getTel(),etud.getPwd(),etud.getAppogee(),this.nom));

				 st.executeUpdate(String.format(query,etud.getCne(),etud.getNom(),etud.getPrenom(),etud.getTel(),etud.getPwd(),etud.getAppogee(),this.nom));

			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		

			
			
			
	}
	public void ajouetd(Etudiant etud)  {
		
		Connection conn;
		ResultSet nbprset = null ;
		final String url ="jdbc:mysql://localhost:3306/amsdb";
		
		
		
			
			try {
				conn = DriverManager.getConnection(url,"root","PFH#23kgrw9");
				String query = "insert into etudiant values(%s,'%s','%s','%s',%s,'%s','%s');";
				Statement st;
				st = conn.createStatement();
				System.out.println(String.format(query,etud.getAppogee(),etud.getCne(),etud.getNom(),etud.getPrenom(),etud.getTel(),etud.getPwd(),this.nom));
				try {
				 st.executeUpdate(String.format(query,etud.getAppogee(),etud.getCne(),etud.getNom(),etud.getPrenom(),etud.getTel(),etud.getPwd(),this.nom));
				}catch(SQLIntegrityConstraintViolationException e) {
					System.out.println(e.getMessage());
				}

			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		

			
			
			
			
		
	}

	public void suppetd(int app) {
		
		Connection conn;
		ResultSet nbprset = null ;
		final String url ="jdbc:mysql://localhost:3306/amsdb";
		
		
		
			
			try {
				conn = DriverManager.getConnection(url,"root","PFH#23kgrw9");
				String query = "delete from etudiant where appogee=%s and nom_cl = '%s';";
				Statement st;
				st = conn.createStatement();
				System.out.println(String.format(query,app,this.nom));

				 st.executeUpdate(String.format(query,app,this.nom));
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		

			
			
			
			
		
	}

	public JPanel control() {
		
		
		final JPanel conpanel = new JPanel();
		conpanel.setPreferredSize(new Dimension(754,470));
		conpanel.setBackground(new Color(86,135,166));
		conpanel.add(this.listetud());
		
		JPanel fields = new JPanel();
		fields.setBackground(new Color(86,135,166));
		
		FlowLayout fldlay = new FlowLayout(FlowLayout.LEFT, 15, 15);
		conpanel.setLayout(fldlay);
		
		JLabel appoge = new JLabel(" appogee ");
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
		
		JPanel pwdpnl = new JPanel();
		pwdpnl.add(pwd);
		pwdpnl.add(pwdtxt);
		pwdpnl.setBackground(new Color(86,135,166));
		


		
		JPanel box1 = new JPanel();
		box1.setLayout(new BoxLayout(box1, BoxLayout.Y_AXIS));
		box1.setBackground(new Color(86,135,166));
		
		box1.add(nompnl);
		box1.add(prnpnl);
		
		fields.add(box1);
		
		JPanel box2 = new JPanel();
		box2.setLayout(new BoxLayout(box2, BoxLayout.Y_AXIS));
		box2.setAlignmentX(Component.LEFT_ALIGNMENT);
		box2.setBackground(new Color(86,135,166));
		
		
		
		
		
		
		JButton updbtn = new JButton("UPDATE");
		updbtn.setPreferredSize(new Dimension(appoge.getPreferredSize()));
		updbtn.setBorder(null);
		updbtn.setBackground(new Color(47, 85, 115));
		updbtn.setForeground(new Color(255,255,255));
		updbtn.setFont(new Font("Fredoka LIGHT", Font.PLAIN, 14));
		
		updbtn.addActionListener(new ActionListener() {
			
			
			public void actionPerformed(ActionEvent e) {
				
				updetd(new Etudiant(
						cnetxt.getText(),
						nomtxt.getText(),
						prenomtxt.getText(),
						Integer.parseInt(teltxt.getText()),
						pwdtxt.getText(),
						Integer.parseInt(apptxt.getText()),
						getNom()));
				
			}
		
			});
		
		JButton addbtn = new JButton("ADD");
		addbtn.setPreferredSize(new Dimension(appoge.getPreferredSize()));
		addbtn.setBorder(null);
		addbtn.setBackground(new Color(47, 85, 115));
		addbtn.setForeground(new Color(255, 255, 255));
		addbtn.setFont(new Font("Fredoka Light", Font.PLAIN, 14));
		
		
		addbtn.addActionListener(new ActionListener() {
			
		
			public void actionPerformed(ActionEvent e) {
				
				ajouetd(new Etudiant(
						cnetxt.getText(),
						nomtxt.getText(),
						prenomtxt.getText(),
						Integer.parseInt(teltxt.getText()),
						pwdtxt.getText(),
						Integer.parseInt(apptxt.getText()),
						getNom()));
				
				conpanel.remove(listetud());
				conpanel.add(listetud());
			}
		
			});
		
		JButton suppbtn = new JButton("DELETE");
		suppbtn.setPreferredSize(new Dimension(appoge.getPreferredSize()));
		suppbtn.setBorder(null);
		suppbtn.setBackground(new Color(222,31,39));
		suppbtn.setForeground(new Color(255,255,255));
		suppbtn.setFont(new Font("Fredoka LIGHT", Font.PLAIN, 14));
		
		suppbtn.addActionListener(new ActionListener() {
			
			
			public void actionPerformed(ActionEvent e) {
				
				suppetd(
						Integer.parseInt(apptxt.getText())
						);
				
			}
		
			});
		
		JButton srcbtn = new JButton("FIND");
		srcbtn.setPreferredSize(new Dimension(appoge.getPreferredSize()));
		srcbtn.setBorder(null);
		srcbtn.setBackground(new Color(47, 85, 115));
		srcbtn.setForeground(new Color(255, 255, 255));
		srcbtn.setFont(new Font("Fredoka Light", Font.PLAIN, 14));
		
		
		srcbtn.addActionListener(new ActionListener() {
			
		
			public void actionPerformed(ActionEvent e) {
				
			ArrayList al=find(Integer.parseInt(apptxt.getText()));
			cnetxt.setText((String) al.get(0));
			nomtxt.setText((String) al.get(1));
			prenomtxt.setText((String) al.get(2));
			teltxt.setText((String) al.get(3));
			pwdtxt.setText((String) al.get(4));
		
			}
		
			});
		
		
		JLabel vide= new JLabel();
		vide.setPreferredSize(appoge.getPreferredSize());
		
		JLabel vide2= new JLabel();
		vide2.setPreferredSize(appoge.getPreferredSize());
		
		
		pwdpnl.add(vide);
		
		pwdpnl.add(updbtn);
		pwdpnl.add(srcbtn);
		
		telpnl.add(vide2);
		telpnl.add(addbtn);
		telpnl.add(suppbtn);
		
		box2.add(telpnl);
		box2.add(pwdpnl);
		fields.add(box2);

		
		
		
		conpanel.add(fields);
		
		return conpanel;
		
	}
	
	public ArrayList listapp() {
		
		ArrayList<Integer> ls = new ArrayList();
		
		Connection conn;
		ResultSet nbprset = null ;
		final String url ="jdbc:mysql://localhost:3306/amsdb";
		
		
		
			
			try {
				conn = DriverManager.getConnection(url,"root","PFH#23kgrw9");
				String query = "select appogee from etudiant where nom_cl='%s' ";
				Statement st;
				st = conn.createStatement();
				System.out.println(String.format(query,this.nom));
				try {
				nbprset = st.executeQuery(String.format(query,this.nom));
				
				while(nbprset.next()) {
					ls.add(Integer.parseInt(nbprset.getString("appogee")));
				}
				}catch(SQLIntegrityConstraintViolationException e) {
					System.out.println(e.getMessage());
				}

			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		

		return ls;
		
	}

	
	
	
}
