import java.util.*;

public class Queue_ArrayMine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of an queue");
		int n = sc.nextInt();
		Queue1 ob = new Queue1(n);
		int ch;
		do {
			System.out.println("========MENU=======");
			System.out.println("1.Insert");
			System.out.println("2.Delete");
			System.out.println("3.Status");
			System.out.println("4.Exit");
			System.out.println("Enter ur choice");
			ch = sc.nextInt();
			switch(ch) {
					case 1: ob.insert();
						    break;
			        case 2: ob.delete();
			                break;
			        case 3: ob.status();
			         		break;
			        default: 
			        	System.out.println("Invalid choices made");
			}
			System.out.println();
		}while(ch != 4);
	}
}
class Queue1{
	int front = -1;
	int rear  = -1;
	int n; 
	int queue[];
	
	Queue1(int n){
		this.n = n;
		queue = new int[n];
	}

	public void insert() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		if(rear == n-1) {
			System.out.println("Queue Overflow");
			return;
		}
		else if(front == -1 && rear == -1) {
			front = 0;
			rear = 0;
		}
		else {
			rear += 1;
		}
		System.out.println("Enter the value");
		int val = sc.nextInt();
		queue[rear] = val;
		
	}

	public void delete() {
		// TODO Auto-generated method stub
		if(front == -1 && rear == -1 || front > rear) {
			System.out.println("Queue is Empty");
		}
		System.out.println(queue[front]);
		front++;
		
	}

	public void status() {
		// TODO Auto-generated method stub
		System.out.println("Queue is now...");
		for(int i = front;i <= rear;i++) {
			System.out.println(queue[i]);
		}
	}
}
