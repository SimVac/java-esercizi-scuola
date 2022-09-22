public class Main {
    /**
     * Ricerca un numero in un vettore ordinato
     * @param v Vettore in cui ricercare il numero
     * @param valore Numero da ricercare
     * @param i Posizione iniziale del vettore
     * @param f Posizione finale del vettore
     * @return true se il numero è stato trovato, false altrimenti
     */
    public static boolean ricercaBinaria(int[] v, int valore, int i, int f){
        if (i > f)
            return false;
        int pos = (i + f) / 2;
        if (v[pos] == valore)
            return true;
        else if (v[pos] > valore)
            return ricercaBinaria(v, valore, i, pos - 1);
        else
            return ricercaBinaria(v, valore, pos + 1, f);
    }

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
        int n = 5;
        int[] v = new int[n];
        inizializzaVettore(v, n);
        selectionSort(v, n);
        System.out.println("Vettore:");
        for (int i = 0; i < n; i++) {
            System.out.println(v[i]);
        }
        int valoreRicercato = 4;
        if (ricercaBinaria(v, valoreRicercato, 0, n - 1))
            System.out.println("Valore trovato");
        else
            System.out.println("Valore non trovato");
    }
}