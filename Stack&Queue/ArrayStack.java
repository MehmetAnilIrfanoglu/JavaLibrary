package mehmetanilirfanoglu;

public class ArrayStack<E> implements Stack<E> {
  
	public static final int CAPACITY=1000;   

  private E[] data;                        

  private int top = -1;                      
  private int count = -1;
  
  public ArrayStack() { this(CAPACITY); }  

  @SuppressWarnings("unchecked")
public ArrayStack(int capacity) {        
    data = (E[]) new Object[capacity];     
  }

  public int size() { return (top + 1); }
  
  public boolean isEmpty() { return (top == -1); }

  
  
  public void push(E e) throws IllegalStateException {
    if (size() == data.length) {
    	count++;
    	if(count==data.length) {
    		count=0;
    	}
    	data[count]=e;
    }
    else {
    	data[++top] = e;
    }
                               
  }

  public E top() {
    if (isEmpty()) return null;
    return data[top];
  }

  
  public E pop() {
    if (isEmpty()) return null;
    E answer = data[top];
    data[top] = null;                       
    top--;
    return answer;
  }

 
  public String toString() {
    StringBuilder sb = new StringBuilder("(");
    for (int j = top; j >= 0; j--) {
      sb.append(data[j]);
      if (j > 0) sb.append(", ");
    }
    sb.append(")");
    return sb.toString();
  }

  /*the void main part shows an example of question 2 */
  public static void main(String[] args) {
   
	  
	int capacity = 3; // it is the capacity , it could be change via hand
    ArrayStack<Integer> S = new ArrayStack<Integer>(capacity); 
	
	S.push(1);
	S.push(2);
	S.push(3);
	S.push(4);
	S.push(5);
	S.push(6);
	S.push(7);
	S.push(8);
	S.push(9);
	
	for(int i =0;i<capacity;i++) {
		System.out.println(S.pop());
	}
	
  }
}