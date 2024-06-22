package org.example.exceptions.exo4.perso;

import java.util.Scanner;

public class IHM {

    public static void start() {

        String reponseAge;
        String reponseNom;
        int ageConverti;
        int choix;

        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.println("=== Menu ===");
            System.out.println("1. Créer un étudiant");
            System.out.println("2. Afficher les étudiants");
            System.out.println("3. Quitter");

            System.out.println("Faites votre choix");
            choix = sc.nextInt();
            sc.nextLine();
            switch (choix) {
                case 1 -> {
                    System.out.println("Nom de l'étudiant :");
                    reponseNom = sc.nextLine();

                    System.out.println("Age de l'étudiant");
                    try {
                        reponseAge = sc.nextLine();
                        ageConverti = Integer.parseInt(reponseAge);

                        Student etudiant = new Student(reponseNom, ageConverti);

                    } catch (NumberFormatException e){
                        System.out.println("Vous devez saisir un nombre");
                    } catch (InvalidAgeException e) {
                        System.out.println(e.getMessage());
                    }
                }
                case 2 -> {
                    for (Student student : Student.getTousLesEtudiants()) {
                        System.out.println(student);
                    }
                    System.out.println();
                }
                case 3 -> {
                    System.out.println("Exit");
                    sc.close();
                    return; // quitte la méthode start
                }
            }
        }
    }
}
