import java.util.Scanner;

public class Interfaz {

    public void showMessage(String message, char icon) {

        int width = message.length() + 4;

        System.out.println();
        for (int i = 0; i < width; i++) {
            System.out.print(icon);
        }
        System.out.println();

        System.out.print(icon + " ");
        for (int i = 0; i < message.length(); i++) {
            System.out.print(message.charAt(i));
        }
        System.out.println(" " + icon);

        for (int i = 0; i < width; i++) {
            System.out.print(icon);
        }
        System.out.println();
    }

    public void showMenu(){
        String menu = """
                
                ============== Conversor de Monedas ==============
                Seleccione una opción:

                --- Convertir de USD a otra moneda ---
                1.  USD → EUR (Euro)
                2.  USD → GBP (Libra esterlina)
                3.  USD → JPY (Yen japonés)
                4.  USD → CNY (Yuan chino)
                5.  USD → AUD (Dólar australiano)
                6.  USD → CAD (Dólar canadiense)
                7.  USD → CHF (Franco suizo)
                8.  USD → INR (Rupia india)
                9.  USD → MXN (Peso mexicano)
                10. USD → BRL (Real brasileño)
                11. USD → ARS (Peso argentino)
                12. USD → CLP (Peso chileno)
                13. USD → CRC (Colón costarricense)
                14. EUR → USD (Euro)
                15. GBP → USD (Libra esterlina)
                16. JPY → USD (Yen japonés)
                17. CNY → USD (Yuan chino)
                18. AUD → USD (Dólar australiano)
                19. CAD → USD (Dólar canadiense)
                20. CHF → USD (Franco suizo)
                21. INR → USD (Rupia india)
                22. MXN → USD (Peso mexicano)
                23. BRL → USD (Real brasileño)
                24. ARS → USD (Peso argentino)
                25. CLP → USD (Peso chileno)
                26. CRC → USD (Colón costarricense)
                27. Salir
                ===============================================
                """;

        System.out.println(menu);
    }

    public int requestDataInt(Scanner in, String message){
        System.out.print(message);
        return in.nextInt();
    }

    public double requestDataDouble(Scanner in, String message){
        System.out.print(message);
        return in.nextDouble();
    }

    public void printMessageConvertion(String currencyInit, String currencyFinal, double amount,  double conversion){
        System.out.println("El valor " + amount + " <<" + currencyInit + ">> corresponde al valor final de → " +  conversion + " <<" + currencyFinal + ">>");
    }

}
