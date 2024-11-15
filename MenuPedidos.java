package Menu;

import javax.swing.JOptionPane;

public class MenuPedidos extends MenuGral{

    public static void menuPedidos(){
        String menuPedido = "Ingrese a donde quiere entrar: \n\n"+
                "1. Crear pedidos. \n" +
                "2. Modificar pedidos. \n" +
                "3. Eliminiar pedidos. \n" +
                "4. Buscar pedidos por Cliente. \n" +
                "0. Volver al menu principal.\n";

        String input = JOptionPane.showInputDialog(null, menuPedido, "Menu Pedidos", JOptionPane.QUESTION_MESSAGE);

        if (input == null){
            JOptionPane.showMessageDialog(null, "Vuelve al Menu Pedidos."); // No estoy segura si vuelve a menu pedidos o menu principal.
        }

        int option;

        try {
            option = Integer.parseInt(input);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Opción no válida. Intente de nuevo.");
            menuPedidos();
            return;
        }

        switch (option){
            case 1:
                JOptionPane.showMessageDialog(null, "Crear pedido.");
                break;
            case 2:
                JOptionPane.showMessageDialog(null,"Modificar pedido.");
                break;
            case 3:
                JOptionPane.showMessageDialog(null, "Eliminar pedido.");
                break;
            case 4:
                JOptionPane.showMessageDialog(null, "Buscar pedido por cliente.");
                break;
            case 0:
                JOptionPane.showMessageDialog(null, "Vuelve al menu principal.");
                MenuGral.menuPrincipal();
                break;
            default:
                JOptionPane.showMessageDialog(null, "Opcion invalida.");
                menuPedidos();
                break;
        }

    }
}
