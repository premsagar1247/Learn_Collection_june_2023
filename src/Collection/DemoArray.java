package Collection;

import java.util.Arrays;

public class DemoArray {
    public static void main(String[]args){
    String [] cars={"VOLVO","BMW","HERO","SUZUKI"};
    cars[3]="hyundai"; // here we replacing suzuki from hyundai

        System.out.println(cars[1]);

        Integer [] marks={98,99,97,95,96};
        System.out.println("before replce marks are "+marks[0]);
        marks[0]=90;
        System.out.println("after replce marks are "+marks[0]);

    }

}
