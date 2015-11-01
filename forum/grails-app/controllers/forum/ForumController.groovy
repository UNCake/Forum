package forum

class ForumController {

    def index() {
        redirect action: "list"
    }

    def list(){

    }

    def create(){
        this.getActionName()
        try {
            def forum = new Forum(params)
            forum.save
        }catch (Exception e) {
            log.error ('No se pudo crear el Foro', e)
        }
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
