package forum

class Post {

    String topic
    Date dateCreated
    Date lastupdate
    boolean itsAllowed
    List<String> comments
    Integer rate

    static hasMany = [files:File]
    static belongsTo = [parentforum:Forum, user:Regular]

    static mapping = {
        parentforum key: "fatherForum_id"
        user key: "owner_id"
    }

    static constraints = {
        topic nullable: false, size: 3..50
        dateCreated nullable: false, min: new Date()
        lastupdate nullable: false, min: new Date()
        itsAllowed nullable: false
        rate min: 0
    }

    def beforeInsert() {
        dateCreated = new Date()
    }

    def beforeUpdate() {
        lastupdate = new Date()
    }

}
