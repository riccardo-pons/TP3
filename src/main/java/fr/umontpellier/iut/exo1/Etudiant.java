package fr.umontpellier.iut.exo1;

import java.time.LocalDate;

public class Etudiant {
    private String nom;
    private String prenom;
    private LocalDate dateNaissance;
    private String adresseMail;
    private String adressePostale;



    public Etudiant(String nom, String prenom, LocalDate dateNaissance, String adresseMail, String adressePostale) {
        this.nom = nom;
        this.prenom = prenom;
        this.dateNaissance = dateNaissance;
        this.adresseMail = adresseMail;
        this.adressePostale = adressePostale;
    }

    @Override
    public String toString() {
        return  '\n' + "nom : " + nom + '\n' + "prénom : " + prenom+ '\n';
    }

    public void setNom(String newNom, String newPrenom){
        this.nom = newNom;
        this.prenom = newPrenom;
    }


}
