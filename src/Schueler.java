
public class Schueler
{
	int zAlter;
	String name;
	String vorname;
	String geschlecht;
	String zKlasse;
	double zWurf;
	double zLauf;
	double zSprung; 
	public Schueler(String pVorname, String pName, int pAlter, String pGeschlecht, String pKlasse) 
	  {
		zAlter = pAlter;
		name = pName;
		vorname = pVorname;
		geschlecht = pGeschlecht;
		zKlasse = pKlasse;
	  }
	public String getName()
	{
		return name;
	}
	public String  getVorname()
	{
		return vorname;
	}
	public String getGeschlecht()
	{
		return geschlecht;
	}
	public String getKlasse()
	{
		return zKlasse;
	}
	public void setKlasse(String pKlasse)
	{
		zKlasse = pKlasse;
	}
	public int getAlter()
	{
		return zAlter;
	}
	public void setAlter(int pAlter)
	{
		zAlter = pAlter;	
	}
	public double getWurf()
	{
		return zWurf;
	}
	public void setWurf(double pWurf)
	{
		zWurf = pWurf;
	}
	public double getLauf()
	{
		return zLauf;
	}
	public void setLauf(double pLauf)
	{
		zLauf = pLauf;
	}
	public double getSprung()
	{
		return zSprung;
	}
	public void setSprung(double pSprung)
	{
		zSprung = pSprung;
	}
}
