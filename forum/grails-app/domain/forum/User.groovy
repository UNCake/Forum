package forum

class User{

String name
String lastname
Integer age
String username
String password

static constraints = {
  name nullable: false, blank: false, size: 3..50
  lastname nullable: false, blank: false, size: 3..50
  age nullable: false, blank: false, min: 13
  username nullable: false, blank: false, unique: true
  password nullable: false, blank: false, minSize: 8, matches: "([a-zA-Z0-9]*[A-Z][0-9])+"

}

}
