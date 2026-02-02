class GradeCalculation
{
	public static void main(String[] args)
	{
		int mark = 92;
		
		String grade = (mark >= 90) ? "Grade A" : 
					   (mark >= 70) ? "Grade B" :
					   (mark >= 40) ? "Grade C" : "Fail";
					   
		System.out.println(grade);
	}
}