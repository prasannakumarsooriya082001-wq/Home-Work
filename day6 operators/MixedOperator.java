class MixedOperator
{
	public static void main(String[] args)
	{
		int a = 10;
		int b = 5;
		int c = 15;
		
		System.out.println("Arithmetic operators.......");
        System.out.println((a + b));
        System.out.println((c - a));
        System.out.println((a * b));
        System.out.println((c / b));



		System.out.println("Relational operators.......");
        System.out.println((a > b));
        System.out.println((b == a));
        System.out.println((a != b));



		System.out.println("Logical operators.......");
        System.out.println(((a > c) && (b >= a)));
        System.out.println(((a > c) || (b <= c)));
        System.out.println(!(a == c));
		
	}
}