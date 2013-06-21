import quotes.Quote

class BootStrap {

    def init = { servletContext ->
		
		def quote1 = new Quote(quote:"Hello World", author:"Author1")
		quote1.save(fallOnError: true)
    }
    def destroy = {
    }
}
