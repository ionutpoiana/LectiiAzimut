package stepsDefinition.exercitiiJava;

import java.util.Date;

public class Factura {
    // Apoi, vom crea si o factura, ce va contine datele clientului, numarul de client, data emiterii si suma datorata
    // pe care clientul o va putea plati.
    private Client client;
    private int numarClient;
    private Date dataFactura;
    private double totalFactura;

    public Factura(Client client, int numarClient, Date dataFactura, double totalFactura) {
        this.client = client;
        this.numarClient = numarClient;
        this.dataFactura = dataFactura;
        this.totalFactura = totalFactura;
    }

    public Client getClient() {
        return client;
    }

    public int getNumarClient() {
        return numarClient;
    }

    public Date getDataFactura() {
        return dataFactura;
    }

    public double getTotalFactura() {
        return totalFactura;
    }
}
