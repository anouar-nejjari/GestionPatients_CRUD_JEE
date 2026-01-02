package ws;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;

import java.util.Date;
import java.util.List;


@WebService
public class WebServiceBank {
    @WebMethod(operationName = "conversionEuroToDH")
    public double conversion(@WebParam(name = "montant") double amount){
        return  amount*10;
    }
    @WebMethod
    public Acount getAcount (@WebParam(name = "code") int code ){
        return new Acount (code , 2000, new Date());
    }
    @WebMethod
    public List<Acount> acountList(){
        return List.of(
               new Acount(1 , 2000, new Date()),
               new Acount(2 , 1000 , new Date()),
                new Acount(3 , 200 , new Date())
        );
    }
}
