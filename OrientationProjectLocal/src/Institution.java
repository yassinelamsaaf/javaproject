import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public abstract class Institution implements Evaluate{
	String nom;
	String ville;
	String type ; //Ecole ou Universite . . .
	List<Filiere> filieres = new ArrayList<Filiere>();
	int capacite;
	String priveeOuPublique ;
	
	
	public Institution(String nom,String ville,String type,String pb,int c) {
		this.nom = nom;
		this.ville = ville;
		this.type= type;
		this.priveeOuPublique = pb;
		this.capacite=c;
	}
	
	public void ajouterFIliere(Filiere filiere){
		this.filieres.add(filiere);
		
	}
	

	
	//verifier si un etudiant peut acceder a l'institut
	
	public String PeutAcceder(Etudiant E) {
		String r = "";
		
		for(int i=0;i<this.filieres.size();i++) {
			
			if (this.filieres.get(i).PeutAccederFiliere(E)==true) {
				
				r = r +" "+this.filieres.get(i).nom;
				
			}
		}
		if(r==""){
			System.out.println("ne peut pas acceder");
		}
		return r;
	}
	
	
	
	public void sortFilieres() {
		
		Collections.sort(this.filieres);	
		
	}
	
	
	
	




	
}
