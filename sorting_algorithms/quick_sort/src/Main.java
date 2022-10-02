public class Main {
    /**
     * Dimensione massima del vettore da ordinare
     */
    public static final int DIM = 10;

    /**
     * Funzione che sistema il pivot al posto corretto e porta i valori minori di esso a "sinistra" e i valori minori a "destra"
     * @param v Vettore da partizionare
     * @param inizio Posizione iniziale del vettore
     * @param fine Posizione iniziale del vettore
     * @return La posizione finale del pivot
     */
    public static int partition(int[] v, int inizio, int fine){
        int i = inizio, j = fine - 1, t;
        while (i <= j){
            while (v[i] < v[fine])
                i++;
            while (j > inizio && v[j] >= v[fine])
                j--;
            if (i >= j)
                break;
            t = v[i];
            v[i] = v[j];
            v[j] = t;
        }
        t = v[i];
        v[i] = v[fine];
        v[fine] = t;
        return i;
    }

    /**
     * Funzione che ordina un vettore passato come parametro
     * @param v Vettore da ordinare
     * @param inizio Posizione iniziale del vettore
     * @param fine Posizione finale del vettore
     */
    public static void quickSort(int[] v, int inizio, int fine){
        if (inizio >= fine)
            return;
        int i = partition(v, inizio, fine);
        quickSort(v, inizio, i - 1);
        quickSort(v, i + 1, fine);
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
        quickSort(v, 0, DIM - 1);
        System.out.println("Vettore ordinato:");
        for (int i = 0; i < DIM; i++)
            System.out.println(v[i]);
    }
}