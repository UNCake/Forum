package forum

class FileController {
    static contentTypes = ["text/plain": ".txt" , "image/png" :".png" ]

    def share() {
        render "Not implemented yet"
    }

    def download() {
        def id = params.actualFile
        def file = File.get(id)
        render file: file.content, contentType: file.fileType
    }


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

    }

    def create(){
        this.getActionName()
        try {
            def upFile = request.getFile("myFile")
            if(contentTypes.containsValue(upFile.getContentType())) {
                def file = new File(params)
                file.save()
            }else {
                log.error ('No se pudo crear el Archivo, tipo invalido')
            }
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
