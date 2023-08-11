public class Teacher {
    String name;
    String mpno;
    String branch;

public Teacher(String name,String mpno,String branch){
    this.name=name;
    this.mpno=mpno;
    this.branch=branch;
}



public void print(){
    System.out.println("Öğretmen Adı : " + name);
    System.out.println("Öğretmen Numarası : " +mpno);
    System.out.println("Öğretmen branchi : " +branch);
}
}
