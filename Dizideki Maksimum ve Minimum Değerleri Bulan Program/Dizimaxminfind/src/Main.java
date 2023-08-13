import java.util.Arrays;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int [] arr={ 15,12,788,1,-1,-778,2,0};
        Scanner scanner=new Scanner(System.in);
        System.out.println("Bir değer giriniz:");
        int a=scanner.nextInt();
        Arrays.sort(arr);
        int max= arr[0];
        int min= arr[0];
        for( int i : arr){
            if(i > a ){
                max= i;
                break;
            }
        }
        for( int b= arr.length -1 ; b >= 0; b--)   {
            if(arr[b] < a){
                min=arr[b];
                break;
            }
        }

            System.out.println("max : " + max);
            System.out.println( "min : " + min );



    }
}