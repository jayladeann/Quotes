<g:each in="${quoteList}">
	Quote: ${it.quote}<br />
	Author: ${it.author}
</g:each>

<br />
<br />
<br />

<g:form name="search" action="search">
	Quote: <input type="text" name="quote">
	<input type="submit" value="submit">
</g:form> 