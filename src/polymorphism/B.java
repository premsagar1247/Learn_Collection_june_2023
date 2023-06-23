package polymorphism;

public class B extends A {
    @Override
    public void div(){
        int a=100;
        int b=5;
        int c =a/b;
        System.out.println(c);
    }
    public static void main(String[]args){
        B obj=new B();
        obj.div();
    }
}
