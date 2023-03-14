import java.util.Scanner;

public class StartPattern_G {
    public static void main(String[] args) {
//        Scanner s = new Scanner(System.in);
//        System.out.print("Enter a Number");
//        int n = s.nextInt();
//        for(int i = 0; i < n; i++){
//            for(int j = 0; j < n; j++){
//                if(j==1 && i>1 && i < 9 || i==1&&j>1&&j<9||i==9&&j>1&&j<9||j==9&&i>4&&i<9||i==5&&j>4&&j<9){
//                    System.out.print("*");
//                }else{
//                    System.out.print(" ");
//                }
//            }
//            System.out.println();

        int n=9;
        for(int i=0;i<=n;i++)
        {
            for(int j=0;j<=n;j++)
            {
                if(j==1&&i>1&&i<9||i==1&&j>1&&j<9||i==9&&j>1&&j<9||j==9&&i>4&&i<9||i==5&&j>4&&j<9)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }

            }
            System.out.println();
        }

    }
}
