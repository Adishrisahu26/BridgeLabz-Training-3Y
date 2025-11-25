class Book {
  constructor(title, author, isbn) {
    this.title = title;
    this.author = author;
    this.isbn = isbn;
    this.isIssued = false;
  }
  issueBook() { this.isIssued = true; }
  returnBook() { this.isIssued = false; }
}

const books = [
  new Book("DSA", "Karumanchi", "111"),
  new Book("Maths", "RD Sharma", "222"),
  new Book("Physics", "HC Verma", "333")
];

console.log("Available Books:");
console.log(books.filter(b => !b.isIssued));

function issue(isbn) {
  let found = books.find(b => b.isbn == isbn);
  if(found && !found.isIssued){
    found.issueBook();
    console.log("Issued:", found.title);
  } else {
    console.log("Not available");
  }
}

issue("222");
