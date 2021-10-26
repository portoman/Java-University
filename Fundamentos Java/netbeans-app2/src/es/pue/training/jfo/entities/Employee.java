//Declaración del package
package es.pue.training.jfo.entities;

import java.time.LocalDate;
import java.time.Period;

//Declaración de la clase
//Fully Qualified Class Name: es.pue.training.jfo.entities.Employee
public class Employee {

    //<editor-fold defaultstate="collapsed" desc="Estado: Atributos/Campos">
    private String code;
    private String firstname;
    private String lastname;
    private LocalDate birthDate;
    private LocalDate hireDate;
    private double monthlySalary;
    private int payments;
    
    public static final int DEFAULT_PAYMENTS = 12;
    public static final double DEFAULT_SALARY = 1_500;
    private static int contador=0;
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Comportamiento: Métodos/Operaciones">
    
    public String getFullName(){
        
        return String.format( "%s%s", this.firstname,this.lastname);
    }
    
    public String getReverseName(){
        
        return this.lastname+" "+this.firstname;
    }
    public double getAnnualSalary(){
        
        return this.monthlySalary*this.payments;
    }
    
    
    public int getAge(){
        
        //return Period.between(this.birthDate,LocalDate.now() hireDate);
    return 0;
    
    }
    
    
    //<editor-fold defaultstate="collapsed" desc="Constructores">
    
    public Employee(String code, String firstname, String lastname, LocalDate birthDate, LocalDate hireDate, double monthlySalary, int payments) {
        //---->[]Employee  code:null | firstname: null | lastname: null | birthDate: null | hireDate: null | monthlySalary: 0.0 | payments: 0
        this.code = code;
        this.firstname = firstname;
        this.lastname = lastname;
        this.birthDate = birthDate;
        this.hireDate = hireDate;
        this.monthlySalary = monthlySalary;
        this.payments = payments;
    }
    
    public Employee(String code, String firstname, String lastname, LocalDate birthDate, LocalDate hireDate, double monthlySalary) {
        //---->[]Employee  code:null | firstname: null | lastname: null | birthDate: null | hireDate: null | monthlySalary: 0.0 | payments: 0
        this(code, firstname, lastname, birthDate, hireDate, monthlySalary, DEFAULT_PAYMENTS);
    }
    
    public Employee(String code, String firstname, String lastname, LocalDate birthDate, LocalDate hireDate, int payments) {
        //---->[]Employee  code:null | firstname: null | lastname: null | birthDate: null | hireDate: null | monthlySalary: 0.0 | payments: 0
        this(code, firstname, lastname, birthDate, hireDate, DEFAULT_SALARY, payments);
    }
    
    public Employee(String code, String firstname, String lastname, LocalDate birthDate, LocalDate hireDate) {
        //---->[]Employee  code:null | firstname: null | lastname: null | birthDate: null | hireDate: null | monthlySalary: 0.0 | payments: 0
        this(code, firstname, lastname, birthDate, hireDate, DEFAULT_SALARY, DEFAULT_PAYMENTS);
    }
    
    public Employee(String code, String firstname, String lastname, LocalDate birthDate, double monthlySalary, int payments) {
        //---->[]Employee  code:null | firstname: null | lastname: null | birthDate: null | hireDate: null | monthlySalary: 0.0 | payments: 0
        this(code, firstname, lastname, birthDate, LocalDate.now(), monthlySalary, payments);
    }
    
    public Employee(String code, String firstname, String lastname, LocalDate birthDate, int payments) {
        //---->[]Employee  code:null | firstname: null | lastname: null | birthDate: null | hireDate: null | monthlySalary: 0.0 | payments: 0
        this(code, firstname, lastname, birthDate, LocalDate.now(), DEFAULT_SALARY, payments);
    }
    
    public Employee(String code, String firstname, String lastname, LocalDate birthDate) {
        //---->[]Employee  code:null | firstname: null | lastname: null | birthDate: null | hireDate: null | monthlySalary: 0.0 | payments: 0
        this(code, firstname, lastname, birthDate, LocalDate.now(), DEFAULT_SALARY, DEFAULT_PAYMENTS);
    }
    
    //</editor-fold>
    
    
    //</editor-fold>


}
