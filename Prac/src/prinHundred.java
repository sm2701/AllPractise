import java.util.Scanner;

public class prinHundred {
	 
	public void showHundred(int nums){
		
		if(nums > 00) {
			showHundred(nums-1);
			System.out.println(nums);
		}
		return ;
		
	}
	public static void main(String [] args) {
		System.out.println("please enter a number");
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		 int nums=sc.nextInt();
		prinHundred p=new prinHundred();
		p.showHundred(nums);
		
	}

}
