package Menu;

import javax.swing.JOptionPane;

public class MenuProveedores extends MenuGral{

    public static void menuProveedores(){
        String menuProveedor = "Ingrese a donde quiere ingresar: \n\n" +
                "1. Alta.\n" +
                "2. Baja.\n" +
                "3. Modificacion.\n" +
                "4. Buscar.\n" +
                "0. Volver al menu principal.\n";

        String input = JOptionPane.showInputDialog(null, menuProveedor, "Menu Proveedores", JOptionPane.QUESTION_MESSAGE);

        if (input == null) {
             JOptionPane.showMessageDialog(null, "Vuelve al Menu Proveedores.");// No estoy segura a donde va
        }

        int option;

        try{
            option = Integer.parseInt(input);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Opcion no válida. Intente de nuevo.");
            menuProveedores();
            return;
        }

        switch (option){
            case 1:
                JOptionPane.showMessageDialog(null,"Alta de Proveedores.");
                break;
            case 2:
                JOptionPane.showMessageDialog(null, "Baja de Proveedores.");
                break;
            case 3:
                JOptionPane.showMessageDialog(null, "Modificacion de Proveedores..");
                break;
            case 4:
                JOptionPane.showMessageDialog(null,"Buscar Proveedor.");
                break;
            case 0:
                JOptionPane.showMessageDialog(null,"Vuelve al menu principal.");
                MenuGral.menuPrincipal();
                break;
            default:
                JOptionPane.showMessageDialog(null, "Opcion invalida.");
                menuProveedores();
                break;
        }

    }
}
