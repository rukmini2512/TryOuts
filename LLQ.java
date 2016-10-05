/*
 * class Node {
		Node next;
		int data;
		public Node(int data){
	        this.data = data;
	    }
	}
 */
public class LLQ {
    //Merge 2 sorted lists
	Node MergeLists(Node list1, Node list2) {
	if(list1==null) return list2;
	if(list2==null) return list1;
	if(list1.data < list2.data){
		list1.next = MergeLists(list1.next,list2);
		return list1;
	} else {
		list2.next = MergeLists(list2.next,list1);
		return list2;
	}
    } 
	//Reverse a linked list
	Node reverseList(Node head){
		if(head==null||head.next==null){
			return head;
		}
		Node second = head.next;
		head.next = null;
		Node rest = reverseList(second);
		second.next = head;
		return rest;
	}
	public Node AddList(Node l1,  Node l2) {
		 int carry = 0;
		        Node head = new Node(0);
		        Node p= head;
		        while(l1 != null || l2 != null){
		            if(l1 != null){
		                carry += l1.data;
		                l1 = l1.next;
		            }
		            if(l2 != null){
		                carry += l2.data;
		                l2 = l2.next;
		            }
		            p.next = new Node(carry%10);
		            p = p.next;
		            carry /= 10;
		        }
		      if(carry == 1){
		           p.next = new Node(carry); 
		           p.next.next = new Node(carry); 
		         } 
		   return head.next;
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Node n1 = new Node(5);
		Node n2 = new Node(6);
		Node n3 = new Node(7);
		n1.next = n2;
		n2.next = n3;
		n3.next = null;
		Node n4 = new Node(9);
		Node n5 = new Node(9);
		Node n6 = new Node(9);
		n4.next = n5;
		n5.next = n6;
		n6.next = null;
		LLQ obj = new LLQ();
		//this is 7-6-5 + 9-9-9
		Node add = obj.AddList(n1,n4);
		Node temp = add;
		while(temp.next!=null){
			System.out.print(temp.data);
			temp = temp.next;
		}

		Node result = obj.MergeLists(n1, n4);
		Node reverse = obj.reverseList(result);
		Node temp2 = reverse;
		while(temp2.next!=null){
			System.out.print(temp2.data);
			temp2 = temp2.next;
		}*/

	}

}
