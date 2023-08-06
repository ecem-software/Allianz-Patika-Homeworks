import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int a,e,d,m,p;
        double Total;
        double Armut = 2.14;
        double Elma = 3.67;
        double Domates = 1.11;
        double Muz = 0.95;
        double Patlıcan = 5.00;

        System.out.println("Armut Kaç Kilo");
        a= scanner.nextInt();
        System.out.println("Elma Kaç Kilo");
        e= scanner.nextInt();
        System.out.println("Domates Kaç Kilo");
        d= scanner.nextInt();
        System.out.println("Muz Kaç Kilo");
        m= scanner.nextInt();
        System.out.println("Patlıcan Kaç Kilo");
        p= scanner.nextInt();

        Total=(a*Armut)+(e*Elma)+(d*Domates)+(m*Muz)+(p*Patlıcan);
        System.out.println("Toplam manava ödenecek tutar :" + Total +"TL");

    }
}