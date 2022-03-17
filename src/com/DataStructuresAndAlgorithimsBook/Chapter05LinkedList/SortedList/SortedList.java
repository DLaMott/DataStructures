package com.DataStructuresAndAlgorithimsBook.Chapter05LinkedList.SortedList;

public class SortedList {

    static class Link{
        public long dData;
        public Link next;

        public Link(long dd){
            dData = dd;
        }

        public void displayLink(){
            System.out.println(dData + " ");
        }
    }
    static class Sortedlist{
        private Link first; // First item of the list
        public Sortedlist(){ // Constructor
            first = null;
        }
        public boolean isEmpty(){ // return true if no links
            return first == null;
        }
        public void insert(long key){ // Insert IN ORDER
            Link newLink = new Link(key); // make new link
            Link previous = null; // Start at first
            Link current = first;

            while (current != null && key > current.dData){ // Until the end of the list
                previous = current;
                current = current.next; //Go to next item
            }

            if(previous == null){
                first = newLink;
            }else{
                previous.next = newLink;
            }

            newLink.next = current;
        }

        public Link remove(){ // Return and delete first link
            Link temp = first;
            first = first.next;
            return temp;
        }

        public void displayList(){
            System.out.println("List (first ---> Last)");

            Link current = first;
            while (current != null){
                current.displayLink();
                current = current.next;
            }
            System.out.println(" ");
        }
    }

    static class SortedListApp{
        public static void main(String[] args) {
            Sortedlist theSortedList = new Sortedlist();

            theSortedList.insert(20);
            theSortedList.insert(40);

            theSortedList.displayList();

            theSortedList.insert(10);
            theSortedList.insert(5);
            theSortedList.insert(60);

            theSortedList.displayList();
        }
    }

}
