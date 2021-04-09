import java.util.List;

public interface Vali {
    void add(List<Book> list);

    void display(List<Book> list);

    void remove(List<Book> list, int index);

    void edit(List<Book> list, int index);
}
