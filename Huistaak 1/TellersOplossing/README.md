# Opgave Tellers

## Requirements
Bestudeer het project in dit IntelliJ project. Beantwoord de volgende vragen in een aparte textfile Tellers\requirements.md.
1. Wat doet dit project? Welke functionaliteiten/responsibilities heeft het? Maak een lijst van de requirements zoals geleerd tijdens business processes.  
De 2 methods voor de 2 dagen zijn mogelijke scenario's welke de functionaliteiten gebruiken. Dit zijn slechts voorbeelden, de 2 dagen zijn zelf geen deel van de requirements, maar de onderliggende functionaliteit wel. Om te testen dat je code werkt zal je de code voor de 2 dagen een juiste plaats geven.  
Vb. Dat er precies 3 tellers nodig zijn voor dag 1 is geen requirement, dat men een (onbekend) aantal tellers kan aanmaken wel.
Om jullie verder op weg te helpen lees je het business process diagram die als PDF is toegevoegd.

Vb requirements. 
  1. Er kan op een bankrekening geld gestort worden.
  2. Alle bankrekeningen worden bijgehouden.
  3. Een bank kan een nieuwe rekening openen.

### Oplossing
1. Er kunnen tellers aangemaakt worden welke bij elkaar horen.
2. Het aantal en de aan/uit status van iedere teller is bekend.
3. Er kan een nieuwe teller worden aangemaand in een groep bestaande tellers.
4. Een teller kan verhoogd worden met een hoeveelheid.
5. Een teller kan aan en uit gezet worden.
6. Er kan worden vastgesteld of alle tellers in de groep gelijk zijn. Tellers met status uit kunnen al dan niet worden genegeerd.
7. Het hoogste aantal van de tellers in 1 groep kan bepaald worden.  
Nota: start en verhoog wordt hier beschouwd als het samenvoegen van 2 requirements. Ze staan apart vermeld. Indien (vaak) nodig kan er een method voor gebouwd worden, maar het is geen aparte requirement.

## Verdeling verantwoordelijkheden
Deze code is een ramp: 2 classes zijn verantwoordelijk voor alles.  
2. Wat kan er verbeterd worden? Voor elke requirement bepaal je welke class of method hiervoor verantwoordelijk moet zijn. Denk aan SRP!

Vb. Bankrekening: nummer, naam, balans
- 1 Bankrekening voorstellen: class BankAccount.
- Alle bankrekeningen worden bijgehouden: class Bank
- Op een rekening kan een bedrag gestort: BankAccount.deposit(amount)

### Oplossing
1. Er kunnen tellers aangemaakt worden welke bij elkaar horen.  
1 Teller => Class Teller  
meerdere tellers => Class TellerGroep
2. Het aantal en de aan/uit status van iedere teller is bekend. 
=> Teller.aantal, Teller.staatAan
3. Er kan een nieuwe teller worden aangemaand in een groep bestaande tellers.  
=> TellerGroep.addTeller()  
Niet TellerGroep.addTeller(Teller) want dan wordt het de verantwoordelijkheid om de teller aan te maken uitbesteed aan de oproepende method.
4. Een teller kan verhoogd worden met een hoeveelheid.  
=> Teller.verhoog(aantal)
5. Een teller kan aan en uit gezet worden.  
=> Teller.zetAan en zetUit
6. Er kan worden vastgesteld of alle tellers in de groep gelijk zijn. Tellers met status uit kunnen al dan niet worden genegeerd.  
=> TellerGroep.tellersZijnGelijk(vergelijkUitTellers)
7. Het hoogste aantal van de tellers in 1 groep kan bepaald worden. Tellers met status uit kunnen al dan niet worden genegeerd.  
=> TellerGroep.getHoogsteAantal(vergelijkUitTellers)

## implementatie
3. Pas nu op basis van de verantwoordelijkheden de code aan. Elke klasse en elke method is verantwoordelijk voor 1 ding. Let goed op private-public. Wees spaarzaam met static. 

