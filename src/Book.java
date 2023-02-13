public class Book {
      private String bookName;
      private Author author;
      private int publicationDate;

      public Book(String bookName, Author author, int publicationDate) {
            this.bookName = bookName;
            this.author = author;
            this.publicationDate = publicationDate;

      }

      public String getBookName() {
            return this.bookName;
      }

      public Author getAuthor() {
            return this.author;
      }

      public int getPublicationDate() {
            return this.publicationDate;
      }

      public void setPublicationDate(int publicationDate) {
            this.publicationDate = publicationDate;
      }
}
