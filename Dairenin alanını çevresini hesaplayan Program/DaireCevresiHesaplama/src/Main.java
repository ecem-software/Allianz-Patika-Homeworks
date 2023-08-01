import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        int r;
        double pi = 3.14;
        double a;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Dairenin yarıçapını giriniz:");
        r = scanner.nextInt();
        System.out.println("Daire diliminin açsını giriniz?");
        a = scanner.nextDouble();
        double alan = (pi * (r * r) * a) / 360;
        System.out.println("Dairenin alanı: " + alan);

    }

}