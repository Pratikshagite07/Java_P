public class Throw {
    public static void main(String args[]){
        try{
            int a=12;
            int b=0;
            if (b==0)
            throw new ArithmeticException("cannot find");
            double c =a/b;
            System.out.println(c);
        }catch(Exception ex){
            ex.printStackTrace();
            System.out.println("not possible");
        }
    }
}
