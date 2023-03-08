# Library Management (third assignment)

## Introduction
- In this assignment we made a library management that have User, Librarian and Book classes with their own variables and methods.
- we also have a Library class that a big part of this code happen there.


## Design and Implementation
**classes**
> Class User
- In the User class we declare variables username and password (for login or creating an account if they don't have one)
- And a list named *rentedBook* for the books the rent.
- functions for renting and returning books to the library.
- And Setter-Getter function.

> Class Book 
- In the book class we have variables including name, author, number of pages, price, year of publish and ISBN.
- I declare a boolean named *isRented* to know if anyone rented that book or not.
- I changed the situation of this boolean in main.
- and setter-getter function.

> Class Librarian 
- In this class we declare variables username and password (just like user class).
- and getter-setter function as usual.

>> Library Class
- In the class Library (which is the class that contains our main methods).
- We have methods : add, remove, search, update and doesExist for all Book, User and Librarian.
- We also have 3 arrayList and 3 HashMap for Book, User and Librarian.(I will see more about them in the **Testing and Evaluation** part).
- In *add* methods we create a new object and get the variables from user and also add it to ArrayList and HashMap of that object.
- In *remove* method we get name/username from terminal, find that object and set it null to delete it.
- In *search* method we get name/username from terminal, fing the object and show their details in the terminal.
- In *update* method we again get name/username and find the object then the code let us to kindof rewrite their variables.
- in *doesExist* method we get name/username and look in the list of Book/User/Library and check if it exists.

## Testing and Evaluation
- For finding the specific object and have access to its variables, I used HashMap
- and solve the errors that was made. (with like making a void Book public function that only get name of the book and do this for User and Librarian too)
- 


## Conclusion
- we used 3 main classes (User, Book and Librarian) and big part of the program is about them.


## Bonus Objectives
- I used regex to make password safer. (with the regex I used password should be at least 8 letters and contains both character and numbers)
- I made a rentedBook lsit for user to prevent returning books that weren't rent by that user. (the program first check if that book is in the rented list, and then if it was the user can retuen it)
- I also used HashMap for finding objects. (more details is in *Testing and Evaluation* part)



