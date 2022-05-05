class Stack{
	static int max=10;
	static public int a1[];
	static int top1;
	static int top2;
	Stack(){
		top1=-1;
		top2=max;
		a1=new int[max];
	}
	static void push1(int x){
		a1[++top1]=x;
	}
	static void push2(int x){
		a1[--top2]=x;
	}
	static int pop1(){
		return a1[top1--];
	}
	static int pop2(){
		return a1[top2++];
	}
	static int peek1(){
		return a1[top1];
	}
	static int peek2(){
		return a1[top2];
	}
	static boolean isEmpty(){
		return top1==-1&&top2==max;
	}
	public static void main(String []args){
		Stack s1=new Stack();
		push1(5);
		push2(10);
		push2(15);
		push1(11);
		push2(7);
		push2(40);
		System.out.println("Popped element from stack1 is "+pop1());
		System.out.println("Popped element from stack2 is "+pop2());
		
		
		
	}
}