package abstraite_interface;

public class Lotissement implements GestionPropriete {
    protected Propriete[] tabProp;
    protected int nombre;

    public Lotissement(int capacite) {
        tabProp = new Propriete[capacite];
        nombre = 0;
    }

    @Override
    public void afficherProprietes() {
        for (int i = 0; i < nombre; i++) {
            System.out.println(tabProp[i].toString());
        }
    }

    @Override
    public boolean ajouter(Propriete p) {
        if (nombre < tabProp.length) {
            tabProp[nombre++] = p;
            return true;
        }
        return false;
    }

    @Override
    public boolean supprimer(Propriete p) {
        for (int i = 0; i < nombre; i++) {
            if (tabProp[i].equals(p)) {
                tabProp[i] = tabProp[--nombre];
                tabProp[nombre] = null;
                return true;
            }
        }
        return false;
    }

    public Propriete getProprieteByIndex(int i) {
        if (i >= 0 && i < nombre) {
            return tabProp[i];
        }
        return null;
    }

    public int getNbPieces() {
        int totalPieces = 0;
        for (int i = 0; i < nombre; i++) {
            if (tabProp[i] instanceof ProprietePrivee) {
                totalPieces += ((ProprietePrivee) tabProp[i]).getNbPieces();
            }
        }
        return totalPieces;
    }
}

