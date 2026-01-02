package dao;

public class DaoImpltV1 implements IDao{

    // code qui recuper valeur a partie DB ou Capteur ou webService ....
    @Override
    public double getData() {
        double temp = 10 ;
        return temp;
    }
}
