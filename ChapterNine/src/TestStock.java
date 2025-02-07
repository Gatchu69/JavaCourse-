public class TestStock {
    public static void main(String[] args){
        Stock stock = new Stock("ORCL", "Oracle Corporation", 34.5, 34.35);
        System.out.println(stock.name);
        System.out.println(stock.symbol);
        System.out.println(stock.getChangePercent());
    }
}
