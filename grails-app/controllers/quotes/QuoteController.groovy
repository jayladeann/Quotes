package quotes

class QuoteController {

    def index() {
		def quotesList = Quote.list()
		
//		quotesList.each{
//			println it.quote
//			println it.author
//		}	
		
		[quoteList:quotesList]
	}
	
	def search() {
		def quote = Quote.findByQuote(params.quote)
		[quote:quote]
	}
}
