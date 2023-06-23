package Methods;

public class FF {
    static int Factorial(int n){
if (n==1)
return 1;
else return (n*Factorial(n-1));

    }
    public static void main(String[]args){
        System.out.println("factorial"+Factorial(5));
    }
}
