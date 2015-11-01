package forum

import grails.converters.JSON

class PostController {

    def beforeInterceptor = {
        log.trace("Se va a ejecutar la acci�n $actionName")
    }

    def afterInterceptor = { model ->
        log.trace("Se ha ejecutado la acci�n $actionName")
    }

    def index() {
        redirect action: "list"
    }

    def list(){
        render Post.list() as JSON
    }

    def comment(){

    }

    def rate(){
        def post = Post.findById(params.actualPost)
    }

    def share(){
        render "No se ha implementado esta funcionalidad"
    }

    def create(){
        this.getActionName()
        try {
            def post = new Post(params)
            post.save()
        }catch (Exception e) {
            log.error ('No se pudo crear el Post', e)
        }
    }
    def read(){
        try {
            render Post.findAll()
        }catch (Exception e) {
            log.error ('No se pudo leer el Post', e)
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
