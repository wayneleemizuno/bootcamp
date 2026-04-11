public class Library {
  private Book[] books;

  public Library(int size) {
    books = new Book[size];
  }

  public void addBook(Book book) {
    for (int i = 0; i < books.length; i++) {
      if (books[i] == null) {
        books[i] = book;
        break;
      }
    }
  }

  public Book searchByTitle(String title) {
    for (int i = 0; i < books.length; i++) {
      if (books[i] == null) {
        continue;
      }
      if (books[i].getTitle().equalsIgnoreCase(title)) {
        return books[i];
      }
    }
    return null;
  }

  public Book searchByAuthor(String author) {
    Book[] foundBooks = new Book[books.length];
    for (int i = 0; i < books.length; i++) {
      if (books[i] == null) {
        continue;
      }
      if (books[i].getAuthor().equalsIgnoreCase(author)) {
        for (int j = 0; j < foundBooks.length; j++) {
          if (foundBooks[j] == null) {
            foundBooks[j] = books[i];
          }
        }
      }
    }
    return null;
  }

  public static void main(String[] args) {
    Book book1 = new Book("The Silent Forest", "Alice Wong");
    Book book2 = new Book("Echoes of Eternity", "David Chan");
    Book book3 = new Book("Shadows of the Past", "Alice Wong");
    Book book4 = new Book("Journey to the Horizon", "Michael Lee");
    Book book5 = new Book("Crimson Dawn", "Sophia Ng");
    Book book6 = new Book("Whispers in the Dark", "David Chan");

    Library lib1 = new Library(50);

    lib1.addBook(book1);
    lib1.addBook(book2);
    lib1.addBook(book3);
    lib1.addBook(book4);
    lib1.addBook(book5);
    lib1.addBook(book6);

  }

}
