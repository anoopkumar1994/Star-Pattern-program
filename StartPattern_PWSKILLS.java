import java.util.Scanner;

public class StartPattern_PWSKILLS {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a Number");
        int n = s.nextInt();

        // P Alphabet
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(j == 0 || i == 0 || i == (n-1)/2 || j == n-1 && i < (n-1)/2 ){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.print(" ");

            // W Alphabet
                for(int j = 0; j < n; j++){
                    if(j == 0 || j == n-1 ||  i + j == n-1 && j <= (n-1)/2 || i == j && i >= (n-1)/2){
                        System.out.print("*");
                    }else{
                        System.out.print(" ");
                    }
                }
                System.out.print("           ");

            // S Alphabet
                for(int j = 0; j < n; j++){
                    if(j == 0 && i < (n-1)/2 || i == 0 || i == (n-1)/2 || j == n-1 && i > (n-1)/2 || i == n-1 ){
                        System.out.print("*");
                    }else{
                        System.out.print(" ");
                    }
                }
            System.out.print("   ");

                // K Alphabet
                for(int j = 0; j < n; j++){
                    if(j == 0 || i+j == (n-1)/2 || i-j == (n-1)/2){
                        System.out.print("*");
                    }else{
                        System.out.print(" ");
                    }
                }
            System.out.print("");

                // I Alphabet
                for(int j = 0; j < n; j++){
                    if(i == 0 || i == n-1 || j == (n-1)/2){
                        System.out.print("*");
                    }else{
                        System.out.print(" ");
                    }
                }
            System.out.print("   ");
                // L Alphabet

            for(int j = 0; j < n; j++){
                if(j == 0 || i == n-1){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.print("  ");

            // L Alphabet
            for(int j = 0; j < n; j++){
                if(j == 0 || i == n-1){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
