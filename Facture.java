public class Facture {
    private static final int RABAIS_FIDELITE = 10;
    private static final int FRAIS_LIVRAISON = 5;
    private static final int PRIX_UNITAIRE = 20;

    public static void main(String[] args) {		
        afficherFacture("Client démonstration", 3);
		System.out.println("----------");
        afficherFacture("Client fidèle", 6);
    }

    private static void afficherFacture(String client, int quantite) {
        int sousTotal = PRIX_UNITAIRE * quantite;
        int total = sousTotal + FRAIS_LIVRAISON - RABAIS_FIDELITE;

        System.out.println("Client : " + client);
		System.out.println(quantite + " article(s) à " + PRIX_UNITAIRE + " $");
		System.out.println("Sous-total : " + sousTotal + " $");
        System.out.println("Total : " + total + " $");
    }
}
