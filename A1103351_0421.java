import java.util.Scanner;
public class A1103351_0421 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str;
        boolean iscorrect;
        do{
            System.out.printf("請輸入電子郵件：");
            iscorrect = true;
            str = input.nextLine();
            if(str.matches("^[a-z0-9._%+-]+@[a-z0-9.-]+\\.[a-z]{2,}$")){
                System.out.printf("true\n");
            }else{
                System.out.printf("false\n");
                iscorrect = false;
            }
        }while(!iscorrect);
       
    }
}
