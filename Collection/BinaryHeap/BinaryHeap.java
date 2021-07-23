package p4submit;

import java.util.Arrays;

@SuppressWarnings("unchecked")

public class BinaryHeap < T extends Comparable < T >> //heap class
{

  private T[] heap; //main heap
  private int length; //length of heap
  private static final int DEFAULT_CAPACITY = 100; //capacity of heap

  public BinaryHeap() //constructor of heap
  {
    heap = (T[]) new Comparable[DEFAULT_CAPACITY]; //set heap
    length = 0; //set length
  }

  public void add(T value) //insert element to heap
  {

    if (this.length >= heap.length - 1) //checking length
    {
      heap = this.resize(); //increase size
    }

    length++; //increase length
    heap[length] = value; //set value
    bubbleUp(); //bubble up
  }

  public T remove() //remove element
  {
    T result = peek(); //the element that we gona delete

    swap(1, length); //swapping
    heap[length] = null; //decreasing length and setting last one to null
    length--;

    bubbleDown(); //bubble down

    return result; //returning deleted element
  }

  public boolean isEmpty() //checking if heap is empty
  {
    return length == 0;
  }

  public T peek() //look at first element
  {
    if (isEmpty()) throw new IllegalStateException();
    return heap[1];
  }

  public int length() //gets length
  {
    return length; //acessing to length
  }

  private T[] resize() //increases length of heap
  {

    return Arrays.copyOf(heap, heap.length + DEFAULT_CAPACITY);
  }

  private void bubbleUp() //this is the bubble up function,came from heap rules
  {
    int index = length;

    while (hasParent(index) && (parent(index).compareTo(heap[index]) > 0)) {
      swap(index, parentIndex(index));
      index = parentIndex(index);
    }

  }

  private void bubbleDown() //this is the bubble down function,came from heap rules
  {
    int index = 1;

    while (hasLeftChild(index)) {

      int smaller = leftIndex(index);
      if (hasRightChild(index) && heap[leftIndex(index)].compareTo(heap[rightIndex(index)]) > 0) {
        smaller = rightIndex(index);
      }
      if (heap[index].compareTo(heap[smaller]) > 0) {
        swap(index, smaller);
      }
      else break;

      index = smaller;
    }
  }

  private boolean hasParent(int i) //checking parent
  {
    return i > 1;
  }

  private int leftIndex(int i) //checking left index
  {
    return i * 2;
  }

  private int rightIndex(int i) //cehcking right index
  {
    return i * 2 + 1;
  }

  private boolean hasLeftChild(int i) //is there left child
  {
    return leftIndex(i) <= length;
  }

  private boolean hasRightChild(int i) //is there right child
  {
    return rightIndex(i) <= length;
  }

  private int parentIndex(int i) {
    return i / 2;
  }

  private T parent(int i) {
    return heap[parentIndex(i)];
  }

  private void swap(int index1, int index2) //swap function , it sawaps elements
  {
    T temp = heap[index1];
    heap[index1] = heap[index2];
    heap[index2] = temp;
  }

}