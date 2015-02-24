class UrlMappings {

	static mappings = {
        "/$controller/$action?/$id?(.$format)?"{
            constraints {
                // apply constraints here
            }
        }

        "/"(controller: 'cafe', GET: 'index')
        "500"(view:'/error')
        "/cafes"(resources: 'cafe')
	}
}
