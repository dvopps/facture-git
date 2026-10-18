public class CalculFacture {
    static final int PRIX_UNITAIRE = 20;
    static final int FRAIS_LIVRAISON = 5;
    static final int RABAIS_FIDELITE = 10;
    static final int SEUIL_LIVRAISON_GRATUITE = 100;

    static int calculerTotal(int sousTotal) {
        int totalAvantRabais = sousTotal + calculerFraisLivraison(sousTotal);
		int totalApresRabais = totalAvantRabais - RABAIS_FIDELITE;
        return totalApresRabais;
    }

    static int calculerFraisLivraison(int sousTotal) {
        if (sousTotal >= SEUIL_LIVRAISON_GRATUITE) {
            return 0;
        }
        return FRAIS_LIVRAISON;
    }

    static int calculerSousTotal(int quantite) {
        int sousTotal = PRIX_UNITAIRE * quantite;
        return sousTotal;
    }    
}
