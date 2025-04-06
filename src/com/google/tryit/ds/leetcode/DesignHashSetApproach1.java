package com.google.tryit.ds.leetcode;

import static java.lang.System.exit;

public class DesignHashSetApproach1 {

    private int arraySize=1000001;
    private boolean[] hashSet = new boolean[arraySize];
    public DesignHashSetApproach1() {

    }

    public void add(int key) {
        hashSet[key] = true;
    }

    public void remove(int key) {
        hashSet[key] = false;
    }

    public boolean contains(int key) {
        return hashSet[key];
    }


/**
 * Your MyHashSet object will be instantiated and called as such:
 *
 */
    public static void main(String[] args) {
     DesignHashSetApproach1 obj = new DesignHashSetApproach1();
     obj.add(1);
     obj.add(2);
     obj.add(3);
     obj.remove(2);
     boolean param_3 = obj.contains(3);
     System.out.println(param_3);
     DesignHashSetApproach1 obj1 = new DesignHashSetApproach1();
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
        DesignHashSetApproach1 obj2 = new DesignHashSetApproach1();
        obj2.add(1);
        boolean param_6 = obj2.contains(1);
        System.out.println(param_6);
        obj2.remove(1);
        param_6 = obj2.contains(1);
        System.out.println(param_6);
    }

}
