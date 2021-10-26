package test;

import domain.FiguraGeometrica;
import domain.Rectangulo;

public class TestClasesAbstractas {
    
    public static void main(String[] args) {
        
        //FiguraGeometrica fig=new FiguraGeometrica();
        
        FiguraGeometrica figura=new Rectangulo("Rectangulo");
        figura.dibujar();
    
    }
}
