public class twentythree {
            public static void main(String[] args) {
        
                  int flag,i;
                  int num1=1;
                  int num2=20;
        
                  for(i=num1;i<=num2;i++) {
        
                      flag=0;
        
                      for(int j=2;j<i;j++) {
        
                          if(i%j==0) {
        
                              flag=1;
        
                              break;
        
                          }
        
                      }
        
                      if(flag==0)
        
                          System.out.println(i);
        
                  }
        
            }
        
        
        
        }
    
    