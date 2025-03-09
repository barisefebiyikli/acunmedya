abstract class Hayvan {
    String isim;

    public Hayvan(String isim) {
        this.isim = isim;
    }

    abstract void sesCikar();

    public void bilgileriGoster() {
        System.out.println("Hayvan Adı: " + isim);
    }
}

class Kedi extends Hayvan {
    public Kedi(String isim) {
        super(isim);
    }

    @Override
    void sesCikar() {
        System.out.println("Miyav!");
    }
}
