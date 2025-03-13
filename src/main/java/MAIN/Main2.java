package MAIN;

import DAO.Daoimp;
import DAO.Idao;
import METIER.Imetier;

import java.io.File;
import java.util.Scanner;

public class Main2 {
        public static void main(String[] args) throws Exception{
            Scanner scanner = new Scanner(new File("context.txt"));
            String DAOIMP = scanner.nextLine();
            Class dao = Class.forName(DAOIMP);
            Idao d = (Idao) dao.newInstance();

            String metierimp = scanner.nextLine();
            Class metier = Class.forName(metierimp);
            Imetier met;
            met = (Imetier) metier.getConstructor(Idao.class).newInstance(d);
            System.out.println(met.calcule());
        }
    }



