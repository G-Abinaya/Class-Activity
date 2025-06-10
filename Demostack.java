package stack;
import java.util.*;
public class Demostack {
	static ArrayList<String> arr=new ArrayList<String>();
	public static void intputString(String name)
	{
		arr.add(name);
	}
	public static void undo()
	{
		if(!arr.isEmpty())
			arr.remove(arr.size()-1);
	}
 public static void main(String[] args)
 {
//	 Stack<Integer> s=new Stack<Integer>();
//	 s.push(10);
//	 s.push(23);
//	 s.push(766);
//	 System.out.println(s);
//	 System.out.println(s.pop());
//	 System.out.println(s.peek());
	 Scanner sc=new Scanner(System.in);
	 
	 String str=sc.nextLine();
	 arr.add(str);
	 System.out.println(arr);
	 arr.add(str);
	 System.out.println(arr);
	 undo();
	 System.out.println(arr);
 }
}
