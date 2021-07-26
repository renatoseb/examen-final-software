package main;

public class CentroVac {
    String name;
    private int mas80 = 0;
    private int a7980 = 0;
    private int a6069 = 0;
    private int a5059 = 0;
    private int a4049 = 0;
    private int a3039 = 0;
    private int a1829 = 0;
    // Para verificar si fue dado de alta o no
    Boolean active = true;

    public CentroVac(String name) {
        this.name = name;
    }

    public int getTotal() {
        return mas80 + a1829 + a3039 + a4049 + a5059 + a6069 + a7980;
    }
}
