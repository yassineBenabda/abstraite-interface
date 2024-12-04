package abstraite_interface;

public class Villa extends ProprietePrivee {
    private boolean avecPiscine;

    public Villa(int id, Personne responsable, String adresse, double surface, int nbPieces, boolean avecPiscine) {
        super(id, responsable, adresse, surface, nbPieces);
        this.avecPiscine = avecPiscine;
    }

    public boolean isAvecPiscine() { return avecPiscine; }
    public void setAvecPiscine(boolean avecPiscine) { this.avecPiscine = avecPiscine; }

    @Override
    public double calculImpot() {
        double impot = super.calculImpot();
        if (avecPiscine) {
            impot += 200;
        }
        return impot;
    }

    @Override
    public String toString() {
        return super.toString() + ", Avec Piscine: " + (avecPiscine ? "Oui" : "Non");
    }
}
