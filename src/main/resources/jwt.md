
<h1>JWT</h1>

Un JSON Web Token è un token di accesso standardizzato secondo RFC 7519 e consente lo scambio sicuro di dati tra due parti. Contiene tutte le informazioni importanti su un’entità, in modo che non sia necessaria alcuna interrogazione del database e che la sessione non debba essere memorizzata sul server (stateless session).


<h3>Header di un JWT</h3>
-All'interno dell'header di un JWT viene specificato l'agoritmo di crittografia utilizzato per generare l'hash della Firma Digitale e il tipo di JWT.
Decodificando con qualunque base64 decoder, ad esempio:

eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9


<h3>Payload di un JWT</h3>
-Come per l'header del JWT, prendiamo la stringa del JWT di esempio e concentriamoci sul payload del JWT:

eyJzdWIiOiIxMjM0NTY3ODkwIiwibmFtZSI6IkpvaG4gRG9lIiwiaWF0IjoxNTE2MjM5MDIyfQ

All'interno del payload di un JWT vengono inseriti i dati che vogliamo trasmettere (per questo si chiama payload).


<h3>JWT claims</h3>
Ogni proprietà del payload di un JWT viene definito claim. I claim previsti dallo standard sono chiamati JWT Registered Claims e sono tutti opzionali (quindi si può scegliere quali usare e quali no). Poi si può scegliere di usare altri claim personalizzati, i JWT Public Claims e i JWT Private Claims.

-JWT Registered Claims


Claim	Significato	Descrizione<br>
iss	issuer	L'emittente del JWT<br>
sub	subject	Il soggetto del JWT. Può essere per esempio l'ID utente che ha effettuato l'accesso<br>
aud	audience	I destinatari del JWT<br>
exp	expiration time	La scadenza del token<br>
nbf	not before	L'inizio di validità del JWT<br>
iat	issued at	Il momento in cui il JWT viene generato<br>
jti	jwt id	Identificatore univoco del JWT<br>
