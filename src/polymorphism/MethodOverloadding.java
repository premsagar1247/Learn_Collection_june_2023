package polymorphism;

import java.sql.SQLOutput;

public class MethodOverloadding {
    public void add(int num1){
        System.out.println(num1);
    }
    public void add(int x,int y){
        int sum=x+y;
        System.out.println(sum);
    }
    public void add(int a,int b,int c){
        int addition=a+b+c;
        System.out.println(addition);
    }
    public void add(String a,double b){
        System.out.println(a+b);
    }
    public void add(int a,char ch){
        System.out.println(a+" " + ch);
    }
    public static void main(String[]args){
        MethodOverloadding obj=new MethodOverloadding();
        obj.add(45);
        obj.add(30,40);
        obj.add(2,5,7);
        obj.add("ram",76.09);
        obj.add(40,'R');

    }

}
