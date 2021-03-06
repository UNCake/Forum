package forum

import grails.converters.JSON

class AdminController {

    def beforeInterceptor = {
        log.trace("Se va a ejecutar la acci�n $actionName")
    }

    def afterInterceptor = { model ->
        log.trace("Se ha ejecutado la acci�n $actionName")
    }

    def index() {
        //list()
        //redirect action: "list"
    }

    def list(){
        render Admin.list() as JSON
    }

    def create(){
        this.getActionName()
        try {
            def admin = new Admin(params)
            admin.save
        }catch (Exception e) {
            log.error ('No se pudo crear el administrador', e)
        }
    }
    def read(){
        try {
            render Admin.findAll()
        }catch (Exception e) {
            log.error ('No se pudo crear el administrador', e)
        }
    }
    def update(){
        try {

        }catch (Exception e) {
            log.error ('No se pudo crear el administrador', e)
        }
    }
    def delete(){
        try {

        }catch (Exception e) {
            log.error ('No se pudo crear el administrador', e)
        }
    }
}
