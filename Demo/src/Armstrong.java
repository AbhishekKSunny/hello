import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

int n = 371;
int original, remainder,result=0;
original = n;
while(n!=0)
{
	remainder = original%10;
	result = result+(remainder*remainder*remainder);
	original /= 10;	
}
if(result == n)
{
	System.out.println("Armstrong");
}
else
{
	System.out.println("Not Armstrong");
}
	}

}
