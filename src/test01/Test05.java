package test01;

import java.text.DecimalFormat;

public class Test05 {

    public static void main(String[] args) {

        ProductOrder product1 = new ProductOrder("물", 1000, 1);
        ProductOrder product2 = new ProductOrder("아이스 아메리카노", 2500, 5);
        ProductOrder product3 = new ProductOrder("참치 김밥", 4500, 2);

        System.out.println("= 주문 목록 =");
        product1.printOrder();
        product2.printOrder();
        product3.printOrder();

        int[] arr = {product1.getTotalPayment(), product2.getTotalPayment(), product3.getTotalPayment()};
        DecimalFormat formatter = new DecimalFormat("###,###");
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println("▣ 주문하신 물건의 합계 : " + formatter.format(sum) + "원");
    }
}
