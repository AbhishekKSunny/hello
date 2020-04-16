import java.util.ArrayList;
import java.util.Collections;

public class collectionsSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<String> al = new ArrayList<String>();
ArrayList<Integer> ad = new ArrayList<Integer>();
al.add("Abhi");
al.add("Sunny");
al.add("Ladli");
al.add("Sneha");
al.add("Mom");
ad.add(12);
ad.add(10);
ad.add(100);
ad.add(11);
Collections.sort(al);
System.out.println(al);
Collections.sort(ad,Collections.reverseOrder());
System.out.println(ad);
	}

}
