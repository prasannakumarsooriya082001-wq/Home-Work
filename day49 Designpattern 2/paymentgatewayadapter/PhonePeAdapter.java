
package paymentgatewayadapter;


public class PhonePeAdapter implements PaymentGateWay
{
    PhonePe pp;

    PhonePeAdapter(PhonePe pp) 
    {
        this.pp = pp;
    }

    @Override
    public void pay() 
    {
        pp.phonePeMethod();
    }
    
}
