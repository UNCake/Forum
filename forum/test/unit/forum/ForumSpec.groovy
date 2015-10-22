package forum

import grails.test.mixin.TestFor
import spock.lang.Specification

/**
 * See the API for {@link grails.test.mixin.domain.DomainClassUnitTestMixin} for usage instructions
 */
@TestFor(Forum)
class ForumSpec extends Specification {

    def setup() {
    }

    def cleanup() {
    }

    void "El nombre de forum debe tener entre 3 y 20 caracteres"() {

        when: 'El nombre menos de 20 caracteres'
        def p = new Forum(name: "ksfmf",  category: "grails")
        p.dateCreated = new Date()+2
        then: 'La validacion deber ser correcta'
        p.validate()

        when: 'El nombre posee 21 caracteres'
        p = new Forum(name: "Las pruebas unitariass", category: "grails")
        p.dateCreated = new Date()+2
        then: 'La validacion debe ser incorrecta'
        !p.validate()
    }

    void "La fecha de forum debe ser mayor a la actual"() {

        when: 'Fecha de mañana'
        def p = new Forum(name: "Las pruebas",  category: "grails")
        p.dateCreated = new Date()+1

        then: 'La validacion deber ser correcta'
        p.validate()

        when: 'fecha anterior'
        p = new Forum(name: "Las pruebas unitarias", category: "grails")
        p.dateCreated = new Date() - 1
        then: 'La validacion debe ser incorrecta'
        !p.validate()
    }


    void "La categoria de forum debe ser entre 3 y 15 caracteres"() {

        when: 'Categoria de 6 caracteres'
        def p = new Forum(name: "Las  unitarias", category: "grails")
        p.dateCreated = new Date()+1

        then: 'La validacion deber ser correcta'
        p.validate()

        when: 'Categoria de mas de 15 caracteres'
        p = new Forum(name: "Las pruebas unitarias", category: "framework grails webapp spock...")
        p.dateCreated = new Date()+1
        then: 'La validacion debe ser incorrecta'
        !p.validate()
    }

}
