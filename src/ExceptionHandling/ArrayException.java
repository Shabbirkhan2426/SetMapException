package ExceptionHandling;

public class ArrayException {
    public static void main(String[] args) {

        System.out.println("Beginning");
        try {

            int i[] = new int[4];
            i[5] = 100;
        }catch(Exception e){
            System.out.println("Error Occured ");

            //scrrennshot
            //send main with attached screenshot and print error message in mail subject of the mail
            e.printStackTrace();
        }

        System.out.println("Ending");
    }
}
