public class RegularPolygonTest {
    public static void main(String[] args){
        RegularPolygon polygon1 = new RegularPolygon();
        System.out.println("---- Polygon 1 ----");
        System.out.println(polygon1.getPerimeter());
        System.out.println(polygon1.calculateArea());

        RegularPolygon polygon2 = new RegularPolygon(6, 4);
        System.out.println("---- Polygon 2 ----");
        System.out.println(polygon2.getPerimeter());
        System.out.println(polygon2.calculateArea());

        RegularPolygon polygon3 = new RegularPolygon(10, 4, 5.6, 7.8);
        System.out.println("---- Polygon 3 ----");
        System.out.println(polygon3.getPerimeter());
        System.out.println(polygon3.calculateArea());

    }
}
