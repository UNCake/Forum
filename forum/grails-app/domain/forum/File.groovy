package forum

class File {

    String fileType
    Byte[] content
    Integer size
    static belongsTo = [parentPost: Post]

    static mapping = {
        parentPost column: "post_belongs_id"
    }

    static constraints = {
        fileType nullable: false, match: "[a-zA-Z0-9]+'/'[a-zA-Z0-9]+"
        content nullable: false
        size nullable: false, max: 10000
    }

}
