public class Fan {
    public static final int SLOW = 1;
    public static final int MEDIUM = 2;
    public static final int FAST = 3;

    private int speed = SLOW;
    private boolean on = false;
    private double radius = 5;

    String color = "Blue";

    public Fan() {
    }

    public int getSpeed() {
        return speed;
    }

    public boolean isOn() {
        return on;
    }

    public double getRadius() {
        return radius;
    }

    public void setSpeed(int speed) {
        if(speed == SLOW || speed == MEDIUM || speed == FAST){
            this.speed = speed;
        } else {
            System.out.println("Invalid speed setting");
        }
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        if(on) {
            return "Fan{" +
                    "speed = " + speed +
                    ", on = " + on +
                    ", radius = " + radius +
                    ", color = " + color + '\'' +
                    '}';
        } else {
            return "Fan { color  = " + color +
                    ", radius = " + radius +
                    ", fan is off }";
        }
    }
}
