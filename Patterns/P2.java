
import java.util.Scanner;

public class P2 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for(int j=1;j<=i;j++){
                System.out.print(i);
            }
            System.out.println();
        }
    }
}

/*
 1
 22
 333
 4444
 55555

1
12
123
1234
12345
 */