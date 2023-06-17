public class Test {
    /LinkedList as STACK
    LinkedList<String> stackList = new LinkedList<String>();
		stackList.push("D");
		stackList.push("W");
		stackList.push("R");
		stackList.push("A");
		System.out.println(stackList);
		System.out.println(stackList.pop());
    // LinkedList as QUEUE
    LinkedList<String> queueList = new LinkedList<String>();
		queueList.offer("D");
		queueList.offer("W");
		queueList.offer("R");
		queueList.offer("A");
		System.out.println(queueList);
		System.out.println(queueList.poll());
}
