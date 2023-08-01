import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int Matematik, Fizik, Kimya, Türkçe, Tarih, Müzik;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Lütfen matematik notunuzu girin:");
        Matematik =scanner.nextInt();
        System.out.println("Lütfen Fizik notunuzu girin:");
        Fizik =scanner.nextInt();
        System.out.println("Lütfen Kimya notunuzu girin:");
        Kimya =scanner.nextInt();
        System.out.println("Lütfen Türkçe notunuzu girin:");
        Türkçe =scanner.nextInt();
        System.out.println("Lütfen Tarih notunuzu girin:");
        Tarih =scanner.nextInt();
        System.out.println("Lütfen Müzik notunuzu girin:");
        Müzik =scanner.nextInt();

        double Total= (Matematik+Fizik+Kimya+Türkçe+Tarih+Müzik)/6;
        System.out.println("Not ortalaması: "+ Total);
        if(Total>= 60){
            System.out.println("Ortalaması :"+ Total + " Sınıfı Geçti");
        }else{
            System.out.println("Ortalaması :"+ Total + " Sınıfta Kaldı.");
        }
    }
}