import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books;
    private ArrayList<Member> members;

    public Library() {
        books = new ArrayList<>();
        members = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void addMember(Member member) {
        members.add(member);
    }

    public void printBooks() {
        if (books.isEmpty()) {
            System.out.println("No books in the library.");
        } else {
            System.out.println("Books in the library:");
            for (Book book : books) {
                System.out.println(book);
            }
        }
    }

    public void printMembers() {
        if (members.isEmpty()) {
            System.out.println("No members in the library.");
        } else {
            System.out.println("Members of the library:");
            for (Member member : members) {
                System.out.println(member);
            }
        }
    }

    // Other methods for searching, issuing, and returning books
}