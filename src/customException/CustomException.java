
package customException;

public class CustomException {
    public void DoVoting(int age)throws AgeNotEligible{
        if (age>18){
            System.out.println("person is eligible for do voting");
        }
        else {
            throw new AgeNotEligible("person is eligible for do voting");
        }

    }
    public static void main(String[]args){
        CustomException obj=new CustomException();
        try {
            obj.DoVoting(12);
        }
        catch (Exception e){
            System.out.println("Exception occured" +e);
        }
    }

}
