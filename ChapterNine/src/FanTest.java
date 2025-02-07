public class FanTest {
    public static void main(String[] args){
        Fan fan1 = new Fan();
        fan1.setOn(true);
        fan1.setSpeed(Fan.FAST);
        fan1.setRadius(10);
        fan1.color = "Yellow";
        System.out.println(fan1.toString());

        Fan fan2 = new Fan();
        fan2.setSpeed(Fan.MEDIUM);
        fan2.setRadius(5);
        fan2.color = "Blue";
        System.out.println(fan2.toString());
    }
}
