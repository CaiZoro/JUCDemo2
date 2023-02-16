package com.newcoder;

/**
 * 合并两个有序链表为一个有序链表
 * 例：NodeList1 1-3-5
 *    NodeList2 2-4-6
 *    合并后为1-2-3-4-5-6
 */
public class MergeTwoNodeList {
    public static void main(String[] args) {
        //Scanner in = new Scanner(System.in);
        //int a = in.nextInt();
        //System.out.println(a);
        Node root1 = new Node(1);
        Node node11 = new Node(3);
        Node node12 = new Node(5);
        Node root2 = new Node(2);
        Node node21 = new Node(4);
        Node node22 = new Node(6);
        root1.next = node11;
        node11.next = node12;
        root2.next = node21;
        node21.next = node22;
       // Node result = add2NodeLinked(root1, root2);
        Node result = add2NodeLinked2(root1, root2);
        while(result != null){
            System.out.println(result.val);
            result = result.next;
        }
    }
    static class Node{
        Node next;
        int val;
        public Node(int val){
            this.val = val;
        }
    }

    //递归解决合并两个有序的链表为一个新的有序链表
    public static Node add2NodeLinked(Node root1,Node root2){
        Node result = null;
        if(root1 == null && root2 == null)
            return null;
        if (root1 == null){
            return root2;
        }
        if (root2 == null){
            return root1;
        }
        if(root1.val<root2.val){
           result = root1;
           result.next = add2NodeLinked(root1.next,root2);
        }else{
            result = root2;
            result.next = add2NodeLinked(root2.next,root1);
        }
        return result;
    }

    public static Node add2NodeLinked2(Node root1,Node root2){
        if (root1 == null || root2 == null){
            return root1 != null?root1:root2;
        }
        Node result = root1.val<root2.val?root1:root2;
        Node cur1 = result == root1?root1:root2;
        Node cur2 = result == root1?root2:root1;
        Node pre = null;
        Node next = null;
        while (cur1 != null && cur2 != null){
            if (cur1.val<cur2.val){
                pre = cur1;
                cur1 = cur1.next;
            }else {
                next = cur2.next;
                pre.next = cur2;
                cur2.next = cur1;
                pre = cur2;
                cur2 = next;
            }
        }
        pre.next = cur1 == null?cur2:cur1;
        return result;
    }
}
