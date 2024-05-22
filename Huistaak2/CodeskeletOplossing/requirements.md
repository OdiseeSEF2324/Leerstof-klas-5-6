# Verantwoordelijkheden

* REQ0005 - Het is bekend welk lid zich succesvol bekend gemaakt heeft
JazzClub -> getLidByEmail()
Lidmaatschap > getEmailadres()

* REQ0015 - Het is bekend welk concert het lid geselecteerd heeft
JazzClub -> getConcert()

* REQ0016 - Er kan nagegaan worden of het lidmaatschap geldig is op de datum van het geselecteerde concert
Concert -> getDatum()  
Lidmaatschap -> checkGeldigheid()


* REQ0017 - De status (geldig of vervallen) van het lidmaatschap op concertdatum is bekend
Lidmaatschap > checkGeldigheid()

* REQ0018 - Bij geldig lidmaatschap kan de plaatsreservatie vastgelegd worden
JazzClub -> legPlaatsreservatieVast()
Plaatsreservatie -> Plaatsreservatie()

* REQ0019 - Bij vervallen lidmaatschap kan de plaatsreservatie onder voorbehoud vastgelegd worden
JazzClub -> legPlaatsreservatieVast()
Plaatsreservatie -> Plaatsreservatie()