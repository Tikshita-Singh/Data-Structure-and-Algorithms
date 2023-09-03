import java.util.*;
public class Stack_Array {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of an stack");
		int n = sc.nextInt();
		Stack1 ob = new Stack1(n);
		int ch;
		do {
			System.out.println("========MENU=======");
			System.out.println("1.Push");
			System.out.println("2.Pop");
			System.out.println("3.Peak");
			System.out.println("4.Status");
			System.out.println("5.Exit");
			System.out.println("Enter ur choice");
			ch = sc.nextInt();
			switch(ch) {
					case 1: ob.push();
						    break;
			        case 2: ob.pop();
			                break;
			        case 3: ob.peak();
			         		break;
			        case 4: ob.status();
			         		break;
			        default: 
			        	System.out.println("Invalid choices made");
			}
			System.out.println();
		}while(ch != 5);
	}
}
class Stack1{
	int stack[];
	int top = -1;
	int n;
	
	Stack1(int n){
		this.n = n;
		stack = new int[n];
	}
	
	public void push() {
		Scanner sc = new Scanner(System.in);
		if(top == n-1) {
			System.out.println("Stack Overflow");
			return;
		}
		System.out.println("Enter the value");
		int val = sc.nextInt();
		top += 1;
		stack[top] = val;
	}
	
	public void pop() {
		if(top == -1) {
			System.out.println("Stack is Empty");
		}
		System.out.println(stack[top]);
		top--;
	}
	
	public void peak() {
		if(top == -1) {
			System.out.println("Stack is Empty");
		}
		System.out.println(stack[top]);
	}
	
	public void status() {
		System.out.println("Stack is now...");
		for(int i = top;i >= 0;i--) {
			System.out.println(stack[i]);
		}
	}
}
