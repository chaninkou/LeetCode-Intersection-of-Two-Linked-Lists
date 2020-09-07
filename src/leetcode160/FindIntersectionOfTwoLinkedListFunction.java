package leetcode160;

public class FindIntersectionOfTwoLinkedListFunction {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA == null || headB == null){
            return null;
        }
        
        ListNode a = headA;
        ListNode b = headB;
        
        // When they are not equal
        while(a != b){
          
        	// when a reach to end of the linked list, make the pointer to b now
            if(a == null){
                a = headB;  
            } else {
                a = a.next;
            }
            
            // when b reach to end of the linked list, make the pointer to a now
            if(b == null){
                b = headA;
            } else {
                b = b.next;
            }
        }
        
        return a;
    }	
}
