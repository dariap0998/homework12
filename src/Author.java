public class Author {
       private String fullName;

       public  Author (String fullName) {
              this.fullName = fullName;
       }

       public String getFullName() {
              return this.fullName;
       }

       public String toString() {
              return "Автор книги - "+ getFullName();

       }
       public boolean equals(Object other) {
              if (this.getClass() != other.getClass()) {
                     return false;
              }
              Author second = (Author) other;
              return fullName.equals(second);
       }
       public int hashCode() {
              return java.util.Objects.hash(fullName);
       }
}
