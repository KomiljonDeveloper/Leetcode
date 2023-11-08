class Solution {
    public int evalRPN(String[] tokens) {
         Stack<Integer> stack = new Stack<>();

        for (String token : tokens) {
            stack.push(
              switch (token){
                  case "+" -> {
                      int a = stack.pop();
                      int b = stack.pop();
                      yield a+b;
                  }
                  case "-" -> {
                      int a = stack.pop();
                      int b = stack.pop();
                      yield b-a;
                  }
                  case "*" -> {
                      int a = stack.pop();
                      int b = stack.pop();
                      yield a*b;
                  }
                  case "/" -> {
                      int a = stack.pop();
                      int b = stack.pop();
                      yield b/a;
                  }
                  default -> 
                      Integer.parseInt(token);
              }
            );
        }
        return stack.peek();
    }
}