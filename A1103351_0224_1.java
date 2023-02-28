import java.util.Scanner;

public class A1103351_0224_1{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("請輸入任意整數:");
        int num = input.nextInt();

        if(num % 2 == 0){
            System.out.printf("%d 此數為偶數", num);
        }else{
            System.out.printf("%d 此數為奇數", num);
        }

    }
}