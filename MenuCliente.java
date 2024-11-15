package Menu;

import javax.swing.JOptionPane;

public class MenuCliente extends MenuGral{

    public static void menuClientes(){
        String menuClientes = "Ingrese a donde quiere entrar: \n\n" +
                "1. Alta. \n" +
                "2. Baja. \n" +
                "3. Modificacion. \n" +
                "4. Buscar. \n" +
                "0. Volver al menu principal. \n";

        String input = JOptionPane.showInputDialog(null, menuClientes, "Menu Clientes", JOptionPane.QUESTION_MESSAGE);

        if (input == null){
            JOptionPane.showMessageDialog(null, "Vuelve al Menu Clientes."); // No estoy segura si vuelve a menu pedidos o menu principal.
            return;
        }

        int option;

        try {
            option = Integer.parseInt(input);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Opción no válida. Intente de nuevo.");
            menuClientes();
            return;
        }

        switch (option){
            case 1:
                JOptionPane.showMessageDialog(null, "Alta de clientes.");
                break;
            case 2:
                JOptionPane.showMessageDialog(null, "Baja de clientes.");
                break;
            case 3:
                JOptionPane.showMessageDialog(null, "Modificación de clientes.");
                break;
            case 4:
                JOptionPane.showMessageDialog(null, "Buscar por cliente.");
                break;
            case 0:
                JOptionPane.showMessageDialog(null, "Vuelve al menú principal.");
                MenuGral.menuPrincipal();
                break;
            default:
                JOptionPane.showMessageDialog(null, "Opción no valida.");
                menuClientes();
                break;
        }

    }
}
