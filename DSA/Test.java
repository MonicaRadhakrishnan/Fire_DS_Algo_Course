public class Test {
	Queue<String> queue = new LinkedList<String>();
		System.out.println(queue.isEmpty());
		queue.offer("Print_Job1");
		queue.offer("Print_Job2");
		queue.offer("Print_Job3");
		queue.offer("Print_Job4");
		queue.offer("Print_Job5");

		System.out.println(queue);
		System.out.println(queue.isEmpty());
		System.out.println(queue.size());
		System.out.println(queue.peek());
		queue.poll();
		System.out.println(queue);
		System.out.println(queue.size());
		System.out.println(queue.contains("Print_Job1"));
}
