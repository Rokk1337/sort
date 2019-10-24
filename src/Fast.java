import java.util.Arrays;

public class Fast {

    public static void quickSort(int[] array, int end, int start) {
        if (array.length == 0)
            return;

        if (end >= start)
            return;

        int mid = end + (start - end) / 2;
        int suppors = array[mid];

        int i = end, j = start;
        while (i <= j) {
            while (array[i] < suppors) {
                i++;
            }

            while (array[j] > suppors) {
                j--;
            }

            if (i <= j) {
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i++;
                j--;
            }
        }

        if (end < j)
            quickSort(array, end, j);

        if (start > i)
            quickSort(array, i, start);
    }
    public static void main(String[] args) {
        int[] mass = { 9, 20, 11, 8, 45, -79, 100500, 0, 1 };
        System.out.println("до");
        System.out.println(Arrays.toString(mass));

        int low = 0;
        int high = mass.length - 1;

        quickSort(mass, low, high);
        System.out.println("после");
        System.out.println(Arrays.toString(mass));
    }
}