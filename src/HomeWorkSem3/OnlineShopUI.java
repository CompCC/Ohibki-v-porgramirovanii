package HomeWorkSem3;

import java.util.Scanner;

public class OnlineShopUI {
    public static void main(String[] args) throws RuntimeException  {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите ID товара: ");
        int productId = scanner.nextInt();
        System.out.print("Введите количество: ");
        int quantity = scanner.nextInt();
        if (quantity < 0 ){
            throw new RuntimeException("Количество товара не может быть отрицательным!");
        }
        double totalPrice = 0;
        try {
            totalPrice = ShopManager.purchaseProduct(productId, quantity);
        }catch (ProductDoesNotExistException e){
            System.out.println(e.getMessage());
        }catch (NotEnoughtProductExeption e){
            System.out.println(e.getMessage());
        }


        System.out.println("Total price: $" + totalPrice);
    }
}
