/*

Definition for singly Link List Node
class Node
{
    int data;
    Node next,prev;

    Node(int x){
        data = x;
        next = null;
        prev = null;
    }
}

You can also use the following for printing the link list.
Node.printList(Node node);
*/

class Solution {
    public static ArrayList<ArrayList<Integer>> findPairsWithGivenSum(int target, Node head) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        Node tail = head;
        while (tail.next != null) {
            tail = tail.next;
        }
        while (head != null && tail != null && head != tail && tail.next != head) {
            int sum = head.data + tail.data;
            if (sum == target) {
                ArrayList<Integer> pair = new ArrayList<>();
                pair.add(head.data);
                pair.add(tail.data);
                result.add(pair);
                head = head.next;
                tail = tail.prev;
            } else if (sum > target) {
                tail = tail.prev;
            } else {
                head = head.next;
            }
        }
        return result;
    }
}

