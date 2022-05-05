class Rev{
	static Node head=null;
	static class Node{
		int data;
		Node next;
		Node prev;
		
		Node(int data){
			this.data=data;
			this.next=null;
			this.prev=null;
		}
		
	}
	static boolean search(int d){
		Node temp=head;
		while(temp!=null){
			if(temp.data==d){
				return false;
			}
			temp=temp.next;
		}
		return true;
	}
	static void insert(int d){
		boolean b=search(d);// to not to allow duplicate element
		if(true){	//if uncomment this line then it will take dublicate element into list
		//if(b){	//if uncomment this line then it will not take dublicate element into list
			Node new_node=new Node(d);	
			Node temp=head;
			if(head==null){
				head=new_node;
				head.prev=null;
				head.next=null;
			}else{
				while(temp.next!=null){
					temp=temp.next;
				}
				temp.next=new_node;
				new_node.prev=temp;
			}
		}
		
		
	}
	static void display(Node temp){
		Node p=null;
		System.out.print("Forword Printing: ");
		while(temp!=null){
			System.out.print(temp.data+" ");
			p=temp;
			temp=temp.next;
		}
		System.out.println();
		System.out.print("Backword Printing: ");
		while(p!=null){
			System.out.print(p.data+" ");
			p=p.prev;
		}
	}
	
	public static void main(String []args){
		Rev r1=new Rev();
		
		insert(1);
		insert(5);
		insert(1);
		insert(2);
		insert(3);
		insert(4);
		insert(5);
		display(head);
		// insert(2);
		// insert(4);
		// insert(3);
		// insert(4);
		// insert(2);
		// insert(5);
		// display(head);
	}
}