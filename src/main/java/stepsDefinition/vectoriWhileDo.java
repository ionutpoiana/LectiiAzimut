package stepsDefinition;

import java.util.Scanner;

import static java.lang.Thread.sleep;

public class vectoriWhileDo {
    public static void main(String[] args) throws InterruptedException {
        // ---------Initizalizare Vectori---------
//        int[] numereNoi = new int[3];
//        numereNoi[0] = 20;
//        numereNoi[1] = 21;
//        numereNoi[2] = 22;

////        // ------------Initializare vectori prin introducerea lor in consola------------------

        System.out.println("----Initializare vectori si operatii cu vectori prin introducerea lor in consola----");
        Scanner in=new Scanner (System.in);
        int[] numere=new int[4];
        int i;
        for (i=0;i<numere.length;i++)
        {
            System.out.println("Introduceti un numar:");
            numere[i]=in.nextInt();
        }
        System.out.println("Ati introdus urmatoarele numere: ");
        for (i=0;i<numere.length;i++) {
            System.out.println(numere[i]);
        }
//        System.out.println("Primul numar introdus este: " + numere[0]);
//        System.out.println("Al doilea numar introdus este: " + numere[1]);
//        System.out.println("Al treilea numar introdus este: " + numere[2]);
//        System.out.println("Al patrulea numar introduse este: " +numere[3]);

        //--------------Exercitiu-- cea mai mare valoare introdusa folosind----- WHILE---------------
        i=0;
        int maxim=0;
        while(i <numere.length){
            if(numere[i] > maxim){
                maxim = numere[i];
            }
            i++;
        }
        System.out.println("Cel mai mare numar dintre cele introduse este: " + maxim);

//        -------------do---------------
        i=0;
        int minim=numere[0];
        do
        {
            if (numere[i]<minim) {
                minim = numere[i];
            }
            i++;
        } while (i < numere.length);
        System.out.println("Cel mai mic numar dintre cele introduse este: " + minim);

        //-----------------Suma numerelor introduse--------------------------------
        System.out.println("Suma numerelor introduse este: " + (numere[0]+numere[1]+numere[2]+numere[3]));


        //-----------------siruri de caractere----------------------
        System.out.println("----------Initializare siruri de caractere--------");

//        String[] caractere = {"Testare", "Manuala", "Automata"};
//        caractere[0] = "Testare";
//        caractere[1] = "Manuala";
//        caractere[2] = "Automata";

        Scanner cuvant=new Scanner (System.in);
        String[] caractere = new String[4];
        for (i=0;i<caractere.length;i++)
        {
            System.out.println("Introduceti un cuvant: ");
            caractere[i]=cuvant.next();
        }

//        i = 0;
//        System.out.println(caractere.length); // 3
//        while (caractere.length<=4){
//            i++; //
//            System.out.println(caractere[i]); // Codul da eroare la final "index out of bound"
//        }

        for (i=0;i<caractere.length;i++)
        {
            System.out.println("Ati introdus: " + caractere[i]);
        }

        System.out.println("Primul cuvant introdus este: " + caractere[0]);
        sleep(500);
        System.out.println("Al doilea cuvant introdus este: " + caractere[1]);
        sleep(500);
        System.out.println("Al treilea cuvant introdus este: " + caractere[2]);
        sleep(500);
        System.out.println("Al patrulea cuvant introdus este: " + caractere[3]);
        sleep(500);


        //----------operatii cu Siruri de caractere "subtring, charAt"---------

        System.out.println("Introduceti o propozitie: ");
        String sirDeCaractere;
        Scanner cuvinte = new Scanner(System.in);
        sirDeCaractere = cuvinte.nextLine();

        System.out.println("Introduceti un index pentru a afisa un caracter din sirul introdus mai sus: ");
        Scanner indexIn=new Scanner(System.in);
        int index=indexIn.nextInt();
//        String sirDeCaractere = "Acesta este un sir de caractere";
        System.out.println("Acesta este caracterul de la indexul introdus: \"" + sirDeCaractere.charAt(index)+"\"");
        System.out.println("Afisare caractere intre index de inceput si sfarsit: \""+sirDeCaractere.substring(0, 12)+"\"");
        System.out.println("Afisare caractere de la un index de inceput: \""+sirDeCaractere.substring(13)+"\"");
        System.out.println("Ati introdus: "+sirDeCaractere);
        System.out.println("Sirul introdus are "+sirDeCaractere.length()+" caractere!");


        //---------------WHILE--------------------
        i = 0;
        while (i < 5)
        {
            i = i+1;
            System.out.print(i);
        }

    }
}
