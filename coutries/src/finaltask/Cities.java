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
public class Cities {

  
    
    String CityName;
    int CityID;
    int CityPopulation;
    String CityAbb;

    public Cities(String CityName, int CityID, int CityPopulation, String CityAbb) {
        this.CityName = CityName;
        this.CityID = CityID;
        this.CityPopulation = CityPopulation;
        this.CityAbb = CityAbb;
    }

    public String getCityName() {
        return CityName;
    }

    public void setCityName(String CityName) {
        this.CityName = CityName;
    }

    public int getCityID() {
        return CityID;
    }

    public void setCityID(int CityID) {
        this.CityID = CityID;
    }

    public int getCityPopulation() {
        return CityPopulation;
    }

    public void setCityPopulation(int CityPopulation) {
        this.CityPopulation = CityPopulation;
    }

    public String getCityAbb() {
        return CityAbb;
    }

    public void setCityAbb(String CityAbb) {
        this.CityAbb = CityAbb;
    }
    
    @Override
    public String toString() {
        return "Cities{" + "CityID=" + CityID + ", CityName=" + CityName + ", CityPopulation=" + CityPopulation + ", Cityabb=" + CityAbb + "}";
    }
    
    
    
}

   

