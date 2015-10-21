package forum

class Post{

String topic
Date dateCreated
Date lastupdate
boolean itsAllowed

static constraints = {
  topic nullable: false, size: 3..50
  dateCreated nullable: false, min: new Date()
  lastupdate nullable: false, min: new Date()
  itsAllowed nullable: false
}

}
