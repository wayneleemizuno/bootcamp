public class Book {
  private String title;
  private String author;
  private boolean isAvailable;

  public Book(String title, String author) {
    this.title = title;
    this.author = author;
    isAvailable = true;
  }

  public String getTitle() {
    return this.title;
  }

  public String getAuthor() {
    return this.author;
  }

  public boolean isAvailable() {
    return this.isAvailable;
  }

  public boolean borrow() {
    if (this.isAvailable()) {
      this.isAvailable = false;
    }
    return false;
  }

}
