package ExceptionHandling;

public class FinallyBlock {

    public static void main(String[] args) {

        //udemy video

        final int x = 100;
        //x=200;cannot do it , Difference between final vs finally

        try{

            //DB Connectio
            //Executing some quering
            //Validating the data and comparing from websites
            //Closing Connection


        }catch(Throwable e){
            System.out.println("Error Occurred ");

        }finally{

            System.out.println("Clsoing the DB Connection");
        }
    }
}
