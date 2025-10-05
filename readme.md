# Exercises on Arrays, class and Object, Wrapper Classes ...

## Project description 

### Exercice 1: CourseNumberArray

This program shows basic array operations in Java using course numbers.

* **Initialization**: Starts with a fixed array of course IDs.
* **Add Course (`addCourse`)**: Creates a new array, copies old values, and appends the new course (demonstrates manual resizing).
* **Search Course (`containsCourse`)**: Uses a simple linear search to check if a course exists in the array.
* **Main**: Adds a new course (2000) and searches for an existing one (2140), printing the result.

It demonstrates array manipulation, dynamic expansion, and searching without advanced data structures.

### Exercice 2: DogShelter

This program manages a simple shelter using arrays to track the number of dogs by breed.

* **Array Initialization**: A static array `dogCounts` of size 3 stores counts for three breeds.
* **Add Breed (`addBreed`)**: Increases the number of dogs for a given breed index.
* **Delete Breed (`deleteBreed`)**: Removes a breed by setting its count to 0 (since arrays are fixed-size).
* **Display (`displayDogs`)**: Iterates over the array and prints the number of dogs per breed.
* **Main**: Demonstrates usage by initializing counts, adding dogs, removing a breed, and displaying results before and after updates.

It illustrates array manipulation, updates by index, and simple data management using fixed-size arrays.

### Exercice 3: BankAccount

This program manages a simple bank account using arrays to track user transactions.

* **Attributes**:

    * `name`: Account holder's name.
    * `currentBalance`: The current balance of the account.
    * `transactions`: A fixed-size array (1000) to store transaction amounts.
    * `transactionCount`: Tracks the number of transactions recorded.

* **Deposit (`deposit`)**: Adds a positive amount to the balance and records it in the transactions array.

* **Withdraw (`withdraw`)**: Subtracts a positive amount from the balance if sufficient funds exist, recording it as a negative transaction.

* **Display Transactions (`displayTransactions`)**: Iterates over the transactions array and prints deposits and withdrawals.

* **Display Balance (`displayBalance`)**: Prints the current account balance.

* **Main**: Demonstrates account creation, deposits, withdrawals, and displays transaction history and balance.

It illustrates array usage for recording multiple values, simple account operations, and basic input validation.

### Exercice 4: ManageStudent
This program manages an array of students and performs various operations using arrays and simple data structures.

* **Array of Students**: Stores `Student` objects in a fixed-size array or expandable array.

* **Find Oldest (`findOldest`)**: Returns the student with the highest age.

* **Count Adults (`countAdults`)**: Counts students aged 18 or older.

* **Average Grade (`averageGrade`)**: Computes the average grade of all students.

* **Search by Name (`findStudentByName`)**: Finds a student by name, ignoring case.

* **Sort by Grade Descending (`sortByGradeDesc`)**: Orders students by grade in descending order.

* **Print High Achievers (`printHighAchievers`)**: Displays students with grades ≥ 15.

* **Update Grade (`updateGrade`)**: Updates a student’s grade by ID.

* **Detect Duplicate Names (`hasDuplicateNames`)**: Checks if multiple students share the same name.

* **Append Student (`appendStudent`)**: Expands the array to add a new student.

* **Print 2D Array (`printSchool`)**: Prints the names of students in a 2D array representing classes.

* **Main**: Demonstrates all functionalities including creating students, performing queries, sorting, updating, appending, and printing a school.

It illustrates array manipulation, searching, sorting, aggregation, and working with both 1D and 2D arrays of objects.

## Student 

- Yasser, Baouzil