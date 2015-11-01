package forum

class RegularController {

    def index() {
        redirect action: "list"
    }

    def list(){

    }

    def create(){
        this.getActionName()
        try {
            def regular = new Regular(params)
            regular.save
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
