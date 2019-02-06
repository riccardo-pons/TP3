package fr.umontpellier.iut.exo1;

import java.time.LocalDate;

public class GestionEtudiants {
    public static void main(String[] args) {

        Etudiant lolo = new Etudiant( "Nemard", "Jean", LocalDate.of(2000,1,2) , "jeanNemard@gmail.com", "145 rue de la liberté");
        Etudiant titi = new Etudiant( "René", "Jean", LocalDate.of(2000,1,2) , "jeanNemard@gmail.com", "145 rue de la liberté");
        Etudiant tutu = new Etudiant( "Laurent", "Jean", LocalDate.of(2000,1,2) , "jeanNemard@gmail.com", "145 rue de la liberté");
        Etudiant toto = lolo;
        Departement MondepInfo = new Departement("Informatique", "23 rue gritifo");
        MondepInfo.inscrire(lolo);
        MondepInfo.inscrire(toto);
        MondepInfo.inscrire(titi);
        MondepInfo.inscrire(tutu);

        System.out.println(MondepInfo);

        MondepInfo.desinscrire(toto);

        System.out.println(MondepInfo);

    }

}
