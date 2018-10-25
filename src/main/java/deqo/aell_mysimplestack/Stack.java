package deqo.aell_mysimplestack;

import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.List;

public class Stack implements SimpleStack{

    private List<Item> stack;

    public Stack () {
        this.stack = new ArrayList<>();
    }

    @Override
    public boolean isEmpty() {
        return (this.stack.size() == 0);
    }

    @Override
    public int getSize() {
        return this.stack.size();
    }

    @Override
    public void push(Item item) {
        this.stack.add(item);
    }

    @Override
    public Item peek() throws EmptyStackException {
        return this.stack.get(this.stack.size()-1);
    }

    @Override
    public Item pop() throws EmptyStackException {
        Item res = this.stack.get(this.stack.size()-1);
        this.stack.remove(this.stack.size()-1);
        return res;
    }
}
