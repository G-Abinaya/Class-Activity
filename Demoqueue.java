package Queue;
import java.util.LinkedList;
import java.util.Queue;
public class Demoqueue {
public static void main(String[] args)
{
		Queue<String> queue=new LinkedList<String>();
		queue.offer("One");
		queue.offer("two");
		queue.offer("three");
		while(!queue.isEmpty())
		{
			String user=queue.poll();
			System.out.println("Ticket is booked :"+user);
			queue.remove(user);
			System.out.println("The booked ticket is removed "+user);
		}
}
}
