package Class;

public abstract class Voiture {
    String Marque;
    int prix;
    int poids;
    static int currentVitesse;
    int maxVitesse;


    public String getMarque() {
        return Marque;
    }

    public void setMarque(String marque) {
        Marque = marque;
    }

    public int getPoids() {
        return poids;
    }

    public void setPoids(int poids) {
        this.poids = poids;
    }

    public int getPrix() {
        return prix;
    }

    public void setPrix(int prix) {
        this.prix = prix;
    }

    public int getCurrentVitesse() {
        return currentVitesse;
    }

    public void setCurrentVitesse(int Vitesse) {
        Voiture.currentVitesse = Vitesse;
    }

    public int getMaxVitesse() {
        return maxVitesse;
    }

    public void setMaxVitesse(int maxVitesse) {
        this.maxVitesse = maxVitesse;
    }

    public String toString(){
        return "Voiture : " + getMarque() + " , Prix : " + getPrix() + " , Poids : " + getPoids();
    }

    public void rouler(){
        System.out.println("la voiture roule");
    }

}
