/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadoraapi;
import javax.xml.ws.Endpoint;
/**
 *
 * @author Taymara
 */
public class Servidor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       CalculadoraWebService calculadoraWebService = new CalculadoraWebService();
       String url = "http://localhost/calculadora";
       System.out.println("Calculadora Rodando: "+url);
       Endpoint.publish(url,calculadoraWebService);
    }
    
}
