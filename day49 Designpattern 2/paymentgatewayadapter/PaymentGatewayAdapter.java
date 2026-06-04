
package paymentgatewayadapter;


public class PaymentGatewayAdapter {

    
    public static void main(String[] args) 
    {
        GooglePay gp = new GooglePay();
        PhonePe pp = new PhonePe();
        Paytm pt = new Paytm();
        
        
        PaymentGateWay gpay = new GooglePayAdapter(gp);

        PaymentGateWay phonepe = new PhonePeAdapter(pp);

        PaymentGateWay paytm = new PaytmAdapter(pt);

        gpay.pay();
        phonepe.pay();
        paytm.pay();
    }
    
}
