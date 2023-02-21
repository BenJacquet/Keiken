## Checklist :
- Create Use Case Diagram ✅
[pdf](./Library%20-%20Use%20Case%20Diagram.drawio.pdf)
- Create Class Diagram ✅
[pdf](./Library%20-%20Class%20Diagram.drawio.pdf)
- Create Entity Relationship Diagram ✅
[pdf](./Library%20-%20Entity%20Relationship%20Diagram.pdf)
- Create Sequence Diagram ❌
- Implement Database using SQL ❌
- Implement Classes and Methods in Java ❌
- Test the system with CRUD operation ❌
- Checking consistency ❌

For the Sequence Diagram, I did not have time to finish so I chose to do it in very simplified text format for the moment and come back to it to create a proper diagram

```
Member -> Administrator: Request to borrow a book

Administrator -> Member: Request for member ID

Member -> Administrator: Provide member ID

Administrator -> Book: Check availability of requested book

Book -> Administrator: Respond with book availability

Administrator -> Member: Inform member of book availability and due date

Member -> Administrator: Confirm request to borrow book

Administrator -> Book: Record book as checked out to member

Book -> Administrator: Confirm book is checked out to member

Administrator -> Reservation: Generate reservation with book details and due date

Reservation -> Administrator: Provide reservation to member

Administrator -> Member: Hand over book and reservation to member
```