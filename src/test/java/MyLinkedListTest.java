import static org.junit.jupiter.api.Assertions.*;

        import org.junit.jupiter.api.DisplayName;
        import org.junit.jupiter.api.Test;

        import java.util.LinkedList;

class MyLinkedListTest {
    @Test
    @DisplayName("12345")
    void BasePath1() {
        MyLinkedList<String> list = new MyLinkedList<>();
        list.add(null);
        assertEquals(true, list.remove(null));

    }
    @Test
    @DisplayName("12311")
    void basePath2() {
        MyLinkedList<String> list = new MyLinkedList<>();
        list.add("hello");
        assertEquals(false, list.remove(null));

    }
    @Test
    @DisplayName("167811")
    void BasePath3() {
        MyLinkedList<String> list = new MyLinkedList<>();
        list.add("hello");
        assertEquals(true, list.remove("hello"));

    }
    @Test
    @DisplayName("1678911")
    void basePath4() {
        MyLinkedList<String> list = new MyLinkedList<>();
        list.add(null);
        assertEquals(false, list.remove("hello"));

    }

}