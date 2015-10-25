package forum

class Post {

    String topic
    Date dateCreated
    Date lastupdate
    boolean itsAllowed

    static hasMany = [files:File]
    static belongsTo = [parentforum:Forum, user:Regular]

    static mapping = {
        parentforum column: "fatherForum_id"
        user column: "owner_id"
    }

    static constraints = {
        topic nullable: false, size: 3..50
        dateCreated nullable: false, min: new Date()
        lastupdate nullable: false, min: new Date()
        itsAllowed nullable: false
    }

}
