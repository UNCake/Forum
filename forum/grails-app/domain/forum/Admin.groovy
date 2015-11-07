package forum

class Admin extends User {

    Integer level
    Double rating
    static hasMany = [forumsToMod:Forum]

    static constraints = {
        sort: "level"
        level nullable: false, range: 1..5
        rating nullable: false, range: 0..100
    }

}
