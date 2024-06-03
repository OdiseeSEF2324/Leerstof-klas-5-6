
# Verdeling van verantwoordelijkheden
## Bepaal model en ui requirements
model requirements  
1. Alle ingegeven getallen worden onthouden.
2. Het gemiddelde van alle ingegeven getallen wordt berekend.  

UI requirements  
3. De user kan een nieuw getal ingeven.
4. Het nieuwe gemiddelde wordt getoond nadat een getal ingegeven is.

## Bepaal classes, methods, vars

1. Alle ingegeven getallen worden onthouden.  

=> class `GetallenVerzameling`  
onthouden van de getallen => `Set<int> getallen`  
Toevoegen van een getal => `void add(int getal)`

2. Het gemiddelde van alle ingegeven getallen wordt berekend.  

=> class `GetallenVerzameling` 
=> `double average()`

# req 1
* Bouw codeskelet + javadoc
* geen unit test want de methode add is te eenvoudig
* implementatie

# req 2
* Bouw codeskelet + javadoc
* unit tests: 
  * lege verzameling
  * 1 element
  * meer elementen
  * met cijfers na de komma
* implementatie

# UI