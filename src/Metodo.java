import java.io.IOException;

public class Metodo {
    Conversion conversion = new Conversion();

    public void dolarPesoArgentino(double cantidad){
        try {
            conversion.conversionMonedas("USD","ARS",cantidad);

        }catch (IOException | InterruptedException e){
            System.out.println("error en la busqueda de monedas "+e.getMessage());
        }

    }

    public void pesoArgentinoDolar(double cantidad){
        try {
            conversion.conversionMonedas("ARS","USD",cantidad);

        }catch (IOException | InterruptedException e){
            System.out.println("error en la busqueda de monedas "+e.getMessage());
        }

    }
    public void realBrasilenoDolar(double cantidad){
        try {
            conversion.conversionMonedas("BRL","USD",cantidad);

        }catch (IOException | InterruptedException e){
            System.out.println("error en la busqueda de monedas "+e.getMessage());
        }

    }
    public void dolarRealBrasileno(double cantidad){
        try {
            conversion.conversionMonedas("USD","BRL",cantidad);

        }catch (IOException | InterruptedException e){
            System.out.println("error en la busqueda de monedas "+e.getMessage());
        }

    }
    public void dolarPesoColombiano(double cantidad){
        try {
            conversion.conversionMonedas("USD","COP",cantidad);

        }catch (IOException | InterruptedException e){
            System.out.println("error en la busqueda de monedas "+e.getMessage());
        }

    }
    public void pesoColombianoDolar(double cantidad){
        try {
            conversion.conversionMonedas("COP","USD",cantidad);

        }catch (IOException | InterruptedException e){
            System.out.println("error en la busqueda de monedas "+e.getMessage());
        }

    }
}
