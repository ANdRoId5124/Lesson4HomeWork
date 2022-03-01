import java.util.Arrays;
import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        Scanner sacnner = new Scanner(System.in);
        int length = sacnner.nextInt();
        int[] array = new int[length];
        int min = 0;
        int max = 0;
        double average = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * length + 1);
            average = (average + array[i]);
        }
        System.out.println(Arrays.toString(array));
        average = average / length;
        Arrays.sort(array);
        for (int j = 0; j < array.length; j++) {
            min = array[0];
            max = array[j];
        }
        System.out.println(Arrays.toString(array));
        System.out.println("min: " + min + "\n" + "max: " + max + "\n" + "average: " + average);
    }

}



