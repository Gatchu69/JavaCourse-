public class ChapterOne {
    public static void main (String[] args){
        // 1.1
        System.out.println("Welcome to Java");
        System.out.println("Welcome to Computer science");
        System.out.println("Programing is fun");

        // 1.2
        for (int i = 0; i < 5; i++) {
            System.out.println("Welcome to Java");
        }

        // 1.3

        System.out.println("    J     A    V     V    A");
        System.out.println("    J    A A    V   V    A A");
        System.out.println("J   J   AAAAA    V V    AAAAA");
        System.out.println(" J J   A     A    V    A     A");

        // 1.4
        int a;
        System.out.println("a   a^2  a^3");
        for (a = 1; a <=4; a++ ) {
            System.out.print(a + "   ");
            System.out.print(a*a + "    ");
            System.out.print(a*a*a);
            System.out.print("\n");
        }

        // 1.6
        int z = 0;
        for (int i = 1; i <= 9; i++){
            z += i;
        }
        System.out.println(z);

        // 1.7
        double p = 4 * (1.0 - 1/3F + 1/5F -1/7F + 1/9F - 1/11F + 1/13f);
        System.out.println(p);

        // 1.8
        double rad = 5.5;
        double perimeter = 2 * rad * p;
        System.out.println(perimeter);
        double area = rad * rad * p;
        System.out.println(area);

        // 1.9
        float width = 4.5F;
        float height =7.9F;
        float rectArea = width*height;
        System.out.println(rectArea);

        // 1.10
        int km = 14;
        float mil = 14/1.6f; //8.75 mil
        float time =  0.75f; //H
        double avgSpeed = mil / time;
        System.out.println("Average Speed in miles: " + avgSpeed);

        // 1.11


        // 1.12
        double distance= 24 * 1.6f;
        double time2 = 1.6763; //H
        double speedInKm = distance / time2;
        System.out.println("Average speed in KM " + speedInKm);

        // 1.13

    }
}
