//creo la classe base Veicolo
public class Veicolo {

    //creo attributi della classe Veicolo
    private String marca;
    private String modello;
    private int velocitaMassima;
    private int annoProduzione;

    /**
     * Costruttore parametrico
     * @param marca veicolo
     * @param modello veicolo
     * @param velocitaMassima raggiunta dal veicolo
     * @param annoProduzione del veicolo
     */
    public Veicolo(String marca, String modello, int velocitaMassima, int annoProduzione) {
        this.marca = marca; //inizializzo. Con this. accedo all'attributo della classe e lo distinguo dal parametro
        this.modello = modello;
        this.velocitaMassima = velocitaMassima;
        this.annoProduzione = annoProduzione;
    }

    /**
     * Costruttore vuoto
     */
    //public Veicolo() {} //faccio un costruttore senza parametri per il main dove ho istanziato

    /**
     * altro costruttore
     * @param marca
     * @param modello
     * @param annoProduzione
     */
    public Veicolo(String marca, String modello, int annoProduzione){
        this.marca = marca;
        this.modello = modello;
        this.annoProduzione = annoProduzione;
    }


    //creo metodo che stampa le informazioni del veicolo
    public void mostraInfo( ) { //non passo parametri perchè non è necessario ai fini del metodo perchè ha già le info che servono
        System.out.println("Marca: " + this.marca); //this qui è opzionale ma lo uso per indicare che sto accedendo ai campi dell'oggetto
        System.out.println("Modello: " + this.modello);
        System.out.println("velocità massima: " + this.velocitaMassima);
        System.out.println("annoProduzione: " + this.annoProduzione);
    }   //NB qui posso accedere direttamente alle variabili private senza usare get perchè sono nella stessa classe
    //creo metodo che stampa "il veicolo è stato avviato
    public void avvia(){
        System.out.println("Il veicolo è stato avviato");
    }

    //metodi getter e setter per la modifica e la lettura dei campi
    //set è un mutatore
    //getter è un accessore
    public void setMarca(String marca) {
        //modifica l'attributo marca
        this.marca=marca;
    }
    public void setModello(String modello) {
        this.modello=modello;
    }
    public void setVelocitaMassima(int velocitaMassima){
        this.velocitaMassima=velocitaMassima;
    }
    public void setAnnoProduzione(int annoProduzione){
        this.annoProduzione=annoProduzione;
    }

    public String getMarca(){
        //restituisce il valore di marca
        return marca;
    }
    public String getModello(){
        return modello;
    }
    public int getVelocitaMassima(){
        return velocitaMassima;
    }
    public int getAnnoProduzione(){
        return annoProduzione;
    }

    //aggiungo metodo che aggiorna la velocità massima con nuovaVelocità
    public void aggiornaVelocitaMassima(int nuovaVelocita) {
       this.velocitaMassima = nuovaVelocita;
    }
}
