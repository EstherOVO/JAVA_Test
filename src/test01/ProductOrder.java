package test01;

import java.text.DecimalFormat;

public class ProductOrder {

    private String productName;
    private int price;
    private int quantity;

    public ProductOrder(String productName, int price, int quantity) {
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }

    public void printOrder() {
        DecimalFormat formatter = new DecimalFormat("###,###");
        System.out.println("□ 상품명 : " + productName + "\n□ 가격 : " + formatter.format(price) + "원\n□ 수량 : " + formatter.format(quantity) + "개");
        System.out.println("----------");
    }

    public int getTotalPayment() {
        return price * quantity;
    }
}
