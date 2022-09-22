public class Main {
    /**
     * Inverte un vettore utilizzando la ricorsione
     * @param v Vettore da invertire
     * @param i Posizione iniziale del vettore
     * @param f Posizione finale del vettore
     */
    public static void invertiRicorsivo(int[] v, int i, int f){
        if (i >= f)
            return;
        int t = v[i];
        v[i] = v[f];
        v[f] = t;
        invertiRicorsivo(v, i+1, f-1);
    }

    /**
     * Funzione per inizializzare un vettore con numeri casuali compresi tra 0 e 99 inclusi
     * @param v Vettore da inizializzare
     * @param n Lunghezza del vettore
     */
    public static void inizializzaVettore(int[] v, int n){
        for (int i = 0; i < n; i++) {
            v[i] = (int)(Math.random() * 100);
        }
    }

    public static void main(String[] args) {
        int n = 11;
        int[] v = new int[n];
        inizializzaVettore(v, n);
        System.out.println("Vettore prima:");
        for (int i = 0; i < n; i++) {
            System.out.println(v[i]);
        }
        invertiRicorsivo(v, 0, n-1);
        System.out.println("Vettore dopo:");
        for (int i = 0; i < n; i++) {
            System.out.println(v[i]);
        }
    }
}