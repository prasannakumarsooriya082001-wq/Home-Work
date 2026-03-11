
package onlinefoodordersystem;


public class FoodOrder extends Customer implements Order
{
    String foodItemName;
    int price;
    
    public FoodOrder(String name, String foodItemName, int price) {
        super(name);
        this.foodItemName = foodItemName;
        this.price = price;
    }

    @Override
    public void placeOrder() 
    {
        System.out.println("Order Placed Scuccessfully ...");
    }

    @Override
    public void showBill() 
    {
        System.out.println("Customer Name : "+ name);
        System.out.println("Food Item Name : "+ foodItemName);
        System.out.println("Price : "+price);
    }
    
}
