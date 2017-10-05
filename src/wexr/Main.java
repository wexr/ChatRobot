package wexr;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here


        Scanner input = new Scanner(System.in);

        System.out.println("Indtast dit navn:");
        String navn = input.nextLine();

        System.out.println("Goddag " + navn + ". Hvad kan jeg gøre for dig?");
        System.out.println("                   Skriv help for hjælp.");

        String tekst = input.nextLine();

        while (! tekst.toLowerCase().contains("stop dig selv")) {

            if(tekst.toLowerCase().contains("hvad er dit navn?"))
                System.out.println("Mit navn er Flotte Bot");

            else if (tekst.toLowerCase().contains("hvor gammel er du?"))
                    System.out.println(navn + " altså! Alder er bare et tal! tihi");

                else if (tekst.toLowerCase().contains("hvem er den bedste lærer?"))
                    System.out.println("Den bedste lærer er András som underviser i Programmering.");
                else if (tekst.toLowerCase().contains("help")) {

                System.out.println("Følgende kommandoer virker: ");
                System.out.println("hvad er dit navn?");
                System.out.println("hvor gammel er du?");
                System.out.println("hvem er den bedste lærer?");
                System.out.println("stop dig selv");

            }
            else
                System.out.println("Jeg forstår desværre ikke hvad du siger");

            tekst = input.nextLine();

        }
        System.out.println("Farvel " + navn + ". Du må have en god dag.");
    }
}
