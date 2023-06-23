package Collection;

import java.sql.SQLOutput;
import java.util.Hashtable;
import java.util.Map;

public class Hashtable_HashMap {
    public static void main(String[]args){
        Hashtable<Integer,String> ht=new Hashtable<>();
        ht.put(5,"raj");
        ht.put(7,"prem");
        ht.put(8,"RAVI");
        ht.put(0,"ram");
        ht.put(5,"rahul");
        for (Map.Entry m:ht.entrySet()){
            System.out.println(m.getKey()+ "and" + m.getValue());
        }
    }
}
