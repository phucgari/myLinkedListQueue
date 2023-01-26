import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyLinkedListQueueTest {
    @Test
    void testQueueDequeue(){
        MyLinkedListQueue list=new MyLinkedListQueue();
        list.enqueue(1);
        list.enqueue(2);
        list.enqueue(3);
        list.enqueue(4);
        assertEquals(1,list.dequeue());
        assertEquals(2,list.dequeue());
        assertEquals(3,list.dequeue());
        assertEquals(4,list.dequeue());
    }
}