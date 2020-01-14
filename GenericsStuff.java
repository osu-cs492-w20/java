import java.util.Stack;

public class GenericsStuff {
  public static void main(String[] args) {
    Stack<Integer> intStack = new Stack<Integer>();
    for (int i = 0; i < 10; i++) {
      intStack.push(new Integer(i));
    }

    Stack<String> strStack = new Stack<String>();
    while (!intStack.empty()) {
      Integer in = intStack.pop();
      strStack.push(String.valueOf(in) + String.valueOf(in));
    }
  }
}
