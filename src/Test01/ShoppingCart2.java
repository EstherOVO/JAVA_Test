package Test01;

import java.text.DecimalFormat;

public class ShoppingCart2 {

    private Item[] items;
    private int itemCount;

    public ShoppingCart2() {
        items = new Item[10];
    }

    public void addItem(Item item) {
        if (itemCount > 9) {
            System.out.println("장바구니는 10개의 상품만 담을 수 있습니다.");
        } else {
            items[itemCount] = item;
            itemCount++;
        }
    }

    public void printProductInfo() {
        DecimalFormat formatter = new DecimalFormat("###,###");
        System.out.println("= 장바구니 목록 =");
        for (int i = 0; i < itemCount; i++) {
            System.out.println("□ 상품명 : " + items[i].getProductName() + "\n□ 가격 : " + formatter.format(items[i].getPrice()) + "원 \n□ 수량 : " + formatter.format(items[i].getQuantity()) + "개");
            System.out.println("----------");
        }
    }

    public void getTotal() {
        int sum = 0;
        for (int i = 0; i < itemCount; i++) {
            sum += items[i].getSum();
        }

        System.out.println("▣ 최종 가격 : " + sum);
    }
}
