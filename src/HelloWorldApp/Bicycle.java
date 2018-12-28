package HelloWorldApp;

public class Bicycle {

    // 预定义变量
    public int cadence;
    public int gear;
    public int speed;

    // 构造函数
    public Bicycle(int startCadence, int startSpeed, int startGear) {
        gear = startGear;
        cadence = startCadence;
        speed = startSpeed;
    }

    // 设置踏板
    public void setCadence(int newValue) {
        cadence = newValue;
    }

    // 设置齿轮
    public void setGear(int newValue) {
        gear = newValue;
    }

    // 减速
    public void applyBrake(int decrement) {
        speed -= decrement;
    }

    // 加速
    public void speedUp(int increment) {
        speed += increment;
    }

    public static void main(String[] args) {
        Bicycle myBike = new Bicycle(30, 0, 8);

        System.out.println(myBike.cadence + " " + myBike.gear + " " + myBike.speed);
    }
}

