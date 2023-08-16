import java.util.Arrays;
public class Main {
    static boolean isFind(int[] arr, int value) {
        for (int i : arr) {
            if (i == value) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] list = {1, 2, 3, 3, 3, 4, 6, 4, 5, 6, 7, 7};
        int[] duplicate = new int[list.length];
        int startindex = 0;

        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list.length; j++) {
                if((i !=j) && (list[i]== list[j])){
                if (!isFind(duplicate, list[i])) {
                    duplicate[startindex++] = list[i];
                }
                break;

            }

        }

    }
     System.out.println(Arrays.toString(duplicate));
}

}