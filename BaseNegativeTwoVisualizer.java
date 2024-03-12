public class BaseNegativeTwoVisualizer {
    public static void main(String[] args) {
        
        System.out.println("in base -2:                        n for negative, p for positive "); 
        
        int neg = 0;
      
      for(int j=0; j<50; j++){ //change 50 to 2147483647 to see all possible base neg 2 numbers representable by an int
          
        int pos = neg;
        
        for(int i=1; i<32; i=i+2)
        {
            
            int mask = 1 << i;
            int neg_at_i = neg & mask;
            
            if(neg_at_i != 0)
            {
            pos = pos - ((int) (2*Math.pow(2,i)));
            }
        }
        
        //Sys.out.p neg to byte
        String byt = "";
        for (int i = 1 << 30; i > 0; i = i / 2)
        {
          if((neg & i) != 0)
          {
            byt = byt + "1";
          }
          else
          {
            byt = byt + "0";
          }
        }
        
        
        String num = byt + ": ";
        
        if(pos<0){
            
            for(int i=0; i>pos; i--)
            {
                num = num + "n";
            }
            System.out.println(num+"\n");
            
        }else{
        
            for(int i=0; i<pos; i++)
            {
                num = num + "p";
            }
            System.out.println(num+"\n");
        }
        
        neg++;  
                  
      }
        
        
    }
}