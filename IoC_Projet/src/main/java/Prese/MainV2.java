package Prese;

import dao.IDao;
import exit.DaoImpltV2;
import metier.IMetier;
import metier.MetierImplt;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.InvocationTargetException;
import java.util.Scanner;

public class MainV2 {
    public static void main(String[] args) {

        try {

            Scanner scanner = new Scanner(new File("config.txt"));

            // CREATE INSTANCE OF CLASS DaoImpltV1 AND USE FOR CREATE OBJECT
            // lire ligne
            String daoClassName = scanner.nextLine();
            // crée instance de la classe
            // DaoImplt dao = new DaoTmplt();
            Class cls = Class.forName(daoClassName);
            Object objt = cls.getDeclaredConstructor().newInstance();
            IDao dao = (IDao) objt;

            // MetierImplt metier = new MetierImplt();
            String metierClass = scanner.nextLine();
            Class clsMetier = Class.forName(metierClass);
            // injectée vai constructors
            IMetier metier = (IMetier)clsMetier.getDeclaredConstructor(IDao.class).newInstance(dao);
            /*
            * injectée via setters
            * IMetier metier = (IMetier)clsMetier.getDeclaredConstructor().newInstance();
            * Methode setDao = clsMetier.getDeclaredMethode("setDao",IDao.class)
            * setDao.invoke(metier, dao);
            * */
            System.out.println("Le Resultat est : "+metier.calculer());

            // maintent en faire injétion  manuallement
            // aprés le fremework qui fait ça (spring EJB .... (AOP)
        }catch (Exception e){

        e.printStackTrace();

    }
    }
}