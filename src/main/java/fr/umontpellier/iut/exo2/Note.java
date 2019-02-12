package fr.umontpellier.iut.exo2;

public class Note {
    private Matière matiere;
    private double valeurNote;

    public Note(Matière matiere, double valeurNote){
        this.matiere = matiere;
        this.valeurNote = valeurNote;
    }
    public Matière getMatiere(){
        return matiere;
    }
    public double getValeurNote(){
        return valeurNote;
    }
}

