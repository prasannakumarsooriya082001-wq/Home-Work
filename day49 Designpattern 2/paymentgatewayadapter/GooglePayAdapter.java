
package paymentgatewayadapter;


public class GooglePayAdapter implements PaymentGateWay
{
    GooglePay gp;

    GooglePayAdapter(GooglePay gp) 
    {
        this.gp = gp;
    }

    @Override
    public void pay() 
    {
        gp.googlePayMethod();
    }
}
