package com.ld;

/**
 * Author:li_d
 * Created:2019/6/13
 */
//链表大于X的放后面，小于的放前面
public class Test1 {

    public static class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }

    public static ListNode partition(ListNode pHead,int x){
        ListNode small = null;
        ListNode smallLast = null;//小于x的最后一个节点
        ListNode big = null;
        ListNode bigLast = null;
        ListNode cur = pHead;
        while (cur != null){
            ListNode next = cur.next;
            if (cur.val < x){
                cur.next = null;
                if (small == null){
                    small = cur;
                }else {
                    smallLast.next = cur;
                }
                smallLast = cur;
            }else {
                cur.next = null;
                if (big == null){
                    big = cur;
                }else {
                    bigLast.next = cur;
                }
                bigLast = cur;
            }
            cur = next;
        }
        if (small == null){
            return  big;
        }else {
            smallLast.next = big;
            return small;
        }
    }
    public static void main(String[] args) {
        ListNode n1 = new ListNode(9);
        ListNode n2 = new ListNode(2);
        ListNode n3 = new ListNode(6);
        ListNode n4 = new ListNode(0);
        ListNode n5 = new ListNode(5);
        ListNode n6 = new ListNode(1);
        ListNode n7 = new ListNode(7);
        n1.next = n2;n2.next = n3;n3.next = n4;
        n4.next = n5;n5.next = n6;n6.next = n7;
        n7.next = null;
        ListNode result = partition(n1,0);
        ListNode  cur = result;
        while (cur != null){
            System.out.print(cur.val + "->");
            cur = cur.next;
        }
    }
}
