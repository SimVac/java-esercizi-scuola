public class Main {
    public static int sommaRicorsiva(int[] v, int i, int f){
        if (i == f)
            return v[i];
        return sommaRicorsiva(v, i, (i + f) / 2) + sommaRicorsiva(v, (i + f) / 2 + 1, f);
    }

    /**
     * Funzione per inizializzare un vettore con numeri casuali compresi tra 0 e 9 inclusi
     * @param v Vettore da inizializzare
     * @param n Lunghezza del vettore
     */
    public static void inizializzaVettore(int[] v, int n){
        for (int i = 0; i < n; i++) {
            v[i] = (int)(Math.random() * 10);
        }
    }

    public static void main(String[] args) {
        int n = 4;
        int[] v = new int[n];
        inizializzaVettore(v, n);
        System.out.println("Vettore:");
        for (int i = 0; i < n; i++) {
            System.out.println(v[i]);
        }
        System.out.println("Somma: " + sommaRicorsiva(v, 0, n - 1));
    }
}