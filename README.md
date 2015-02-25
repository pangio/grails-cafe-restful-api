# Cafe API
Groovy/Grails restful API example.
See the Groovy/Grails rest client [Cafe Client](https://github.com/pangio/grails-cafe-rest-client) .


# Stack
*  Grails 2.4.3
*  MySQL 5

# Prerequisites
*  Grails 2.4.3
*  MySQL 5
*  any REST Client (like XHR Poster) or use the client [Cafe Client](https://github.com/pangio/grails-cafe-rest-client)


# Setup

Create a MySQL schema named  ```'cafeapi'```.

See ```grails-app/conf/DataSource.groovy``` file to modify user and pass credentials.

# Run the example

From the Terminal:

Clone the repo ``` https://github.com/pangio/grails-cafe-restful-api ```.

Build / run ``` grails compile``` and ```grails run-app ```

NOTE:
If the [Cafe Client](https://github.com/pangio/grails-cafe-rest-client) is used, it will  expect the API be running on the ```8080``` port.
The client will hit the below endpoints.


# Endpoints / Http Methods

URL: ```http://localhost:8080/cafe-api/cafes```


* ```POST``` - Creates a new Cafe.

JSON body example:
```
	{
		"name": "UB",
		"city": "San Francisco",
		"neighborhood": "Castro"
	}
```

* ```GET``` - Returns the list of all cafes.

* ```GET``` - Returns a Cafe.
URI: ```/cafe-api/cafes/{cafeId}```

* ```DELETE``` - Deletes a Cafe.
URI: ```/cafe-api/cafes/{cafeId}```

* ```PUT``` - Updates a Cafe.
URI: ```/cafe-api/cafes/{cafeId}```

JSON body example:
```
{
		"name": "UB - UPDATED",
		"city": "San Francisco ",
		"neighborhood": "MISSION"
	}
```

# Content Type
The API responds ```json``` as default but also supports ```xml```.

Also for all Http Methods can try by adding the suffix as shown below:
```
/cafe-api/cafes.json
/cafe-api/cafes.xml
```

examples:
```
http://localhost:8080/cafe-api/cafes/1.xml
http://localhost:8080/cafe-api/cafes.xml
http://localhost:8080/cafe-api/cafes/1.json
http://localhost:8080/cafe-api/cafes.json
```
