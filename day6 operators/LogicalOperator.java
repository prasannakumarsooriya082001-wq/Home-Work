class LogicalOperator
{
	public static void main(String[] args)
	{
		int a = 10;
		int b = 5;
		
		System.out.println("AND Operator : " + ((a > b) && (b != 0)));
		
		System.out.println("OR Operator : " + ((a > b) || (b == 0)));
		
		System.out.println("NOT Operator : " + !(a > b));
	}
}