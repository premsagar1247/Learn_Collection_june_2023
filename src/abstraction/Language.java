package abstraction;
// making sub class and extend by super class (abtarct method implimentation)
public class Language extends Programming{

    @Override
    public void HTML_Prog() {
        System.out.println("this is developed by tim berner ");

    }

    @Override
    public void JAVA_Prog() {
        System.out.println("this is developed by Games Gosling ");


    }
    public static void main(String[]args){
        Programming l=new Language(); // MAKING obj by super class/sub class Reference
        l.HTML_Prog();// call by obj.method name
        l.JAVA_Prog();// call by obj.method name
    }
}
