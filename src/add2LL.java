public class add2LL {
	public int adding(Node n1, Node n2) {
		int carry=0,value=0;
		Node cur1=n1;
		Node cur2=n2;
		Node cur=null,n=null;
        LinkedList l=new LinkedList();
        while(cur1!=null || cur2!=null){
            if(carry!=0){
                if(cur1!=null && cur2!=null){
                    value=((cur1.val+cur2.val+carry)%10);
                    carry=(cur1.val+cur2.val+carry)/10;
                    cur1=cur1.next;
                    cur2=cur2.next;
                }
                else if(cur1==null){
                    value=((cur2.val+carry)%10);
                    carry=(cur2.val+carry)/10;
                    cur2=cur2.next;
                }
                else{
                    value=((cur1.val+carry)%10);
                    carry=(cur1.val+carry)/10;
                    cur1=cur1.next;
                }
            }
            else{
                if(cur1!=null && cur2!=null){
                    value=(cur1.val+cur2.val+carry)%10;
                    carry=(cur1.val+cur2.val+carry)/10;
                    cur1=cur1.next;
                    cur2=cur2.next;
                }
                else if(cur1==null){
                    value=(cur2.val+carry)%10;
                    carry=(cur2.val+carry)/10;
                    cur2=cur2.next;
                }
                else{
                    value=(cur1.val+carry)%10;
                    carry=(cur1.val+carry)/10;
                    cur1=cur1.next;
                }
            }
            if(cur==null){
            	cur=new Node(value,null);
                n=cur;  
            }
            else{
                if(cur.next!=null){
                    cur.next.val=value;
                }
                else{
                    cur.next=new Node(value,null);
                }
                cur=cur.next;
            }
            if(carry!=0){
                cur.next=new Node(carry); 
            }
        }
        int i=0,ans=0;
        l.setHead(n);
        while(n!=null) {
        	ans=ans+n.val*(int)Math.pow(10, i);
        	i++;
        	n=n.next;
        }
        return ans;
	}
}
