package Methods;

public class Reverse_method {
    public static void main(String[] args){
        String r="PREM SAGAR";
        String r1="";

        int l=r.length();
        for (int i=r.length()-1;i>=0;i--){
            r1=r1+r.charAt(i);
        }
        System.out.println(r1);
    }
}
