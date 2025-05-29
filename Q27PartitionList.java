class Q27PartitionList {
    public ListNode partition(ListNode head, int x) {
        ListNode left =new ListNode();
        ListNode ltail =left;
        ListNode right=new ListNode();
        ListNode rtail =right;

        while(head!=null){
            if(head.val<x){
              ltail.next=head;  
              ltail=ltail.next; 

            }else{
                rtail.next=head;
                rtail=rtail.next;

            }
            head=head.next;

        }
        ltail.next=right.next;
        rtail.next=null;

        return left.next;
    
    }
}