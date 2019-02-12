package fr.umontpellier.iut.exo2;

public class Matière {
    private String intitule;
    private double coefficient;
    private Professeur professeur;

    public Matière (String intitule, double coefficient, Professeur professeur){
        this.intitule = intitule;
        this.coefficient = coefficient;
        this.professeur = professeur;

    }
    public double getCoefficient(){
        return coefficient;
    }
}


