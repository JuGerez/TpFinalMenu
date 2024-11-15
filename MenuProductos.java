package Menu;

import javax.swing.JOptionPane;

public class MenuProductos extends MenuGral{

    public static void menuProductos(){
        String menuProd = "Ingrese la opcion correcta: \n\n"+
                "1. Alta. \n" +
                "2. Baja. \n" +
                "3. Modificacion. \n" +
                "4. Listado de productos. \n" +
                "5. Buscar x producto. \n" +
                "6. Buscar x proveedor. \n" +
                "0. Volver al menu principal. \n";

        String input = JOptionPane.showInputDialog(null, menuProd, "Menu Proveedores", JOptionPane.QUESTION_MESSAGE);

        if (input == null){
            JOptionPane.showMessageDialog(null, "Vuelve al Menu Productos.");//No se dnd va tdvia
        }

        int option;

        try {
            option = Integer.parseInt(input);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Opción no válida. Intente de nuevo.");
            menuProductos();
            return;
        }

        switch (option){
            case 1:
                JOptionPane.showMessageDialog(null, "Alta de Productos.");
                break;
            case 2:
                JOptionPane.showMessageDialog(null,"Baja de Productos.");
                break;
            case 3:
                JOptionPane.showMessageDialog(null,"Modificación de Productos.");
                break;
            case 4:
                JOptionPane.showMessageDialog(null,"Listado de Productos.");
                break;
            case 5:
                JOptionPane.showMessageDialog(null,"Buscar por producto.");
                break;
            case 6:
                JOptionPane.showMessageDialog(null,"Buscar Productos por Proveedor.");
                break;
            case 0:
                JOptionPane.showMessageDialog(null,"Vuelve al Menu Principal.");
                MenuGral.menuPrincipal();
                break;
            default:
                JOptionPane.showMessageDialog(null,"Opción invalida.");
                menuProductos();
                break;
        }

    }
}
