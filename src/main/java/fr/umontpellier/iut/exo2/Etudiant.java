package fr.umontpellier.iut.exo2;

import java.time.LocalDate;
import java.util.ArrayList;

public class Etudiant {
    private String nom;
    private String prenom;
    private LocalDate dateNaissance;
    private String adresseMail;
    private String adressePostale;
    private ArrayList<Note> notes;



    public Etudiant(String nom, String prenom, LocalDate dateNaissance, String adresseMail, String adressePostale) {
        this.nom = nom;
        this.prenom = prenom;
        this.dateNaissance = dateNaissance;
        this.adresseMail = adresseMail;
        this.adressePostale = adressePostale;
        this.notes = new ArrayList<>();
    }

    @Override
    public String toString() {
        return  '\n' + "nom : " + nom + '\n' + "prénom : " + prenom+ '\n';
    }

    public void setNom(String newNom, String newPrenom){
        this.nom = newNom;
        this.prenom = newPrenom;
    }

        public void noter(Matière matiere, double valeur){
            Note n = new Note(matiere, valeur);
            this.notes.add(n);
        }

        public double calculMoyenne(){
        double totalValeurs = 0;
        double totalCoefficient = 0;
        for(Note n : this.notes){
            double val = n.getValeur();
            double coeff =  n.getMatière().getCoeff();
        }
            totalValeur += val * coeff;
            totalCoef += coeff;
    }
    if (totalCoefficients == 0){
        return 0;

    }
    else {
        return totalValeurs / totalCoefficient;
    }

}
