# Single Responsibility Principle

## School1
### Probleem: 
Te veel verantwoordelijkheden in 1 class (School).
Te herkennen aan 
* de verantwoordelijkheden van de class (in javadoc) bevat een opsomming van zwak gerelateerde onderwerpen
* het veelvuldig gebruik van het woord **"en"** in de verantwoordelijkheden
* verschillende lijsten/collections 
* weinig methods welke meer dan 1 lijst gebruiken (low cohesion)

### Oplossing:
Opsplitsen in gespecialiseerde classes welke elk 1 aspect beheersen. Variabelen en methods welke sterk samenwerken probeer je bij elkaar te houden. (high cohesion)


## School2
### Probleem: 
Te veel verantwoordelijkheden in 1 class (Student).
Te herkennen aan 
* het veelvuldig gebruik van het woord **"en"** in de verantwoordelijkheden
* het niet vermelden van alle verantwoordelijkheden in de documentatie
* verkeerd gebruik van static om een splitsing van de verantwoordelijkheden af te dwingen
* bevat een POJO class welke enkel de data van een instance voorstelt en naast C tors en getters en setters weinig functionaliteit heeft voor 1 student.

Ook in het ontwerp van programma's is data design belangrijk. De class Student stelt hier een instance/rij/record voor van de entiteit student. De lijst van studenten komt dan overeen met de tabel voor de entiteit student. Het probleem is hier dat de class Student tegelijk 1 rij van de tabel EN de tabel voorstelt.

### Oplossing:
Opsplitsen in 2 classes: 1 POJO class Student en 1 welke de groep studenten voorstelt.

### Probleem:
De method getStudents stelt de lijst van students open naar andere classes toe. Hierdoor kunnen andere classes ook studenten toevoegen enz. Dit gaat in tegen het idee dat enkel StudentAdministration verantwoordelijk is voor de studentenlijst.

Meerder classes kunnen hierdoor dezelfde verantwoordelijkheden uitoefenen wat niet mag.  

### Oplossing1
Geef een kopij van de lijst terug waardoor studenten toevoegen geen effect meer heeft. Het geeft andere classes wel nog steeds zicht op de interne variabelen van de administratie class.

### Oplossing2
Maak gespecialiseerde methods welke een bepaalde nood van andere classes voorzien zonder alle data terug te geven. Dit geeft preciezere service aan andere classes.

vb1 Geef enkel de data terug van de gezochte studenten.

vb2 Geef enkel de data terug welke de andere class nodig heeft, vb. enkel de leeftijden van de studenten of enkel de gemiddelde leeftijd.

## School3
### Probleem:
Te veel opsplitsing. Te herkennen aan:
* Methods staan in een andere class dan de data welke ze gebruiken (low cohesion)
* De ene class kan niet zonder de andere en roept voortdurend een andere class op.
* Een class is sterk afhankelijk van de implementatie van een andere class. Dat gaat in tegen het data hiding principe en geeft grote coupling. 
* Classes zonder eigen data

### Oplossing:
Samenvoegen van de data en method welke elkaar nodig hebben.
En neen, inheritance (als in StudentAdministrationZoekStudent een subclass maken van StudentAdministration) is geen oplossing. Het object welke de student bevat is dan een ander object dan het object welke de zoekopdrachten uitvoert. En vaak casten naar een ander type is ook geen oplossing hiervoor want een subclass heeft mogelijks wel eigen data (vb configuratieparameters).

### Opgelet:
Deze opsplitsing is niet altijd een slecht idee. Voorbeeld: een Data Access Object (DAO) welke verantwoordelijk is voor het opslaan en retrieven van de objecten in een database. Zo scheiden we de "gewone" methods van de save-to-db methods. https://www.baeldung.com/java-dao-pattern
