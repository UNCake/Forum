package forum

import grails.test.mixin.TestFor
import spock.lang.Specification

/**
 * See the API for {@link grails.test.mixin.domain.DomainClassUnitTestMixin} for usage instructions
 */
@TestFor(User)
class UserSpec extends Specification {

    def setup() {
        mockForConstraintsTests(User)
    }

    def cleanup() {
    }

    void "El nombre del usuario debe tener entre 3 y 50 caracteres"() {

        when: 'El nombre posee 15 caracteres'
        def p = new User(name: 'Juan Sebastian', age: 14, lastname: 'Gutierrez',
                password: '1234Adfdd', username: 'jsgutierrez2')


        then: 'La validacion deber ser correcta'
        p.validate()

        when: 'El nombre posee 2 caracteres'
        p = new User(name: 'JS', age: 14, lastname: 'Gutierrez',
                password: '1234Adfdd', username: 'agutierrez5')

        then: 'La validacion debe ser incorrecta'
        !p.validate()
    }

    void "El apellido del usuario debe tener entre 3 y 50 caracteres"() {
        when: 'El apellido posee 9 caracteres'
        def p = new User(name: 'Juan Sebastian', age: 14, lastname: 'Gutierrez',
                password: '1234Adfdd', username: 'jsgutierrez2')

        then: 'La validacion deber ser correcta'
        p.validate()

        when: 'El apellido posee 0 caracteres'
        p = new User(name: 'Mario', age: 14, lastname: '',
                password: '1234Adfdd', username: 'agutierrez6')

        then: 'La validacion debe ser incorrecta'
        !p.validate()
    }

    void "El usuario debe ser mayor de 13 años"() {
        when: 'El usuario tiene 15 años'
        def p = new User(name: 'Juan Sebastian', age: 15, lastname: 'Gutierrez',
                password: '1234Adfdd', username: 'jsgutierrez2')

        then: 'La validacion deber ser correcta'
        p.validate()

        when: 'El usuario tiene 10 años'
        p = new User(name: 'Mario', age: 10, lastname: 'Gutierrez',
                password: '1234Adfdd', username: 'agutierrez7')

        then: 'La validacion debe ser incorrecta'
        !p.validate()
    }

    void "El username del usuario debe ser unico"() {
        when: 'El username es unico'
        def p = new User(name: 'Juan Sebastian', age: 15, lastname: 'Gutierrez',
                password: '1234Adfdd', username: 'jsgutierrez2')

        then: 'La validacion deber ser correcta'
        p.validate()

        when: 'El username esta repetido'
        p = new User(name: 'Mario', age: 10, lastname: 'Gutierrez',
                password: '1234Adfdd', username: 'agutierrez2')

        then: 'La validacion debe ser incorrecta'
        !p.validate()
    }

    void "El password del usuario debe poseer al menos una letra mayuscula y un número"() {
        when: 'El password cumple con los requisitos'
        def p = new User(name: 'Juan Sebastian', age: 15, lastname: 'Gutierrez',
                password: '1234Adfdd', username: 'jsgutierrez2')

        then: 'La validacion deber ser correcta'
        p.validate()

        when: 'El password no posee mayusculas'
        p = new User(name: 'Mario', age: 10, lastname: 'Gutierrez',
                password: '1234dfdd', username: 'agutierrez8')

        then: 'La validacion debe ser incorrecta'
        !p.validate()
    }

}
