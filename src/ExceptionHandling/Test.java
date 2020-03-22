package ExceptionHandling;

public class Test {
    public static void main(String[] args) {

        System.out.println("Before the try block");

        try {
            System.out.println("Beginning ");

            int divide = 10 / 0;
            System.out.println(divide);

            System.out.println("Ending");
        }catch (Exception e){
            System.out.println("Error Orccurred ");
            System.out.println(e.getMessage());
            //e.printStackTrace();
        }



            System.out.println("After Catch block");
    }
}
