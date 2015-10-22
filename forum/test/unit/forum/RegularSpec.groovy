package forum

import grails.test.mixin.TestFor
import spock.lang.Specification

/**
 * See the API for {@link grails.test.mixin.domain.DomainClassUnitTestMixin} for usage instructions
 */
@TestFor(Regular)
class RegularSpec extends Specification {

    def setup() {
    }

    def cleanup() {
    }


    void "regular debe tener strikesNumber  de  0 a 3"() {

        when: 'Regular strikesNumber 3'
        def p = new Regular(postViews: 0, strikesNumber: 3, starsNumber: 2, name: 'Juan Sebastian', age: 14, lastname: 'Gutierrez',
                password: '1234Adfdd', username: 'jsgutierrez2')


        then: 'La validacion deber ser correcta'
        p.validate()

        when: 'Regular strikesNumber -1'
        p = new Regular(postViews: 0, strikesNumber: -1, starsNumber: 2, name: 'Juan Sebastian', age: 14, lastname: 'Gutierrez',
                password: '1234Adfdd', username: 'jsgutierrez2')

        then: 'La validacion debe ser incorrecta'
        !p.validate()
    }

    void "regular debe tener numero de estrellas  de  0 a 5"() {

        when: 'Regular numero de estrellas 2'
        def p = new Regular(postViews: 0, strikesNumber: 3, starsNumber: 2, name: 'Juan Sebastian', age: 14, lastname: 'Gutierrez',
                password: '1234Adfdd', username: 'jsgutierrez2')


        then: 'La validacion deber ser correcta'
        p.validate()

        when: 'Regular numero de estrellas -1'
        p = new Regular(postViews: 0, strikesNumber: 3, starsNumber: -1, name: 'Juan Sebastian', age: 14, lastname: 'Gutierrez',
                password: '1234Adfdd', username: 'jsgutierrez2')

        then: 'La validacion debe ser incorrecta'
        !p.validate()
    }

    void "regular puede tener postviews vacio"() {

        when: 'Regular postviews vacio'
        def p = new Regular(postViews: 0, strikesNumber: 3, starsNumber: 2, name: 'Juan Sebastian', age: 14, lastname: 'Gutierrez',
                password: '1234Adfdd', username: 'jsgutierrez2')


        then: 'La validacion deber ser correcta'
        p.validate()

        when: 'Regular debe exigir campo postviews'
        p = new Regular(strikesNumber: 3, starsNumber: 4, name: 'Juan Sebastian', age: 14, lastname: 'Gutierrez',
                password: '1234Adfdd', username: 'jsgutierrez2')

        then: 'La validacion debe ser incorrecta'
        !p.validate()
    }
}
