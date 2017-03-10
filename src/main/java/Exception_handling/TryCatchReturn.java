package Exception_handling;

/**
 * Created by AK on 2/24/17.
 */
public class TryCatchReturn {

    public static void main(String[] args){

       String str="";
        try {
            execute();
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println(str);
    }


    public static void execute() throws Exception{
        try{
            //Do blah
            int i=0;
            return; //Assuming everything goes well, return success.
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
