
public class Count_Inversion {
    public static int countInversion(int arr[], int l, int h) {
        int res = 0;
        if (l < h) {
            int m = l + (h - l) / 2;
            res += countInversion(arr, l, m);
            res += countInversion(arr, m + 1, h);
            res += merge(arr, l, m, h);
        }
        return res;

    }

    public static int merge(int arr[], int l, int m, int h) {
        int n1 = m - l + 1;
        int n2 = h - m;
        int l0[] = new int[n1];
        int r[] = new int[n2];
        for (int i = 0; i < n1; i++) {
            l0[i] = arr[l + i];
        }
        for (int i = 0; i < n2; i++) {
            r[i] = arr[m + i + 1];
        }
        int i = 0, j = 0, res = 0, low = l;

        while (i < n1 && j < n2) {
            if (l0[i] > r[j]) {
                arr[low++] = r[j];
                j++;
                res = res + (n1 - i);
            } else {
                arr[low++] = l0[i];
                i++;
            }
        }
        while (i < n1) {
            arr[low++] = l0[i];
            i++;
        }
        while (j < n2) {
            arr[low++] = r[j];
            j++;
        }
        // System.out.println(res+" "+Arrays.toString(arr));
        return res;
    }

    public static void main(String args[]) {
        int arr[] = { 2, 4, 1, 3, 5 };
        System.out.print(countInversion(arr, 0, arr.length - 1));
    }
}
