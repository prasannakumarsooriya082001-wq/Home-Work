class Grade
{
	public static void main(String[] args)
	{
		int mark = 82;
		
		if (mark >= 90)
		{
			System.out.println("Grade A");
		}
		else if (mark >= 75)
		{
			System.out.println("Grade B");
		}
		else if (mark >= 50)
		{
			System.out.println("Grade C");
		}
		else if (mark < 50)
		{
			System.out.println("Fail");
		}
	}
}