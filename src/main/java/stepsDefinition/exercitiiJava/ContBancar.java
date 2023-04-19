package stepsDefinition.exercitiiJava;

public class ContBancar extends Client{
    private String numeContBancarAlias;
    private int numarContBancar;
    private double valoareCont;

    public ContBancar(String numeClient, String adresaClient, String numeContBancarAlias, int numarContBancar,
                      double valoareCont) {
        super(numeClient, adresaClient);
        this.numeContBancarAlias = numeContBancarAlias;
        this.numarContBancar = numarContBancar;
        this.valoareCont = valoareCont;
    }

    public String getNumeContBancarAlias() {
        return numeContBancarAlias;
    }

    public int getNumarContBancar() {
        return numarContBancar;
    }

    public double getValoareCont() {
        return valoareCont;
    }

    public void setValoareCont(double valoareCont) {
        this.valoareCont = valoareCont;
    }

    public void alimentareContBancar(double sumaDeBani){
        if (sumaDeBani>0){
//            setValoareCont(this.valoareCont+sumaDeBani);
            valoareCont = valoareCont + sumaDeBani;
            System.out.println("Contul a fost alimentat cu "+ sumaDeBani + " iar contul are valoarea " + valoareCont);
        }
        else System.out.println("Contul nu a fost alimentat. Suma este invalida");
    }
    public int scadere(double sumaDeBani){
        if(sumaDeBani>0){
            if(valoareCont-sumaDeBani>0){
                valoareCont=valoareCont-sumaDeBani;
                return 1;
            }
            else return -1;
        }
        else return 0;
    }

    public void retragereSuma(double sumaDeBani){
        if(scadere(sumaDeBani)==1){
            System.out.println("Contului i s-au retras "+ sumaDeBani + " lei, astfel contul are valoarea " + valoareCont);
        } else if (scadere(sumaDeBani)==-1) {
            System.out.println("Fonduri insuficiente! Contul tau are valoarea: " + valoareCont);
        }
        else System.out.println("Suma introdusa nu este corecta");

//        if(sumaDeBani>0) {
//            if (valoareCont-sumaDeBani > 0) {
//                valoareCont = valoareCont - sumaDeBani;
//                System.out.println("Contului i s-au retras "+ sumaDeBani + " lei, astfel contul are valoarea " + valoareCont);
//            }
//            else System.out.println("Fonduri insuficiente! Contul tau are valoarea: " + valoareCont);
//        }
//        else System.out.println("Suma introdusa nu este corecta.");
    }

    public void exchange(String moneda){
        switch (moneda){
            case "EURO"->{
                setValoareCont(getValoareCont()/5);
                System.out.println("Valoarea contului in EURO este: " + getValoareCont());
            }
            case "LIRE"->{
                setValoareCont(getValoareCont()/5.6);
                System.out.println("Valoarea contului in LIRE este: " + getValoareCont());
            }
            default -> System.out.println("Valoarea contului Ron este: " + getValoareCont());
        }
    }

    public void plataFactura(double sumaDeBani){
        if(scadere(sumaDeBani)==1){
            System.out.println("Factura de "+ sumaDeBani + " lei, a fost platita! Astfel contul are valoarea " + valoareCont);
        } else if (scadere(sumaDeBani)==-1) {
            System.out.println("Fonduri insuficiente! Contul tau are valoarea: " + valoareCont);
        }
        else System.out.println("Factura a fost platita deja.");
    }

//        if(sumaDeBani>0) {
//            if (valoareCont-sumaDeBani > 0) {
//                valoareCont = valoareCont - sumaDeBani;
//                System.out.println("Factura de "+ sumaDeBani + " lei, a fost platita! Astfel contul are valoarea " + valoareCont);
//            }
//            else System.out.println("Fonduri insuficiente! Contul tau are valoarea: " + valoareCont);
//        }
//        else System.out.println("Factura a fost platita deja.");
//    }

}
