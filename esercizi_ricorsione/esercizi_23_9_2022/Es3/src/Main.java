public class Main {
    /**
     * Funzione che trova il massimo in maniera ricorsiva
     * @param v Vettore in cui ricercare il valore massimo
     * @param i Posizione iniziale del vettore
     * @param f Posizione finale del vettore
     * @return Valore massimo del vettore
     */
    public static int massimoRicorsivo(int[] v, int i, int f){
        if (i == f)
            return v[i];
        int m1 = massimoRicorsivo(v, i, (i + f) / 2);
        int m2 = massimoRicorsivo(v, (i + f) / 2 + 1, f);
        return Math.max(m1, m2);
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
        int n = 10;
        int[] v = new int[n];
        inizializzaVettore(v, n);
        System.out.println("Vettore:");
        for (int i = 0; i < n; i++) {
            System.out.println(v[i]);
        }
        System.out.println("Valore massimo: " + massimoRicorsivo(v, 0, n - 1));
    }
}