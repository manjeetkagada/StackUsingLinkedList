public class Main {

    public static void main(String[] args) {
	LinkedList list=new LinkedList();
	list.push(10);
	list.push(20);
	list.push(30);
	list.pop();
	list.peek();
	list.show();

		System.out.println("--------------------");
		list.push(40);
		list.push(50);
		list.show();

		list.pop();
		list.peek();
		System.out.println("--------------------");
		list.show();

    }
}
