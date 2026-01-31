//package Implementing_DS;
//
//import java.util.LinkedList;
//class Node {
//    int key;
//    int value;
//    Node next;
//
//    public Node(int key, int value){
//        this.key = key;
//        this.value = value;
//        next = null;
//    }
//}
//
//class MyHashMap {
//
//    Node[] table;
//    LinkedList<Node> list;
//
//    public MyHashMap() {
//        table = new Node[16];
//        list = new LinkedList<>();
//    }
//
//
//    public void put(int key, int value) {
//        int hash = hashCode(key);
//        int index = hash & table.length-1;
//        Node current = table[index];
//        if(current == null){
//            Node temp = new Node(key, value);
//            table[index] = temp;
//        }else{
//            if(current.key == (key))
//                table[index].value = value;
//            else{
//                Node temp = new Node(key, value);
//                current = table[index];
//                while(current.next != null){
//                    current = current.next;
//                }
//                current.next = temp;
//            }
//        }
//
//    }
//
//    public int get(int key) {
//        int hash = hashCode(key);
//        int index = hash & table.length-1;
//        Node current = table[index];
//
//        if(current != null){
//
//            while(current.next != null){
//                if(current.key == (key))
//                    return current.value;
//                current = current.next;
//            }
//        }
//        return -1;
//
//    }
//
//    public void remove(int key) {
//        int hash =hashCode(key);
//        int index = hash & table.length-1;
//        Node current = table[index];
//        if(current != null){
//            while(current.next != null){
//                if(current.key == (key)){
//                    current.next = current.next.next;
//                }
//                current = current.next;
//            }
//        }
//
//    }
//
//}
//
///**
// * Your MyHashMap object will be instantiated and called as such:
// * MyHashMap obj = new MyHashMap();
// * obj.put(key,value);
// * int param_2 = obj.get(key);
// * obj.remove(key);
// */
