package stepsDefinition.Lectia34;

public class TestareJUnit {

    public static void tiparireInt(int tiparireNumar){
        System.out.println(tiparireNumar);
    }

    public static void tiparireString(String tiparireString){
        System.out.println(tiparireString);
    }

    public int maxim(int[] multimeNumere){
        int maxim=0;
        for(int i=0; i < multimeNumere.length; i++){
            if (multimeNumere[i]>maxim) {
                maxim = multimeNumere[i];
            }
        }
        tiparireInt(maxim);
        return maxim;
    }

    public static int repetareCuvinte(String[] sirDeCaractere, String cuvantCautat){
        int x = 0;
        for (String i : sirDeCaractere){
            if (i.contains(cuvantCautat)){
                x++;
            }
        }
        tiparireInt(x);
        return(x);
    }

    public static String concatenare (String[] sirDeCaractere){
        String sirConcatenat = "";
        for (String i : sirDeCaractere){
            sirConcatenat=sirConcatenat.concat(i);
        }
        tiparireString(sirConcatenat);
        return sirConcatenat;
    }

    //-------------------------------------------------------------------------
    public int sumaNumere(int a, int b){
        tiparireInt(a+b);
        return(a+b);
    }
}
