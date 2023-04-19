package stepsDefinition;

public class Lectia21For {
    public static void main(String[] args) {
        String sirDeCaractere = "Acesta este un sir de caractere";
        int[] nrDocumente = {453, 456, 77, 65};
        String[] curs = {"Testare", "Manuala", "Automata"};

        //  ------------------------ STRUCTURI REPETITIVE -----------------------------

        //----------------- FOR  --------------------------------

        //siruri de caractere
        for (int i=0; i<sirDeCaractere.length(); i++) {
            System.out.println(sirDeCaractere.charAt(i));
        }

        //numere intregi
        for (int i=0; i< nrDocumente.length; i++) {
            System.out.println(nrDocumente[i]);
        }

        //vectori
        for (int i=0; i< curs.length; i++) {
            System.out.println(curs[i]);
        }


        //forEach format
        for (int i=0; i< nrDocumente.length; i++) {
            System.out.println(nrDocumente[i]);
        }
        for (int i : nrDocumente ){
            System.out.println(nrDocumente[i]);
        }


        for (int i=0; i< curs.length; i++) {
            System.out.println(curs[i]);
        }
        for(String i : curs){
            System.out.println(curs[Integer.parseInt(i)]);
        }


        //----------------- EXERCITII --------------------------------
        // Se da un sir de numere intregi.
        int[] exercitiulUnu = {34, 67, 45, 3, 10, 2, 90};

        // Sa se determine si sa se afiseze valoarea maxima din acest sir.
        int maxim=0;
        for(int i=0; i < exercitiulUnu.length; i++){ // i = 0 // i=1
            if (exercitiulUnu[i]>maxim) { // 34 > 0 //  67 > 34
                maxim = exercitiulUnu[i]; // maxim = 34 // 67
                System.out.println("Maximul la pasul " + i + " este " + maxim);
            }
            System.out.println("Variabila noastra la pasul " + i + " este " + maxim);
        }
        System.out.println("Valoarea maxima a sirului este: " + maxim);

        // Sa se determine si sa se afiseze valoarea minima din acest sir.
        int minim=exercitiulUnu[0];
        for (int i=0; i < exercitiulUnu.length; i++){
            if (exercitiulUnu[i]<minim) {
                minim = exercitiulUnu[i];
            }
        }
        System.out.println("Valoarea minima a sirului este: " + minim);

    }
}