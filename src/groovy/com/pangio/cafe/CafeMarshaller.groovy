package com.pangio.cafe

import grails.converters.JSON

/**
 * Custom Marshaller for JSON format
 */
class CafeMarshaller {

    void register() {
        JSON.registerObjectMarshaller(Cafe) {
            Cafe cafe -> return [
                id: cafe.id,
                name: cafe.name,
                city: cafe.city,
                neighborhood: cafe.neighborhood
//              county: cafe.city,
//              area: cafe.neighborhood
            ]
        }
    }

}
