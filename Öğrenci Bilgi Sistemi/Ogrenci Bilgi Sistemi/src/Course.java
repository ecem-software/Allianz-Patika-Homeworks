public class Course {
    Teacher teacher;
    String name;
    String code;
    String prefix;
    int note;
    int QuizNote=0;


    Course(String name, String code, String prefix){
        this.name=name;
        this.code=code;
        this.prefix=prefix;
    }

    void addTeacher(Teacher teacher){
        if(teacher.mpno.equals(this.prefix))
        this.teacher=teacher;
        else{
            System.out.println("Lütfen doğru branch ile eşleşen hocayı giriniz.");
        }
    }

    void printTeacherInfo(){
        this.teacher.print();
    }

}
