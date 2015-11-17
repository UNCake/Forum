package forum

import grails.converters.JSON

class ForumController {

    def beforeInterceptor = {
        log.trace("Se va a ejecutar la acción $actionName")
    }

    def afterInterceptor = { model ->
        log.trace("Se ha ejecutado la acción $actionName")
    }

    def index() {
        //redirect action: "list"
        render(view:'index', model: [forumList: Forum.findAll()])
    }

    def list(){
        render Forum.list() as JSON
    }

    def create(){
        print "Jueputa vida"
        print(params)
        this.getActionName()
        try {
            def forum = new Forum(params)
            forum.save
        }catch (Exception e) {
            log.error ('No se pudo crear el Foro', e)
        }
        render "algo"
    }
    def read(){
        try {
            render Forum.findAll()
        }catch (Exception e) {
            log.error ('No se pudo leer el Foro', e)
        }
    }
    def update(){
        try {

        }catch (Exception e) {
            log.error ('No se pudo actualizar', e)
        }
    }
    def delete(){
        try {

        }catch (Exception e) {
            log.error ('No se pudo borrar', e)
        }
    }
}
