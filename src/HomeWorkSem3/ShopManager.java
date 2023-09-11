package HomeWorkSem3;

public class ShopManager {
    public static double purchaseProduct(int productId, int quantity) throws NotEnoughtProductExeption, ProductDoesNotExistException {
            Product product = ProductDatabase.getProduct(productId);
        if (product == null){
            throw new ProductDoesNotExistException("Товар закончился!");
        }
        if (quantity > product.getAvailableQuantity()){
            throw new NotEnoughtProductExeption("Для заказа, недостаточно товара!");
        }

        double totalPrice = product.getPrice() * quantity;
        return totalPrice;
    }
}
