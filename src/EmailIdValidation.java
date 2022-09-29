import java.util.Scanner;

//write a program to search a string entered by a user from the array of strings.
public class EmailIdValidation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the email id to be searched");
		String email=sc.next();
		String[] arr= {"priya@gmail.com","test@gmail.com","loop@gmail.com","vinay@gmail.com"};
		for(String str:arr) 
		{
			if(str.compareTo(email)==0)
			{
				System.out.println("Email id found");
				x=1;
			}
		}
		if(x==0)
			System.out.println("Email id not found");
	}

}
