import java.util.Arrays;
import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose digit between 1 and 10");
        int number = scanner.nextInt();
        int length2 = 0;
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 10 + 1);
            if (array[i] != number) {
                length2++;
            } else {
                System.out.println("Нет такого числа");
            }
        }
        System.out.println(Arrays.toString(array));

        int lengthOfArray2 = 0;
        int array2[] = new int[length2];
        for (int j = 0; j < array.length; j++) {
            if (array[j] != number) {
                array2[lengthOfArray2] = array[j];
                lengthOfArray2++;
            }
        }
        System.out.println(Arrays.toString(array2));
    }
}
