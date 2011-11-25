/**
 * @author Alexander Jeurissen, Bas Helder
 * @version 0.1
 */

public class Artikel
{

    private String artikelNaam;
    private double artikelPrijs;
    private String test;
   
    /**
     * Constructor voor de klasse Artikel
     * @param artikelNaam beginwaarde van variabele artikelNaam
     * @param artikelPrijs beginwaarde van variabele artikelPrijs
     */
    public Artikel(String artikelNaam, double artikelPrijs)
    {      
        this.artikelNaam = artikelNaam;
        this.artikelPrijs = artikelPrijs;
    }

   /**
    * Haal de naam op
    * @return artikelNaam de huidige waarde van variabele artikelNaam
    */
    public String getName()
    {
        return artikelNaam;
    }
    
    /**
     * Geef de artikelnaam een waarde
     * @param artikelNaam de nieuwe artikelnaam
     */
    public void setName(String artikelNaam)
    {
        this.artikelNaam = artikelNaam;
    }
    
    /**
     * geef de artikelprijs terug
     * @return artikelPrijs de huidige waarde van variabele artikelPrijs
     */
    public double getPrice()
    {
        return artikelPrijs;
    }
    
    /**
     * Geef artikelprijs een waarde
     * @param artikelPrijs nieuwe artikelprijs
     * 
     */
    public void setPrice(double artikelprijs)
    {
        this.artikelPrijs = artikelprijs;
    }
    
        
    
    
    
    
}
