import java.util.Arrays;

public class ex6 {
    public static void main(String[] args) {
        int[] array = {8, 10, 98, 44, 58, 31};
        System.out.println(Arrays.toString(array));
        for(int i = 0; i < array.length; i++){
            if(i % 2 == 1){
                array[i] = 0;
            } System.out.print(" " + array[i]);
        }
    }
}
