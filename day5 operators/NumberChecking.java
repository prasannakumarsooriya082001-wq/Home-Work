class NumberChecking
{
	public static void main(String[] args)
	{
		int num = -8;
		
		
		String check = (num > 0) ? "Positive Number" : 
					   (num < 0) ? "Negative Number" :
								   "Zero";
		
		System.out.println(check);
	}
}