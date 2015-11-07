import forum.*
class BootStrap {

    def init = { servletContext ->
        def user = new Regular(name: "Felipe", lastname: "Rey", age: 30, username: "frey123", password: "asdfG12")
        user.save()

        def admin = new Admin(name: "Camilo", lastname: "lololo", age: 20, username: "camlolo", password: "qwertY12",
                level: 1, rating: 5)

        def forum = new Forum(name: "Controller 1", category: "Grails")
        admin.addToForumsToMod(forum)
        admin.save(flush: true)

        def post = new Post(topic: "A topic", itsAllowed: true, owner: user, forum: forum)

        post.save(flush: true)
    }
    def destroy = {
    }
}
