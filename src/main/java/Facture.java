import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Facture {    

    private static void affciherFacture(String client, int quantite) {
        int sousTotal = CalculFacture.calculerSousTotal(quantite);
        int total = CalculFacture.calculerTotal(sousTotal);
        System.out.println("Client : " + client);
		System.out.println(quantite + " article(s) à " + CalculFacture.PRIX_UNITAIRE + " $");
		System.out.println("Sous-total : " + sousTotal + " $");
        System.out.println("Total : " + total + " $");
    }

    public static void main(String[] args) {
        affciherFacture("Client démonstration", 3);
		System.out.println("----------");
        affciherFacture("Client fidèle", 6);
        System.out.println(exporterJson("Client fidèle", 6));
    }

    static String exporterJson(String client, int quantite) {
        int sousTotal = CalculFacture.calculerSousTotal(quantite);
        int total = CalculFacture.calculerTotal(sousTotal);
        ResumeFacture resume = new ResumeFacture(client, quantite, sousTotal, total);
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        return gson.toJson(resume);
    }
}