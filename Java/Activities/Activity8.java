package activities;

class CustomException extends Exception{
    private String str = null;

    public CustomException(String str){
        this.str = str;
    }
    @Override
    public String getMessage(){
        return str;
    }
}

public class Activity8 {
    public static void main(String[] args)  {
        try {
            Activity8.exceptionTest("Will print to console");
            Activity8.exceptionTest(null);
            Activity8.exceptionTest("Won't Execute");
        }
        catch (CustomException e) {
            System.out.println(e.getMessage());
        }

    }
    static void exceptionTest(String str) throws CustomException{
        if(str == null){
            throw new CustomException("String Value is null");
        }
        else{
            System.out.println(str);
        }
    }
}
