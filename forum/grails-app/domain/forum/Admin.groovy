package forum

class Admin extends User {

    Integer level
    Double rating
    static hasMany = [forumsToMod:Forum]

    def c = Admin.createCriteria()
    def results = c.list {
        order("level", "desc")
    }

    static constraints = {
        level nullable: false, range: 1..5
        rating nullable: false, range: 0..100
    }

}
