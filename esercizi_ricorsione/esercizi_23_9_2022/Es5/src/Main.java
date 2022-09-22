public class Main {
    /**
     * Ricerca un certo numero all'interno di un vettore
     * @param v Vettore in cui cercare il numero
     * @param valore Numero da ricercare
     * @param i Posizione iniziale del vettore
     * @param f Posizione finale del vettore
     * @return true se è stato trovato il numero, false altrimenti
     */
    public static boolean ricerca(int[] v, int valore, int i, int f){
        if (v[i] == valore)
            return true;
        if (i >= f)
            return false;
        return ricerca(v, valore, i + 1, (i + f) / 2) || ricerca(v, valore, (i + f) / 2 + 1, f);
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
        int n = 100;
        int[] v = new int[n];
        inizializzaVettore(v, n);
        System.out.println("Vettore:");
        for (int i = 0; i < n; i++) {
            System.out.println(v[i]);
        }
        int valoreRicercato = 4;
        if (ricerca(v, valoreRicercato, 0, n - 1))
            System.out.println("Valore trovato");
        else
            System.out.println("Valore non trovato");
    }
}