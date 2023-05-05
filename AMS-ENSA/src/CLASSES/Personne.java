package CLASSES;

import javax.swing.JPanel;

public abstract class Personne {
	private String cne ;
	protected String nom ;
	protected String prenom ;
	protected int tel ;
	protected String pwd ;
	
	//------------------------------------------------------------ GETTERS AND SETTERS ------------------------------------------------------
	
	public String getCne() {
		return cne;
	}
	public void setCne(String cne) {
		this.cne = cne;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public int getTel() {
		return tel;
	}
	public void setTel(int tel) {
		this.tel = tel;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public Personne(String cne, String nom, String prenom, int tel, String pwd) {
		super();
		this.cne = cne;
		this.nom = nom;
		this.prenom = prenom;
		this.tel = tel;
		this.pwd = pwd;
	}
	
	public Personne() {
		// TODO Auto-generated constructor stub
		this.cne = "";
		this.nom = "";
		this.prenom = "";
		this.tel = 0;
		this.pwd = "";
	}
	//---------------------------------------------------------------AUTRES ----------------------------------------------------(---------------
	public   String  toString () {
		return String.format("CNE : %s \t | NOM : %s \t | PRENOM : %s \t TEL : %s \t | PASSWORD : %s",cne,nom,prenom,tel ,pwd);
	}
	
	
}
