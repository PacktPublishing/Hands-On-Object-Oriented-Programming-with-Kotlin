package chapter7.patterns.behavioral

interface Request

class GETRequest: Request

class POSTRequest: Request

class PUTRequest: Request

class DELETERequest: Request

interface RequestHandler {
    val nextHandler: RequestHandler?
    fun handle(request: Request)
}

class GETRequestHandler: RequestHandler {

    override val nextHandler = POSTRequestHandler()

    override fun handle(request: Request) {
        if (request is GETRequest) {
            println("Handle GET request...")
        } else {
            nextHandler.handle(request)
        }
    }
}

class POSTRequestHandler: RequestHandler {

    override val nextHandler = PUTRequestHandler()

    override fun handle(request: Request) {
        if (request is POSTRequest) {
            println("Handle POST request...")
        } else {
            nextHandler.handle(request)
        }
    }
}

class PUTRequestHandler: RequestHandler {
    override val nextHandler = DELETERequestHandler()

    override fun handle(request: Request) {
        if (request is PUTRequest) {
            println("Handle PUT request...")
        } else {
            nextHandler.handle(request)
        }
    }
}

class DELETERequestHandler: RequestHandler {
    override val nextHandler: RequestHandler? = null

    override fun handle(request: Request) {
        if (request is DELETERequest) {
            println("Handle DELETE request...")
        }
    }
}

fun main(args: Array<String>) {
    GETRequestHandler().apply {
        handle(GETRequest())
        handle(DELETERequest())
    }
}


