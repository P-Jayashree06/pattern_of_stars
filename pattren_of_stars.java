import java.util.Scanner;

public class pattren_of_stars {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter the number of levels for the pyramid:");
        int num = obj.nextInt();

        for(int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
