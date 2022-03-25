import java.util.Arrays;

class Interval implements Comparable<Interval> {
    int s;
    int e;

    Interval(int i, int j) {
        s = i;
        e = j;
    }

    public int compareTo(Interval a) {
        return this.s - a.s;
    }
}

public class MergeOverLapping_Intervals {
    public static void merge(Interval arr[]) {

        Arrays.sort(arr);
        int res = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[res].e >= arr[i].s) {
                arr[res].s = Math.min(arr[res].s, arr[i].s);
                arr[res].e = Math.max(arr[res].e, arr[i].e);

            } else {
                res++;

                arr[res] = arr[i];

            }
        }

        for (int x = 0; x <= res; x++) {
            System.out.print("(" + arr[x].s + "," + arr[x].e + "),");
        }
    }

    public static void main(String args[]) {
        Interval arr[] = { new Interval(7, 9), new Interval(6, 10), new Interval(4, 5), new Interval(1, 3),
                new Interval(2, 4) };

        merge(arr);

    }
}
