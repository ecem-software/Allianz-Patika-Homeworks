import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        String userName, password,userName1,password1;
        userName1="patika";
        password1="java123";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Kullanıcı adı giriniz");
        userName = scanner.nextLine();

        System.out.println("Sifreniz: ");
        password = scanner.nextLine();

        if (userName.equals("patika") && password.equals("java123")) {
            System.out.println("Giriş Yaptınız !");
        }else{
            System.out.println("Bilgileriniz yanlış !");
            System.out.println("Sifrenizi sıfırlamak ister misiniz? press yes/no" );
            String choice =scanner.nextLine();
            if(choice.equals("yes")){
                System.out.println("Lütfen yeni şifre belirleyiniz , yeni şifreniz eski şifrenizle aynı olamaz!");
                String newPassword=scanner.nextLine();
                while (newPassword.equals(password1)==true){
                    System.out.println("your password can not be same with your old password.");
                    System.out.println("Please enter password again:");
                    newPassword=scanner.nextLine();
                }

                password1= newPassword; // Update the password
                System.out.println("Şifreniz başarı ile güncellendi");
            }else {
                System.out.println("Şifre sıfırlama işlemi iptal edildi.");
            }


        }
    }
}