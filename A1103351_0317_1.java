import java.util.Scanner;

public class A1103351_0317_1 {
    public static void  main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.printf("請輸入n值: ");
        int n = input.nextInt();
        System.out.printf("請輸入n值: ");
        int m = input.nextInt();

        int nm[][] = new int[n][m];
        for(int i = 0; i <nm.length; i++){
            for(int j = 0; j<nm[i].length ; j++){
                nm[i][j]=(i+1)*(j+1);
                // System.out.printf("%d", nm[i][j]);
            }
            // System.out.printf("\n");
        }

        // for(int i=0; i<nm.length; i++){
        //     for(int num: nm[i]){
        //         System.out.printf("%-4d",num);
        //     }
        //     System.out.printf("\n");
        // }

        for(int[] arr: nm){
            for(int i: arr){
                System.out.printf("%-4d", i);
            }
            System.out.println();
        }

    }
}
