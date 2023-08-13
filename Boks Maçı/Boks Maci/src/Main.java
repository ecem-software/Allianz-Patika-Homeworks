
public class Main {
    public static void main(String[] args) {
      Fighter f1=new Fighter("Mehmet", 10,100,80, 100);
      Fighter f2=new Fighter("Kerem",15,100,70,0);

      Match match=new Match(f1,f2,60,120);
      match.run();
        }
    }
