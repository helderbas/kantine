/**
 * @author Alexander Jeurissen, Bas Helder
 * @version 0.1
 */

public class Persoon
{
    
    private int bsn;
    private String voornaam;
    private String achternaam;
    private int gebDag;
    private int gebMaand;
    private int gebJaar;
    private char geslacht;
    

    /**
     * Constructor class Persoon
     * @param bsn burgerservicenummer nieuw persoon
     * @param voornaam Voornaam nieuw persoon
     * @param achternaam Achternaam nieuw persoon
     * @gebDag Geboortedag nieuw persoon
     * @gebMaand Geboortemaand nieuw persoon
     * @gebJaar Geboortejaar nieuw persoon
     * @geslacht Geslacht nieuw persoon
     */
    public Persoon(int bsn, String voornaam, String achternaam, int gebDag, int gebMaand, int gebJaar, char geslacht)
    {
        this.bsn = bsn;
        this.voornaam = voornaam;
        this.achternaam = achternaam;
        setGebdatum(gebDag, gebMaand, gebJaar);
        setGeslacht(geslacht);
    }

    /**
     * Bsn setten
     * @param bsn het ingevulde burgerservicenummer
     */
    public void setBsn(int bsn)
    {
        this.bsn = bsn;
    }
    
    /**
     * Voornaam setten
     * @param voornaam de ingevulde voornaam
     */
    public void setVoornaam(String voornaam)
    {
        this.voornaam = voornaam;
    }
    
    /**
     * Achternaam setten
     * @param achternaam de ingevulde achternaam
     */
    public void setAchternaam(String achternaam)
    {
        this.achternaam = achternaam;
    }
    
    /**
     * Geboortedatum setten
     * @param dag Ingevoerde cijfer dat de dag aangeeft
     * @param maand Ingevoerde cijfer dat de maan aangeeft
     * @param jaar Ingevoerde cijfer dat het jaar aangeeft
     * Methode checkt eerst of de datum wel geldig is, als dit zo is set hij de dag, de maan en het jaar
     */
    public void setGebdatum(int dag, int maand, int jaar)
    {
        if (dag < 32 && dag >= 1 && maand < 13 && maand >=1 && jaar > 1900 && jaar < 2100)
        {
            if (dag > 30)
            {
                if (maand == 4)
                    {
                        System.out.println("U heeft een ongeldige datum ingevoerd");                      
                    }
                else if (maand == 6)
                    {
                        System.out.println("U heeft een ongeldige datum ingevoerd");
                    }
                else if (maand == 9)
                    {
                        System.out.println("U heeft een ongeldige datum ingevoerd");
                    }
                else if (maand == 11)
                    {
                        System.out.println("U heeft een ongeldige datum ingevoerd");
                    }
                
            }
            else
            {
                if (dag > 28 && dag <= 29 && maand == 2)
                {
                    if(date.isSchrikkeljaar(jaar))
                    {
                        gebDag = dag;
                        gebMaand = maand;
                        gebJaar = jaar;
                    }
                
                    else{     
                            System.out.println("U heeft een ongeldige datum ingevoerd");
                        }
                }
                else
                {
                    gebDag = dag;
                    gebMaand = maand;
                    gebJaar = jaar;
                }
            }
        }
        
                
        else
        {
            System.out.println("U heeft een ongeldige datum ingevoerd");
        }
    }
    
    /**
     * Geslacht setten
     * @param Geslacht het ingevoerde geslacht
     */
    public void setGeslacht(char Geslacht)
    {
        if(Geslacht == 'm' || Geslacht == 'M' || Geslacht =='v' || Geslacht == 'V')
        {
            this.geslacht = Geslacht;
        }
        else
        {
            System.out.println("Vul bij geslacht 'm', 'M', 'v' of 'V' in");
        }
    }
    
      /**
     * Getter voor geslacht
     * @return geslacht
     */
    public String getGeslacht()
    {

        if (geslacht == 'm' || geslacht == 'M') return "Man";
       
        if (geslacht == 'v' || geslacht == 'V') return "Vrouw";
        
        return "Onbekend";
    }
    
    /**
     * Getter voor geboortedatum
     * @return Geboortedatum
     */
    public String getGebDatum()
    {
        String temp;
        if (gebDag==0 && gebMaand==0 && gebJaar==0)
        {
            temp="Onbekend";
        }
        else
        {
            temp=gebDag+"/"+gebMaand+"/"+gebJaar;
        }
        return temp;
    }
    
     /**
     * Getter voor bsn
     * @return bsn
     */
    public int getBsn()
    {
        return bsn;
    }
    
    /**
    * Getter voor voornaam
    * @return voornaam
    */
    public String getVoornaam()
    {
        return voornaam;
    }
    
      /**
     * Getter voor achternaam
     * @return achternaam
     */
    public String getAchternaam()
    {
        return achternaam;
    }
    
    public void drukAf()
    {
        System.out.println("Bsn: " + getBsn());
        System.out.println("Voornaam: " + getVoornaam());
        System.out.println("Achternaam: " + getAchternaam());
        System.out.println("Geboortedatum(dd/mm/jjjj): " + getGebDatum());
        System.out.println("Geslacht: " + getGeslacht());
    }
        
    
}
