# Verschilrijen
Een verschilrij is een rij van positieve natuurlijke getallen en een ouder- en (optioneel) een kindverschilrij heeft. Een **kindverschilrij** berekent men door het verschil te nemen van 2 getallen van de verschilrij.  
Bijvoorbeeld:
````
Verschilrij:      3    1    6
Kindverschilrij: 6-3  3-1  6-1   (berekening)
Kindverschilrij:  3    2    5   (resultaat)
````
Merk op dat elke berekening **geen getallen kleiner dan 0** mag opleveren. Dus het is 6-3 (of |3-6|) en niet 3-6. De volgende rijen worden dan:
````
  3    2    5  
  2    1    3     (5-3  3-2  5-2)
  1    1    2
  1    0    1     (identiek)
  0    1    1
  1    1    0
  1    0    1     (identiek)
````
De opeenvolging van verschilrijen waarbij elke rij de kindrij van de vorige rij is, noemen we een **verschilrijboom (of rijboom)**. De **diepte van een rijboom** is het aantal gekende verschilrijen in de rijboom.  
Zoals je ziet zullen de getallen op de kindrij kleiner of gelijk zijn dan hun ouderrij. Het is het ook mogelijk dat sommige kinderen van een verschilrij identiek zijn. In dat geval spreekt men van een **cyclische rijboom** omdat 2 of meerdere rijen terugkomen.
````
4 2 4 2
2 2 2 2
0 0 0 0
````
De laatste rij bevat enkel 0 getallen en noemt daarom een **nulrij**. Een rijboom met een nulrij is niet cyclisch.

## Opgave
Voor de volgende requirements maak je de nodige unit tests. Bedenk dat niet voor alle methods unit tests nodig zijn. Denk aan SRP!  
Volg de SEF werkwijze en maak per requirement in de juiste volgorde:
1. javadoc + codeskelet
2. de nodige unit test(s)
3. de implementatie

Doe dit voor requirements 2, 4, 5 en 11.

Req01 Een verschilrij bevat 3 positief gehele getallen.  
Req02 Men kan detecteren of een verschilrij een nulrij is.  
Req03 Een verschilrij kan 4 getallen bevatten.  
Req04 De getallen van een verschilrij kunnen weergegeven worden in 1 string.  
Req05 Men kan een kindrij bereken van een verschilrij.

Req10 Een rijboom bewaart de gekende verschilrijen die een kind- of ouderrij zijn van elkaar.  
Req11 Men kan de diepte van een rijboom opvragen.  
Req12 Elke rij in de boom kan weergegeven worden  
Req13 We kunnen een opgegeven aantal kindrijen berekenen van een rijboom  
Req14 De kindrijen van een rijboom berekenen stopt indien er een nulrij geproduceerd wordt.