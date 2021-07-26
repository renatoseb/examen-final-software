package main;

import java.util.Random;

public class CentroVac {
    String name;
    private int vacParc = 0;
    private int vacComp = 0;
    // Para verificar si fue dado de alta o no
    Boolean active = true;

    public CentroVac(String name) {
        this.name = name;
        Random r = new Random();
        this.vacParc = r.nextInt(100000);
        this.vacComp = vacParc / 2;
    }

    public int getTotal() {
        return vacComp;
    }

    public boolean getActive() {
        return active;
    }

    public void darAlta() {
        active = true;
    }

    public void darBaja() {
        active = false;
    }

    public int getPersVacParc() {
        // SUPONGAMOS QUE ACA HAY UNA QUERY A UNA DB
        return vacParc;
    }

    public String getName() {
        return name;
    }

}
