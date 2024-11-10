public class Moto extends Veicolo {
    //attributo aggiunto
    String tipoManubrio;


    /**
     * aggiungo costruttore che inizializza tutti gli attributi inclusi quelli della superclass
     * @param marca
     * @param modello
     * @param velocitaMassima
     * @param annoProduzione
     * @param tipoManubrio
     */
    public Moto(String marca, String modello, int velocitaMassima, int annoProduzione, String tipoManubrio){
        super(marca, modello, velocitaMassima, annoProduzione);
        this.tipoManubrio = tipoManubrio;
    }
    //sovrascrivo metodo della superclass (Override)
    @Override
    public void mostraInfo(){
        super.mostraInfo();
        System.out.println("Tipo Manubrio: " + tipoManubrio);
    }
}
