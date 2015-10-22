package forum

class File {

    String fileType
    Byte[] content
    Integer size

    static constraints = {
        fileType nullable: false, match: "[a-zA-Z0-9]+'/'[a-zA-Z0-9]+"
        content nullable: false
        size nullable: false, max: 10000
    }

}
