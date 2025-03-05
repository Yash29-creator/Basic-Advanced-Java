package control_flow_statements;
public class breakstatement {
	public static void main(String[] args) {
		int sum=0;
		int num=0;
		while(num<=20)
		{
			num++;
			sum=sum+num;
			if(sum>=100)
			{
				break;
			}
			System.out.println("the number is : " + num);
			System.out.println("the sum is : " + sum);
		}

	}

}


