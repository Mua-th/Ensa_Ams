package CLASSES;

public class Seance {
	private int num;
	private String sdate ;
	private String duree ;
	private String module ;
	private int code_prof;
	private String nom_cl;
	private String HDEP ;
	
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getSdate() {
		return sdate;
	}
	public void setSdate(String sdate) {
		this.sdate = sdate;
	}
	public String getDuree() {
		return duree;
	}
	public void setDuree(String duree) {
		this.duree = duree;
	}
	public String getModule() {
		return module;
	}
	public void setModule(String module) {
		this.module = module;
	}
	public int getCode_prof() {
		return code_prof;
	}
	public void setCode_prof(int code_prof) {
		this.code_prof = code_prof;
	}
	public String getNom_cl() {
		return nom_cl;
	}
	public void setNom_cl(String nom_cl) {
		this.nom_cl = nom_cl;
	}
	public Seance(int num, String sdate, String duree, String module, int code_prof, String nom_cl,String HDEP) {

		this.num = num;
		this.sdate = sdate;
		this.duree = duree;
		this.module = module;
		this.code_prof = code_prof;
		this.nom_cl = nom_cl;
		this.HDEP = HDEP ;
	}
	public String getHDEP() {
		return HDEP;
	}
	public void setHDEP(String hDEP) {
		HDEP = hDEP;
	}
	
	
}
