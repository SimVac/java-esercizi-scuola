public class Main {
    public static void hanoi(int n, int i, int f, int a){
        if (n == 0)
            return;
        hanoi(n - 1, i, a, f);
        System.out.println(i + " -> " + f);
        hanoi(n - 1, a, f, i);
    }

    public static void main(String[] args) {
        int n = 5;
        hanoi(n, 1, 3, 2);
    }
}