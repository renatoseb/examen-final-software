package main;

import java.util.logging.Logger;

public class Main {

    static final Logger logger = Logger.getLogger(Main.class.getName());

    public static void main(String[] args){
        VacSys system = VacSys.getInstance();
        system.main();
    }
}
