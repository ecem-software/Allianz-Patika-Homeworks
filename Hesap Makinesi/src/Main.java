import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int number1,number2,select;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter number 1 ");
        number1= scanner.nextInt();
        System.out.println("Please enter number 2" );
        number2= scanner.nextInt();
        System.out.println("Please select task :\n 1- Sum\n 2- extraction\n 3- multiple\n 4- divide");
        select = scanner.nextInt();

        switch (select){
            case 1:
                double toplam= number1+number2;
                System.out.println(toplam);
                break;

            case 2:
                double cıkarma=number1-number2;
                System.out.println(cıkarma);
                break;
            case 3:
                double carpma=number1*number2;
                System.out.println(carpma);
                break;

            case 4:
                if (number2 !=0) {
                    double bolme = number1 / number2;
                    System.out.println(bolme);
                }
                else{
                    System.out.println("Lütfen number2 ye sıfırdan farklı bir değer griniz.");
                }
                break;

            default:
                System.out.println("Please enter correct value");
        }

        }
}