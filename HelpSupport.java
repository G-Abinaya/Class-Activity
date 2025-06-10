package helpdesk;


import java.util.LinkedList;
import java.util.Queue;


public class HelpSupport {
	
	 static Queue<String> queue=new LinkedList<String>();
	public static void undo()
	{
		String elementToRemove ="two";
	    Queue<String> tempQueue = new LinkedList<String>();
	    while (!queue.isEmpty()) {
	        String currentElement = queue.poll();
	        if (!currentElement.equals(elementToRemove)) {
	            tempQueue.add(currentElement);
	        }
	    }
	    queue.addAll(tempQueue);
	}

	public static void main(String[] args)
	{ 
	//	Scanner sc=new Scanner(System.in);
			
//			while(sc.hasNext())
//			{ 
//				queue.offer( sc.nextLine());
//			}
			queue.offer("one");
			queue.offer("two");
			undo();
			queue.offer("three");
			while(!queue.isEmpty())
			{
				String user=queue.poll();
				System.out.println("Closed the ticket :"+user);
				queue.remove(user);
				
			}
	}
}
