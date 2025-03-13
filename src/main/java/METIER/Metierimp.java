package METIER;

import DAO.Idao;

public class Metierimp implements Imetier{
    Idao idao=null;
    public Metierimp(){}

    public Metierimp(Idao idao) {
        this.idao = idao;
    }

    public double calcule() {
    double x =idao.getdata();
        return x*23;
    }


    public void setIdao(Idao idao) {
        this.idao = idao;
    }
}
