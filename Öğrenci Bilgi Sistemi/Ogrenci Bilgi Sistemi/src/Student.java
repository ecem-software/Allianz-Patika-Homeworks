import java.sql.SQLOutput;

public class Student {
    Course c1;
    Course c2;
    Course c3;
    String name;
    String StudentNo;
    String classes;
    double average = 0;
    boolean isPassed = false;

    public Student(String name, String studentNo, String classes, Course c1, Course c2, Course c3) {
        this.c1 = c1;
        this.c2 = c2;
        this.c3 = c3;
        this.name = name;
        StudentNo = studentNo;
        this.classes = classes;
    }


    void addBulkExamNote(int note1, int note2, int note3) {
        if (note1 >= 0 && note1 <= 100) {
            c1.note = note1;
        }
        if (note2 >=  0 && note2 <= 100) {
            c2.note = note2;
        }
        if (note3 >=  0 && note3 <= 100) {
            c3.note = note3;
        }
    }

    void addBulkQuizNote(int qnote1, int qnote2, int qnote3) {
        this.c1.QuizNote = qnote1;
        this.c2.QuizNote = qnote2;
        this.c3.QuizNote = qnote3;
    }

    void calculateAverage() {
        this.average = (((this.c1.note * 0.8 +this.c1.QuizNote * 0.2) + (this.c2.note* 0.7 + this.c2.QuizNote * 0.3) + (this.c3.note * 0.9 + this.c3.QuizNote * 0.1))/3);
        System.out.println("average :" + average);
    }

    void isPassed() {
        if (this.average > 55) {
            System.out.println("Öğrenci sınıfı geçti");
        } else {
            System.out.println("Öğrenci sınıfta kaldı");
        }
    }

    void printNote() {
        System.out.println(this.c1.name + "Notu :" + this.c1.note);
        System.out.println(this.c2.name + "Notu :" + this.c2.note);
        System.out.println(this.c3.name + "Notu :" + this.c3.note);
    }

}
