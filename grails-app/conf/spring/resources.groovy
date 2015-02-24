import grails.rest.render.json.JsonRenderer

import com.pangio.cafe.*

/**
 * Custom renderer for XML & JSON format.
 * See {@link CafeMarshaller}
 */
beans = {
    // Custom Render for Cafe
    cafeRenderer(JsonRenderer, Cafe) {
        excludes = ['class']
    }
}
