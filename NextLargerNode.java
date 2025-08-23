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
    public int[] nextLargerNodes(ListNode head) {
        ListNode temp=head;
        ArrayList<Integer> tempList=new ArrayList<>();
        while(temp!=null){
            tempList.add(temp.val);
            temp=temp.next;
        }
        Stack<Integer> stack=new Stack<>();
        int[] ans=new int[tempList.size()];
        for(int i=0;i<tempList.size();i++){
            while(!stack.isEmpty()&&tempList.get(i)>tempList.get(stack.peek())){
                int index=stack.pop();
                ans[index]=tempList.get(i);
            }
            stack.push(i);
        }
        return ans;
    }
}
