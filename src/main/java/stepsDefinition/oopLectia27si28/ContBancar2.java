package stepsDefinition.oopLectia27si28;


public class ContBancar2 {

    private int numarCont;
    private double balanta;
    private String numeClient;
    private String email;
    private String numarTelefon;

    public ContBancar2(){
        this.numarCont = 123456;
        this.balanta = 5153.53;
        this.numeClient = "Georgescu Marian";
        this.email = "m.georgescu@gmail.com";
        this.numarTelefon = "0767123456";
    }


    public void setNumarCont(int numarCont) {
        this.numarCont = numarCont;
    }

    public void setBalanta(Double balanta) {
        if (balanta > 400) {
            this.balanta = balanta;
        } else if (balanta>100 && balanta<400) {
            System.out.println("Ati retras suma cu succes. Mai aveti fonduri limitate in valoare de: " + balanta);
        } else {
            System.out.println("Fonduri insuficiente!");
        }
    }


    public void setNumeClient(String numeClient) {
        this.numeClient = numeClient;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setNumarTelefon(String numarTelefon) {
        if (numarTelefon.length()==10){
            this.numarTelefon = numarTelefon;
        }
        else {
            System.out.println("Nu ati introdus un numar de telefon valid!");
            System.exit(0);
        }
    }

    public int getNumarCont() {
        return numarCont;
    }

    public Double getBalanta() {
        return balanta;
    }

    public String getNumeClient() {
        return numeClient;
    }
    public String getEmail() {
        return email;
    }

    public String getNumarTelefon() {
        return numarTelefon;
    }
}
