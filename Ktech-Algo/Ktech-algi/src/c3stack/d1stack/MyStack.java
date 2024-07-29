package c3stack.d1stack;

public class MyStack {
    // nhap du lieu vao
    private final int[] arr = new int[16];
    // phai cho stack bay gio
    private int top = -1;
    //  neu top == 0 arr[0] stack의 마지막으로 데이터가ㅏ 존재한다
    //push
    public void push(int x){
        if(top == arr.length -1){
            throw new RuntimeException(" stack is full");
        }
        top++;
        arr[top] = x;
    }
    // lay du lieu ra
    //pop
    public int pop(){
        int value = arr[top];
        top--;
        return  value;
    }
    // xac nhan stack trong(empty) hay k
    public boolean isEmpty(){
        return top==-1;
    }

}
