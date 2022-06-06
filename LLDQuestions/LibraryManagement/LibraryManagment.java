package LibraryManagement;

public class LibraryManagment {
	

}
/*
public class Library{
	String name;
	Address address;
	List<Book> books;
}

public class Address{
	int pinCode;
	String street;
	String Country;
   String Location;
}

public class Book{
String ISBNNumber;
int price;
Date publishedDate;
List<Author> authors;
}

public class BookIem extends Book {
String barcode;
BookType booktype;
ReservationStatus status;
Date issuedDate;
Person person;
Rack placedAt;
}

public class BookReservation {
int bookReservationId;
String barcode;
int memberId;
reserveBook(BookItem item,int accountid);
}

public class BookLending{
Date creationDate;
String barcode;
Member memberId;
Date returnDate;
Date issuedDate;
private boolean checkStatus(barcode);
private void checkOut(barcode,memberId);
private BookLending fetchBookLending(String barcode)
}
 
 






class Person{
String name;
String email;
Date dob;
}
class Account{
int accountId;
AccountStatus accountStatus;
Person person;
}
Class Member extends Person{
Date memberShipEndDate;

getCountOfBooksCheckedOut()//
checkOutBookItem() //
checkForFine() //
}

public bookLending{
BookItem bookItem,
Member

public class Rack {
int rackNo;
String rackPhysicalLocation;
}
Enum BookType{
Hardcover,
E-Book.
}

public interface Search {
  public List<Book> searchByTitle(String title);
  public List<Book> searchByAuthor(String author);
  public List<Book> searchBySubject(String subject);
  public List<Book> searchByPubDate(Date publishDate);
}

public class Catalog implements Search {
  private HashMap<String, List<Book>> bookTitles;
  private HashMap<String, List<Book>> bookAuthors;
  private HashMap<String, List<Book>> bookSubjects;
  private HashMap<String, List<Book>> bookPublicationDates;

  public List<Book> searchByTitle(String query) {
    // return all books containing the string query in their title.
    return bookTitles.get(query);
  }

  public List<Book> searchByAuthor(String query) {
    // return all books containing the string query in their author's name.
    return bookAuthors.get(query);
  }
}








*/


