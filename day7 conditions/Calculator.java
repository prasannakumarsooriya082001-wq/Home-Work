class Calculator
{
	public static void main(String[] args)
	{
		int firstNumber = 10;
		int secondNumber = 20;
		
		char operator = '/';
		
		if (operator == '+')
		{
			System.out.println(firstNumber + secondNumber);
		}
		else if (operator == '-')
		{
			System.out.println(firstNumber - secondNumber);
		}
		else if (operator == '*')
		{
			System.out.println(firstNumber * secondNumber);
		}
		else if (operator == '/')
		{
			System.out.println(firstNumber / secondNumber);
		}
	}
	
}