public class Main {

    public static void main(String[] args)
    {
        ProductManager productManager = new ProductManager();
        System.out.println("Danh sách sản phẩm ban đầu");
        productManager.productDisplay();

        System.out.println("Danh sách sản phẩm thứ tự tăng dần theo giá ");
        productManager.ascendingPriceOrder();

        System.out.println("Danh sách sản phẩm thứ tự giảm dần theo giá ");
        productManager.descendingPriceOrder();


    }
}
