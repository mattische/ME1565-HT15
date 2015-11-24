###GUI designer i IntelliJ (IDEA)   
är ett IDE som Jetbrains ligger bakom. Det är ett välanvänt IDE som används av många.  

Här är en kort beskrivning för att komma igång med GUI-designern i IntelliJ.  Innan du kör igång bör du ha installerat programmet från https://www.jetbrains.com/idea/  

<br>
+ 1 skapa ett nytt java-projekt (det går bra att välja empty project)  

+ 2 skapa en GUI-form, File/New/GUI Form  

+ 3 markera din Form i Component tree och se till är det finns en klass för 'Property'n 'bind to class'. Om inte välj en klass.     Se https://www.jetbrains.com/idea/help/binding-a-form-to-an-existing-class.html   

+ 4 designa ditt GUI med de komponenter du behöver, här finns guider: https://www.jetbrains.com/idea/help/swing-designing-gui.html  
     Det du bör tänka på här är att du bör lägga en en JPanel i vilken du placerar alla andra komponenter i. Detta för att sedan kunna skapa en main metod för att köra ditt GUI/Form.   
    `_In order to generate the main() method, the top-level panel of a form must
be bound to a field. This is not highlighted as an error because it is generally
a valid situation._`  

+ 5 för din top-level panel, skapa en variabel till källkoden. D v s ange ett värde/variabelnamn för 'Property' 'field name'.  
Detta skapar en variabel i källkoden.  
+ 6 i din källkodsklass (som du angett i punkt 4), tryck `ALT + INSERT` och välj att lägga till en main-metod i pop-up menyn.
