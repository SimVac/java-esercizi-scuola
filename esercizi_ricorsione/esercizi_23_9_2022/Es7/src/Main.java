public class Main {
    /**
     * Funzione che calcola la somma dei posti dispari di un vettore
     * @param v Vettore di cui calcolare la somma
     * @param n Dimensione del vettore
     * @return Somma dei posti dispari del vettore
     */
    public static int sommaDispari(int[] v, int n){
        if (n < 1)
            return 0;
        return sommaDispari(v, n - 2) + v[v.length - n];
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
        int n = 10;
        int[] v = new int[n];
        inizializzaVettore(v, n);
        System.out.println("Vettore:");
        for (int i = 0; i < n; i++) {
            System.out.println(v[i]);
        }
        System.out.println("Somma dei posti dispari del vettore: " + sommaDispari(v, n));
    }
}