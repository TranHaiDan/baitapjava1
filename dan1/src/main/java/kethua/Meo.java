package kethua;

public class Meo extends DongVat {

    public Meo(String mauLong, int soChan) {
        super(mauLong, soChan);
    }

    @Override
    public void tiengKeu() {
        System.out.println("Mèo kêu: Meow...");
    }
}

