package CLASSES;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import javax.swing.JPanel;

public class Prof extends Personne{
	private String statut ;
	private float salaire ;
	private String nom_dep;
	private int code_prof ;

	public Prof(String cne,int code_prof, String nom, String prenom, int tel, String pwd, String statut, float salaire, String nom_dep) {
		super(cne, nom, prenom, tel, pwd);
		this.statut=statut;
		this.salaire=salaire;
		this.nom_dep=nom_dep;
		this.code_prof = code_prof ;
		// TODO Auto-generated constructor stub
	}

		
	
	public Prof() {
		// TODO Auto-generated constructor stub
		super();
		this.statut="";
		this.salaire=0;
		this.nom_dep="";
		this.code_prof = 0 ;
	}

	public int getCode_prof() {
		return code_prof;
	}

	public void setCode_prof(int code_prof) {
		this.code_prof = code_prof;
	}

	public String getStatut() {
		return statut;
	}

	public void setStatut(String statut) {
		this.statut = statut;
	}

	public float getSalaire() {
		return salaire;
	}

	public void setSalaire(float salaire) {
		this.salaire = salaire;
	}

	public String getNom_dep() {
		return nom_dep;
	}

	public void setNom_dep(String nom_dep) {
		this.nom_dep = nom_dep;
	}
	
	public String toString() {
		return (super.toString()+String.format("\tSTATUT : %s \t | SALAIRE : %s \t | NOM_DEP : %s ",statut,salaire,nom_dep));
		
	}
	
	
	public ArrayList find() {
		ArrayList etdlist = new ArrayList();
		
		Connection conn;
		ResultSet etudset = null ;
		final String url ="jdbc:mysql://localhost:3306/amsdb";
		
		
		
			
			try {
				conn = DriverManager.getConnection(url,"root","PFH#23kgrw9");
				String query = "select* from prof where code_prof=%s ";
				Statement st;
				st = conn.createStatement();
				System.out.println(String.format(query,this.code_prof));

				etudset= st.executeQuery(String.format(query,this.code_prof));
				
				while(etudset.next()) {
					etdlist.add(etudset.getString("cne"));
					etdlist.add(etudset.getString("nom"));
					etdlist.add(etudset.getString("prenom"));
					
					etdlist.add(etudset.getString("tel"));
					etdlist.add(etudset.getString("pwd"));
					etdlist.add(etudset.getString("statut"));
					etdlist.add(etudset.getString("salaire"));
				}
				
				
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return etdlist;
		

	}



	public Prof(String cne, String nom, String prenom, int tel, String pwd, int code_prof) {
		super(cne, nom, prenom, tel, pwd);
		this.code_prof = code_prof;
	}



	public Prof(int code) {
		
		this.code_prof = code;
		
		this.statut="";
		this.salaire=0;
		this.nom_dep="";
		super.nom="";
		super.prenom="";
		super.tel=0;
		super.pwd="";
	}
	
	public void update() {
		
		Connection conn;
		ResultSet nbprset = null ;
		final String url ="jdbc:mysql://localhost:3306/amsdb";
		
		
		
			
			try {
				conn = DriverManager.getConnection(url,"root","PFH#23kgrw9");
				String query = "update prof set cne= '%s',nom='%s',prenom='%s',tel=%s,pwd='%s' , statut = '%s' , salaire ='%s' where  code_prof=%s;";
				Statement st;
				st = conn.createStatement();
				System.out.println(String.format(query,getCne(),getNom(),getPrenom(),getTel(),getPwd(),getStatut(),getSalaire(),getCode_prof(),this.nom));

				 st.executeUpdate(String.format(query,getCne(),getNom(),getPrenom(),getTel(),getPwd(),getStatut(),getSalaire(),getCode_prof(),this.nom));

			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		
	}

		
	

	
		
	
	
	
}
