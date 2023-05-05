package CLASSES;

public class Departement {
	private int code_dep ;
	private String nom ;
	private int code_chef ;
	
	public Departement(int code_dep, String nom, int code_chef) {
	
		this.code_dep = code_dep;
		this.nom = nom;
		this.code_chef = code_chef;
	}

	public int getCode_dep() {
		return code_dep;
	}

	public void setCode_dep(int code_dep) {
		this.code_dep = code_dep;
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
	
}
