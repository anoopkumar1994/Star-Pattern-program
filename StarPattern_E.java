import java.util.Scanner;

public class StarPattern_E {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print(" Enter a Number ");
        int n = s.nextInt();
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(j == 0 || i == n-1 || i == (n-1)/2 || i == 0 ){
                    System.out.print(" *");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
