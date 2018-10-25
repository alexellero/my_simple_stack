package deqo.aell_mysimplestack;

import org.junit.Test;

import static org.junit.Assert.*;

public class ItemTest {

    @Test
    public void getValue() {
        Item item = new Item(1);
        assertEquals(1,item.getValue());

    }
}