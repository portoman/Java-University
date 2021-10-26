package test;

import domain.PersonaBean;

public class TestJavaBeans {
    public static void main(String[] args) {
        PersonaBean persona = new PersonaBean();
        persona.setNombre("Juan");
        persona.setApellido("Perez");
        
        
        System.out.printf("Persona = %s \n", persona);
        System.out.printf("Persona nombre= %s \n",persona.getNombre());
        System.out.printf("Persona apellido= %s \n",persona.getApellido());
    }
}
