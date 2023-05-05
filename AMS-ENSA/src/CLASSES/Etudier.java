package CLASSES;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.sql.Statement;

public class Etudier {
	
		private String nom_mod ;
		private String nom_cl ;
		
		
		public Etudier(String nom_mod, String nom_cl) {
			super();
			this.nom_mod = nom_mod;
			this.nom_cl = nom_cl;
		}
		public String getNom_mod() {
			return nom_mod;
		}
		public void setNom_mod(String nom_mod) {
			this.nom_mod = nom_mod;
		}
		public String getNom_cl() {
			return nom_cl;
		}
		public void setNom_cl(String nom_cl) {
			this.nom_cl = nom_cl;
		}
		
		public void SaveEtudier() {
		
				
				Connection conn;
				ResultSet nbprset = null ;
				final String url ="jdbc:mysql://localhost:3306/amsdb";
				
				
				
					
					try {
						conn = DriverManager.getConnection(url,"root","PFH#23kgrw9");
						String query = "insert into etudier values('%s','%s');";
						Statement st;
						st = conn.createStatement();
						System.out.println(String.format(query,this.nom_mod,this.nom_cl));
						try {
						 st.executeUpdate(String.format(query,this.nom_mod,this.nom_cl));
						}catch(SQLIntegrityConstraintViolationException e) {
							System.out.println(e.getMessage());
						}

					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				

					
					
					
					
				
			

		}
}
