package org.aplas.basicappx;

public class Temperature {
    private double celcius;
    private double fahrenheit;
    private double kelvin;

    public Temperature(){
        this.celcius = 0;
    }
    public void setCelcius(double celcius){
        this.celcius = celcius;
    }
    public void setFahrenheit(double f){
        this.celcius = (fahrenheit-32)/5;
    }
    public void setKelvin(double k){
        this.celcius=kelvin-273;
    }
}
