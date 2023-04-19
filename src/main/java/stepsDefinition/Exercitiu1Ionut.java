package stepsDefinition;

import java.util.Scanner;

public class Exercitiu1Ionut {
    public static void main(String[] args){

        String cerinta = "De ce este testarea necesară?";
        String rasp1 = "să prevină defectele";
        String rasp2 = "să reducă cantitatea de defecte din producție";
        String rasp3 = "să asigure că defectele din producție nu afectează financiar compania (profitabilitatea)";
        String rasp4 = "să crească calitatea produsului software";
        String rasp5 = "să se asigure ca cerințele sunt implementate complet și corect";
        String rasp6 = "să valideze că produsul se comportă în concordanță cu scopul acestuia";
        String rasp7 = "să mențină reputația companiei";
        String cuvant1 = "defectele";
        String cuvant2 = "să";
        String cuvant3 = "asigure";
        String text = cerinta+rasp1+rasp2+rasp3+rasp4+rasp5+rasp6+rasp7;

        // a. Determinați dacă textul conține cuvintele: „defectele”, „să”, „asigure”;
        System.out.println("a. Determinați dacă textul conține cuvintele: „defectele”, „să”, „asigure”;");
        if ((text).contains(cuvant1)){
            System.out.println("Textul conține cuvântul: \"" + cuvant1 + "\";");
        }
        else {
            System.out.println("Textul nu conține cuvântul \": " + cuvant1 + "\";");
        }
        if ((text).contains(cuvant2)) {
            System.out.println("Textul conține cuvântul: \"" + cuvant2 + "\";");
        }
        else {
            System.out.println("Textul nu conține cuvântul: \"" + cuvant2 + "\";");
        }
        if ((text).contains(cuvant3)) {
            System.out.println("Textul conține cuvântul: \"" + cuvant3 + "\";");
        }
        else {
            System.out.println("Textul nu conține cuvântul: \"" + cuvant3 + "\";");
        }
        System.out.println("\n");

        // b. Să se determine numărul de caractere din frazele de la punctele: 1, 3, 5, 7;
        System.out.println("b. Să se determine numărul de caractere din frazele de la punctele: 1, 3, 5, 7;");
        System.out.println("Fraza de la punctul 1 conține " + rasp1.length() + " de caractere.");
        System.out.println("Fraza de la punctul 3 conține " + rasp3.length() + " de caractere.");
        System.out.println("Fraza de la punctul 5 conține " + rasp5.length() + " de caractere.");
        System.out.println("Fraza de la punctul 7 conține " + rasp7.length() + " de caractere.");
        System.out.println("Frazele de la punctele 1,3,5 si 7 conțin împreună " + (rasp1+rasp3+rasp5+rasp7).length()
                + " de caractere.");
        System.out.println("\n");

        // c. Cât % din numărul total de caractere al textului au frazele de la punctele 2 și 4;
        System.out.println("c. Cât % din numărul total de caractere al textului au frazele de la punctele 2 și 4;");
        System.out.println("Textul conține " + text.length() + " de caractere." );
        System.out.println("Frazele de la punctele 2 si 4 conțin împreună: " +(rasp2+rasp4).length()+" de caractere.");
        System.out.println("Caracterele frazelor de la punctele 2 și 4 reprezintă " +
                ((rasp2+rasp4).length()*100/text.length()) + "% din totalul de caractere din text.");
        System.out.println("\n");

        // d. Cum ar arăta o structură condițională dacă s-ar atribui câte un adjectiv fiecărui punct din text?
        System.out.println("d. Cum ar arăta o structură condițională dacă s-ar atribui câte un adjectiv fiecărui " +
                "punct din text?");

        //Tastati un adjectiv in consola
        System.out.println("Scrieti un adjectiv: ");
        String adjectiv;
        Scanner adjectivNou = new Scanner(System.in);
        adjectiv = adjectivNou.next();

        System.out.println("Ai scris adjectivul: \"" +adjectiv+ "\" astfel rezultatul structurii condiționale este: ");
        switch (adjectiv) {
            case "preventiva" -> {
                System.out.println(rasp1);
            }
            case "cantitativa" -> {
                System.out.println(rasp2);
            }
            case "profitabila"-> {
                System.out.println(rasp3);
            }
            case "calitativa" -> {
                System.out.println(rasp4);
            }
            case "asiguratoare" -> {
                System.out.println(rasp5);
            }
            case "valida" -> {
                System.out.println(rasp6);
            }
            case "reputabila" -> {
                System.out.println(rasp7);
            }
            default -> {
                System.out.println("Nu ai scris adjectivul adecvat. Mai incearcă!");
            }
        }
    }
}
