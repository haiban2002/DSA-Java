
public class StackArray {

  int size;
  int[] stack;
  int top = -1;

  StackArray() {
      size = 100;
      stack = new int[size];
  }
  
  void push(int data) {
      if (top == size - 1) {
          System.out.println("Overflow");
          return;
      }
      stack[++top] = data;
  }

  int pop() {
      if (top == -1) {
          System.out.println("Underflow");
          return -1;
      }
      return stack[top--];
  }

  int peek() {
      return stack[top];
  }

  int isEmpty() {
      if (top == -1) {
          return 1;
      }
      return 0;
  }

  public static void main(String[] args) {
      
      StackArray stack = new StackArray();
      stack.push(5);
      stack.push(6);
      stack.push(1);
      stack.push(2);
      System.out.println(stack.pop());
      System.out.println(stack.isEmpty());
      System.out.println(stack.peek());
  }
}
