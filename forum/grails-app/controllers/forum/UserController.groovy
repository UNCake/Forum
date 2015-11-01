package forum

import grails.converters.JSON

class UserController {

    def beforeInterceptor = {
        log.trace("Se va a ejecutar la acci�n $actionName")
    }

    def afterInterceptor = { model ->
        log.trace("Se ha ejecutado la acci�n $actionName")
    }

    def index() {
        render User.list() as JSON
    }

    def list(){

    }

    def create(){
        this.getActionName()
        try {
            def user = new User(params)
            user.save()
        }catch (Exception e) {
            log.error ('No se pudo crear el usuario', e)
        }
    }
    def read(){
        try {
            render User.findAll()
        }catch (Exception e) {
            log.error ('No se pudo leer el usuario', e)
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
