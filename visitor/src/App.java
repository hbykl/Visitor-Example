interface Hayvan {

    void kabul(EvcilHayvanZiyaretcisi ziyaretci);

}

class Aslan implements Hayvan {

    @Override
    public void kabul(EvcilHayvanZiyaretcisi ziyaretci) {
        ziyaretci.ziyaretEt(this);
    }

}

class Kaplan implements Hayvan {

    @Override
    public void kabul(EvcilHayvanZiyaretcisi ziyaretci) {
        ziyaretci.ziyaretEt(this);
    }

}

class Maymun implements Hayvan {

    @Override
    public void kabul(EvcilHayvanZiyaretcisi ziyaretci) {
        ziyaretci.ziyaretEt(this);
    }

}

interface EvcilHayvanZiyaretcisi {

    void ziyaretEt(Hayvan a);

}

class SesZiyaretcisi implements EvcilHayvanZiyaretcisi {

    @Override
    public void ziyaretEt(Hayvan a) {
        if (a instanceof Kaplan) {
            System.out.println("rrr");
        } else if (a instanceof Aslan) {
            System.out.println("miavvv");
        } else if (a instanceof Maymun) {
            System.out.println("minik maymun kükredi");
        } else
            System.out.println("benim sesim yokkk");
    }

}

class BeslenmeZiyaretcisi implements EvcilHayvanZiyaretcisi {

    public void ziyaretEt(Hayvan a) {

    }

}

public class App {

    public static void main(String[] args) {

        Hayvan aslan = new Aslan();
        Hayvan kaplan = new Kaplan();
        Hayvan maymun = new Maymun();

        EvcilHayvanZiyaretcisi sesZiyaretcisi = new SesZiyaretcisi();

        aslan.kabul(sesZiyaretcisi);
        kaplan.kabul(sesZiyaretcisi);
        maymun.kabul(sesZiyaretcisi);
    }

}
