package com.nowcoder.hw;

public class ReverseLinkedList {
    public static void main(String[] args) {
        ListNode root = new ListNode(0);
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        root.next = node1;
        node1.next = node2;
        //ListNode resultNode = reverseList(root);
        ListNode resultNode2 = reverse(root);
        //System.out.println("遍历翻转结果为:"+resultNode.val+"\t "+resultNode.next.val+"\t"+resultNode.next.next.val);
        System.out.println("递归翻转结果为:"+resultNode2.val+"\t"+resultNode2.next.val+"\t"+resultNode2.next.next.val);
    }

    /**
     * 遍历出栈
     * @param root
     * @return
     */
    public static ListNode reverseList(ListNode root){
        ListNode pre = null;
        ListNode next = null;
        while (root != null){
            next = root.next;
            root.next = pre;
            pre = root;
            root = next;
        }
        return pre;
    }

    public static ListNode reverse(ListNode root){
        if (root == null || root.next == null){
            return root;
        }
        ListNode temp = root.next;
        ListNode newHead = reverse(root.next);
        temp.next = root;
        root.next = null;
        return newHead;
    }

    static class ListNode{
        int val;
        ListNode next;

        public ListNode(int val) {
            this.val = val;
        }
    }
}
