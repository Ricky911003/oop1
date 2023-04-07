import java.util.Scanner;
class animal{
    String name;
    double height;
    int weight;
    int speed;

    animal(String name, double height, int weight, int speed){
        this.name = name;
        this.height = height;
        this.weight = weight;
        this.speed = speed;
    }
    void show(){
        System.out.printf("姓名: %s 身高: %.1f 體重: %d 速度: %d%n", name, height, weight, speed);
    }

    double distance(int time, double acceleration){
        return time*this.speed*acceleration;
    }

    double distance(int time){
        return this.speed*time;
    }

}



public class A1103351_0331_1 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int time;
        double acceleration;
        animal[] arr = new animal[4];
        arr[0] = new animal("雪寶", 1.1, 52, 100);
        arr[1] = new animal("驢子", 1.5, 99, 200);
        arr[2] = new animal("安娜", 1.7, 48, 120);
        arr[3] = new animal("愛莎", 1.7, 50, 120);


        for(animal thisanimal : arr){
            thisanimal.show();
            System.out.printf("請輸入時間與加速度(不輸入加速度的話請按0): ");
            time = input.nextInt();
            acceleration = input.nextDouble();
            if(acceleration!=0){
                System.out.printf("跑動距離為%.2f%n",thisanimal.distance(time, acceleration));
            }else{
                System.out.printf("跑動距離為%.2f%n",thisanimal.distance(time));
            }
            
        }
    }

    
}
