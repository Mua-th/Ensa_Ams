package CLASSES;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.sql.Statement;

public class Module {
	
	private String  nom ;
	private float  nbh ;
	private int  prof_mod ;
	
	public Module(String nom, int prof_mod) {
		super();
		this.nom = nom;
		this.prof_mod = prof_mod;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public float getNbh() {
		return nbh;
	}
	public void setNbh(float nbh) {
		this.nbh = nbh;
	}
	public int getProf_mod() {
		return prof_mod;
	}
	public void setProf_mod(int prof_mod) {
		this.prof_mod = prof_mod;
	}
	
	public void savemod() {
		
		Connection conn;
		ResultSet nbprset = null ;
		final String url ="jdbc:mysql://localhost:3306/amsdb";
		
		
		
			
			try {
				conn = DriverManager.getConnection(url,"root","PFH#23kgrw9");
				String query = "insert into module(nom , prof_mod) values('%s',%s);";
				Statement st;
				st = conn.createStatement();
				System.out.println(String.format(query,this.nom,this.prof_mod));
				try {
				 st.executeUpdate(String.format(query,this.nom,this.prof_mod));
				}catch(SQLIntegrityConstraintViolationException e) {
					System.out.println(e.getMessage());
				}

			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
}
