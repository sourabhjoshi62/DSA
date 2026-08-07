/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        if(head == null){
            return null;
        }
        Node newList = new Node(head.val);
        Node head2 = newList;
        HashMap<Node,Node> map = new HashMap<>();


        Node oldList = head.next;
        while(oldList != null){
            Node tmp = new Node(oldList.val);
            newList.next = tmp;
            oldList = oldList.next;
            newList = newList.next;
        }

        newList = head2;
        oldList = head;

        while(oldList != null){
            map.put(oldList,newList);
            newList = newList.next;
            oldList = oldList.next;
        }
        newList = head2;
        oldList = head;

        while(oldList != null){
            newList.random = map.get(oldList.random);
            newList = newList.next;
            oldList = oldList.next;
        }
        return head2;


       
    }
}