package interf;

import java.util.Scanner;

public class Prem_sagar implements In_op_inter {

    String name;
    double sal;
    public void input(){
        Scanner scr=new Scanner(System.in);
        System.out.println("pls enter yr name");
        name=scr.nextLine();
        System.out.println("pls enter yr sal");
        sal=scr.nextDouble();

    }
    public void output(){
        System.out.println(name+" "+sal);

    }
    public static void main(String[]args){
        In_op_inter i=new Prem_sagar();
        i.input(); i.output();
    }


}
