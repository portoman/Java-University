package Test;

import enumeracion.Continentes;
import enumeracion.Dias;

public class TestEnumeraciones {
    public static void main(String[] args) {
        
        System.out.println("Dia 1: "+Dias.LUNES);
     
        indicarDiaSemana(Dias.SABADO);
        
        System.out.println(Continentes.AFRICA);
        System.out.println(Continentes.AFRICA.getPaises());
        System.out.println(Continentes.AMERICA.getPaises());
        System.out.println(Continentes.ASIA.getPaises());
        System.out.println(Continentes.EUROPA.getPaises());
        System.out.println(Continentes.OCEANIA.getPaises());
        System.out.println(Continentes.OCEANIA.getApodo());
        System.out.println(Continentes.AMERICA.getApodo());
    }

    public static void indicarDiaSemana(Dias dias){
        
        switch(dias){
            case LUNES:
                System.out.println("Primer dia de la semana");
                break;
            case MARTES:
                System.out.println("Segundo dia de la semana");
                break;
            case MIERCOLES:
                System.out.println("Tercer dia de la semana");
                break;
            case JUEVES:
                System.out.println("Cuarto dia de la semana");
                break;
            case VIERNES:
                System.out.println("Quinto dia de la semana");
                break;
            case SABADO:
                System.out.println("Sexto dia de la semana");
                break;
            case DOMINGO:
                System.out.println("Último dia de la semana");
                break;
                      
            
                
        }
    }
}
