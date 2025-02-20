import java.util.Stack;

public class inbuilt_stack {
    public static void pushatbootm(Stack<Integer> s,int data){
        if (s.isEmpty()){
            s.push(data);
            return;
        }
        int top = s.pop();
        pushatbootm(s,data);
        s.push(top);
    }
    public static String reverceString(String str){
        Stack<Character> s = new Stack<>();
        int idx = 0;
        while (idx < str.length()){
            s.push(str.charAt(idx));
            idx++;
        }
        StringBuilder result = new StringBuilder("");
        while (!s.isEmpty()){
            char curr = s.pop();
            result.append(curr);
        }
        return result.toString();
    }
    public static void reverceStck(Stack<Integer> s){
        if (s.isEmpty()){
            return;
        }
        int top = s.pop();
        reverceStck(s);
        pushatbootm(s,top);
    }
    public static void printstack(Stack<Integer> s){
        while (!s.isEmpty()){
            System.out.println(s.pop());
        }
    }
    public static void stocksSpan(int stocks[],int span[]){
        Stack<Integer> s = new Stack<>();
        span[0] = 1;
        s.push(0);

        for (int i = 1; i < stocks.length; i++) {
            int currPrice = stocks[i];
            while (!s.isEmpty() && currPrice > stocks[s.peek()]){
                s.pop();
            }
            if (s.isEmpty()){
                span[i] = i+1;
            }else {
                int prevhigh = s.peek();
                span[i] = i-prevhigh;
            }
            s.push(i);
        }
    }
    public static boolean isvalid(String str){
        Stack<Character> s = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == '(' || ch == '{' || ch=='['){
                s.push(ch);
            }else {
                if (s.isEmpty()){
                    return false;
                }
                if ((s.peek() == '(' && ch == ')')||(s.peek() == '{' && ch == '}')||(s.peek() == '[' && ch == ']')){
                    s.pop();
                }else {
                    return false;
                }
            }
        }
        if (s.isEmpty()){
            return true;
        }else {
            return false;
        }
    }

    public static boolean isduplicate(String str){
        Stack<Character> s = new Stack<>();

        for (int i = 0; i < str.length() ; i++) {
            char ch = str.charAt(i);

            if (ch == ')'){
                int count = 0;
                while (s.pop() != '('){
                    count++;
                }
                if (count < 1){
                    return true;
                }
            }else {
                s.push(ch);
            }
        }
        return false;
    }
    public static void maxAria(int arr[]){
        int maxArea =0;
        int nsr[] = new int[arr.length];
        int nsl[] = new int[arr.length];

        // next smaller right
        Stack<Integer> s = new Stack<>();
        for (int i = arr.length-1; i >= 0 ; i--) {
            while (!s.isEmpty() && arr[s.peek()] >= arr[i]){
                s.pop();
            }
            if (s.isEmpty()){
                nsr[i] = arr.length;
            }else {
                nsr[i] = s.peek();
            }
            s.push(i);
        }
        // next smaller left
        s = new Stack<>();
        for (int i = 0; i < arr.length ; i++) {
            while (!s.isEmpty() && arr[s.peek()] >= arr[i]){
                s.pop();
            }
            if (s.isEmpty()){
                nsl[i] = -1;
            }else {
                nsl[i] = s.peek();
            }
            s.push(i);
        }
        //current area : width = j-i-1 = nsr[i]-nsl[i]-1
        for (int i = 0; i < arr.length; i++) {
            int height = arr[i];
            int width = nsr[i]-nsl[i]-1;
            int currArea = height*width;
            maxArea = Math.max(currArea,maxArea);
        }
        System.out.println("max area in histogram = "+maxArea);
    }
    public static void main(String[] args) {
//        Stack<Integer> s = new Stack<>();
//        s.push(1);
//        s.push(2);
//        s.push(3);
//        s.push(4);
//        s.push(5);
//
//        pushatbootm(s,45);
//
//        while (!s.isEmpty()){
//            System.out.println(s.peek());
//            s.pop();
//        }

//        String str = "abc";
//        System.out.println(str);
//        String result = reverceString(str);
//        System.out.println(result);

//        Stack<Integer> s = new Stack<>();
//        s.push(1);
//        s.push(2);
//        s.push(3);
//        s.push(4);
//        s.push(5);
//
//        reverceStck(s);
//        printstack(s);

//        int stocks[] =  {100,80,60,70,60,85,100};
//        int span[] = new int[stocks.length];
//        stocksSpan(stocks,span);
//
//        for (int i = 0; i < span.length; i++) {
//            System.out.println(span[i]+" ");
//        }

//        //next greater program
//        int arr[] = {6,8,0,1,3};
//        Stack<Integer> s = new Stack<>();
//        int nextGreater[] = new int[arr.length];
//
//        for (int i = arr.length-1; i >= 0; i--) {
//            while (!s.isEmpty() && arr[s.peek()] <= arr[i]){
//                s.pop();
//            }
//            if (s.isEmpty()){
//                nextGreater[i] = -1;
//            }else {
//                nextGreater[i] = arr[s.peek()];
//            }
//
//            s.push(i);
//        }
//        for (int i = 0; i < nextGreater.length; i++) {
//            System.out.print(nextGreater[i]+" ");
//        }
//        System.out.println();

//        String str = "({})[{}]";
//        System.out.println(isvalid(str));

//        String str = "(a+b)";
//        String str2 = "((a+b))";
//        System.out.println(isduplicate(str));
//        System.out.println(isduplicate(str2));

        int arr[] = {2,4};
        maxAria(arr);

    }
}
