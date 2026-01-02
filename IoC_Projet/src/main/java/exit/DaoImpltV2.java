package exit;

import dao.IDao;

public class DaoImpltV2 implements IDao {
    @Override
    public double getData() {
        System.out.println("vesrion web service");
        double t = 1 ;
        return t;
    }
}
