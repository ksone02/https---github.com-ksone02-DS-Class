package DS13;

public class Selection {
    public static void sort(Comparable[] a) {
        int N = a.length;
        for (int i = 0; i < N; i++) {
            int min = i;
            for (int j = i+1; j < N; j++) {
                if(isLess(a[j], a[min])) min = j;
            }
            swap(a, i, min);
        }
    }

    private static boolean isLess(Comparable i, Comparable j) {
        return (i.compareTo(j) < 0);
    }

    private static void swap(Comparable[] a, int i, int j) {
        Comparable temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}
