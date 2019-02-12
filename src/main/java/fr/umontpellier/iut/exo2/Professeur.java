package fr.umontpellier.iut.exo2;

public class Professeur {
private String nom;
private String prenom;

public professeur(String nom, String prenom){
    this.nom = nom;
    this.prenom = prenom;
}
@Override
    public String toString(){
    return "Nom : " + nom + '\n'+ "Prénom : " + prenom + '\n';
}

}
