package leetcode160;

public class Main {
	public static void main(String[] args) {
		int[] inputA = {4,1,8,4,5};
		
		ListNode headA = insertNode(inputA);
		
		int[] inputB = {5,0,1,8,4,5};

		ListNode headB = insertNode(inputB);
		
		headA.next = headB;
		
		FindIntersectionOfTwoLinkedListFunction solution = new FindIntersectionOfTwoLinkedListFunction();
		
		System.out.println(solution.getIntersectionNode(headA, headB).val);
		
	}
	
	private static ListNode insertNode(int[] input){
		ListNode dummyRoot = new ListNode(0);
		ListNode previous = dummyRoot;
		
		for(int item : input){
			previous.next = new ListNode(item);
			previous = previous.next;
		}
	
		return dummyRoot.next;
	}

}
