package edu.cmu.cs.cs214.rec04;

/**
 * DelegationSortedIntList -- a variant of a SortedIntList that keeps
 * count of the number of attempted element insertions (not to be confused
 * with the current size, which goes down when an element is removed)
 * and exports an accessor (totalAdded) for this count.
 *
 * @author Nora Shoemaker
 *
 */

public class DelegationSortedIntList implements IntegerList {
    // Write your implementation below with API documentation
    private SortedIntList list;
    private int totalAdded;
    public DelegationSortedIntList(){
        list = new SortedIntList();
        totalAdded = 0;
    }

    public boolean add(int num){
        totalAdded++;
        return list.add(num);
    }

    public int getTotalAdded(){
        return totalAdded;
    }

    

    public boolean addAll(IntegerList elements){
        int size = elements.size();
        for(int i = 0; i < size; i++){
            add(elements.get(i));
        }
        return true;
    }

    public int get(int index){
        return list.get(index);
    }

    public int size(){
        return list.size();
    }

    public boolean remove(int num){
        return list.remove(num);
    }

    public boolean removeAll(IntegerList elements){
        int size = elements.size();
        for(int i = 0; i < size; i++){
            remove(elements.get(i));
        }
        return true;
    }





}