import java.util.Scanner;

public class StarPattern_fullName {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print(" Enter a number");
        int n = s.nextInt();

        // A Alphabet
        for(int i = 0; i < n; i++){
            for(int j =0; j < n; j++){
                if( i == 0 && j > 0 && j < (n-1)/2 || j == 0 && i > 0 || i == (n-1)/2 && j <= (n-1)/2 || j == (n-1)/2 && i > 0){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.print(" ");

            // N Alphabet
            for(int j = 0; j < n; j++){
                if(j == 0 || j == n-1 || i == j){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.print("  ");

            //  O Alphabet
            for(int j=0;j<=n;j++) {
                if (i == 0 && j > 0 && j < (n - 1) || i == (n - 1) && j > 0 && j < (n - 1) || j == 0 && i > 0 && i < (n - 1) || j == (n - 1) && i > 0 && i < (n - 1)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
                System.out.print(" ");
            }

            // O Alphabet
            for(int j=0;j<=n;j++) {
                if (i == 0 && j > 0 && j < (n - 1) || i == (n - 1) && j > 0 && j < (n - 1) || j == 0 && i > 0 && i < (n - 1) || j == (n - 1) && i > 0 && i < (n - 1)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
                System.out.print(" ");
            }

            //  P Alphabet

            for(int j = 0; j < n; j++){
                if(j == 0 && i > 0 || i == 0 && j > 0 || j == n-1 && i <= (n-1)/2 || i == (n-1)/2 && j < n-1 ){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
