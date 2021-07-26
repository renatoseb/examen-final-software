package main;

import java.util.logging.Logger;

public class Main {

    static final Logger logger = Logger.getLogger(Main.class.getName());
    /*
    *
    * USER LOGIN
    * User: renatoseb
    * password: besotaner
    *
    * */
    public static void main(String[] args){
        var system = VacSys.getInstance();
        system.main();
    }
}
