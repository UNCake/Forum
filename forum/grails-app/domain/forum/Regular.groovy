package forum

class Regular extends User {

    Integer postViews
    Integer strikesNumber
    Integer starsNumber

    static hasMany = [posts:Post]

    static mapping = {
        posts cascade: 'all-delete-orphan'
    }

    static constraints = {
        postViews nullable: false, blank: true
        strikesNumber nullable: false, range: 0..3
        starsNumber nullable: false, range: 0..5
    }

}
