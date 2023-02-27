import java.util.*;
public class Main

{
    static List<Schueler> meineList = new List<Schueler>();
    static List<Schueler> sortList = new List<Schueler>();
    public static void main(String[] args)
    {
        Scanner mS = new Scanner(System.in);
        while(true)
        {	
            System.out.println("------------------------");
            System.out.println("1. Schueler anlegen");
            System.out.println("2. Schueler anzeigen");
            System.out.println("3. Anzahl der eingetragenden Schueler");
            System.out.println("4. Schueler loeschen");
            System.out.println("5. Schueler suchen");
            System.out.println("6. Schuelerdaten eintragen");
            System.out.println("7. Bubblesort");
            System.out.println("8. Insertionsort");
            System.out.println("9. Programm beenden");
            System.out.println();
            System.out.println("Deine Eingabe?");
            int eingabe = mS.nextInt();
            System.out.println();
            System.out.println("Es wird zum Menuepunkt "+eingabe+" gewechselt!");
            System.out.println();
            if(eingabe == 1)
            {
                anlegen();
            }
            if(eingabe == 2)
            {
                anzeigen();
            }
            if(eingabe == 3)
            {
            	System.out.println("Anzahl der Schueler:" +meineList.laenge());
               
            }
            if(eingabe == 4)
            {
            	loeschen();
            }
            if(eingabe == 5)
            {
            	suchen();
            }
            if(eingabe == 6)
            {
            	eintragen();
            }
            if(eingabe == 7){
            	bubblesort();
            }
            if(eingabe == 8){
            	insertionSort();
               	Sortanzeigen();
            }
            if(eingabe == 9)
            {
            	System.out.println("Programm wird beendet.");
                System.exit(0);
            }
            mS.close();
        }
    }
  
	public static void anlegen()
    {
        Scanner mS = new Scanner(System.in);

        System.out.println();
        System.out.println("Gib bitte deinen Vornamen ein.");                
        System.out.println();
        String Vorname = mS.next();  

        System.out.println();
        System.out.println("Gib bitte deinen Namen ein.");            
        System.out.println();
        String Name = mS.next();

        System.out.println();
        System.out.println("Gib bitte dein Alter an.");                
        System.out.println();
        int zAlter = mS.nextInt();  

        System.out.println();
        System.out.println("Gib bitte dein Geschlecht ein.");          
        System.out.println();
        String zGeschlecht = mS.next();  

        System.out.println();
        System.out.println("Gib bitte deine Klasse an.");    
        System.out.println();
        String zKlasse = mS.next();
        System.out.println();
        
        Schueler S1 = new Schueler(Vorname, Name, zAlter, zGeschlecht, zKlasse);
        meineList.append(S1);

        mS.close();
    }
    public static void anzeigen()
    {
        meineList.toFirst();
        while(meineList.hasAccess())
        {
             
            System.out.println();
            System.out.println("Vorname: " + meineList.getContent().getVorname());
            System.out.println();
            System.out.println("Name: " + meineList.getContent().getName());    
            System.out.println();
            System.out.println("Alter: " + meineList.getContent().getAlter());
            System.out.println();
            System.out.println("Geschlecht: " + meineList.getContent().getGeschlecht());
            System.out.println();
            System.out.println("Klasse: " + meineList.getContent().getKlasse());
            System.out.println();
            System.out.println("Der Schueler hat " + meineList.getContent().getWurf() + " Meter weit geworfen");
            System.out.println();
            System.out.println("Der Schueler ist 100 Meter in " + meineList.getContent().getLauf()+ " Sekunden gelaufen");
            System.out.println();
            System.out.println("Der Schueler ist " + meineList.getContent().getSprung() + "Meter weit gesprungen");
            System.out.println();
            System.out.println("------------------------");  
            
            meineList.next();
        }  
    }
    public static void Sortanzeigen()
    {
        sortList.toFirst();
        while(sortList.hasAccess())
        {
             
            System.out.println();
            System.out.println("Vorname: " + sortList.getContent().getVorname());
            System.out.println();
            System.out.println("Name: " + sortList.getContent().getName());    
            System.out.println();
            System.out.println("Alter: " + sortList.getContent().getAlter());
            System.out.println();
            System.out.println("Geschlecht: " + sortList.getContent().getGeschlecht());
            System.out.println();
            System.out.println("Klasse: " + sortList.getContent().getKlasse());
            System.out.println();
            System.out.println("Der Schueler hat " + sortList.getContent().getWurf() + " Meter weit geworfen");
            System.out.println();
            System.out.println("Der Schueler ist 100 Meter in " + sortList.getContent().getLauf()+ " Sekunden gelaufen");
            System.out.println();
            System.out.println("Der Schueler ist " + sortList.getContent().getSprung() + "Meter weit gesprungen");
            System.out.println();
            System.out.println("------------------------");  
            
            sortList.next();
        }  
    }
    public static void loeschen()
    {
    	Scanner mS = new Scanner(System.in);
    	System.out.println();
    	System.out.println("gib den Vornamen des zu loeschenden Schuelers ein");
    	System.out.println();
    	String vorname = mS.next();
    	System.out.println();
    	System.out.println("gib den Nachnamen des zu loeschenden Schuelers ein");
    	System.out.println();
    	String name = mS.next();
    	System.out.println();
    	meineList.toFirst();
    	while(meineList.hasAccess())
    	{
    		Schueler aktuellerSchueler = meineList.getContent();
    		if(aktuellerSchueler.getVorname().equals(vorname) && aktuellerSchueler.getName().equals(name))
    		{
    			meineList.remove();
    		}
    		meineList.next();
    	}
        mS.close();
   	}
    public static void suchen()
    {
    	Scanner mS = new Scanner(System.in);
    	System.out.println();
    	System.out.println("gib den Vornamen des zu suchenden Schuelers ein");
    	System.out.println();
    	String vorname = mS.next();
    	System.out.println();
    	System.out.println("gib den Nachnamen des zu suchenden Schuelers ein");
    	System.out.println();
    	String name = mS.next();
    	System.out.println();
    	
    	meineList.toFirst();
    	while(meineList.hasAccess())
    	{
    		Schueler aktuellerSchueler = meineList.getContent();
    		if(aktuellerSchueler.getVorname().equals(vorname) && aktuellerSchueler.getName().equals(name))
    		{
    			System.out.println();
                System.out.println("Vorname: " + meineList.getContent().getVorname());
                System.out.println();
                System.out.println("Name: " + meineList.getContent().getName());    
                System.out.println();
                System.out.println("Alter: " + meineList.getContent().getAlter());
                System.out.println();
                System.out.println("Geschlecht: " + meineList.getContent().getGeschlecht());
                System.out.println();
                System.out.println("Klasse: " + meineList.getContent().getKlasse());
                System.out.println();
                System.out.println("Der Schueler hat " + meineList.getContent().getWurf() + " Meter weit geworfen");
                System.out.println();
                System.out.println("Der Schueler ist 100 Meter in " + meineList.getContent().getLauf()+ " Sekunden gelaufen");
                System.out.println();
                System.out.println("Der Schueler ist " + meineList.getContent().getSprung() + "Meter weit gesprungen");
                System.out.println();
                System.out.println("------------------------");  
    		}
    	meineList.next();
    	}
        mS.close();
    }
    public static void eintragen()
    {
    	Scanner mS = new Scanner(System.in);
        System.out.println("------------------------");
        System.out.println("1. Wurfdaten angeben");
        System.out.println("2. Laufdaten angeben");
        System.out.println("3. Sprungdaten angeben");
        System.out.println();
        System.out.println("Deine Eingabe?");
        int eingabe = mS.nextInt();
        System.out.println();
        System.out.println("Es wird zum Menuepunkt "+eingabe+" gewechselt!");
        System.out.println();
        
        if(eingabe == 1)
        {
        	meineList.toFirst();
        	while(meineList.hasAccess())
        	{
        		Schueler aktuellerSchueler = meineList.getContent();
        		System.out.println();
        		System.out.println(meineList.getContent().getVorname()+" "+ meineList.getContent().getName());  
        		System.out.println();
        		System.out.println("Gib bitte deine Wurfdaten an.");    
        		System.out.println();
        		double zWurf = mS.nextDouble();
        		System.out.println();  
        
        		aktuellerSchueler.setWurf(zWurf);
        		meineList.next();
        	}
        }
        if(eingabe == 2)
        {
        	meineList.toFirst();
        	while(meineList.hasAccess())
        	{
        		Schueler aktuellerSchueler = meineList.getContent();
        		System.out.println();
        		System.out.println(meineList.getContent().getVorname()+" "+ meineList.getContent().getName());    
        		System.out.println();
        		System.out.println("Gib bitte deine Laufdaten an.");    
        		System.out.println();
        		double zLauf = mS.nextDouble();
        		System.out.println();
        
        		aktuellerSchueler.setLauf(zLauf);   
        		meineList.next();
        	}
        }
        
        if(eingabe == 3)
        {
        	meineList.toFirst();
        	while(meineList.hasAccess())
        	{
        		Schueler aktuellerSchueler = meineList.getContent();
        		System.out.println();
        		System.out.println(meineList.getContent().getVorname()+" "+ meineList.getContent().getName());   
        		System.out.println();
        		System.out.println("Gib bitte deine Sprungdaten an.");    
        		System.out.println();
        		double zSprung = mS.nextDouble();
        		System.out.println();
        
        		aktuellerSchueler.setSprung(zSprung);
        		meineList.next();
        	}
        }
        mS.close();
    }
    public static void insertionSort()
    {
    	meineList.toFirst();
		if(sortList.isEmpty()){
			Schueler aktuellerSchueler = meineList.getContent();
			meineList.remove();
			sortList.insert(aktuellerSchueler);
		}
    	while(!meineList.isEmpty())
    	{
    		meineList.toFirst();
    		Schueler aktuellerSchueler = meineList.getContent();
			meineList.remove();
			sortList.toFirst();
			int i = sortList.laenge(); //die laenge wird auf der Variable i gespeichert
    		while(sortList.hasAccess() && !sortList.isEmpty()){
    			if(aktuellerSchueler.getSprung() < sortList.getContent().getSprung()){
    				sortList.insert(aktuellerSchueler);
    				while(sortList.hasAccess()){
    					sortList.next();
    				}
    			}
    			else
    			{
    				sortList.next();
    			}	
    		}
    		int q = sortList.laenge(); //die laenge wird auf der Variable i gespeichert
    		if(q == i){ // ist die Liste laenger geworden?
    		sortList.append(aktuellerSchueler);
    		}
    	}
    }
    public static void bubblesort()
    {
    	int Q = 0;
		while(Q < meineList.laenge()-1){
			meineList.toFirst();
    		while(meineList.hasAccess()){
    			Schueler aktuellerSchueler = meineList.getContent();
    			meineList.remove();
    			if(aktuellerSchueler.getLauf() > meineList.getContent().getLauf()){
    				Schueler inaktiverSchueler = meineList.getContent();
        			meineList.insert(inaktiverSchueler);
    				meineList.setContent(aktuellerSchueler); 				
    			}
    			else{
    				meineList.insert(aktuellerSchueler);
    			}
    			meineList.next();
    		}
    		Q++;
    		return;
    	}
		anzeigen();
    }
    public void selectionSort()
    {
    	int Q = 0;
		while(Q < meineList.laenge()-1){
			meineList.toFirst();
    		while(meineList.hasAccess()){
    			Schueler aktuellerSchueler = meineList.getContent();
    			meineList.remove();
    			if(aktuellerSchueler.getWurf() > meineList.getContent().getWurf()){
    				meineList.insert(aktuellerSchueler);
    				aktuellerSchueler = meineList.getContent();
    				meineList.remove();
    			}
    			else{
    				meineList.next();
    			}
    		}
    		
    		Q++;
    		return;
    	}
		anzeigen();
    }
}
