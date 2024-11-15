package Menu;

import javax.swing.JOptionPane;

public class MenuCuentas extends MenuGral{

    public static void menuCuentas(){
        String menuCuenta = "Ingresa a donde queres ingresar: \n\n" +
                "1. Movimientos de caja. \n" +
                "2. Estado de cuenta. \n" +
                "3. Saldos deudores. \n" +
                "4. Buscar saldo por cliente. \n" +
                "0. Volver al menu principal. \n";

        String input = JOptionPane.showInputDialog(null, menuCuenta, "Menu Cuentas", JOptionPane.QUESTION_MESSAGE);

        if (input == null){
            JOptionPane.showMessageDialog(null, "Vuelve al Menu Cuentas.");// No estoy segura a dnd va
        }

        int option;

        try{
            option = Integer.parseInt(input);
        } catch (NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Opción no válida. Intente de nuevo.");
            menuCuentas();
            return;
        }

        switch (option){
            case 1:
                JOptionPane.showMessageDialog(null,"Ingresaste a Moviemientos de caja");
                //q incluya pagos de clientes
                break;
            case 2:
                JOptionPane.showMessageDialog(null, "Estado de cuenta.");
                break;
            case 3:
                JOptionPane.showMessageDialog(null, "Saldos deudores.");
                break;
            case 4:
                JOptionPane.showMessageDialog(null, "Buscar saldo por cliente.");
                break;
            case 0:
                JOptionPane.showMessageDialog(null,"Volver al Menu Principal.");
                MenuGral.menuPrincipal();
            default:
                JOptionPane.showMessageDialog(null,"Opción invalida.");
                menuCuentas();
                break;
        }
    }
}
