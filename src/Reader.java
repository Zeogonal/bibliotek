public interface Reader extends Person { // Читатели
    void takeBoob(Administrator administrator, Book book);
    void returnBook(Administrator administrator, Book book);
}
