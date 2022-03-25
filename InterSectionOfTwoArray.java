
public class InterSectionOfTwoArray {
    public static void function(int a[], int m, int b[], int n) {
        int i = 0, j = 0;
        while (i < m && j < n) {
            if (i > 0 && a[i] == a[i - 1]) {
                i++;
                continue;
            }
            if (a[i] > b[j]) {
                j++;
            } else if (a[i] < b[j]) {
                i++;
            } else {
                System.out.print(a[i] + " ");
                i++;
                j++;
            }
        }
    }

    public static void main(String args[]) {
        int a[] = { 1, 2, 3, 4, 5 };
        int b[] = { 3, 4, 5, 6, 7, 8, 9 };

        function(a, a.length, b, b.length);
    }
}
