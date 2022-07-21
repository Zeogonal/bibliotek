public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("Щербеткин М.М.", "Бося");
        Book book2 = new Book("Самаркин П.Ж.", "Буркус");
        Book book3 = new Book("Пуриков П.Т.", "Сатиполи");
        Book book4 = new Book("Манянин Л.Г.", "Мармамоли");

        Reader readerMisha = new UserReader("Станислав");
        Reader readerVasya = new UserReader("Угорин");
        Reader readerSasha = new UserReader("Саламик");

        Supplier supplierLena = new User("Авантал");

        Administrator administrator = new Admin("Люсинда");

        Librarian librarianGoga = new User("Самилла");

        librarianGoga.orderBook(supplierLena, book2);
        supplierLena.bringsBook(administrator, book2);
        administrator.findBook(readerMisha, book2);
        readerMisha.takeBoob(administrator, book2);

        readerVasya.returnBook(administrator, book1);
        administrator.giveBook(readerVasya, book1);

        administrator.overdueNotification(readerMisha, book3);
        readerMisha.returnBook(administrator, book3);

        readerSasha.takeBoob(administrator, book4);

    }
}
