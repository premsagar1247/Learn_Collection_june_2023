package Methods;

public class Student {
    int x=25;

    @Override
    public boolean equals(Object obj) {
         Student st=(Student) obj;
         System.out.println("Comparing object");
         return st.x==this.x;
    }
}
