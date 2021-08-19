/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadoraapi;
import javax.jws.WebMethod;
import javax.jws.WebService;
/**
 *
 * @author Taymara
 */
@WebService(
    endpointInterface = "com.calculadoraapi.Calculadora",
    name = "Calculadora",
    serviceName = "CalculatodoraWebService",
    portName = "CalcudoraPorta")

public class CalculadoraWebService {
    private Calculadora calc = new Calculadora();
    
    @WebMethod
    public double getSoma(double valor1, double valor2){
       return calc.soma(valor1,valor2);
    }
    
    
}
