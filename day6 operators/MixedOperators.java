class MixedOperators
{
	public static void main(String[] args)
	{
		int a = 10;
		int b = 5;
		int c = 15;
		
		System.out.println(((a + b) != c) && (a > b) || (c >= b));
		System.out.println(((a / b) != 0) && !(c == (a += b)));
		
	}
}