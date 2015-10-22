package forum

import grails.test.mixin.TestFor
import spock.lang.Specification

/**
 * See the API for {@link grails.test.mixin.domain.DomainClassUnitTestMixin} for usage instructions
 */
@TestFor(Post)
class PostSpec extends Specification {

    def setup() {
    }

    def cleanup() {
    }

    void "La fecha de dateCreated debe ser mayor a la actual"() {

        when: 'Fecha de mañana'
        def p = new Post(itsAllowed: true, topic: "grails")
        p.dateCreated = new Date()+1
        p.lastupdate = new Date()+8

        then: 'La validacion deber ser correcta'
        p.validate()

        when: 'fecha anterior'
        p = new Post(itsAllowed: true, topic: "grails")
        p.dateCreated = new Date()-1
        p.lastupdate = new Date()+8
        then: 'La validacion debe ser incorrecta'
        !p.validate()
    }

    void "La fecha de lastupdate debe ser mayor a la actual"() {

        when: 'Fecha de mañana'
        def p = new Post(itsAllowed: true, topic: "grails")
        p.dateCreated = new Date()+1
        p.lastupdate = new Date()+1

        then: 'La validacion deber ser correcta'
        p.validate()

        when: 'fecha anterior'
        p = new Post(itsAllowed: true, topic: "grails")
        p.dateCreated = new Date()+1
        p.lastupdate = new Date()-1
        then: 'La validacion debe ser incorrecta'
        !p.validate()
    }

    void "El topic de post debe ser entre 3 y 50 caracteres"() {

        when: 'topic de 6 caracteres'
        def p = new Post(itsAllowed: true, topic: "grails")
        p.dateCreated = new Date()+5
        p.lastupdate = new Date()+8

        then: 'La validacion deber ser correcta'
        p.validate()

        when: 'topic de 2 caracteres'
        p = new Post(itsAllowed: true, topic: "as")
        p.dateCreated = new Date()+5
        p.lastupdate = new Date()+8
        then: 'La validacion debe ser incorrecta'
        !p.validate()
    }

    void "El campo itsAllowed debe ser requerido"() {

        when: 'Campo definido'
        def p = new Post(itsAllowed: true, topic: "grails")
        p.dateCreated = new Date()+5
        p.lastupdate = new Date()+8

        then: 'La validacion deber ser correcta'
        p.validate()

        when: 'Campo nulo'
        p = new Post(topic: "as")
        p.dateCreated = new Date()+5
        p.lastupdate = new Date()+8
        then: 'La validacion debe ser incorrecta'
        !p.validate()
    }
}
