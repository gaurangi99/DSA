public class oddEvenByPlace {
	LinkedList oddEvenList(LinkedList l) {
		//we're making a copy of the original list, using extra space
		//try without it
		LinkedList oddList=new LinkedList();
		LinkedList evenList=new LinkedList();
		
		Node cur=l.head;
		while(cur!=null) {
			if(cur.val%2==0) {
				evenList.insertAtTail(cur.val);
			}
			else {
				oddList.insertAtTail(cur.val);
			}			
			cur=cur.next;
		}
		evenList.tail.next=oddList.head;
		return evenList;
	}
	
	LinkedList oddEvenPlace(LinkedList l) {
		LinkedList oddList=new LinkedList();
		LinkedList evenList=new LinkedList();
		
		Node cur=l.head;
		int ctr=1;
		while(cur!=null) {
			if(ctr%2==0) {
				evenList.insertAtTail(cur.val);
			}
			else {
				oddList.insertAtTail(cur.val);
			}			
			cur=cur.next;
			ctr++;
		}
		evenList.tail.next=oddList.head;
		return evenList;
	}
}
		
//		Node odd,even;
//        Node oddHead, evenHead;
//        //Node cur=head;
//        odd=cur;
//        even=cur.next;
////        System.out.printf("%d %d\n",odd.val,even.val);
//        oddHead=odd;
//        evenHead=even;
////        System.out.printf("%d %d\n",oddHead.val,evenHead.val);        
//        int ctr=1;
//        while(cur!=null){
//            if(ctr%2!=0){
//                odd=new Node(cur.val);
//                //System.out.printf("%d\t",odd.val);
//                if(cur.next==null) {
//                	odd=evenHead;
//                	break;
//                }
//                odd=odd.next;
//            }
//            else{
//                even=new Node(cur.val);
//                //System.out.printf("%d\n",even.val);
//                if(cur.next==null) {
//                	odd=evenHead;
//                	break;
//                }
//                even=even.next;                
//            }
//            cur=cur.next;
//            ctr++;
//        }
//        l1.setHead(oddHead);
//        l2.setHead(evenHead);
//        l1.display();
//        l2.display();
//        return oddHead;
//    }
//}
