public class ChapterNineObjectsAndClasses {
    public static void main(String[] args){
        // 9.1
        Rectangle rectangle = new Rectangle();
        Rectangle rectangle1 = new Rectangle(4, 40);
        Rectangle rectangle2 = new Rectangle(3.5, 35.9);

        System.out.println(rectangle.getWidth());
        System.out.println(rectangle.getHeight());
        System.out.println(rectangle.getArea());
        System.out.println(rectangle.getPerimeter());

        System.out.println("\n" + rectangle1.getWidth());
        System.out.println(rectangle1.getHeight());
        System.out.println(rectangle1.getArea());
        System.out.println(rectangle1.getPerimeter());

        System.out.println("\n" + rectangle2.getWidth());
        System.out.println(rectangle2.getHeight());
        System.out.println(rectangle2.getArea());
        System.out.println(rectangle2.getPerimeter());

        //9.2
        Stock stock = new Stock("ORCL", "Oracle Corporation", 34.5,34.35);
        System.out.println(stock.getChangePercent());

    }
}
