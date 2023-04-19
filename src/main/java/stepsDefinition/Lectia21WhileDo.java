package stepsDefinition;

public class Lectia21WhileDo {
    public static void main(String[] args) {

        String sirDeCaractere = "Acesta este un sir de caractere";
        String[] curs = {"Testare", "Manuala", "Automata"};

        //------------------------ STRUCTURI REPETITIVE -----------------------------

        //----------------- WHILE  --------------------------------

        //numere intregi
        int i = 0;
        while (i < 20) {
            i = i+1;
            System.out.println(i);
        }

        i = 0;
        System.out.println(sirDeCaractere.length());
        while (sirDeCaractere.length()<=31){
            i++; // 0 + 1 = 1
            System.out.println(sirDeCaractere.charAt(i)); // 1
        }

        i = -1;
        System.out.println(curs.length); // 3
        while (curs.length<=3){
            i++; //
            System.out.println(curs[i]); // curs[] =
        }

        int[] nrDocumente = {453, 456, 77, 65};

        int numar = 3;
        i = 0;
        while (numar !=0){ // 3 != 0 -> true    //   2 ! = 0 -> true // 1!=0 -> true
            if (nrDocumente[i] != 77){ // nrDocumente[0] = 453    !=77  -> true    // nrDOcumente[1] 456 != 77 -> true // nrDOcumente[2] 77 !=77 -> false
                i++; // i= 0+1 = 1  // 1 + 1 = 2
                System.out.println(nrDocumente[i]); // nrDocumente[1] = 456  // nrDocumnete[2] = 77
                numar--; // decrementare   3-1 = 2 // 2-1 = 1
            }
            else break;
        }

        //----------------- DO  --------------------------------
        do
        {
            System.out.println(curs[i]);
            i--;
        } while (curs.length>2);

        //-----------------------------------------------------
        //------------------------ EXERCITII WHILE-----------------------------

        // Se da un sir de numere intregi.
        int[] exercitiulUnu = {34, 67, 45, 3, 10, 2, 90};

        // Sa se determine si sa se afiseze valoarea maxima din acest sir.
        i=0; // 0
        int maxim=0; // 0
        System.out.println(exercitiulUnu.length); // 7
        while (i < exercitiulUnu.length){ // 0 < 7 -> true // 1<7 -> true // 2<7  // 3<7 //...// 6<7 // 7<7
            if (exercitiulUnu[i]>maxim) { // exercitiulUnu[0]=34 > 0 -> true [1]  67 > 34 // 45 > 67 // [3] 3>67 // .. // 90 > 67
                maxim = exercitiulUnu[i]; // maxim = 34 // 67 // 67 // 67 // .. // 90
            }
            i++; // 1 // 2 // 3 // 4 // .. // 7
        }
        System.out.println("Valoarea maxima a sirului este: " + maxim); // 90

        // Sa se determine si sa se afiseze valoarea minima din acest sir.
        i=0;
        int minim=exercitiulUnu[0];
        while (i < exercitiulUnu.length){
            if (exercitiulUnu[i]<minim) {
                minim = exercitiulUnu[i];
            }
            i++;
        }
        System.out.println("Valoarea minima a sirului este: " + minim);

        //------------------------ EXERCITII DO -----------------------------

        i=0;
        maxim = 0;
        do{
            if (exercitiulUnu[i]>maxim) {
                maxim = exercitiulUnu[i];
            }
            i++;
        } while (i<exercitiulUnu.length);

        System.out.println("Valoarea maxima a sirului este: " + maxim);

        //-----------------------------------------------------

        i=0;
        minim=exercitiulUnu[0];
        do
        {
            if (exercitiulUnu[i]<minim) {
                minim = exercitiulUnu[i];
            }
            i++;
        } while (i < exercitiulUnu.length);

        System.out.println("Valoarea minima a sirului este: " + minim);
    }
}