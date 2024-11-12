//creo sottoclasse Auto che estende la classe Veicolo
//con extends ho gli attributi pubblici e privati della classe Veicolo
public class Auto extends Veicolo {
    //la subclass Auto eredita in automatico attributi e metodi della superclass Veicolo

    //attributo aggiunto della subclass
    private int numeroPorte;


    /**
     * costruttore che inizializza tutti gli attributi inclusi quelli della superclass
     * @param marca
     * @param modello
     * @param velocitaMassima
     * @param annoProduzione
     * @param numeroPorte
     */
    public Auto(String marca,String modello,int velocitaMassima, int annoProduzione, int numeroPorte) {
       super(marca,modello,velocitaMassima,annoProduzione); //richiamo il costurttore della superclass dove inizializzo quei campi
       this.numeroPorte = numeroPorte; //inizializzo attributo aggiunto
   }


    /**
     * altro costruttore per nuova auto
     * @param marca
     * @param modello
     * @param annoProduzione
     */
    public Auto(String marca,String modello, int annoProduzione) {
        super(marca,modello,annoProduzione); //richiamo costruttore vuoto della superclass
        numeroPorte = 4;
    }


   //sovrascrivo metodo della superclass(override)
    @Override
    public void mostraInfo(){
       super.mostraInfo();
       System.out.println("Numero porte: "+numeroPorte);

    }


    //metodo avvia che sovrascrive quello della superclass
    @Override
    public void avvia(){
        super.avvia();
        System.out.println("L'auto è pronta per partire!");
    }
}
