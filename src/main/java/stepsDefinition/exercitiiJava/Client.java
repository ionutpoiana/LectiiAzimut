package stepsDefinition.exercitiiJava;

public class Client {
    //Vom exersa notiunile de Java invatate pana acum prin efectuarea platii unei facturi
    // Pentru asta avem nevoie de un client, o factura si un cont bancar.
    // Astfel, vom crea un client, caruia ii vom da un nume si o adresa.
    // Clientului ii vom asocia un cont bancar, ce va cuprinde atat datele clientului, cat si informatii despre
    // numele contului(alias), numarul contului si suma de bani in lei.
    // Astfel, vom putea alimenta contul bancar, vom putea retrage o anumita suma si vom putea converti suma din LEI in EURO
    // Apoi, vom crea si o factura, ce va contine datele clientului, numarul de client, data emiterii si suma datorata
    // pe care clientul o va putea plati.

    private String numeClient;
    private String adresaClient;

    public Client(String numeClient, String adresaClient) {
        this.numeClient = numeClient;
        this.adresaClient = adresaClient;
    }

    public String getNumeClient() {
        return numeClient;
    }

    public String getAdresaClient() {
        return adresaClient;
    }

    public void setNumeClient(String numeClient) {
        this.numeClient = numeClient;
    }
}
