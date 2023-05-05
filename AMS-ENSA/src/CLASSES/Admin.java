package CLASSES;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.sql.Statement;

public class Admin extends Personne {
	private String nom_fil ;
	private String code_ad ;
	private String nom_dep ;
	
	public String getNom_dep() {
		
		Connection conn;
		ResultSet set = null ;
		final String url ="jdbc:mysql://localhost:3306/amsdb";
		
		
		
			
			try {
				conn = DriverManager.getConnection(url,"root","PFH#23kgrw9");
				String query = "select nom_dep from filier where nom = '%s'";
				Statement st;
				st = conn.createStatement();
				System.out.println(String.format(query,nom_fil));
				try {
				set= st.executeQuery(String.format(query,nom_fil));
				while(set.next()) {
				nom_dep=set.getString("nom_dep");
				}
				}catch(SQLIntegrityConstraintViolationException e) {
					System.out.println(e.getMessage());
				}

			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		return nom_dep;
	}

	

	public Admin(String cne, String nom, String prenom, int tel, String pwd,String code_ad2,String nom_fil) {
		super(cne, nom, prenom, tel, pwd);
		this.nom_fil=nom_fil ;
		this.code_ad=code_ad2;
		// TODO Auto-generated constructor stub
	}

	public String getNom_fil() {
		return nom_fil;
	}

	public void setNom_fil(String nom_fil) {
		this.nom_fil = nom_fil;
	}

	public String getCode_ad() {
		return code_ad;
	}

	public void setCode_ad(String code_ad) {
		this.code_ad = code_ad;
	}
	
}
