import semana1.Bicicleta;

public class Hello {
    public static void main(String[] args){
        def();
    }

    public static void def(){
        Bicicleta b = new Bicicleta();
        b.setPins(2);
        b.setRodado(24);
        b.setVelocidad(50);
        b.setColor("Negra");
        String msg = "Soy una bici de montana con estas caracteristicas";
        msg += "\nColor: "+b.getColor();
        msg += "\nVelocidad: "+b.getVelocidad();
        msg += "\nPins: "+b.getPins();
        msg += "\nRodado: "+b.getRodado();

        System.out.println(msg);
    }
}
