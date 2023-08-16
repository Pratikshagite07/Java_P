public class reverse {
    public static void main(String args[]){
        int number=456;
        int reverse=0;
        int reminder;
        while(number!=0){
            reminder=number%10;
            reverse=reverse*10+reminder;
            number/=10;
        }System.out.println("Reversed number"+reverse);
    }
    
}
