//Declaración del package o paquete
package es.pue.training.jfo.ui;

//Declaración de imports
// ---> Las clases del package java.lang se encuentran importadas por defecto
// es.pue.training.jfo.utilities.MathUtils   -->  MathUtils
// es.pue.training.jfo.entities.Location     -->  Location
// es.pue.training.jfo.entities.Event        -->  Event
// es.pue.training.jfo.entities.Color        -->  Color
// es.pue.training.jfo.entities.Employee     -->  Employee
import es.pue.training.jfo.utilities.MathUtils;
import es.pue.training.jfo.entities.Location;
import es.pue.training.jfo.entities.Event;
import es.pue.training.jfo.entities.Color;
import es.pue.training.jfo.entities.Employee;
import java.time.LocalDate;

// java.lang.Math.E   ---> E
// java.lang.Math.PI  ---> PI
// java.lang.Math.pow ---> pow
import static java.lang.Math.E;
import static java.lang.Math.PI;
import static java.lang.Math.pow;
import static java.lang.Math.sqrt;
import static java.lang.Math.max;
import static java.lang.Math.min;
import static java.lang.System.out;
import java.time.LocalDateTime;
import java.time.Month;

//Declaración de la clase (Main-Class or Driver)
//Fully qualified class name: es.pue.training.jfo.ui.Application
public class Application {

    //Main-Method/Entry Point Level
    public static void main(String[] args) {

        //Usando atributos/campos estáticos de la clase java.lang.Math
        System.out.println(Math.PI);
        System.out.println(Math.E);

        //Usando metodos/operaciones estáticos de la clase java.lang.Math
        System.out.println(Math.sqrt(2));
        System.out.println(Math.pow(2, 3));
        System.out.println(Math.max(4, 6));
        System.out.println(Math.min(4, 6));

        //Usando atributos/campos estáticos de la clase java.lang.Math
        out.println(PI);
        out.println(E);

        //Usando metodos/operaciones estáticos de la clase java.lang.Math
        out.println(sqrt(2));
        out.println(pow(2, 3));
        out.println(max(4, 6));
        out.println(min(4, 6));

        //Usando atributos/campos estáticos nuestra clase es.pue.training.jfo.utilities.MathUtils
        System.out.println("MathUtils.PI: " + es.pue.training.jfo.utilities.MathUtils.PI);
        System.out.println("MathUtils.PI: " + MathUtils.PI);
        System.out.println("MathUtils.E: " + es.pue.training.jfo.utilities.MathUtils.E);
        System.out.println("MathUtils.E: " + MathUtils.E);
        System.out.println("MathUtils.PHI: " + es.pue.training.jfo.utilities.MathUtils.PHI);
        System.out.println("MathUtils.PHI: " + MathUtils.PHI);

        System.out.println("MathUtils.max(4,6): " + MathUtils.max(4, 6));
        System.out.println("MathUtils.max(4,6,3,4,1,1,2,3,4,10,12): " + MathUtils.max(4, 6, 3, 4, 1, 1, 2, 3, 4, 10, 12));
        System.out.println("MathUtils.max(4,6,19,15,312): " + MathUtils.max(4, 6, 19, 15, 312));
        System.out.println("MathUtils.min(4,6): " + MathUtils.min(4, 6));
        System.out.println("MathUtils.min(4,6,3,4,1,1,2,3,4,10,12): " + MathUtils.min(4, 6, 3, 4, 1, 1, 2, 3, 4, 10, 12));
        System.out.println("MathUtils.min(4,6,19,15,312): " + MathUtils.min(4, 6, 19, 15, 312));

        System.out.println("MathUtils.abs(10.8): " + MathUtils.abs(10.8));
        System.out.println("MathUtils.abs(-34.3): " + MathUtils.abs(-34.3));

        System.out.println("MathUtils.isEven(4): " + MathUtils.isEven(4));
        System.out.println("MathUtils.isEven(5): " + MathUtils.isEven(5));

        System.out.println("MathUtils.isOdd(4): " + MathUtils.isOdd(4));
        System.out.println("MathUtils.isOdd(5): " + MathUtils.isOdd(5));

        System.out.println("MathUtils.average(4,6): " + MathUtils.average(4, 6));
        System.out.println("MathUtils.average(4,6,3,4,1,1,2,3,4,10,12): " + MathUtils.average(4, 6, 3, 4, 1, 1, 2, 3, 4, 10, 12));
        System.out.println("MathUtils.average(4,6,19,15,312): " + MathUtils.average(4, 6, 19, 15, 312));

        System.out.println("Color mínimo: " + Color.MIN_VALUE);
        System.out.println("Color máximo: " + Color.MAX_VALUE);
        var c1 = new Color("White", 255, 255, 255);
        var c2 = new Color("Black", 0, 0, 0);
        var c3 = new Color("None", 120, 5, 12);
        var c4 = new Color();
        var c5 = new Color(255, 11, 251);

        System.out.println("Latitud mínima: " + Location.MIN_LATITUDE);
        System.out.println("Latitud máxima: " + Location.MAX_LATITUDE);
        var l1 = new Location(43.2, 84.1);
        var l2 = new Location(24.1, 24.1);
        var l3 = new Location(33.5, 12.3);

        var e1 = new Employee("0001", "Jordi", "Ariño Santos", LocalDate.of(1980, Month.MARCH, 23), LocalDate.now(), 1_5000, 12);

        System.out.println("e1 dame tu nombre: " + e1.getFullName());
        System.out.println("e1 dame tu edad: " + e1.getAge());

        var e2 = new Employee("0002", "Laura", "García Sanchez", LocalDate.of(1980, Month.MARCH, 23), LocalDate.now(), 1_5000, 12);
        var e3 = new Employee("0003", "Maria", "Lopez Aguirre", LocalDate.of(1980, Month.MARCH, 23), LocalDate.now(), 1_5000, 12);
        var e4 = new Employee("0004", "Pedro", "Sanchez", LocalDate.of(1990, Month.AUGUST, 23));

        var ev1 = new Event();
        var ev2 = new Event();
        var ev3 = new Event();

        System.out.println("Numero colores: " + Color.getContador());

    }

}
