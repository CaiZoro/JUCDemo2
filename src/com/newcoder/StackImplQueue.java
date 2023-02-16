package com.newcoder;

import java.util.Stack;
/** 栈是先进后出，队列是先进先出，为了用两个栈实现一个队列的进和出方法，可以这样：
 * 进：保存到栈一里面；底|1|2|3|
 * 出：栈一中的元素依次出栈，并进入到栈2中 底|3|2|1|，然后再把栈二顶的元素推出，就
 * 实现了队列的出功能；
 *
 */
public class StackImplQueue {
    public static void main(String[] args) {
        MyQueue<Integer> myQueue = new MyQueue<>();
        myQueue.push(1);
        myQueue.push(2);
        myQueue.push(3);
        System.out.println("队列出队的第1个是："+myQueue.pop());
        System.out.println("队列出队的第2个是："+myQueue.pop());
        System.out.println("队列出队的第3个是："+myQueue.pop());
    }

}
class MyQueue<ElementType>{
    public MyQueue(){

    }

    private Stack<ElementType> stack1 = new Stack<>();
    private Stack<ElementType> stack2 = new Stack<>();
    public void push(ElementType e){
       stack1.push(e);
    }
    public ElementType pop(){
        while (!stack1.empty()){
            stack2.push(stack1.pop());
        }
        return stack2.pop();
    }
    public boolean isEmpty(){
        return stack1.empty();
    }
}