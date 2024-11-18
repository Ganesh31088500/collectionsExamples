import java.util.ArrayList;
import java.util.List;

public class ArrayListCollections {
public static void main(String[] args) {
	List<Integer> alist=new ArrayList<Integer>();
	alist.add(1);
	alist.add(2);
	alist.add(3);
	//System.out.println("element that got replaced"+alist.set(1, 100));
//	List<Integer> alist1=new ArrayList<Integer>(alist);
	List<Integer> alist1=new ArrayList<Integer>();
	alist1.add(4);
	alist1.add(5);
	alist1.addAll(alist);
	//	System.out.println(alist);
	System.out.println(alist.indexOf(1));
	System.out.println(alist.lastIndexOf(2));
	
	List<Integer> alist2=alist1.subList(1, 4);
	System.out.println("Sub list:: "+alist2);
	alist2.set(0, 100);
	
	System.out.println("After adding the 100 at 0th index : Sub list:: "+alist2);
	System.out.println(alist1);
	
	
	
	
}
}
