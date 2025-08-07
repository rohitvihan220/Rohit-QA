import java.util.LinkedList;

public class First {
    public static void main(String[] args) {
        LinkedList<String> stu_name_list=new LinkedList<>();
        stu_name_list.add("Rohit");
        stu_name_list.add("Aman");
        stu_name_list.add("Anurag");
        stu_name_list.add("Ajay");
        stu_name_list.addFirst("I am First");
        stu_name_list.addLast(" And   i Love my India");
        stu_name_list.remove("Ajay");
        System.out.println(stu_name_list);

        // Traversing


    }
}