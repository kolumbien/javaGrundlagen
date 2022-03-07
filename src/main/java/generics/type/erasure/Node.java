package generics.type.erasure;

public class Node {
    private Object data;

    public Node(Object data){
        this.data=data;
    }

    public void setData(Object data){
        this.data=data;
    }
}

class MyNode extends Node{

    public MyNode(Integer data) {
        super(data);
    }

    public void setData(final Integer data) {
        super.setData(data);
    }
}
