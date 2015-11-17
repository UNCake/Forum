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
        this.getActionName()
        try {
            def forum = new Forum(params)
            forum.save
        }catch (Exception e) {
            log.error ('No se pudo crear el Foro', e)
        }
<<<<<<< HEAD
        render "algo"
=======
        redirect(controller: 'forum', action: 'index')
>>>>>>> b84d1e249d9533adca12d1acb03bf6ffaa6f3441
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
            def borrado = Forum.findWhere(id:params.id)
            borrado.delete()
        }catch (Exception e) {
            log.error ('No se pudo borrar', e)
        }
    }
}
