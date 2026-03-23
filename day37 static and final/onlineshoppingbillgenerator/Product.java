
package onlineshoppingbillgenerator;


public class Product 
{
    int productId;
    String productName;
    double price;
    int quantity;
    
    static String shopName;
    double gstPercent = 0.18;
    
    final int DELIVERY_CHARGE = 50;

    public Product(int productId, String productName, double price, int quantity) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }
    
    double calculateSubTotal()
    {
        return price * quantity;
    }
    
    double calculateGST()
    {
        return calculateSubTotal() * gstPercent;
    }
    
    double calculateFinalBill()
    {
        return calculateSubTotal() + calculateGST() + DELIVERY_CHARGE;
    }
    
    void display()
    {
        System.out.println("Shop Name : "+shopName);
        System.out.println("Product Id : "+productId);
        System.out.println("Product Name : "+productName);
        System.out.println("SubTotal : "+calculateSubTotal());
        System.out.println("GST : "+calculateGST());
        System.out.println("Delivery Charge : "+DELIVERY_CHARGE);
        System.out.println("Final Bill : "+calculateFinalBill());
    }
}
