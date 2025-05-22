class Q12OddEvenList {
    public ListNode oddEvenList(ListNode head) {
         //returning if already valid   
        if(head==null || head.next==null || head.next.next==null ) return head;
        //Initialising slow and fast pointer
        ListNode slow = head;
        ListNode fast = head.next;
        ListNode evenStart=head.next;
        // segregating odd and even indices list
        while(fast!=null && fast.next !=null){
            slow.next=fast.next;
            slow=slow.next;
            fast.next=fast.next.next;
            fast=fast.next;
       }
        //finally combining
        slow.next=evenStart;
        
        return head;   
    }
}