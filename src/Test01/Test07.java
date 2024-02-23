package Test01;

public class Test07 {
    public static void main(String[] args) {

        ShoppingCart shoppingCart= new ShoppingCart();

        Item item1 = new Item("당근", 1500, 3);
        Item item2 = new Item("양파", 1000, 1);

        shoppingCart.addItem(item1);
        shoppingCart.addItem(item2);

        Item item3 = new Item("사과", 1700, 1);
        Item item4 = new Item("귤", 1800, 1);
        Item item5 = new Item("호박", 2000, 2);
        Item item6 = new Item("감자", 3000, 3);
        Item item7 = new Item("고구마", 2000, 5);
        Item item8 = new Item("소고기", 10000, 1);
        Item item9 = new Item("돼지고기", 9000, 5);
        Item item10 = new Item("아이스크림", 1100, 4);
        Item item11 = new Item("감", 1500, 1);

        shoppingCart.addItem(item3);
        shoppingCart.addItem(item4);
        shoppingCart.addItem(item5);
        shoppingCart.addItem(item6);
        shoppingCart.addItem(item7);
        shoppingCart.addItem(item8);
        shoppingCart.addItem(item9);
        shoppingCart.addItem(item10);
        shoppingCart.addItem(item11);

        shoppingCart.printProductInfo();
        shoppingCart.getTotal();
    }
}
