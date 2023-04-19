package stepsDefinition;

public class Lectia27 {

    public static void tiparireInt(int tiparireNumar){
        System.out.println(tiparireNumar);
    }
    public static void tiparireStr(String parametru){
        System.out.println(parametru);
    }

//    public static int maxim(int[] multimeNumere){
//        int nrMaxim = 0;
//        for (int i = 0; i < multimeNumere.length; i++) {
//            if (multimeNumere[i] > nrMaxim) {
//                nrMaxim = multimeNumere[i];
//            }
//        }
//        tiparireInt(nrMaxim);
//        return nrMaxim;
//    }
//    public static void main(String[] args) {
//        int[] exercitiulUnu = {34, 67, 45, 3, 10, 2, 90};
//        maxim(exercitiulUnu);
//    }

    public static String concatenare (String[] sirDeCaractere){
        String sirConcatenat = "";
        for (String i : sirDeCaractere){
            sirConcatenat=sirConcatenat.concat(i);
        }
        return sirConcatenat;
    }
    public static int repetareCuvinte(String[] sirDeCaractere, String cuvantCautat){
        int x = 0;
        for (String i : sirDeCaractere){
            if (i.contains(cuvantCautat)){
                x++;
            }
        }
        return(x);
    }

    public static void main(String[] args) {
        String[] primavara = {"Astazi incepe primavara!", "Astazi este 1 martie", "Astazi este miercuri"};
        tiparireStr("Se da urmatorul sir: ");
        tiparireStr(primavara[0]);
        tiparireStr(primavara[1]);
        tiparireStr(primavara[2]);
        tiparireStr("Cuvantul \"Astazi\" se repeta de "+repetareCuvinte(primavara,"Astazi")+" ori");
        tiparireStr("Concatenarea sirului: " +concatenare(primavara));
    }
}
