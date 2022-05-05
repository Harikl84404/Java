package practiceProgram;

public class Pre_PostDecrement {
	int a=10,b,c;
   public void preDecrement()
   {
	   b=--a;
	   c=--b;
	   System.out.println(a);
	   System.out.println(b);
	   System.out.println(c);
	   
   }
   public void postDecrement()
   {
	   b=a--;
	   c=b--;
	   b=--a+a--;
	   System.out.println(a);
	   System.out.println(b);
	   System.out.println(c);
	   
   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pre_PostDecrement pre_post=new Pre_PostDecrement();
		
		pre_post.preDecrement();
		pre_post.postDecrement();
		

	}

}
