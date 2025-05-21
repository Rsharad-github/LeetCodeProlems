 class ListNode{
  int val;
  ListNode next;
}

public class Q14IsPalindrome{
      public boolean isPalindrome(ListNode head) {
        if (head == null) return false;
        if (head.next == null) return true;

        ListNode n = head;
        int len = 0;
        while (n != null) {
            len++;
            n = n.next;
        }

        int[] arr = new int[len / 2];
        n = head;
        for (int i = 0; i < len / 2; i++) {
            arr[i] = n.val;
            n = n.next;
        }

        // Skip the middle node if length is odd
        if (len % 2 == 1) {
            n = n.next;
        }

        for (int i = len / 2 - 1; i >= 0 && n != null; i--) {
            if (arr[i] != n.val) return false;
            n = n.next;
        }

        return true;
    }

    public static void main(String[] args) {
        
    }
}