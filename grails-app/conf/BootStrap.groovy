import com.pangio.cafe.*

class BootStrap {

    def init = { servletContext ->

        createCafes()

        [new CafeMarshaller()].each {
            it.register()
        }
    }

    def createCafes() {

        def cafe = new Cafe(name: 'UB', city: 'San Francisco', neighborhood: 'Castro').save(flush: true)
        cafe = new Cafe(name: 'Starbucks', city: 'San Francisco', neighborhood: 'Castro').save(flush: true)
        cafe = new Cafe(name: 'Mission Creek', city: 'San Francisco', neighborhood: 'Mission').save(flush: true)
        cafe = new Cafe(name: 'Revolution', city: 'San Francisco', neighborhood: 'Mission').save(flush: true)
        cafe = new Cafe(name: 'Starbucks', city: 'San Francisco', neighborhood: 'Mission').save(flush: true)
        cafe = new Cafe(name: 'El Cairo', city: 'Rosario', neighborhood: 'Centro').save(flush: true)
        cafe = new Cafe(name: 'Starbucks Rosario', city: 'Rosario', neighborhood: 'Centro').save(flush: true)
        cafe = new Cafe(name: 'Petit Colon', city: 'Buenos Aires', neighborhood: 'Tribunales').save(flush: true)
        cafe = new Cafe(name: 'Las Violetas', city: 'Buenos Aires', neighborhood: 'Caballito').save(flush: true)
        cafe = new Cafe(name: 'Starbucks', city: 'Buenos Aires', neighborhood: 'Caballito').save(flush: true)
        cafe = new Cafe(name: 'Tortoni', city: 'Buenos Aires', neighborhood: 'Caballito').save(flush: true)
        cafe = new Cafe(name: 'Cafe De Los Angelitos', city: 'Buenos Aires', neighborhood: 'Centro').save(flush: true)
        cafe = new Cafe(name: 'Cafe Gijon', city: 'Madrid', neighborhood: 'Paseo De Recoletos').save(flush: true)
        cafe = new Cafe(name: 'El Espejo', city: 'Madrid', neighborhood: 'Paseo De Recoletos').save(flush: true)
        cafe = new Cafe(name: 'Bellas Artes', city: 'Madrid', neighborhood: 'Paseo Del Prado').save(flush: true)
        cafe = new Cafe(name: 'Cafe Prado', city: 'Madrid', neighborhood: 'Paseo Del Prado').save(flush: true)
        cafe = new Cafe(name: 'Art of Coffee', city: 'Dublin', neighborhood: 'City Centre').save(flush: true)
        cafe = new Cafe(name: 'The Fix', city: 'Dublin', neighborhood: 'City Centre').save(flush: true)
        cafe = new Cafe(name: 'Bewleys', city: 'Dublin', neighborhood: 'City Centre').save(flush: true)
        cafe = new Cafe(name: '3FE', city: 'Dublin', neighborhood: 'City Centre').save(flush: true)
    }

    def destroy = {
    }
}
