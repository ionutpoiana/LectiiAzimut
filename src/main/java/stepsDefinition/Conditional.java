package stepsDefinition;

public class Conditional {
    public static void main(String[] arg) {

        String ziua = "Marti";
        String actiune;
        int a = 10;
        int b = 50;
        
        switch (ziua) {
            case "Luni" ->{
                actiune = "Luni";
                System.out.println("Se merge la munca");
            }
            case "Marti" ->{
                actiune = "Marti";
                System.out.println("Reminder: Aveti de plata: "+ (a+b) + " Lei la factura!");
            }
            case "Miercuri"->{
                actiune = "Miercuri";
                System.out.println("Se merge la munca si seara avem Lectie azimut");
            }
            case "Joi" ->{
                actiune = "Joi";
                System.out.println("Iar la munca");
            }

            case "Vineri" ->{
                actiune = "Vineri";
                System.out.println("Vine Week-end-ul!!!");
            }
            case "Sambata" ->{
                actiune = "Sambata";
                System.out.println("Distractie!!!");
            }

            default ->{
                actiune = "Duminica";
                System.out.println("Lenevim!");
            }


        }



//        int x = 2;
//        int z;
//        switch (x) {
//            case 1 -> {
//                z = 1;
//                System.out.println(z);
//            }
//            case 2 -> {
//                z = 2;
//                System.out.println(z);
//            }
//            case 3 -> {
//                z = 3;
//                System.out.println(z);
//            }
//            default -> {
//                z = 4;
//                System.out.println(z);
//            }
//        }







//        int a = 10;
//        int b = 20;
//        if (a>b){
//            System.out.println(a+b);
//        }
//        else{
//            System.out.println(a-b);
//        }


        //Structuri conditionale
//        boolean miercuri = true;
//        boolean joi = false;
//        boolean vineri = true;
//
//        System.out.println(miercuri && (joi || vineri));

//        int x = 3;
//        int y = 3;
//
//        if (x>y){
//            System.out.print("Este adevarat!");
//        }
//        else if (x==y) {
//            System.out.println("Numerele sunt egale!");
//        }
//        else {
//            System.out.println("Nu este adevarat!");
//        }
////        boolean variabilaX = true;
////        boolean variabilaY = false;
//        int x = 10;
//        int y = 20;
//
//        int a = 5;
//        int b= 6;
//
////        System.out.println("AND: " + (variabilaX && variabilaY));
////        System.out.println("OR: " + (variabilaX || variabilaY));
//
//        if (x>y)
//        {
//            System.out.println("Este egal");
//        }
//        else
//        {
//            System.out.println("Nu este egal");
//
//        }
//
//        if (x>y){
//            System.out.println(a+b);
//        }
//        else{
//            System.out.println(a-b);
//        }
//
//        String wrd1 = "Eu ";
//        String wrd2 = "invat ";
//        String wrd3 = "bazele ";
//        String wrd4 = "\"programarii\"!";
//
//
//        System.out.println(wrd1.concat(wrd2).concat(wrd3).concat(wrd4));
//        System.out.println("Primul string este compus din " + wrd1.length() + " caractere");
//        System.out.println("Primul si al doilea string contin impreuna " + (wrd1.length()+wrd2.length()) + " caractere!");
//        System.out.println(wrd1.length()*wrd2.length());

    }

}