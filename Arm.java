
public class Arm {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,sun=0,temp,r;
		Scanner in =new Scanner(System.in);
		System.out.out.println("Enter a number to check if it is an armstong number");
	n=in.nextInt();
	
	temp=n;
	while(temp!=0)
	{
		r=temp%10;
		sum+r*r*r;
		temp=temp/10;
	}
	if(n==sum)
		System.out.println("Enter number is an armstong number");
	else
		System.out.println("enter number is an armstong number");
	}

	}


