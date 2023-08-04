import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

            double result=0.0;
            Scanner scan = new Scanner(System.in);
            System.out.print("N sayısını giriniz : ");
            int n=scan.nextInt();

            for(double i=1; i<=n; i++) {
                result+=(1/i);
            }
            System.out.println("Sonuç : "+result);
            scan.close();
    }
}