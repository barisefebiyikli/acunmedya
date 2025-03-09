abstract class Hayvann {
    String isim;

    public Hayvann(String isim) {
        this.isim = isim;
    }

    abstract void sesCikar();

    public void bilgileriGoster() {
        System.out.println("Hayvan Adı: " + isim);
    }
}

class Kedii extends Hayvan {
    public Kedii(String isim) {
        super(isim);
    }

    @Override
    void sesCikar() {
        System.out.println("Miyav!");
    }
}
