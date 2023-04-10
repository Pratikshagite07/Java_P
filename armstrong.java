public class twenty {
      public static void main(String[] args) {

        int number=157, Originalnumber,reminder,result=0;
        Originalnumber=number;
      while(Originalnumber  !=0)
        {
            reminder=Originalnumber%10;
            result+=result+Math.pow(reminder, number);
            Originalnumber/=10;
        }
        if(result==number){
            System.out.println(number +"armstrong");
        }
        else{
            System.out.println(number+"not armstrong");
        }
      }
    }

      
        