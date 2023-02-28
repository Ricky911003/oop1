import java.util.Scanner;

public class A1103351_0224_2{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("請輸入攝氏溫度:(℃)");
        double C = input.nextDouble();

        double F = (C * 9/5) + 32;
        System.out.printf("華氏溫度為:%.1f",F);
        
    }
}



