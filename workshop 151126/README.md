#Övningar inför workshop 151126#
  
<br>
<br>
_Filerna vi arbetade med finns i mapparna i detta repot. I mappen TESTGUI ligger hela IntelliJ-projektet, varför du kanske inte kan öppna det i din editor eller IDE. Dock kan du titta i köllkodsfilerna.
<br>
<br>

  
Inför nästa workshop som är på torsdag 26/11 2015 så finns här lite övningar att göra.  Vissa är svårare och vissa är lättare.  
Gör de du hinner och känner för. Den sista övningen, Mera klasser, är något svår - men den är ett riktmärke mot vad du snart bör kunna.

- **Tal**  
Gör ett Java-program som låter användaren mata in ett antal tal (så många som användaren bestämmer).  
Efter inmatningen av tal så ska programmet presentera de inmatade talen och den sammanlagda summan av talen,  
medelvärdet av talen samt högsta och lägsta imatade talen.  
<br>
_Tips: använd arrayer för inmatade tal._

<br>

- **Text 1**  
Skapa ett Java-program som låter användaren mata in text.  
Efter inmatad text är gjord så ska ditt program presentera inmatad text, antalet tecken som strängen  
innehåller samt strängen baklänges.  
<br>
_Tips: kolla upp String-klassen och vilka metoder du kan använda._  

<br>

- **Text 2**  
Gör ett program, eller bygg ut ovanstående program, som låter användaren skriva in meningar. Spara dessa i en array.  Slumpa ut meningarna i en utskrift för användaren.  
<br>
_Tips: för att arbeta med slump finns två alternativ; klassen Random eller Math.random._  

<br>

- **Rövarspråket**  
Gör ett program som låter användaren mata in en sträng. Programmet skriver ut samma sträng omgjord till <a href="https://sv.wikipedia.org/wiki/R%C3%B6varspr%C3%A5ket">rövarspråket</a>.  
Använd dig av array(er), metod(er), loopar, logiska styrstrukturer och (minst) en extra klass (förutom den med main-metod).  
Programmet ska ha en meny vilken låter användaren mata i ny sträng eller avsluta programmet.  
<br>
_Tips: för menyn kan med fördel en while-loop användas. När det gäller att göra en extra klass - använd inte static-metoder (om du inte vet exakt vad det innebär)._  

<br>

- **GUI**  
Gör samma program som ovan fast med grafik.  
<br>
_Tips: menyn, som du gjort i föregående övning, kan slopas..._

<br>


- **Mera klasser**  
Använd dig av tre stycken klasser; University, Program och Student. Relationerna är följande:  
Ett universitet (University) innehåller flera program (Program). På ett program går flera studenter (Students).  
Det ska finnas egenskaper och attribut för alla klasserna. Tillverka toString()-metoder för samtliga klasser, så att en  
strängrepresentation av objekten är möjlig. 
Alla klasserna ska ha valfria egenskaper (metoder) och attribut (instansvariabler och medlemmar).  
Vad gäller University gör t ex attributen namn och program (så att Program kan tillhöra ett specifikt University).  
Metoder för att lägga till och ta bort program bör finnas.
Vad gäller Program så bör minst följande attribut finnas; namn, studenter (så att Student kan tillhöra ett Program) och ev ytterligare attribut.  
Metoder för att lägga till och ta bort studenter bör finnas.  
Vad gäller Student så kan du använda dig av attributen namn, acronym och ytterligare attribut du tycker passar.  
<br>
_Tips: läs på om klasser och objekt. Gör dig bekant med begrepp (och lär dig implementera dem) såsom konstruktor, objekt, metoder (egenskaper) och attribut (variabler). Det är också en god idé att kolla upp vad private och public betyder och hur det används. Ett koncept i det här sammanhanget är också aggregation - se http://www.javatpoint.com/aggregation-in-java och http://beginnersbook.com/2013/05/aggregation/_  

<br>

