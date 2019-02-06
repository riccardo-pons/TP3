package fr.umontpellier.iut.exo1;


import java.util.ArrayList;

public class Departement {
    private String specialite;
    private String adresse;
    private ArrayList<Etudiant> etudiants;

    public Departement(String specialite, String adresse) {
        this.specialite = specialite;
        this.adresse = adresse;
        this.etudiants = new ArrayList<>();
    }

    public void inscrire(Etudiant e) {
        this.etudiants.add(e);
    }

    public void desinscrire(Etudiant e) {
        this.etudiants.remove(e);
    }

    @Override
    public String toString() {
        return "Departement{" +
                "specialite='" + specialite + '\'' +
                ", adresse='" + adresse + '\'' +
                ", etudiants=" + etudiants +
                '}';
    }
}