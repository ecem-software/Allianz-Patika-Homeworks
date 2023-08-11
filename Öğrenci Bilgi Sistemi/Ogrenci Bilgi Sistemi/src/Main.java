// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Teacher t1 = new Teacher("Mahmut Hoca", "TRH", "0555 555 55 55");
        Teacher t2 = new Teacher("Ahmet Hoca", "FZK", "0555 555 55 54");
        Teacher t3 = new Teacher("Külyutmaz", "BIO", "0555 555 55 53");

        Course tarih = new Course ("Tarih", "101", "TRH");
        tarih.addTeacher(t1);

        Course fizik = new Course ("Fizik", "102", "FZK");
        fizik.addTeacher(t2);

        Course biyoloji = new Course ("Biyoloji", "103", "BIO");
        biyoloji.addTeacher(t3);
        Student s1 = new Student("Kerem", "1234", "4", tarih, fizik, biyoloji);
        s1.addBulkExamNote (100, 100, 100);
        s1.addBulkQuizNote (100, 100, 100);
        s1.calculateAverage();



        }
}