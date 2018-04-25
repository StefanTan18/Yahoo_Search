public class DequeTester2{
       public static void main(String[] args){

	//Set up is thanks to Colin Hosking and his QAF post !
	QQKachoo<String> test = new QQKachoo<String>();
	
        test.offerFirst("apple");
        test.offerFirst("brick");
        test.offerFirst("sky");

	test.offerLast("Dequeue");
        test.offerLast("Deque");
        test.offerLast("Deke");

	
        System.out.println(test.peekFirst()); //sky
	System.out.println(test.pollFirst()); //sky
	System.out.println(test.peekLast()); //Deke
	System.out.println(test.pollLast()); //Deke
        
	System.out.println(test.peekFirst()); //brick
	System.out.println(test.pollFirst()); //brick
	System.out.println(test.peekLast()); //Deque
	System.out.println(test.pollLast()); //Deque

	System.out.println(test.peekFirst()); //apple
	System.out.println(test.pollFirst()); //apple
	System.out.println(test.peekLast()); //Dequeue
	System.out.println(test.pollLast()); //Dequeue

       } //end main
}
