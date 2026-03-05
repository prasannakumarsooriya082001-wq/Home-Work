class AccountProcess
{
	double amount = 1000;
	
	double depositAmount(double deposit)
	{	
		amount += deposit;
		return deposit;
	}
	
	double displayAmount()
	{	
		return amount;
	}
	
	double withDrawAmount(double withdraw)
	{		
		
		amount -= withdraw;
		return withdraw;	
	}
}