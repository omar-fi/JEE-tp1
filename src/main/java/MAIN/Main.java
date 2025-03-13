package MAIN;

import DAO.Daoimp;
import METIER.Metierimp;

public class Main {
    public static void main(String[] args) {
        Daoimp dao = new Daoimp();
        Metierimp metierimp = new Metierimp();
        metierimp.setIdao(dao);
        System.out.println(metierimp.calcule());

    }
}
