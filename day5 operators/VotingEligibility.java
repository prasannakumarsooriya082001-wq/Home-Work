class VotingEligibility
{
	public static void main(String[] args)
	{
		int age = 20;
		boolean citizen = true;
		
		String eligible = ((age >=18) && citizen) ? "Eligible To Vote" : "Not Eligible To Vote";
		
		System.out.println(eligible);
	}
}