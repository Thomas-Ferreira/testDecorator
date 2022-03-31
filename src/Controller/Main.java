package Controller;

import Class.Voiture;
import Class.Citroen;
import Class.Mercedes;
import Class.ToitOuvrant;
import Class.Automatique;
import Class.Manuel;

public class Main {

    public static void main(String [] args){

        Voiture v1 = new Citroen();
        v1 = new Manuel(v1);
        System.out.println(v1);

        Voiture v2 = new Mercedes();
        v2 = new ToitOuvrant(v2);
        v2 = new Automatique(v2);
        System.out.println(v2);
        System.out.println(v2.getMaxVitesse());
        System.out.println(v2.getCurrentVitesse());
        v2.rouler();
        System.out.println(v2.getCurrentVitesse());
        
    }
}
