import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        int UserNumber, Password, right=3 , balance=1500 , price ;
        Scanner input = new Scanner(System.in);
        int select;

        while (right>0) {
            System.out.print("Lütfen kullanıcı adınızı giriniz: ");
            UserNumber = input.nextInt();
            System.out.print("Lütfen şifrenizi giriniz: ");
            Password = input.nextInt();

            if (UserNumber == 241642 && Password == 121421) {
                do {
                    System.out.println("Yapmak istediğiniz işlemi seçiniz:");
                    System.out.println("1-Para yatırma\n" +
                            "2-Para Çekme\n" +
                            "3-Bakiye Sorgula\n" +
                            "4-Çıkış Yap");
                    select = input.nextInt();
                    switch (select) {
                        case 1:
                            System.out.print("Yatırmak istediğiniz miktar: ");
                            price = input.nextInt();
                            balance = balance + price;
                            System.out.println("Yeni Bakiye: " + balance);
                            break;
                        case 2:
                            System.out.print("Çekmek istediğiniz miktarı giriniz: ");
                            price = input.nextInt();
                            if (balance >= price) {
                                balance = balance - price;
                                System.out.println("Yeni Bakiye: " + balance);
                            } else {
                                System.out.println("Yetersiz Bakiye");
                            }
                            break;
                        case 3:
                            System.out.println("Mevcut Bakiye: " + balance);
                            break;
                    }
                } while (select != 4);
                System.out.println("İyi Günler Dileriz");
            } else {
                System.out.println("Hatalı Şifre Tekrar Deneyiniz");
                right--;
                if (right == 0)
                    System.out.println("Kartınız Bloke olmuştur lütfen banka ile iletişime geçiniz");
                else
                    System.out.println("Kalan hakkınız: " + right);
            }
        }
        }

}