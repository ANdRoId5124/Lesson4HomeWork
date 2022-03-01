import java.util.Arrays;

public class ex4 {
    public static void main(String[] args) {
        int array[] = {6, 15, 24, 8, 9};
        int array1[] = {9, 54, 48, 26, 2};
        double average = 0;
        double average2 = 0;
        for (int i = 0; i < array.length; i++) {
            average = average + array[i];
        }
        average = average / array.length;
        System.out.println(Arrays.toString(array) + ": " + "Average of array: " + average);
        for (int j = 0; j < array1.length; j++) {
            average2 = average2 + array1[j];
        }
        average2 = average2 / array1.length;
        System.out.println(Arrays.toString(array1) + ": " + "Average of array1: " + average2);
        if (average == average2) {
            System.out.println("Average of array = Average of array1");
        } else if (average < average2) {
            System.out.println("Average of array1 larger");
        } else {
            System.out.println("Average of array larger");
        }
    }
}
