
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class TestStudent {

    public static void main(String[] args) {
        List<Student> st = new LinkedList<>() {
            @Override
            public String toString() {
                String str = "";
                for (Student thi : this) {
                    str += thi + "\n";
                }
                return str;
            }
        };
        st.add(new Student("1001", "aa", 4.00, "IT", 1));
        st.add(new Student("1007", "cc", 4.00, "IT", 1));
        st.add(new Student("1003", "ba", 3.50, "CS", 3));
        st.add(new Student("1005", "cd", 3.00, "IT", 3));
        st.add(new Student("1002", "ca", 2.00, "IT", 2));
        st.add(new Student("1004", "bb", 2.50, "CS", 2));
        st.add(new Student("1006", "bc", 4.00, "CS", 1));

        System.out.println(st);

        Collections.sort(st);
        System.out.println(st);

        Collections.sort(st, new Student().compareName());
        System.out.println(st);

//        Collections.sort(st,new Student().new NameComparator());
//        System.out.println(st);

        Collections.sort(st,Student.compareYear());
        System.out.println(st);
        
//        Collections.sort(st,new Student.YearComparator());
//        System.out.println(st);

        Collections.sort(st,Student.compareGpax());
        System.out.println(st);
        
        Collections.sort(st,Student.compareFaculty());
        System.out.println(st);
        
        Collections.sort(st,Student.compareAll());
        System.out.println(st);
    }
}
