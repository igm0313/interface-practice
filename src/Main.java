import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        ArrayList<Student> list = new ArrayList<Student>();
        Student st = new Student("Lim",100);
        list.add(st);
        System.out.println(list.get(0).toString());
    }
}
