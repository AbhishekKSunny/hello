
public class sorting {    //Bubble Sort

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ar[] = {12,11,13,55,45};
for(int i=(ar.length-1);i>=0;i--)
{
	for(int j=1;j<=i;j++)
	{
		if(ar[j-1]>ar[j])
		{
			int temp = ar[j-1];
			ar[j-1] = ar[j];
			ar[j] = temp;
		}
	}
}
for(int i=0;i<=ar.length-1;i++)
{
	System.out.print(ar[i] + " ");
}
	}

}
