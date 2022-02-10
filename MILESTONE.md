
The Bank of Mexico has the need to introduce a new
rest API for users payments. The requirements are
as follow:

1. The API must be able to accept the creation of new users.

   - A user must have the following properties: id, name, age, address.
   - The user id must be unique and must be generated while saving the user.
   - The API must return an HTTP-201 CREATED.

2. Error handling
   - When trying to update a user that doesn't exist, return an HTTP-404 with the following properties: message, reason.

3. The API must be able to accept a user's payment.

   - A payment must have the following properties: date, amount.
   - A payment must relate to a user.
   - The API must return an HTTP-200 OK. Do you consider this as a good HTTP status code to return?
   
4. The API must be able to retrieve the user's payments that sit within a given range of dates.

5. Unit tests.
