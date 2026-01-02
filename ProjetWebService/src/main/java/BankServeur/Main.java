package BankServeur;

import jakarta.xml.ws.Endpoint;
import ws.WebServiceBank;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String url = "http://localhost:8080/";
        // creation web service acessible par http
        Endpoint.publish(url,new WebServiceBank());
        System.out.println("web service accessible sur "+url);
    }
}