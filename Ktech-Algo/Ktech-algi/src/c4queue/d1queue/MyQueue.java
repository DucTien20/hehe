package c4queue.d1queue;

public class MyQueue {
    private int[]arr= new int[16];
    // vi tri dau tien( xuat ra dau tien)
    private int front = -1;
    // vi tri cuoi cung vao sau cung( ra sau cung)
    private int rear =-1;

    // them data enQueue
    public  void enQueue(int x){
        rear++;
        //해당 위지에 널어준다
        arr[rear] = x;
    }

    // lay data ra deQueue
    public int deQueue() {
        //front의 크기는 키워주고
        front++;
        //해당 위지에 널어준다
       return arr[front];

    }

    // Queue da trong chua isEmpty
    public boolean isEmpty(){
        return front==rear;
    }
    public boolean isFull(){
        return rear == arr.length -1;
    }
}
