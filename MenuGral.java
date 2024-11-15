package Menu;

import javax.swing.JOptionPane;

public class MenuGral {
    private MenuCliente menuCliente;
    private MenuPedidos menuPedidos;
    private MenuCuentas menuCuentas;
    private MenuProductos menuProductos;
    private MenuProveedores menuProveedores;

    public static void menuPrincipal(){
        String menuOptions = "Ingrese a donde quiere entrar: \n\n" +
                "1. Clientes. \n" +
                "2. Proveedores. \n" +
                "3. Pedidos. \n" +
                "4. Cuentas/Saldos. \n" +
                "5. Productos. \n" +
                "0. Salir del programa. \n";

        String input = JOptionPane.showInputDialog(null, menuOptions, "Menú principal", JOptionPane.QUESTION_MESSAGE);

        if (input == null){
            JOptionPane.showMessageDialog(null, "Sale del programa.");
            return;
        }

        int option;

        try{
            option = Integer.parseInt(input);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Opción no válida. Intente de nuevo.");
            menuPrincipal();
            return;
        }

        switch (option){
            case 1:
                JOptionPane.showMessageDialog(null, "Clientes.");
                MenuCliente.menuClientes();
                break;
            case 2:
                JOptionPane.showMessageDialog(null,"Proveedores.");
                MenuProveedores.menuProveedores();
                break;
            case 3:
                JOptionPane.showMessageDialog(null, "Pedidos.");
                MenuPedidos.menuPedidos();
                break;
            case 4:
                JOptionPane.showMessageDialog(null, "Cuentas.");
                MenuCuentas.menuCuentas();
                break;
            case 5:
                JOptionPane.showMessageDialog(null, "Productos.");
                MenuProductos.menuProductos();
                break;
            case 0:
                JOptionPane.showMessageDialog(null, "Sale del programa.");
                break;
            default:
                JOptionPane.showMessageDialog(null, "Opcion no valida. Intente de nuevo.");
                menuPrincipal();
                break;
        }

    }


}
