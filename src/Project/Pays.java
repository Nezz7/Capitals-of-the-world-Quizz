package Project;

public class Pays {
	private String nom;
	private String capitale;
	private boolean masculin;
	public Pays (String nom,String capitale,boolean b){
		this.nom=nom;
		this.capitale=capitale;
		this.masculin=b;
	}
	public String getNom(){
		return nom;
	}
	public String getCapitale (){
		return capitale;
	}
	public boolean getMasculin(){
		return masculin;
	}
	public String  affichage () {
		return ("- "+nom+"  : "+capitale);
	}

}
