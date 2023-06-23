package hashSet;

import java.util.HashSet;

public class jobHashSet {
    public HashSet<String> Creathashset(){
        HashSet<String> job=new HashSet<>();
        job.add("Enginner");
        job.add("Teaser");
        job.add("Clerk");
        job.add("manager");
        job.add("constable");
        job.add("si");
        return job;
    }
    public HashSet<Integer> numberHashSet(){
        HashSet<Integer> num=new HashSet<>();
        num.add(45);
        num.add(87);
        num.add(56);
        num.add(768);
        num.add(665);
        return num;
    }


    public static void main(String[]args){
        jobHashSet obj=new jobHashSet();
        HashSet<String>job=obj.Creathashset();
        HashSet<Integer>rollnumbers=obj.numberHashSet();

for (String var:job){
    System.out.println("jab details are"+var);
}
    }

}
