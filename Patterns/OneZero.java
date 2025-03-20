public class OneZero {
    
    public static void main(String[] args) {
        int k = 1;
        for (int i = 0; i < 5; i++) {

            if(i%2==0) {
                k = 1;
            }
            else{
                k=0;
            }
            
            for (int j = 0; j <= i; j++) {

               
                System.out.print(k);
                k = 1 - k;
            }
            
            System.out.println();
        }
    }
}
