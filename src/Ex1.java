import java.util.Scanner;
public class Ex1 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int digit = scanner.nextInt();
        int array[] = {5, 6, 15, 18, 515};
        for(int i = 0; i < array.length; i++){
            if(array[i] == digit){
                System.out.println(array[i]);
            }

        }

    }
}
