package Class;

import Decorator.DecoratorVoiture;

public class Manuel extends DecoratorVoiture {

    public Manuel(Voiture v){
        voiture = v;
    }
    public String getMarque() {
        return voiture.getMarque() + " Boite manuel";
    }
    public int getPrix() {
        return voiture.getPrix();
    }
    public int getPoids() {
        return voiture.getPoids();
    }
    public int getMaxVitesse() {
        return voiture.getMaxVitesse();
    }
    public void setCurrentVitesse(int currentVitesse) {
        voiture.currentVitesse = currentVitesse;
    }
    public int getCurrentVitesse() {
        return voiture.getCurrentVitesse();
    }
    public void rouler(){
        voiture.rouler();
    }
}
