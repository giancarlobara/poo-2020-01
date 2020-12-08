
package pratica.e09;

import java.util.Date;

public class TestaCD {

    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Duff McKagan");
        Pessoa p2 = new Pessoa("Slash");
        Pessoa p3 = new Pessoa("Axl Rose");
        Pessoa p4 = new Pessoa("Izzy");
                
        CD gunsNRoses = new CD("Appetite For Destruction", new Date(), p3);
       gunsNRoses.adicionaCantor(p2);
       gunsNRoses.adicionaCantor(p1);
       gunsNRoses.adicionaCantor(p4);
        System.out.println(gunsNRoses);
    }
}