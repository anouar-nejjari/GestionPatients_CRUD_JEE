package Prese;

import exit.DaoImpltV2;
import metier.MetierImplt;

public class Main {
    public static void main(String[] args) {

        System.out.printf("Injection par Instanciation Static");

        // crée objet DAO de type DaoImplt
        // DaoImpltV1 d = new DaoImpltV1();  // Version BD

        DaoImpltV2 d = new DaoImpltV2(); // version web service

        // crée objet de type Metier et injectée dao via constructors or setter
        MetierImplt metier = new MetierImplt(d); // Injection via Constructors
        System.out.println("Injection via Setter" );

        //metier.setDao(d); //2 .Injection via Setter
        System.out.println( "Res is "+metier.calculer());

    }
}