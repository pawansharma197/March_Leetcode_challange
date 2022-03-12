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
     if (head == null) return null;
        Map<Node, Node> map = new HashMap();
        Node curr = head;
        Node prevCopy = null;
        
        while (curr != null) {
            Node next = curr.next;
            Node currCopy = new Node(curr.val);
            map.put(curr, currCopy);
            if (prevCopy != null) prevCopy.next = currCopy;
            currCopy.random = curr;
            prevCopy = currCopy;
            curr = next;
        }
        
        curr = map.get(head);
        while (curr != null) {
            curr.random = map.get(curr.random.random);
            curr = curr.next;
        }

        return map.get(head);   
    }
}