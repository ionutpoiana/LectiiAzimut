package stepsDefinition.oopLectia27si28;


import java.util.Scanner;

public class ExercitiuContBancar {

    public static void printStr(String parametruStr){
        System.out.println(parametruStr);
    }

    public static void main(String... args){
        // cont cu datele definite in constructor07
        printStr("--------Cont folosind datele definite in constructor---------");
        ContBancar2 cont1 = new ContBancar2();
        printStr("Numarul contului este: "+cont1.getNumarCont());
        printStr("Balanta contului este: "+cont1.getBalanta()+" RON");
        printStr("Numele clientului ce detine contul este: "+cont1.getNumeClient());
        printStr("Adresa de e-mail a clientului este: "+cont1.getEmail());
        printStr("Numarul de telefon al clientului este: "+cont1.getNumarTelefon()+"\n");


        //cont cu reinitializarea datelor
        printStr("--------Cont cu noi date setate cu depunere si retragere numerar--------");
        ContBancar2 cont2 = new ContBancar2();
        cont2.setNumarCont(35615);
        cont2.setBalanta(3450.4);
        cont2.setEmail("popescu.ion@gmail.com");
        cont2.setNumeClient("Popescu Ion");
        printStr("Pentru identificare introduceti numarul de telefon si apasati tasta Enter: ");
        Scanner nrTel = new Scanner(System.in);
        cont2.setNumarTelefon(nrTel.next());
        printStr("Ati introdus numarul: "+cont2.getNumarTelefon());
        printStr("Buna ziua domnule "+ cont2.getNumeClient());
        printStr("Numarul contului dumneavoastra este: "+cont2.getNumarCont());
        printStr("Adresa de email inregistrata in sistem este: "+cont2.getEmail());
        printStr("Balanta contului dumneavoastra este: "+cont2.getBalanta()+" RON");

        //Depunere numerar
        printStr("Introduceti suma dorita pentru depunere: ");
        Scanner depunereNumerar = new Scanner(System.in);
        double sumaDepusa = depunereNumerar.nextDouble();
        printStr("Ati depus: "+sumaDepusa+" RON");
        cont2.setBalanta(cont2.getBalanta()+sumaDepusa);
        printStr("Noua balanta este: "+cont2.getBalanta()+" RON");
        printStr("Va multumim!\n");

        //Retragere numerar din balata definita mai sus dupa depunere
        printStr("------Retragere numerar din balanta definita mai sus -----");
        printStr("Introduceti suma dorita pentru retragere: ");
        Scanner retragereNumerar = new Scanner(System.in);
        double sumaRetrasa = retragereNumerar.nextDouble();
        cont2.setBalanta(cont2.getBalanta()-sumaRetrasa);
        printStr("Va multumim!");
    }
}
