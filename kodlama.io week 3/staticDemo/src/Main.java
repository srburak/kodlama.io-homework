public class Main {
    public static void main(String[] args) {
        ProductManager manager = new ProductManager();
        Product product = new Product();
        product.price = 10;
        product.name = "Mouse";
        //product.id = 01;
        manager.add(product);

        DataBaseHelper.Crud.Delete();
    }
}