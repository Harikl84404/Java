package practiceProgram;

public class Vote {
	public int elligibleFOrVote(int age)
	{
		
		if(age>=20)
		{
			System.out.println("the person is elligible to vote"+age);
			
		}
		else
		{
			System.out.println("the person is not elligible to vote"+age);
			
		}
		return(age);
	}
	
	

	public static void main(String[] args) {
	// TODO Auto-generated method stub
	Vote V=new Vote();
	V.elligibleFOrVote(20);
	V.elligibleFOrVote(25);
	V.elligibleFOrVote(18);
	
	
		

	}

}
