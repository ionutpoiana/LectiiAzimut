package stepsDefinition;

public class AnimalClass {
    public static void main(String[] args){
        String numePisica = "Toto";
        String numeCatel = "Rex";
        int k = 1;
        char litera = 'A';

        System.out.println(numePisica);
        System.out.println(numeCatel);
        System.out.println(k);
        System.out.println(litera);
        System.out.println(numePisica == numeCatel);

        // !=	If the values of two operands are not equal, then condition becomes true.	(A != B) is true
        System.out.println(numePisica != numeCatel);
        System.out.println(numePisica != Integer.toString(k));

        // Sa se calculeze suma
        int b = 345;
        double c = 34.5;
        System.out.println(b+c);

        // Sa se continue fraza
        String fraza = "Vreau sa devin tester pentru ca ";
        String continuare = "imi place domeniul IT!";

        System.out.println(fraza+continuare);

        // sa se verifice daca cuvantul pepiniera contine litera m
        System.out.println("pepiniera".contains("m"));
        String brazi ="pepiniera";
        System.out.println(brazi.contains("m"));

        // Demonstrati ca numarul 33 este impar
        int a=33;
        System.out.println(a % 2);

        // 1kg capsuni costa 10 lei, sa se calculeze pretul a 2,5 kg
        System.out.println("2,5kg de capsuni costa: " + (10 * 2.5) + " lei ");

        // Daca pretul unui buchet de flori este 50 de lei...
        double buchetPretFinal = 50 - 0.11*50;
        System.out.println("Buchetele vor costa: " + buchetPretFinal + " lei ");

        // O masina consuma 11 litri la 100 km. In rezervor mai sunt 20 de litri si mai sunt de parcurs 257km.
        // Cati km se pot parcurge cu rezervorul actual?
        // De cata benzina mai este nevoie, pentru a parcurge si restul distantei ramase?
        double q=11;
        int x=100;
        int y=20;
        double z=257;
        System.out.printf("Se mai pot pargurge: " +(x*y/q) + " km ");
    }
}