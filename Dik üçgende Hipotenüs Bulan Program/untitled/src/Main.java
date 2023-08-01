import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        int a,b,c;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Üçgenin birinci kenarını giriniz");
        a=scanner.nextInt();

        System.out.println("Üçgenin ikinci kenarını giriniz.");
        b=scanner.nextInt();
        System.out.println("Üçgenin üçüncü kenarını giriniz");
        c= scanner.nextInt();
        double u;
        u=(a+b+c)/2;
        double Alan;
        Alan=Math.sqrt(u*(u-a)*(u-b)*(u-c));
        System.out.println("Üçgenin Alanı " + Alan);

    }
}