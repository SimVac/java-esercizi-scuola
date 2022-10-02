public class Main {
    /**
     * Dimensione massima del vettore da ordinare
     */
    public static final int DIM = 10;

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

    /**
     * Funzione che fonde due parti ordinate di un vettore
     * @param v Vettore di cui fondere le due parti
     * @param inizio Posizione iniziale del vettore
     * @param fine Posizione finale del vettore
     * @param centro Posizione che distingue le due parti da fondere
     */
    public static void merge(int[] v, int inizio, int fine, int centro){
        int i = inizio, j = centro + 1, k = inizio;
        int[] a = new int[DIM];
        while (i <= centro && j <= fine){
            if (v[i] < v[j]){
                a[k] = v[i];
                i++;
            }
            else{
                a[k] = v[j];
                j++;
            }
            k++;
        }
        while (i <= centro){
            a[k] = v[i];
            k++;
            i++;
        }
        while (j <= fine){
            a[k] = v[j];
            k++;
            j++;
        }
        for (i=inizio; i <= fine; i++)
            v[i] = a[i];
    }

    /**
     * Funzione che ordina un vettore passato come parametro
     * @param v Vettore da ordinare
     * @param inizio Posizione iniziale del vettore
     * @param fine Posizione finale del vettore
     */
    public static void mergeSort(int[] v, int inizio, int fine){
        if (inizio >= fine)
            return;
        int centro = (inizio + fine) / 2;
        mergeSort(v, inizio, centro);
        mergeSort(v, centro + 1, fine);
        merge(v, inizio, fine, centro);
    }

    public static void main(String[] args) {
        int[] v = new int[DIM];
        inizializzaVettore(v, DIM);
        System.out.println("Vettore non ordinato:");
        for (int i = 0; i < DIM; i++)
            System.out.println(v[i]);
        mergeSort(v, 0, DIM-1);
        System.out.println("Vettore ordinato:");
        for (int i = 0; i < DIM; i++)
            System.out.println(v[i]);
    }
}