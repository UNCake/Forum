package forum

import grails.test.mixin.TestFor
import spock.lang.Specification

/**
 * See the API for {@link grails.test.mixin.domain.DomainClassUnitTestMixin} for usage instructions
 */
@TestFor(Admin)
class AdminSpec extends Specification {

    def setup() {
        mockForConstraintsTests(User)
        mockForConstraintsTests(Admin)
    }

    def cleanup() {
    }

    void "El administrador debe tener un nivel de  1 a 5"() {

        when: 'Administrador nivel 3'
        def p = new Admin(level: 3, rating: 5.0, name: 'Juan Sebastian', age: 14, lastname: 'Gutierrez',
                password: '1234Adfdd', username: 'jsgutierrez2')


        then: 'La validacion deber ser correcta'
        p.validate()

        when: 'Administrador nivel 0'
        p = new Admin(level: 0, rating: 5.0, name: 'Juan Sebastian', age: 14, lastname: 'Gutierrez',
                password: '1234Adfdd', username: 'jsgutierrez2')

        then: 'La validacion debe ser incorrecta'
        !p.validate()
    }

    void "El administrador debe tener un raing de  0 a 100"() {

        when: 'Administrador rating 3'
        def p = new Admin(level: 3, rating: 5.0, name: 'Juan Sebastian', age: 14, lastname: 'Gutierrez',
                password: '1234Adfdd', username: 'jsgutierrez2')


        then: 'La validacion deber ser correcta'
        p.validate()

        when: 'Administrador rating 500'
        p = new Admin(level: 3, rating: 500.0, name: 'Juan Sebastian', age: 14, lastname: 'Gutierrez',
                password: '1234Adfdd', username: 'jsgutierrez2')

        then: 'La validacion debe ser incorrecta'
        !p.validate()
    }

}
