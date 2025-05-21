class ListNode{
    int val;
    ListNode next;
    ListNode(){
    }
    ListNode(int val){
        this.val=val;
    }
    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

class MyLinkedList {
    ListNode head;
    public MyLinkedList() {
        head=null;
    }
    
    public int get(int index) {
        if(index<0) return -1;
        int i=0;
        ListNode n=head;

        while(i<index && n!=null){
            n=n.next;
            i++;
        }
        if(n==null) return -1;
        return n.val;
    }
    
    public void addAtHead(int val) {
        ListNode n= new ListNode(val);
        n.next=head;
        head=n;
    }
    
    public void addAtTail(int val) {
        ListNode newNode=new ListNode(val);
        if(head==null){    
            head=newNode;
            return;
        }
        ListNode n=head;

        while(n.next!=null){
            n=n.next;
        }
        n.next=newNode;
    }
    
    public void addAtIndex(int index, int val) {
        if(index<0) return ;
        if(index==0){
            addAtHead(val);
            return;
        }
        int i=0;
        ListNode n= head;
        
        while(i<index-1 && n!=null){
            n=n.next;
            i++;
        }
        if(n!=null){
        ListNode newNode=new ListNode(val);
        newNode.next=n.next;
        n.next=newNode;
        }
        return;
    }
    
    public void deleteAtIndex(int index) {
        if(index<0 || head==null) return;
        if(index==0){
            head=head.next;
            return;
        }
        int i=0;
        ListNode n=head;
        while(i<index-1 && n.next!=null){
            n=n.next;
            i++;
        }
        if(n.next==null) return;
        n.next=n.next.next;
    }
}