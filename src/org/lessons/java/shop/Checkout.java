// Creare la classe Prodotto che gestisce i prodotti dello shop.✅
//Un prodotto è caratterizzato da://- codice (numero intero) ✅//- nome ✅//- descrizione ✅//- prezzo ✅//- iva ✅

//Usate opportunamente i livelli di accesso (public, private), i costruttori, i metodi getter e setter ed eventuali altri metodi di “utilità” per fare in modo che:
//- il codice prodotto sia accessibile solo in lettura ✅
//- gli altri attributi siano accessibili sia in lettura che in scrittura ✅
//- il prodotto esponga sia un metodo per avere il prezzo base che uno per avere il prezzo comprensivo di iva  ✅
//Lo shop gestisce diversi tipi di prodotto:
//- Smarphone, caratterizzati anche dal codice IMEI e dalla quantità di memoria ✅
//- Televisori, caratterizzati dalle dimensioni e dalla proprietà di essere smart oppure no ✅
//- Cuffie, caratterizzate dal colore e se sono wireless o cablate ✅

//Utilizzate l’ereditarietà per riutilizzare il codice di Prodotto nella stesura delle classi che gestiscono i vari sotto tipi di prodotto. ✅
//Create una classe Carrello con metodo main, ✅
//in cui chiedete all’utente di valorizzare un carrello di prodotti con dati inseriti tramite scanner.
// Durante la richiesta di valorizzazione chiedete all’utente se sta inserendo uno Smarphone o un Televisore o Cuffie
// e in base alla scelta dell’utente utilizzate il costruttore opportuno.
// Al termine dell’inserimento stampate il riepilogo del carrello
// (fate l’override del metodo toString per restituire le informazioni da stampare per ogni classe)

//BONUS:
// Aggiungete alla classe Prodotto un metodo per il calcolo del prezzo scontato per clienti con tessera fedeltà, che applica al prezzo uno sconto del 2%.
//Per gli Smartphone, lo sconto è del 5% se la quantità di memoria è inferiore a 32GB, altrimenti rimane del 2%.
//Per i Televisori lo sconto è del 10% se la televisione non è smart, altrimenti rimane del 2%.
//Per le Cuffie lo sconto è del 7% se sono cablate, altrimenti rimane del 2%.
//Nella classe Carrello chiedere all’utente se possiede una carta fedeltà
//In base alla risposta, calcolare il totale del carrello come somma dei prezzi base o dei prezzi scontati.

package org.lessons.java.shop;

import java.util.Scanner;

public class Checkout {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        // Scelta prodotto
        System.out.print("What type of product do you want to add to your shopping cart?\n 1-Tv 2-Headphones 3-Smartphone  ");
        String myProductChoice = scan.nextLine();

        //Creazione prodotto(param del prodotto)
        System.out.print("What is your product's name?  ");
        String myProductName = scan.nextLine();

        System.out.print("What is your product's description?  ");
        String myProductDescription = scan.nextLine();

        System.out.print("What is your product's price?  ");
        int myProductPrice = scan.nextInt();
        scan.nextLine(); // toglie il carattere invio (Grazie Francesco!!)

        System.out.print("What is your product's vat percentage?  ");
        int myProductVat = scan.nextInt();
        scan.nextLine();

        switch (myProductChoice) {
            case "1" -> {
                System.out.print("add your inch size:  ");
                int dimensionChoiced = scan.nextInt();
                scan.nextLine();

                boolean isSmart = false;
                boolean validChoice = false;

                while(!validChoice) {
                    System.out.println("Is it a Smart Tv? press 1 for YES or 2 for NO");
                    int choice = scan.nextInt();
                    scan.nextLine();

                    if(choice == 1) {
                        isSmart = true;
                        validChoice = true;
                    }else if (choice == 2) {
                        isSmart = false;
                        validChoice = true;
                    } else {
                        System.out.println("Invalid input, please press 1 for YES or 2 for NO");

                    }
                }
                // new TV
                Tv tv = new Tv(myProductName, myProductDescription, myProductPrice, myProductVat, dimensionChoiced, isSmart );
                System.out.println(tv.toString());
            }
            case "2" -> {
                System.out.println("What color do you like?");
                String colorChoiced = scan.nextLine();

                boolean isWireless = false;
                boolean validChoice = false;

                while(!validChoice) {
                    System.out.println("Is it a wireless headphone? press 1 for YES or 2 for NO");
                    int choice = scan.nextInt();
                    scan.nextLine();

                    if (choice == 1) {
                        isWireless = true;
                        validChoice = true;
                    } else if (choice == 2) {
                        isWireless = false;
                        validChoice = true;
                    } else {
                        System.out.println("Invalid input, please press 1 for YES or 2 for NO");

                    }
                }
                // new Headphones
                Headphones earphones = new Headphones(myProductName, myProductDescription, myProductPrice, myProductVat, colorChoiced, isWireless );
                System.out.println(earphones.toString());
            }
            case "3" -> {
                System.out.println("What's the imei number");
                int imeiChoosed = scan.nextInt();
                scan.nextLine();

                System.out.println("What memory size would you like?");
                int memoryChoosed = scan.nextInt();
                scan.nextLine();

                // new Smartphone
                Smartphone mobile = new Smartphone(myProductName, myProductDescription, myProductPrice, myProductVat, imeiChoosed, memoryChoosed );
                System.out.println(mobile.toString());
            }
            default -> System.out.println("Invalid input");
        }
        scan.close();



    }
}
