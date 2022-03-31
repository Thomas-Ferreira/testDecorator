package Decorator;

import Class.Voiture;

public abstract class DecoratorVoiture extends Voiture {
    protected Voiture voiture;
    public abstract String getMarque();
    public abstract int getPrix();
    public abstract int getPoids();
    public abstract int getMaxVitesse();
    public abstract int getCurrentVitesse();

    public abstract void setCurrentVitesse(int Vitesse);

    public abstract void rouler();

}
