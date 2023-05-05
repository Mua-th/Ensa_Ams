package CLASSES;

import java.awt.Color;
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
import java.sql.Statement;
import java.util.ArrayList;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class Etudiant extends Personne{
	private int appogee ;
	private String nom_cl ;



	public Etudiant(String cne, String nom, String prenom, int tel, String pwd, int appogee,String nom_cl) {
		super(cne, nom, prenom, tel, pwd);
		this.appogee=appogee ;	
		this.nom_cl=nom_cl;
		// TODO Auto-generated constructor stub
	}



	public int getAppogee() {
		return appogee;
	}



	public void setAppogee(int appogee) {
		this.appogee = appogee;
	}



	public String getNom_cl() {
		return nom_cl;
	}



	public void setNom_cl(String nom_cl) {
		this.nom_cl = nom_cl;
	}
	
	
	
}
