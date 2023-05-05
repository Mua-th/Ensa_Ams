package CLASSES;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.sql.Statement;
import java.util.ArrayList;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;

public class EtudMod {
	private int appogee ;
	private String nom_mod ;
	private float note ;
	private float nbh ;
	public EtudMod(int appogee, String nom_mod, float note, float nbh) {
		super();
		this.appogee = appogee;
		this.nom_mod = nom_mod;
		this.note = note;
		this.nbh = nbh;
	}
	public EtudMod(int appogee, String nom_mod, float note) {
		super();
		this.appogee = appogee;
		this.nom_mod = nom_mod;
		this.note = note;
	}
	
	public EtudMod(int appogee , String mod ) {
		this.appogee = appogee;
		this.nom_mod = mod;
	}
	
	public int getAppogee() {
		return appogee;
	}
	public void setAppogee(int appogee) {
		this.appogee = appogee;
	}
	public String getNom_mod() {
		return nom_mod;
	}
	public void setNom_mod(String nom_mod) {
		this.nom_mod = nom_mod;
	}
	public float getNote() {
		return note;
	}
	public void setNote(float note) {
		this.note = note;
	}
	public float getNbh() {
		return nbh;
	}
	public void setNbh(float nbh) {
		this.nbh = nbh;
	}
	
	public JScrollPane listetud() {

		JPanel pnlist = new JPanel();
		int height = 60 ;
		pnlist.setPreferredSize(new Dimension(754,height+200));
		
		
		
		
		Connection conn;
		ResultSet etudset = null ;
		final String url ="jdbc:mysql://localhost:3306/amsdb";
		
		
		try {
			
			conn = DriverManager.getConnection(url,"root","PFH#23kgrw9");
		
		
		String etquery = "select * from etudiant inner join etudmod on etudiant.appogee=etudmod.appogee inner join  etudier on etudmod.nom_mod=etudier.nom_mod inner join class on etudier.nom_cl = class.nom where etudier.nom_mod = '%s'  ;";
			Statement st = conn.createStatement();
			System.out.println(String.format(etquery,this.nom_mod));
			etudset = st.executeQuery(String.format(etquery,this.nom_mod));
			
			
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
		
		JLabel nbhabslbl = new JLabel("NOTE");
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
				
				JLabel tellbl = new JLabel(etudset.getString("note"));
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

	
	public EtudMod() {
		super();
	}
	public JPanel profcontrol(EnsaClass cl) {
		
			
		final JPanel conpanel = new JPanel();
		conpanel.setPreferredSize(new Dimension(754,470));
		conpanel.setBackground(new Color(86,135,166));
		final JScrollPane list= listetud();
		conpanel.add(list);
		
		final JPanel fields = new JPanel();
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
		
		JLabel cne = new JLabel("NOTE");
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

		
		
		
		JPanel nompnl = new JPanel();
		nompnl.setBackground(new Color(86,135,166));
		
		
		
		
		
		JPanel prnpnl = new JPanel();
	
		prnpnl.setBackground(new Color(86,135,166));
		

		
		
		JPanel telpnl = new JPanel();
	
		telpnl.setBackground(new Color(86,135,166));
		
		
		JPanel pwdpnl = new JPanel();
		
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
		
		
		
		
		
	
		
		JButton addbtn = new JButton("VALIDER");
		addbtn.setPreferredSize(new Dimension(appoge.getPreferredSize()));
		addbtn.setBorder(null);
		addbtn.setBackground(new Color(47, 85, 115));
		addbtn.setForeground(new Color(255, 255, 255));
		addbtn.setFont(new Font("Fredoka Light", Font.PLAIN, 14));
		
		
		addbtn.addActionListener(new ActionListener() {
			
		
			public void actionPerformed(ActionEvent e) {
				EtudMod et = new EtudMod(Integer.parseInt(apptxt.getText()),nom_mod,Float.valueOf(cnetxt.getText()));
				et.updetdm();
				conpanel.setVisible(false);
				conpanel.removeAll();
				conpanel.setVisible(true);
				conpanel.add(listetud());
				conpanel.add(fields);
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
			/*	
			ArrayList al=find(Integer.parseInt(apptxt.getText()));
			cnetxt.setText((String) al.get(0));
			nomtxt.setText((String) al.get(1));
			prenomtxt.setText((String) al.get(2));
			teltxt.setText((String) al.get(3));
			pwdtxt.setText((String) al.get(4));
		
			*/}
		
			});
		
		
		JLabel vide= new JLabel();
		vide.setPreferredSize(appoge.getPreferredSize());
		
		JLabel vide2= new JLabel();
		vide2.setPreferredSize(appoge.getPreferredSize());
		
		
		pwdpnl.add(vide);
		
		pwdpnl.add(srcbtn);
		
		telpnl.add(vide2);
		telpnl.add(addbtn);
		
		box2.add(telpnl);
		box2.add(pwdpnl);
		fields.add(box2);

		
		
		
		conpanel.add(fields);
		
		return conpanel;
		
	}
	public EtudMod(String nom_mod) {
		super();
		this.nom_mod = nom_mod;
	}
	
	public void updetdm() {
		
		Connection conn;
		ResultSet nbprset = null ;
		final String url ="jdbc:mysql://localhost:3306/amsdb";
		
		
		
			
			try {
				conn = DriverManager.getConnection(url,"root","PFH#23kgrw9");
				String query = "update etudmod set note = %s where nom_mod = '%s' and appogee = %s;";
				Statement st;
				st = conn.createStatement();
				System.out.println(String.format(query,note,this.nom_mod,appogee));
				try {
				 st.executeUpdate(String.format(query,note,this.nom_mod,appogee));
				}catch(SQLIntegrityConstraintViolationException e) {
					System.out.println(e.getMessage());
				}

			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		
	}
	
	public void SetAllZero(int app ) {
		Connection conn;
		ResultSet nbprset = null ;
		final String url ="jdbc:mysql://localhost:3306/amsdb";
		
		
		
			
			try {
				conn = DriverManager.getConnection(url,"root","PFH#23kgrw9");
				String query = "insert into etudmod(appogee,nom_mod,note) values(%s,'%s',%s);";
				Statement st;
				st = conn.createStatement();
				System.out.println(String.format(query,app,this.nom_mod,0));
				try {
				 st.executeUpdate(String.format(query,app,this.nom_mod,0));
				}catch(SQLIntegrityConstraintViolationException e) {
					System.out.println(e.getMessage());
				}

			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		

	}

	
	public void updnbhetd() {
		
		Connection conn;
		ResultSet nbprset = null ;
		final String url ="jdbc:mysql://localhost:3306/amsdb";
		
		
		
			
			try {
				conn = DriverManager.getConnection(url,"root","PFH#23kgrw9");
				String query = "update etudmod set nbh_abs = (nbh_abs + 4 )where nom_mod = '%s' and appogee = %s ;";
				String query2 = "update etudmod set sanction ='RATRAPPAGE' where nom_mod = '%s' and appogee = %s and nbh_abs>20 ;";

				Statement st;
				st = conn.createStatement();
				System.out.println(String.format(query,this.nom_mod,appogee));
				try {
				 st.executeUpdate(String.format(query,this.nom_mod,appogee));
				 st.executeUpdate(String.format(query2,this.nom_mod,appogee));
				}catch(SQLIntegrityConstraintViolationException e) {
					System.out.println(e.getMessage());
				}

			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		
	}

}
