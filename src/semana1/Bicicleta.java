package semana1;

import java.lang.annotation.Documented;

public class Bicicleta {
    private int pins, rodado;
    private double velocidad;
    private String color;

    public Bicicleta(){

    }

    public double getVelocidad() {  return velocidad;  }
    public int getPins() {  return pins;  }
    public int getRodado() {  return rodado;  }
    public String getColor() {  return color;  }

    /**
     * Returns flag depending on parameter
     * true = p greater than 0
     * false = p less than 0
     * @param p Number of pins
     * **/
    public boolean setPins(int p){
        if(p > 0){
            this.pins = p;
            return true;
        }else
            return false;
    }
    /**
     * Returns flag depending on parameter
     * true = r greater than 0
     * false = r less than 0
     * @param r Rodado of the bicycle
     * **/
    public boolean setRodado(int r){
        if (r > 0){
            this.rodado = r;
            return true;
        }else
            return false;
    }
    /**
     * Returns flag depending on parameter
     * true = v greater or equal to 0
     * false = v less than 0
     * @param v Velocity of the bicycle
     * **/
    public boolean setVelocidad(double v){
        if (velocidad >= 0){
            this.velocidad = v;
            return true;
        }else
            return false;
    }
    public boolean setColor(String c){
        if(color != ""){
            this.color = c;
            return true;
        }else
            return false;
    }

    public String printState(){
        return "Pins: "+pins+"\n"+
                "Rodado: "+rodado+"\n"+
                "Velocidad: "+velocidad;
    }


}
