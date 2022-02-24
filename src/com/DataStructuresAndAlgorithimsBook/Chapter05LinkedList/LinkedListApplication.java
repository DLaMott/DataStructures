package com.DataStructuresAndAlgorithimsBook.Chapter05LinkedList;

/***
 *
 */
public class LinkedListApplication {

    public static void main(String[] args){

        LinkedList theList = new LinkedList();

        theList.insertFirst(22,2.99);
        theList.insertFirst(44, 4.99);
        theList.insertFirst(66, 6.99);
        theList.insertFirst(88, 8.99);

        theList.displayList();
        Link f = theList.find(44);
        if(f != null){
            System.out.println("Found link with key:" + f.iData);
        }else{
            System.out.println("Link not found");
        }
        Link d = theList.deleteByKey(66);
        if(d != null){
            System.out.println("Link with key deleted");
        }else{
            System.out.println("Cannot delete");
        }

        while (!theList.isEmpty()){
            Link alink = theList.deleteFirst();
            System.out.println("Deleted");
            alink.displayLink();
            System.out.println("");
        }
        theList.displayList();
    }
}
