package solution;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class SinglyLinkedListNode {
    public int data;
    public SinglyLinkedListNode next;

    public SinglyLinkedListNode(int nodeData) {
        this.data = nodeData;
        this.next = null;
    }
}

class SinglyLinkedList {
    public SinglyLinkedListNode head;
    public SinglyLinkedListNode tail;

    public SinglyLinkedList() {
        this.head = null;
        this.tail = null;
    }

    public void insertNode(int nodeData) {
        SinglyLinkedListNode node = new SinglyLinkedListNode(nodeData);

        if (this.head == null) {
            this.head = node;
        } else {
            this.tail.next = node;
        }

        this.tail = node;
    }
}

class SinglyLinkedListPrintHelper {
    public static void printList(SinglyLinkedListNode node, String sep, BufferedWriter bufferedWriter) throws IOException {
        while (node != null) {
            bufferedWriter.write(String.valueOf(node.data));

            node = node.next;

            if (node != null) {
                bufferedWriter.write(sep);
            }
        }
    }
}

class Result{

    public static SinglyLinkedListNode distinct(SinglyLinkedListNode head) {

        LinkedHashSet<SinglyLinkedListNode> map = new LinkedHashSet<SinglyLinkedListNode>();
        SinglyLinkedListNode current = head;
        while (current!=null){
            map.add(current);
            current=current.next;
        }

        SinglyLinkedListNode headNode =null;

        Iterator<SinglyLinkedListNode> iterator = map.iterator();
        SinglyLinkedListNode temp = headNode;
        while (iterator.hasNext()){
            if(headNode==null){
                headNode=iterator.next();
                temp=headNode;
            }else{
                SinglyLinkedListNode curr = iterator.next();
                temp.next = curr;
                temp=curr;
            }
        }
        return headNode;

        /*if(head==null){
            return head;
        }
        SinglyLinkedListNode current =head;
        while(current.next!=null){
            if(current.data==current.next.data){
                SinglyLinkedListNode temp = current.next;
                current.next=temp.next;
                if(current==head){
                    head = current;
                }
            }
            current=current.next;

        }
        return head;*/

    }
}





