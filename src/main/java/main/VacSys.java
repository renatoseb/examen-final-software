package main;

import java.util.*;
import java.util.logging.Logger;

public class VacSys {
    private static VacSys instance = null;
    private Map<String, User> users;
    private List<CentroVac> centros;
    static final Logger logger = Logger.getLogger(VacSys.class.getName());

    private VacSys() {
        var user = new User("renatoseb");
        this.users = new HashMap<>();
        this.centros = new ArrayList<>();
        this.users.put("renatoseb", user);
    }

    public static synchronized VacSys getInstance() {
        if (instance == null)
            instance = new VacSys();
        return instance;
    }

    public void main() {
        login();
        seeOptions();
    }

    public Boolean login() {
        var username = "";
        var password = "";
        do {
            // Pedimos datos
            var input = new Scanner(System.in);
            logger.info("Ingrese su nombre de usuario: ");
            username = input.next();
            logger.info("Ingrese su contraseña: ");
            password = input.next();
        } while(!authUser(username, password));
        return true;
    }
    
    public void seeOptions() {
        Boolean flag = true;
        while(flag) {
            var input = new Scanner(System.in);
            var block = """     
                    -------- BIENVENIDO --------
                    1. Avance de la Vacunación 
                    2. Cobertura de la Vacunación 
                    3. Número de Centros de Vacunación 
                    4. Número de personas vacunadas parcialmente 
                    5. Número de personas vacunadas completamente 
                    6. Salir del sistema
                    -----------------------------
                    """;
            logger.info(block);
            logger.info("Ingrese la opción que quiere realizar: ");
            var option = input.nextInt();
            switch (option) {
                case 1:
                    verAvanceVacunacion();
                    break;
                case 2:
                    verCoberturaVacunacion();
                    break;
                case 3:
                    verNroCentroVac();
                    break;
                case 4:
                    verNroPersonasVacParc();
                    break;
                case 5:
                    verNroPersonasVacComp();
                    break;
                case 6:
                    flag = false;
                    break;
                default:
                    break;
            }

        }
        System.exit(0);
    }

    private void verNroPersonasVacComp() {
        logger.info("not implemented verNroPersonasVacComp");
    }

    private void verNroPersonasVacParc() {
        logger.info("not implemented verNroPersonasVacParc");
    }

    private void verNroCentroVac() {
        logger.info("not implemented verNroCentroVac");
    }

    private void verCoberturaVacunacion() {
        logger.info("not implemented verCoberturaVacunacion");
    }

    private void verAvanceVacunacion() {
        var total = 0;
        for(var i = 0; i < this.centros.size(); ++i) {
            total += this.centros.get(i).getTotal();
        }
        logger.info(String.valueOf(total));
    }

    public boolean authUser(String username, String password) {
        // Validamos
        if (users.containsKey(username)) {
            var user = users.get(username);
            if(password.equals(user.getPassword())) {
                return true;
            }
            else {
                logger.info("Contraseña invalida");
            }
        }
        else {
            logger.info("Usuario no existente");
        }
        return false;
    }
}
