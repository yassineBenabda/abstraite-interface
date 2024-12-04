package abstraite_interface;

public class Fiscalite {
    public static void main(String[] args) {
        
        Personne p1 = new Personne(123456, "Ali", "Ben Salah");
        Personne p2 = new Personne(654321, "Sami", "Bouaziz");
        Personne p3 = new Personne(112233, "Leila", "Toumi");

        
        Lotissement lotissement = new Lotissement(10);

        
        ProprietePrivee prop1 = new ProprietePrivee(1, p1, "Corniche", 350, 4);
        Villa villa = new Villa(2, p2, "Dar Chaabane", 400, 6, true);
        Appartement appart = new Appartement(3, p2, "Hammamet", 1200, 8, 3);
        ProprieteProfessionnelle propPro1 = new ProprieteProfessionnelle(4, p3, "Korba", 1000, 50, true);
        ProprieteProfessionnelle propPro2 = new ProprieteProfessionnelle(5, p1, "Bir Bouragba", 2500, 400, false);

        lotissement.ajouter(prop1);
        lotissement.ajouter(villa);
        lotissement.ajouter(appart);
        lotissement.ajouter(propPro1);
        lotissement.ajouter(propPro2);

        
        System.out.println("Informations sur les propriétés:");
        lotissement.afficherProprietes();

        
        System.out.println("\nImpôts à payer pour chaque propriété:");
        for (int i = 0; i < 5; i++) {
            Propriete prop = lotissement.getProprieteByIndex(i);
            if (prop != null) {
                System.out.println("Propriété ID: " + prop.getId() +
                                   ", Impôt: " + prop.calculImpot() + " DT");
            }
        }

        
        int totalRooms = lotissement.getNbPieces();
        System.out.println("\nNombre total de pièces dans les propriétés privées: " + totalRooms);

        
        ProprietePrivee minTaxProp = null;
        double minTax = Double.MAX_VALUE;

        for (int i = 0; i < 5; i++) {
            Propriete prop = lotissement.getProprieteByIndex(i);
            if (prop instanceof ProprietePrivee) {
                double tax = prop.calculImpot();
                if (tax < minTax) {
                    minTax = tax;
                    minTaxProp = (ProprietePrivee) prop;
                }
            }
        }

        if (minTaxProp != null) {
            System.out.println("\nPropriété privée avec le moins d'impôts:");
            System.out.println("Responsable: " + minTaxProp.getResponsable().getNom() +
                               ", Impôt: " + minTax);
        }

        
        lotissement.supprimer(appart);

        System.out.println("\nListe des propriétés après suppression de l'appartement de Hammamet:");
        lotissement.afficherProprietes();
    }
}

