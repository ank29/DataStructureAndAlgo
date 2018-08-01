import javafx.scene.SnapshotParametersBuilder;

import java.util.HashMap;

public class LinkList {
   static LinkNode head;

     class LinkNode {
        int data;
        LinkNode next;

        LinkNode(int d) {
            data = d;
        }
    }
     void insertAtStart(int data){
        LinkNode node = new LinkNode(data);
        if(head != null)
            node.next= head;

         head = node;

    }
    void insertAtEnd(int data,LinkNode head){
         LinkNode node = new LinkNode(data);
         if(head != null){
             while (head.next != null)
                 head = head.next;
             head.next = node;
         }
         else{
             head = node;
         }
     }
     void insertAfter(int newData,int prevNode){
         LinkNode newNode = new LinkNode(newData);
         LinkNode currentNode = head;
         while (currentNode.data != prevNode)
             currentNode = currentNode.next;
         LinkNode nextNode = currentNode.next;
         currentNode.next = newNode;
         newNode.next = nextNode;

     }
     void deleteFromStart(){
         head= head.next;
     }
     void deleteFromEnd(){
         LinkNode currentNode = head;
         while (currentNode.next.next != null)
             currentNode = currentNode.next;
         currentNode.next = null;
     }
     void deleteNode(int node){
         LinkNode linkNode = head;
         LinkNode prevNode;
         while (linkNode.next.data != node)
             linkNode = linkNode.next;
         prevNode = linkNode;
         prevNode.next = linkNode.next.next;

     }
     boolean isCycle(){
         LinkNode slowNode = head;
         LinkNode fastNode = head;
         while (slowNode != null && fastNode != null && fastNode.next != null){
             slowNode = slowNode.next;
             fastNode = fastNode.next.next;
             if(slowNode == fastNode)
                 return true;
         }
         return false;

     }
     boolean isCycleUsingHashMap(){
         HashMap<Integer,LinkNode> map = new HashMap<>();
         LinkNode currentNode = head;
         while (currentNode != null) {
            if(map.containsValue(currentNode.next))
                return  true;
            else
             map.put(currentNode.data, currentNode.next);
            currentNode= currentNode.next;
         }
       return false;
     }
     void printNodes(LinkNode head){

        LinkNode currentNode =  head;
        while(currentNode != null) {
            System.out.println(currentNode.data);
            currentNode = currentNode.next;
        }

     }
     int sizeOfLinkList(LinkNode head){
         int count = 0;
         while(head != null){
             count ++;
             head = head.next;
         }
         return count;
     }
//     LinkList addList(LinkNode head1,LinkNode head2){
//         while (head1 != null)
//             addList(head1.next,head2.next);
//         int k = head1.data + head2.data
//     }

//     LinkList  addLinkList(LinkList list1,LinkList list2){
//         int size1 = sizeOfLinkList(list1.head);
//         int size2 = sizeOfLinkList(list2.head);
//         if(size1 == 0)
//             return list2;
//         if(size2 == 0)
//             return list1;
//         if(size1 == size2){
//             return addList(list1.head,list2.head);
//         }
//    }
     public static void main(String args[]){
        LinkList linkList = new LinkList();
        LinkList linkList1 = new LinkList();
        linkList.insertAtStart(9);
        linkList.insertAtStart(6);
        linkList.insertAtStart(3);
//        linkList1.insertAtStart(15);
        linkList.insertAtEnd(0,head);
//        linkList1.insertAtStart(6);
        linkList.insertAfter(12,6);
//        LinkList AddedList = linkList.addLinkList(linkList,linkList1);
//         linkList.head.next.next.next = linkList.head.next;
//         if(linkList.isCycle())
//             System.out.println("Cycle found");
//         else System.out.println("No cycle");
//         if(linkList.isCycleUsingHashMap())
//             System.out.println("Cycle found hashmap");
//         else System.out.println("No cycle hashmap");
//        linkList.deleteFromStart();
//        linkList.deleteFromEnd();
//        linkList.deleteNode(6);
        linkList.printNodes(head);
//        System.out.println("");

//        String sum1 =linkList.printNodes();
//        String sum2 =  linkList1.printNodes();
//
//        System.out.println(sum1);
//        System.out.println(sum2);
//
//        System.out.println(Integer.parseInt(sum1)+Integer.parseInt(sum2));

     }

}
