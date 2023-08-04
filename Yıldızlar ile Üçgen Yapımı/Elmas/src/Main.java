import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
            Scanner scn = new Scanner(System.in);
            System.out.println("Bir sayı giriniz: ");
            int giris = scn.nextInt();

            for (int i = 0; i <= giris; i++) {
                for (int j = 0; j < (giris - i); j++) {
                    System.out.print(" ");
                }
                for (int k = 1; k <= (2 * i + 1); k++) {
                    System.out.print("*");
                }
                System.out.println();
            }
            for (int i = 1; i <= giris; i++) {
                for (int j = 0; j < i; j++) {
                    System.out.print(" ");
                }
                for (int k = (2 * (giris - i)) + 1; k > 0; k--) {
                    System.out.print("*");
                }
                System.out.println();
            }
            scn.close();
    }
}