package abstraite_interface;

public abstract class Propriete {
    private int id;
    private Personne responsable;
    private String adresse;
    private double surface;

    public Propriete(int id, Personne responsable, String adresse, double surface) {
        this.id = id;
        this.responsable = responsable;
        this.adresse = adresse;
        this.surface = surface;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public Personne getResponsable() { return responsable; }
    public void setResponsable(Personne responsable) { this.responsable = responsable; }

    public String getAdresse() { return adresse; }
    public void setAdresse(String adresse) { this.adresse = adresse; }

    public double getSurface() { return surface; }
    public void setSurface(double surface) { this.surface = surface; }

    public abstract double calculImpot();

    public String toString() {
        return "ID: " + id + ", Responsable: [" + responsable.toString() + 
               "], Adresse: " + adresse + ", Surface: " + surface + "m²";
    }
}

