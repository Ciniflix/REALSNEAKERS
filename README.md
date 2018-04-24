## Play Framework Product Catalogue with Login and access control

### Public site (HomeController)
- View products
- Login
- Login sets session cookie

### Admin Section (AdminController)
- require a user to be logged in
- access control (check that user has admin role)
- Add and edit products (seperate views for admin)

### All sections
- Show  Login or User / Logout link (main template)
- All controller action methods get logged in user and pass as a parameter to views

**See application homepage and comments for more**
