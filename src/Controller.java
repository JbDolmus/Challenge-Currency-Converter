import java.util.Scanner;

public class Controller {
    public void startApp(){
        Scanner in = new Scanner(System.in);
        QueryAPI query = new QueryAPI();
        Currency currency = query.queryCurrency();

        Interfaz ui = new Interfaz();
        Logic logic = new Logic();
        int option;
        double amount, conversion;
        boolean flag;

        ui.showMessage("Bienvenidos al Conversor de Monedas - Challenge", '*');

        do{
            option = 0;

            ui.showMenu();

            do {
                System.out.print("Ingrese una opción válida: ");
                if (in.hasNextInt()) {
                    option = in.nextInt();
                    in.nextLine();
                    flag = true;
                } else {
                    System.out.println("Formato inválido. Por favor, digite un número válido!!");
                    in.nextLine();
                    flag = false;
                }
            } while (!flag);

            switch (option) {
                case 1:
                    amount = ui.requestDataDouble(in, "Ingrese el valor que deseas convertir: ");
                    conversion = logic.converterCurrency(currency, "USD","EUR" , amount);
                    ui.printMessageConvertion("USD", "EUR", amount, conversion);
                    break;
                case 2:
                    amount = ui.requestDataDouble(in, "Ingrese el valor que deseas convertir: ");
                    conversion = logic.converterCurrency(currency,"USD","GBP" , amount);
                    ui.printMessageConvertion("USD", "GBP", amount, conversion);
    //                convertir("USD", "GBP");
                    break;
                case 3:
                    amount = ui.requestDataDouble(in, "Ingrese el valor que deseas convertir: ");
                    conversion = logic.converterCurrency(currency,"USD","JPY" , amount);
                    ui.printMessageConvertion("USD", "JPY", amount, conversion);
    //                convertir("USD", "JPY");
                    break;
                case 4:
                    amount = ui.requestDataDouble(in, "Ingrese el valor que deseas convertir: ");
                    conversion = logic.converterCurrency(currency,"USD","CNY" , amount);
                    ui.printMessageConvertion("USD", "CNY", amount, conversion);
                    break;
                case 5:
                    amount = ui.requestDataDouble(in, "Ingrese el valor que deseas convertir: ");
                    conversion = logic.converterCurrency(currency,"USD","AUD" , amount);
                    ui.printMessageConvertion("USD", "AUD", amount, conversion);
                    break;
                case 6:
                    amount = ui.requestDataDouble(in, "Ingrese el valor que deseas convertir: ");
                    conversion = logic.converterCurrency(currency,"USD","CAD" , amount);
                    ui.printMessageConvertion("USD", "CAD", amount, conversion);
                    break;
                case 7:
                    amount = ui.requestDataDouble(in, "Ingrese el valor que deseas convertir: ");
                    conversion = logic.converterCurrency(currency,"USD","CHF" , amount);
                    ui.printMessageConvertion("USD", "CHF", amount, conversion);
                    break;
                case 8:
                    amount = ui.requestDataDouble(in, "Ingrese el valor que deseas convertir: ");
                    conversion = logic.converterCurrency(currency,"USD","INR" , amount);
                    ui.printMessageConvertion("USD", "INR", amount, conversion);
                    break;
                case 9:
                    amount = ui.requestDataDouble(in, "Ingrese el valor que deseas convertir: ");
                    conversion = logic.converterCurrency(currency,"USD","MXN" , amount);
                    ui.printMessageConvertion("USD", "MXN", amount, conversion);
                    break;
                case 10:
                    amount = ui.requestDataDouble(in, "Ingrese el valor que deseas convertir: ");
                    conversion = logic.converterCurrency(currency,"USD","BRL" , amount);
                    ui.printMessageConvertion("USD", "BRL", amount, conversion);
                    break;
                case 11:
                    amount = ui.requestDataDouble(in, "Ingrese el valor que deseas convertir: ");
                    conversion = logic.converterCurrency(currency,"USD","ARS" , amount);
                    ui.printMessageConvertion("USD", "ARS", amount, conversion);
                    break;
                case 12:
                    amount = ui.requestDataDouble(in, "Ingrese el valor que deseas convertir: ");
                    conversion = logic.converterCurrency(currency,"USD","CLP" , amount);
                    ui.printMessageConvertion("USD", "CLP", amount, conversion);
                    break;
                case 13:
                    amount = ui.requestDataDouble(in, "Ingrese el valor que deseas convertir: ");
                    conversion = logic.converterCurrency(currency,"USD","CRC" , amount);
                    ui.printMessageConvertion("USD", "CRC", amount, conversion);
                    break;
                case 14:
                    amount = ui.requestDataDouble(in, "Ingrese el valor que deseas convertir: ");
                    conversion = logic.converterCurrency(currency,"EUR","USD" , amount);
                    ui.printMessageConvertion("EUR", "USD", amount, conversion);
                    break;
                case 15:
                    amount = ui.requestDataDouble(in, "Ingrese el valor que deseas convertir: ");
                    conversion = logic.converterCurrency(currency,"GBP","USD" , amount);
                    ui.printMessageConvertion("GBP", "USD", amount, conversion);
                    break;
                case 16:
                    amount = ui.requestDataDouble(in, "Ingrese el valor que deseas convertir: ");
                    conversion = logic.converterCurrency(currency,"JPY","USD" , amount);
                    ui.printMessageConvertion("JPY", "USD", amount, conversion);
                    break;
                case 17:
                    amount = ui.requestDataDouble(in, "Ingrese el valor que deseas convertir: ");
                    conversion = logic.converterCurrency(currency,"CNY","USD" , amount);
                    ui.printMessageConvertion("CNY", "USD", amount, conversion);
                    break;
                case 18:
                    amount = ui.requestDataDouble(in, "Ingrese el valor que deseas convertir: ");
                    conversion = logic.converterCurrency(currency,"AUD","USD" , amount);
                    ui.printMessageConvertion("AUD", "USD", amount, conversion);
                    break;
                case 19:
                    amount = ui.requestDataDouble(in, "Ingrese el valor que deseas convertir: ");
                    conversion = logic.converterCurrency(currency,"CAD","USD" , amount);
                    ui.printMessageConvertion("CAD", "USD", amount, conversion);
                    break;
                case 20:
                    amount = ui.requestDataDouble(in, "Ingrese el valor que deseas convertir: ");
                    conversion = logic.converterCurrency(currency,"CHF","USD" , amount);
                    ui.printMessageConvertion("CHF", "USD", amount, conversion);
                    break;
                case 21:
                    amount = ui.requestDataDouble(in, "Ingrese el valor que deseas convertir: ");
                    conversion = logic.converterCurrency(currency,"INR","USD" , amount);
                    ui.printMessageConvertion("INR", "USD", amount, conversion);
                    break;
                case 22:
                    amount = ui.requestDataDouble(in, "Ingrese el valor que deseas convertir: ");
                    conversion = logic.converterCurrency(currency,"MXN","USD" , amount);
                    ui.printMessageConvertion("MXN", "USD", amount, conversion);
                    break;
                case 23:
                    amount = ui.requestDataDouble(in, "Ingrese el valor que deseas convertir: ");
                    conversion = logic.converterCurrency(currency,"BRL","USD" , amount);
                    ui.printMessageConvertion("BRL", "USD", amount, conversion);
                    break;
                case 24:
                    amount = ui.requestDataDouble(in, "Ingrese el valor que deseas convertir: ");
                    conversion = logic.converterCurrency(currency,"ARS","USD" , amount);
                    ui.printMessageConvertion("ARS", "USD", amount, conversion);
                    break;
                case 25:
                    amount = ui.requestDataDouble(in, "Ingrese el valor que deseas convertir: ");
                    conversion = logic.converterCurrency(currency,"CLP","USD" , amount);
                    ui.printMessageConvertion("CLP", "USD", amount, conversion);
                    break;
                case 26:
                    amount = ui.requestDataDouble(in, "Ingrese el valor que deseas convertir: ");
                    conversion = logic.converterCurrency(currency,"CRC","USD" , amount);
                    ui.printMessageConvertion("CRC", "USD", amount, conversion);
                    break;
                case 27:
                    System.out.println("Gracias por usar el conversor de monedas. ¡Hasta pronto!");
                    break;
                default:
                    System.out.println("Opción inválida. Por favor, seleccione una opción del 1 al 27.");
                    break;
            }
        }while(option != 27);
    }
}
