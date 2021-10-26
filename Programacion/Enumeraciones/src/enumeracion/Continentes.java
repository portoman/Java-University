package enumeracion;

public enum Continentes {

    AFRICA(53, "Calor"),
    EUROPA(46, "Dinero"),
    ASIA(44, "Gente"),
    AMERICA(34, "Nuevo mundo"),
    OCEANIA(14, "Islas");

    private final int paises;
    private final String apodo;

    Continentes(int paises, String apodo) {
        this.paises = paises;
        this.apodo = apodo;
    }

    public int getPaises() {

        return this.paises;
    }
public String getApodo(){
    
    return this.apodo;
}
}
