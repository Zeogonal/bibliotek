public interface Administrator extends Person { //Что далает Администратор
    void findBook(Reader reader, Book book);

    void giveBook(Reader reader, Book book);

    void overdueNotification(Reader reader, Book book);
}
