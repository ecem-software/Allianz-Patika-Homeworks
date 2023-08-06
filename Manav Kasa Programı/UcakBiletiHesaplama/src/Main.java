import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        int age, mesafe,travel_type;
      Scanner scanner =new Scanner(System.in);
      //Kullanıcı Bilgileri Al
        System.out.println("Yaşınızı Giriniz");
        age=scanner.nextInt();
        System.out.println("Mesafeyi giriniz");
        mesafe=scanner.nextInt();
        System.out.println("Yolculuk tipi seçiniz:");
        travel_type=scanner.nextInt()

        if((travel_type=1) || (travel_type=2)){
            System.out.println("Yolculuk tipiniz :" +travel_type);
        }else{
            System.out.println("Hatalı veri girdiniz lütfen geçerli bir veri giriniz:");
        }
    }
}