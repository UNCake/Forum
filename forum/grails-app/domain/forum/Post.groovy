package forum

class Post {

    String topic
    Date dateCreated
    Date lastupdate
    boolean itsAllowed
    List comments
    Integer rate

    static hasMany = [files:File, comments:String]
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
        comments = new ArrayList<String>()
    }

    def beforeUpdate() {
        lastupdate = new Date()
    }

}
