package forum

import grails.test.mixin.TestFor
import spock.lang.Specification

/**
 * See the API for {@link grails.test.mixin.domain.DomainClassUnitTestMixin} for usage instructions
 */
@TestFor(File)
class FileSpec extends Specification {

    def setup() {
    }

    def cleanup() {
    }

    void "File debe comprobar tipo de archivo"() {

        when: 'archivo tipo algo/si'
        def p = new File(fileType: 'algo/si', content: [001], size: 3)

        then: 'La validacion deber ser correcta'
        p.validate()

        when: 'tipo de archivo invalido'
        p = p = new File(fileType: 'algo', content: [001], size: 3)

        then: 'La validacion debe ser incorrecta'
        !p.validate()
    }

    void "File debe exigir el campo content"() {

        when: 'content asignado'
        def p = new File(fileType: 'algo/si', content: [001], size: 3)

        then: 'La validacion deber ser correcta'
        p.validate()

        when: 'content nulo'
        p = p = new File(fileType: 'algo', size: 3)

        then: 'La validacion debe ser incorrecta'
        !p.validate()
    }

    void "size no debe superar los 10MB"() {

        when: 'size de 7 MB'
        def p = new File(fileType: 'algo/si', content: [001], size: 7000)

        then: 'La validacion deber ser correcta'
        p.validate()

        when: 'size de 70 MB'
        p = p = new File(fileType: 'algo', size: 7000)

        then: 'La validacion debe ser incorrecta'
        !p.validate()
    }

}
