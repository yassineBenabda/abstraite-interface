package abstraite_interface;

public class ProprieteProfessionnelle extends Propriete {
    private int nbEmployes;
    private boolean estEtatique;

    public ProprieteProfessionnelle(int id, Personne responsable, String adresse, double surface, int nbEmployes, boolean estEtatique) {
        super(id, responsable, adresse, surface);
        this.nbEmployes = nbEmployes;
        this.estEtatique = estEtatique;
    }

    @Override
    public double calculImpot() {
        if (estEtatique) {
            return 0;
        } else {
            return (100 * (getSurface() / 100)) + (30 * nbEmployes);
        }
    }

    @Override
    public String toString() {
        return super.toString() + ", Nb Employés: " + nbEmployes + ", Est Étatique: " + (estEtatique ? "Oui" : "Non");
    }
}
