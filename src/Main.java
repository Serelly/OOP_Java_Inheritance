import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //istanzio oggetti dalla superclass Veicolo, dalle subclass Auto e Moto

        //Veicolo v = new Veicolo(); //posso anche non farlo
        Auto a = new Auto("Ford", "Fiesta", 200, 2011, 4 );    //devi inserire argomenti numerici/testuali
        Moto m = new Moto("kawasaki", "z650", 187, 2023, "manu");

        //creo nuovo oggetto (auto) dall'altro costruttore
        Auto a1 = new Auto("Ford", "Fiesta", 2011);

        //v.mostraInfo(); //se metto mostraInfo private succede un macello
        System.out.println("Auto");
        a.mostraInfo();

        System.out.println("Moto");
        m.mostraInfo();


        System.out.println("altra auto");
        a1.mostraInfo();

        a.aggiornaVelocitaMassima(180); //uso il metodo della superclass (dimostro il riutilizzo del codice)
        m.aggiornaVelocitaMassima(160); //faccio lo stesso con l'altra subclass


        System.out.println(a1.getMarca()); //con get ottengo il valore

        //creo oggetto Scanner per leggere l'input dell'utente
        Scanner x = new Scanner(System.in);
        //chiedi all'utente di inserire marca
        System.out.println("Inserisci marca auto...");
        //uso metodo setter
        a1.setMarca(x.next());
        //controllo che effettivamente ho modificato
        System.out.println(a1.getMarca());

    }
}
