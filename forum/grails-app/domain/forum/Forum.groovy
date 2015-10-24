package forum

class Forum {

    String name
    Date dateCreated
    String category

    static hasMany = [posts:Post]

    static constraints = {
        name nullable: false, size: 3..20, unique: true
        dateCreated nullable: false, min: new Date()
        category nullable: false, size: 3..15
    }

}
