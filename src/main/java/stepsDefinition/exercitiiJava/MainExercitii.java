package stepsDefinition.exercitiiJava;

import java.util.Date;

public class MainExercitii {
    public static void printStr(String paramStr){
        System.out.println(paramStr);
    }
    public static void main(String[] args) {
        Client client1 = new Client("Andreea", "Bucuresti");
//        printStr(client1.getNumeClient());
//        client1.setNumeClient("alina");
//        printStr(client1.getNumeClient());

        ContBancar contAndreea = new ContBancar("Andreea", "Bucuresti", "economii",
                6969, 500);
//        contAndreea.alimentareContBancar(100);
        contAndreea.retragereSuma(100);
        contAndreea.exchange("");

//        Date dataFactura = new Date("2023-03-01");
        Factura facturaElectricitate = new Factura(client1, 3465,new Date(2023-03-01),20);
        contAndreea.plataFactura(facturaElectricitate.getTotalFactura());
    }
}
