
package paymentgatewayadapter;


public class PaytmAdapter implements PaymentGateWay
{
    Paytm pt;

    PaytmAdapter(Paytm pt) 
    {
        this.pt = pt;
    }

    @Override
    public void pay() 
    {
        pt.paytmMethod();
    }
    
}
