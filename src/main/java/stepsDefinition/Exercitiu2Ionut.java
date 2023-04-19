package stepsDefinition;

import java.util.Scanner;

public class Exercitiu2Ionut {
    public static void main(String[] args){
        int l = 5;
        double hl = 10;
        int x = 6;
        float y = 11;

        double ariaTriunghi = (l*hl)/2;
        double ariaTriunghidr = (x*y)/2;
        double ariaTriunghiech = Math.round((Math.pow(l,2) * Math.sqrt(3))/4);

        System.out.printf("Aria triunghiului este: %.0f\n", ariaTriunghi);
        System.out.printf("Aria triunghiului dreptunghic este: %.0f\n", ariaTriunghidr);
        System.out.printf("Aria triunghiului echilateral este: " + ariaTriunghiech +"\n");


        System.out.println("Vă rog să introduceți valoarea unei arii: ");
        double arie;
        //Introduceti valoare in consola
        Scanner valoareArie = new Scanner(System.in);
        arie = valoareArie.nextInt();

        if (arie == ariaTriunghidr ){
            System.out.println("Triunghiul este dreptunghic.");
        }
        else if (arie == ariaTriunghiech) {
            System.out.println("Triunghiul este echilateral.");
        }
        else {
            System.out.println("Acesta este un triunghi oarecare.");
        }
        System.out.println("Mulțumesc!");

    }
}
