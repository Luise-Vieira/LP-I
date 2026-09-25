package Trabalho_4;

public class Stack {
    private Node top;
    private int n;

    public Stack()
    {
        this.top= null;
        this.n=0;
    }
    public void push(int item)
    {
        Node t = new Node(); 
        t.setItem(item); 
        t.setNext(this.top); 
        this.top=t;
        this.n++;

    }
    public int pop()
    {
        
    }
    public int getTop ()
    {

    }
    public int size()
    {

    }
    public boolean isEmpty()
    {
        return false;
    }
    public void clear()
    {

    }
    public void show()
    {
        
    }
}
