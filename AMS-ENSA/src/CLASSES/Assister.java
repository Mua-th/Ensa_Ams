package CLASSES;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.sql.Statement;

public class Assister {
	
	private int appogee ;
	private int num_s ;
	private String module ;
	private int present ;
	

	public int getAppogee() {
		return appogee;
	}
	public void setAppogee(int appogee) {
		this.appogee = appogee;
	}
	public int getNum_s() {
		return num_s;
	}
	public void setNum_s(int num_s) {
		this.num_s = num_s;
	}
	public String getModule() {
		return module;
	}
	public void setModule(String module) {
		this.module = module;
	}
	public Assister( int appogee, int num_s, String module,int present) {
		
		
		this.appogee = appogee;
		this.num_s = num_s;
		this.module = module;
		this.present=present;
	}
	
	//-------------constructeur a partir d'une seance --------
	public Assister(Seance sc,int appogee,int pres) {
		this.appogee = appogee;
		this.num_s = sc.getNum();
		this.module = sc.getModule();
		this.present=pres;
		
	}
	public int isPresent() {
		return present;
	}
	public void setPresent(int present) {
		this.present = present;
	}
	
	public void savedb ()  {
		Connection conn;
		ResultSet etudset = null ;
		final String url ="jdbc:mysql://localhost:3306/amsdb";
		
		
		try {
			
			conn = DriverManager.getConnection(url,"root","PFH#23kgrw9");
		
		
		String etquery = "insert into assister values(%s,'%s',%s,%s);";
			Statement st = conn.createStatement();
			System.out.println(String.format(etquery,this.present,this.module,this.num_s,this.appogee));
			try {
			st.executeUpdate(String.format(etquery,this.present,this.module,this.num_s,this.appogee));
			}
			catch(SQLIntegrityConstraintViolationException e)
			{
				System.out.println(e.getMessage());
			}
			
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
	
	public void updatetatetud() {
		Connection conn;
		
		final String url ="jdbc:mysql://localhost:3306/amsdb";
		
	try {
			
			conn = DriverManager.getConnection(url,"root","PFH#23kgrw9");
		
		
		String etquery = "update assister set present =%s where appogee=%s and num_s = %s and module = '%s'; ";
			Statement st = conn.createStatement();
			System.out.println(String.format(etquery,this.present,this.appogee,this.num_s,this.module));
			st.executeUpdate(String.format(etquery,this.present,this.appogee,this.num_s,this.module));
			
			EtudMod etm = new EtudMod(this.appogee,this.module);
			System.out.println("normalement tzadet 4 h "+this.appogee+this.module);
			etm.updnbhetd();
			
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
	}
	
}
