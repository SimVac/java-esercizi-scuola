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
    public static void selectionSort(int[] v, int n){
        for (int i = 0; i < n - 1; i++) {
            //Ricerca del numero minore nel sottovettore
            int min = i;
            for (int j = i+1; j < n; j++) {
                if (v[j] < v[min])
                    min = j;
            }
            //Scambio del numero in prima posizione con il minore
            int t = v[i];
            v[i] = v[min];
            v[min] = t;
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
        selectionSort(v, DIM);
        System.out.println("Vettore ordinato:");
        for (int i = 0; i < DIM; i++)
            System.out.println(v[i]);
    }
}