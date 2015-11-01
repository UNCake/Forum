package forum

class FileController {

    def index() {
        redirect action: "list"
    }

    def list(){

    }

    def create(){
        this.getActionName()
        try {
            def file = new File(params)
            file.save
        }catch (Exception e) {
            log.error ('No se pudo crear el Archivo', e)
        }
    }
    def read(){
        try {
            render File.findAll()
        }catch (Exception e) {
            log.error ('No se pudo leer el Archivo', e)
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
