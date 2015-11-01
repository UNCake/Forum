package forum

import grails.converters.JSON

class RegularController {

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
        render Regular.list() as JSON
    }

    def create(){
        this.getActionName()
        try {
            def regular = new Regular(params)
            regular.save()
        }catch (Exception e) {
            log.error ('No se pudo crear', e)
        }
    }
    def read(){
        try {
            render Regular.findAll()
        }catch (Exception e) {
            log.error ('No se pudo leer', e)
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
