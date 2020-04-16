import java.util.Scanner;

public class StringPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String reverse = "";
System.out.println("Enter the value");
Scanner s = new Scanner(System.in);
String original = s.nextLine();
for(int i=original.length()-1;i>=0;i--)
{
	reverse = reverse +original.charAt(i);
}
if(original.equals(reverse))
{
	System.out.println("Anagram");
}
else
{
	System.out.println("Not Anagram");
	}

}
}
