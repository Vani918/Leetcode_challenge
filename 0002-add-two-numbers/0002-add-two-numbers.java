/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy= new ListNode(0);       // Create a dummy linked list at position zero
        ListNode current=dummy;                // Create a copy current pointing to the dummy
        int carry=0;                           // Create a variable carry To hold the carries

        while(l1!=null || l2!=null){        // Until list one or list two is not equal to null
            int x=(l1!=null)?l1.val:0;  // Use conditional statement again to cheque And insert value
            int y=(l2!=null)?l2.val:0;

            int sum=x+y+carry;          // Write the sum function including carry
            carry=sum/10;               // Carry is calculated from the previous step

            current.next=new ListNode(sum%10); // We calculate the Reminder of sum and insert it in the new node position
            current=current.next;   // Move to Next node

        if(l1!=null)    // Check the edge cases Any elements are left in list one or list two
            l1=l1.next;
        if(l2!=null)
            l2=l2.next;
        }
        
        if(carry>0)     // If the carry is form Extra digits place we need to create new node like 99=>100
           current.next=new ListNode(carry);
                    // Return the dummy.next
        return dummy.next;
    }
}