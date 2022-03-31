package Class;

import Decorator.DecoratorVoiture;

public class Automatique extends DecoratorVoiture {

    public Automatique(Voiture v){
        voiture = v;
    }
    public String getMarque() {
        return voiture.getMarque() + " Boite auto";
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

    public int getCurrentVitesse() {
        return voiture.getCurrentVitesse();
    }
    public void setCurrentVitesse(int Vitesse) {
        voiture.currentVitesse = Vitesse;
    }
    public void rouler(){
        if (voiture.getCurrentVitesse() < voiture.getMaxVitesse()){
            voiture.setCurrentVitesse(voiture.getCurrentVitesse()+1);
            voiture.rouler();
        }
        else {
            System.out.println("Erreur");
        }
    }
}
