/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.util.Scanner;

/**
 *
 * @author hp
 */
public class TestBibliotheque {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Capacite de la bibliotheque : ");
        int n = sc.nextInt();

        Bibliotheque biblio = new Bibliotheque(n);

       
        Livre l = new Livre("Les Miserables", "Victor Hugo", 300);
        Revue r = new Revue("National Geographic", "Mars", 2024);

        biblio.ajouter(l);
        biblio.ajouter(r);

        int choix = -1;

        while (choix != 0) {

            System.out.println();
            System.out.println("1. Ajouter");
            System.out.println("2. Afficher");
            System.out.println("3. Supprimer");
            System.out.println("4. Afficher les auteurs");
            System.out.println("5. Rechercher par numero");
            System.out.println("0. Quitter");
            System.out.print("Choix : ");
            choix = sc.nextInt();

            if (choix == 1) {

                System.out.print("Type (1=Livre, 2=Revue, 3=Dictionnaire, 4=Roman, 5=Manuel) : ");
                int type = sc.nextInt();
                sc.nextLine();

                System.out.print("Titre : ");
                String titre = sc.nextLine();

                Document doc = null;

                if (type == 1) {
                    System.out.print("Auteur : ");
                    String auteur = sc.nextLine();
                    System.out.print("Nombre de pages : ");
                    int pages = sc.nextInt();
                    doc = new Livre(titre, auteur, pages);

                } else if (type == 2) {
                    System.out.print("Mois : ");
                    String mois = sc.nextLine();
                    System.out.print("Annee : ");
                    int annee = sc.nextInt();
                    doc = new Revue(titre, mois, annee);

                } else if (type == 3) {
                    System.out.print("Langue : ");
                    String langue = sc.nextLine();
                    doc = new Dictionnaire(titre, langue);

                } else if (type == 4) {
                    System.out.print("Auteur : ");
                    String auteur = sc.nextLine();
                    System.out.print("Nombre de pages : ");
                    int pages = sc.nextInt();
                    System.out.print("Prix : ");
                    double prix = sc.nextDouble();
                    doc = new Roman(titre, auteur, pages, prix);

                } else if (type == 5) {
                    System.out.print("Auteur : ");
                    String auteur = sc.nextLine();
                    System.out.print("Nombre de pages : ");
                    int pages = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Niveau : ");
                    String niveau = sc.nextLine();
                    doc = new Manuel(titre, auteur, pages, niveau);

                } else {
                    System.out.println("Type invalide.");
                }

                if (doc != null) {
                    boolean ok = biblio.ajouter(doc);
                    System.out.println(ok ? "Ajoute avec succes (n° " + doc.getNumEnreg() + ")." : "Bibliotheque pleine.");
                }

            } else if (choix == 2) {
                biblio.afficherDocuments();

            } else if (choix == 3) {
                System.out.print("Numero d'enregistrement a supprimer : ");
                int numEnrg = sc.nextInt();

                Document doc = biblio.document(numEnrg);

                if (doc == null) {
                    System.out.println("Document introuvable.");
                } else {
                    boolean ok = biblio.supprimer(doc);
                    System.out.println(ok ? "Supprime avec succes." : "Echec de la suppression.");
                }

            } else if (choix == 4) {
                biblio.afficherAuteurs();

            } else if (choix == 5) {
                System.out.print("Numero d'enregistrement recherche : ");
                int numEnrg = sc.nextInt();
                Document doc = biblio.document(numEnrg);
                System.out.println(doc != null ? "Trouve : " + doc : "Aucun document avec ce numero.");

            } else if (choix == 0) {
                System.out.println("Au revoir.");

            } else {
                System.out.println("Choix invalide.");
            }
        }

        sc.close();
    }
    
}
