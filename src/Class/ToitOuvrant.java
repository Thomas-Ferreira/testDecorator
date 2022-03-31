package Class;

import Decorator.DecoratorVoiture;

public class ToitOuvrant extends DecoratorVoiture {

    public ToitOuvrant(Voiture v){
        voiture = v;
    }

    public String getMarque() {
        return voiture.getMarque() + " Toit Ouvrant";
    }

    public int getPrix() {
        return voiture.getPrix() + 2000;
    }

    public int getPoids() {
        return voiture.getPoids() + 15;
    }

    public int getMaxVitesse() {
        return voiture.getMaxVitesse();
    }

    public int getCurrentVitesse() {
        return voiture.getCurrentVitesse();
    }

    public void setCurrentVitesse(int currentVitesse) {
        voiture.currentVitesse = currentVitesse;
    }

    public void rouler(){
        voiture.rouler();
    }

    public void ouvirToitOuvrant(){
        System.out.println("le toit est ouvert");
    }
}
