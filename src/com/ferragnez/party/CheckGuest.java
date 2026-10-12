package com.ferragnez.party;

import java.util.Scanner;

public class CheckGuest {
    public static void main(String[] args) {

        String[] invitati = {
            "Dua Lipa",
            "Paris Hilton",
            "Manuel Agnelli",
            "J-Ax",
            "Francesco Totti",
            "Ilary Blasi",
            "Bebe Vio",
            "Luis",
            "Pardis Zarei",
            "Martina Maccherone",
            "Rachel Zeilic"
        };

        Scanner in = new Scanner(System.in);

        System.out.print("Come ti chiami? ");
        String nome = in.nextLine();

        boolean trovato = false;

        for (int i = 0; i < invitati.length; i++) {

            if (invitati[i].equalsIgnoreCase(nome)) {
                trovato = true;
                break;
            }
        }

        if (trovato) {
            System.out.println("Benvenuto alla festa!");
        } else {
            System.out.println("Mi dispiace, non sei nella lista!");
        }

        in.close();
    }

}
