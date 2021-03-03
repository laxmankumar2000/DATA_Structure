package Genaric;

public class node<t> {
    t data;
    node<t> next;

    public node(t data) {
        this.data = data;
        next = null;
    }
}
