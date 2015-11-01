package forum

class AdminController {

    def beforeInterceptor = {
        log.trace("Se va a ejecutar la acción $actionName")
    }

    def index() {
        redirect action: "list"
    }

    def list(){
        log.debug( [ Admin: Admin.get(params) ] )
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
