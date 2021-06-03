/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finaltask;

/**
 *
 * @author 20115
 */
public class Countries {
    
    String CountryAbb;
    String Continent;
    String CountryName;
    int CountryPopulation;
    String CountryCapital;

    public Countries(String CountryAbb, String Continent, String CountryName, int CountryPopulation, String CountryCapital) {
        this.CountryAbb = CountryAbb;
        this.Continent = Continent;
        this.CountryName = CountryName;
        this.CountryPopulation = CountryPopulation;
        this.CountryCapital = CountryCapital;
    }

    public String getCountryCode() {
        return CountryAbb;
    }

    public void setCountryCode(String CountryAbb) {
        this.CountryAbb = CountryAbb;
    }

    public String getContinent() {
        return Continent;
    }

    public void setContinent(String Continent) {
        this.Continent = Continent;
    }

    public String getCountryName() {
        return CountryName;
    }

    public void setCountryName(String CountryName) {
        this.CountryName = CountryName;
    }

    public int getCountryPopulation() {
        return CountryPopulation;
    }

    public void setCountryPopulation(int CountryPopulation) {
        this.CountryPopulation = CountryPopulation;
    }

    public String getCountryCapital() {
        return CountryCapital;
    }

    public void setCountryCapital(String CountryCapital) {
        this.CountryCapital = CountryCapital;
    }
    
    @Override
     public String toString() {
        return "Countires{" + "CountryAbb=" + CountryAbb + ", CountryName=" + CountryName + ", Continent=" + Continent + ", CountryPopulation=" + CountryPopulation + ", CountryCapital" + CountryCapital + "}";
    }
    
     
     
    
    
}

    

