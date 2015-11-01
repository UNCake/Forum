package forum

class FiltrosFilters {

    def filters = {
        all(controller:'*', action:'*', actionExclude:'index') {
            before = {
                if( !session.authStatus.equals('logged') ){
                    redirect(action: 'index')
                    return false
                }
            }
            after = { Map model ->

            }
            afterView = { Exception e ->

            }
        }
    }
}
