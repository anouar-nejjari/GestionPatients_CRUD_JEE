package metier;

import dao.IDao;

public class MetierImplt implements IMetier{
    // instancie Objet Dao
    private IDao dao;

    // constructors sans param pour choisé de quille injection je peux fair
    public  MetierImplt (){
    }
    // 1. Injection par constructor (beaucoup mieux)
    public MetierImplt(IDao dao){
        this.dao = dao;
    }
    // 2. injection par setters
    public void setDao(IDao dao) {
        this.dao = dao;
    }
    // Triatement des donne recupére a partier de DAO
    @Override
    public double calculer() {
        System.out.println("vesrion Base de donnée");
        double t = dao.getData() ;
        double res = t * 23;
        return res;
    }



}
