package abstraite_interface;

public class ProprietePrivee extends Propriete {
    private int nbPieces;

    public ProprietePrivee(int id, Personne responsable, String adresse, double surface, int nbPieces) {
        super(id, responsable, adresse, surface);
        this.nbPieces = nbPieces;
    }

    public int getNbPieces() { return nbPieces; }
    public void setNbPieces(int nbPieces) { this.nbPieces = nbPieces; }

    @Override
    public double calculImpot() {
        return (50 * (getSurface() / 100)) + (10 * nbPieces);
    }

    @Override
    public String toString() {
        return super.toString() + ", Nb Pièces: " + nbPieces;
    }
}

