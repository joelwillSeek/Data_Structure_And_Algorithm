package Common_class;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import Algorithms.*;
import Datastructure.*;

public class Main {
    static Convenience con = new Convenience();
    private static int[] mergeSort;

    public static void main(String[] args) {
        //linkedListTest();
        // buildingArrayFromScrach();
        // buildingStack();
         //Dublelinkytesty();
        // binarySearchTest();
        // interplationBro();
        // BubbleItUp();
        // Selectitup();
         Inseritup();
        // Recurseitup();
        // Mergeitup();
        // quicksorter();
        // hashitup();
        // graohitup();
        // DepthSearchup();
        // BreathFirstSearch_Holder();
        // BinarySearchTree_holder();
        // Timermeaserment();
        // TertairySearchitup();
        // Heapify();
    }

    private static void Heapify() {
        Heaps h = new Heaps();

        h.insert(5);
        h.insert(1);
        h.insert(9);
        h.insert(7);
        h.insert(4);

        h.display();

    }

    private static void TertairySearchitup() {
        TertairySearch ts = new TertairySearch();
        con.println(ts.search(5) + "\n");
        con.println(ts.search(100) + "\n");
    }

    private static void Timermeaserment() {
        long start = System.nanoTime();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        long duration = (System.nanoTime() - start) / 1000000;
        con.printlnLong(duration);
    }

    private static void BinarySearchTree_holder() {
        BinarySearchTree bst = new BinarySearchTree();
        bst.insert(10);
        bst.insert(3);
        bst.insert(19);
        bst.insert(1);
        bst.insert(5);
        bst.insert(15);
        bst.insert(13);
        bst.insert(16);
        bst.display();
        con.printlnbool(bst.search(60));
        con.printlnbool(bst.search(5));
        bst.remove(5);
        bst.display();

    }

    private static void BreathFirstSearch_Holder() {
        BFS breathBfs = new BFS();
        breathBfs.breathFirstSearch(0);
        con.nextLine();
        breathBfs.breathFirstSearch(1);
        con.nextLine();
        breathBfs.breathFirstSearch(2);
        con.nextLine();
        breathBfs.breathFirstSearch(3);
        con.nextLine();
    }

    private static void DepthSearchup() {
        DFS dfs = new DFS();
        dfs.search(0);
        dfs.search(1);
        dfs.search(2);
        dfs.search(3);
    }

    private static void graohitup() {
        // adjecymetrix
        Graphs.adjecymetrix.AdjecenyMetrix am = new Graphs.adjecymetrix.AdjecenyMetrix(5);

        am.addNode('A');
        am.addNode('B');
        am.addNode('C');
        am.addNode('D');
        am.addNode('E');

        am.createEdge(0, 1);
        am.createEdge(1, 2);
        am.createEdge(2, 0);
        am.createEdge(2, 1);

        con.print(String.valueOf(am.checkEdge(0, 1)));
        con.nextLine();
        con.print(String.valueOf(am.checkEdge(2, 1)));
        con.nextLine();
        am.print();

        // adjecencylist
        con.nextLine();

        Graphs.ajecylist.adjcentList al = new Graphs.ajecylist.adjcentList();
        al.addNode('A');
        al.addNode('B');
        al.addNode('C');
        al.addNode('D');
        al.addNode('E');
        al.createEdge(0, 1);
        al.createEdge(1, 0);
        al.createEdge(1, 2);
        al.createEdge(2, 0);
        al.createEdge(2, 1);
        al.createEdge(2, 3);
        con.nextLine();
        con.print(String.valueOf(al.checkEdge(0, 3)));
        con.nextLine();
        con.print(String.valueOf(al.checkEdge(0, 1)));
        con.nextLine();
        al.print();

    }

    private static void hashitup() {
        HashMap hm = new HashMap();
        hm.add(100, "hi");
        hm.add(624, "there");
        hm.hashcode();
        con.nextLine();
        hm.getAll();
    }

    private static void quicksorter() {
        QuickSort qs = new QuickSort();
        int[] s = { 5, 2, 3, 6, 1, 4 };
        qs.quickSort(s, 0, s.length - 1);
        con.print("\n");
        for (int l : s) {

            con.printInt(l);
            con.print("-");
        }
        con.print("\n");
    }

    private static void Mergeitup() {
        MergeSort ms = new MergeSort();
        int[] l = { 5, 3, 6, 8, 1, 3, 6, 7, 0 };

        ms.sort(l);

        for (int m : l) {
            con.printInt(m);
            con.print("\n");
        }
    }

    private static void Recurseitup() {
        Recursion r = new Recursion();
        String a = "walk\n";
        con.clearScreen();
        r.steps(a, 3);
        con.clearScreen();
        con.printInt(r.factorial(3));
        con.print("\n");
        con.printInt(r.power(2, 3));
    }

    private static void Inseritup() {
        int[] a = { 4, 5, 3, 2, 1, 5, 7, 9 };
        InsertionSort is = new InsertionSort();
        is.sort(a);
        for (int e : a) {
            con.printInt(e);
            con.print("\n");
        }
    }

    private static void Selectitup() {
        SelectionSort secte = new SelectionSort();
        int v[] = { 6, 4, 2, 1, 5, 7, 3 };
        secte.sortThis(v);
        for (int i : v) {
            con.printInt(i);
            con.print("\n");
        }
    }

    private static void BubbleItUp() {
        BubbleSort bubbleSort = new BubbleSort();
        int v[] = { 5, 4, 3, 2, 1, 0 };
        bubbleSort.sortThis(v);
        for (int i = 0; i < v.length; i++) {
            con.printlnInt(v[i]);
        }
    }

    private static void interplationBro() {
        InterpolationSearch is = new InterpolationSearch();
        int[] list = { 1, 2, 4, 8, 16, 32, 64, 128, 256, 512, 1024 };
        con.printlnInt(is.interpolit(list, list.length - 1, 0, 32));
    }

    private static void binarySearchTest() {
        int[] ad = { 1, 2, 3, 4, 5, 6, 7, 8 };
        BinarySearch bs = new BinarySearch();
        con.print(bs.search(ad, 3));
    }

    private static void Dublelinkytesty() {
        DoubleLinkedLIsty list = new DoubleLinkedLIsty();
        list.insertFront(1);
        list.insertFront(-1);
        list.display();
        list.insertLast(2);
        list.insertLast(3);
        list.display();
        list.insertAtIndex(1, 0);
        list.display();
        list.removeFront();
        list.removeLast();
        list.display();
        list.removeAtIndex(1);
        list.display();
        con.println(list.getSize()+""+list.getFront()+""+list.getLast());
    }

    private static void buildingStack() {
        Stack list = new Stack();
        list.Push(10);
        list.Push(11);
        list.read();
        list.POP();
        list.read();
    }

    private static void linkedListTest() {
        LinkedLIsttest list = new LinkedLIsttest();
        list.insertFront(2);//1
        list.insertFront(1);//2
        list.display();
        list.insertLast(3);//3
        list.insertLast(4);//4
        list.display();
        list.insertInIndex(0, 4);
        list.display();
        list.removeFirst();
        list.display();
        list.removeLast();
        list.display();
        list.removeOnIndex(1);
        list.display();
        list.removeFirst();
        list.display();
        list.removeFirst();
        list.display();
        list.removeFirst();
        list.insertFront(100);
        list.display();
        con.printInt(list.getIndex(0));
        
    }

    private static void buildingArrayFromScrach() {
        ArrayType n = new ArrayType(5);
        n.add(10);
        n.add(5);
        n.add(6);
        n.add(8);
        n.add(2);
        n.print();
        n.remove(1);
        n.print();
        System.out.println(n.searchNum(10, 0));
        System.out.println(n.searchNum(5, 0));
        System.out.println(n.searchNum(6, 0));
        System.out.println(n.searchNum(8, 0));
        System.out.println(n.searchNum(2, 0));
    }
}
