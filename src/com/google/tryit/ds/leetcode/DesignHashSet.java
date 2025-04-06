package com.google.tryit.ds.leetcode;

import static java.lang.System.exit;

public class DesignHashSet {

    ListNode head;
    ListNode hashsetnode;
    public DesignHashSet() {
        hashsetnode = new ListNode();
    }

    public void add(int key) {
        if(hashsetnode == null && key < 0) {
            exit(0);
        }
        System.out.println("start add");
        printListNode(hashsetnode);
        //while(hashsetnode != null) {
            if(hashsetnode.val == 0) {
                System.out.println("if add");
                hashsetnode = new ListNode(key);
            }
            else {
                while (hashsetnode.next != null) {
                    System.out.println("else while add");
                    ListNode tempNode = new ListNode(key);
                    hashsetnode.next = tempNode;
                    hashsetnode = hashsetnode.next;
                }
            }

       // }
    }

    public void remove(int key) {
        if(hashsetnode == null && key < 0) {
          exit(0);
        }
        while(hashsetnode.next != null) {
            if(hashsetnode.val == key) {
                hashsetnode = hashsetnode.next;
            }
               /* else {
                    return false;
                }*/
            hashsetnode = hashsetnode.next;
        }
    }

    public boolean contains(int key) {
        if(hashsetnode == null  && key < 0) {
            exit(0);
        } while(hashsetnode != null) {
                if(hashsetnode.val == key) {
                    return true;
                }
               /* else {
                    return false;
                }*/
                hashsetnode = hashsetnode.next;
            }
        return false;
    }


/**
 * Your MyHashSet object will be instantiated and called as such:
 *
 */
    public static void main(String[] args) {
     DesignHashSet obj = new DesignHashSet();
     obj.add(1);
     obj.add(2);
     obj.add(3);
     obj.remove(2);
     boolean param_3 = obj.contains(3);
     System.out.println(param_3);
     DesignHashSet obj1 = new DesignHashSet();
        obj1.add(1);
        obj1.add(2);
        obj1.add(3);
        obj1.add(4);
        obj1.add(5);
        obj1.add(6);
        obj1.add(7);
        obj1.remove(1);
     boolean param_4 = obj1.contains(1);
     System.out.println(param_4);
        DesignHashSet obj2 = new DesignHashSet();
        obj2.add(1);
        boolean param_6 = obj2.contains(1);
        System.out.println(param_6);
        obj2.remove(1);
        param_6 = obj2.contains(1);
        System.out.println(param_6);
    }

    private static void printListNode(ListNode newListNode) {
        System.out.print("[");
        while(newListNode!=null)
        {
            System.out.print(newListNode.val+",");
            newListNode = newListNode.next;
        }
        System.out.print("]");
        System.out.println();
    }
}
