// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        String[][] matris = new String[7][4];
        for (int i = 0; i < matris.length; i++) {
            for (int j = 0; j < matris.length; j++) {
                if (i == 0 || i == 2 || i==5 ) {
                    matris [i][j] = " * ";
                } else if (j == 0 || j == 3) {
                    matris [i][j] = " * ";
                } else {
                    matris [i][j] = "   ";
                }
            }
        }
        for (String[] row : matris) {
            for (String column : row) {
                System.out.println(column);
            }
            System.out.println();
        }
    }
}