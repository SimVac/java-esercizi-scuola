public class Main {
    /**
     * Dimensione massima del vettore da ordinare
     */
    public static final int DIM = 10;

    /**
     * Funzione che ordina un vettore passato come parametro
     * @param v Vettore da ordinare
     * @param n Lunghezza del vettore
     */
    public static void bubbleSort(int[] v, int n){
        for (int i = 0; i < n - 1; i++) {
            boolean ordinato = false;
            for (int j = n - 2; j >= i; j--) {
                if (v[j] > v[j+1]){
                    ordinato = true;
                    int t = v[j];
                    v[j] = v[j+1];
                    v[j+1] = t;
                }
            }
            if (!ordinato)
                return;
        }
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
        int[] v = new int[DIM];
        inizializzaVettore(v, DIM);
        System.out.println("Vettore non ordinato:");
        for (int i = 0; i < DIM; i++)
            System.out.println(v[i]);
        bubbleSort(v, DIM);
        System.out.println("Vettore ordinato:");
        for (int i = 0; i < DIM; i++)
            System.out.println(v[i]);
    }
}