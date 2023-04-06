import java.util.Scanner;
class HarshadNo 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter Number : ");
		int ip = sc.nextInt();

		if(checkHarshadNo(ip))
		{
			System.out.println("It's a harshad number");
		}
		else
		{
			System.out.println("It's not a harshad number");
		}
	}

	public static boolean checkHarshadNo(int num)
	{
		int sum = 0;

		while(num > 0)
		{
			int rem = num % 10;
				sum = sum + rem;
				num = num/10;
		}

		if(num % sum == 0)
		{
			return true;
		}
		return false;
	}

}
