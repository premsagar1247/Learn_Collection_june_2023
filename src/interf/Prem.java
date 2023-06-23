package interf;

import java.util.Scanner;

public class Prem implements Client{

    String name;
    double salary;
    public void input(){
        Scanner scr=new Scanner(System.in);
        System.out.println("pls enter your name");
        name=scr.nextLine();
        System.out.println("pls enter your salary");
        salary=scr.nextDouble();
    }
    public void output (){
        System.out.println(name+" "+salary);

    }
    public static void main(String[]args){
        Client c=new Prem();
        c.input(); c.output();
    }
}
