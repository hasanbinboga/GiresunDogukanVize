import java.util.Scanner;

/**
 * Öğrenci No: 220706052
 * Adı Soyadı: Doğukan Önder
 */
public class DersIstatistik {
    int notAA;
    int notBA;
    int notBB;
    int notBC;
    int notCB;
    int notCC;
    int notDC;
    int notDD;
    int toplamOgrenciSayisi;

    public DersIstatistik(int notAA,
            int notBA,
            int notBB,
            int notBC,
            int notCB,
            int notCC,
            int notDC,
            int notDD) {
        super();
        this.setNotAA(notAA);
        this.setNotBA(notBA);
        this.setNotBB(notBB);
        this.setNotCB(notCB);
        this.setNotCC(notCC);
        this.setNotDC(notDC);
        this.setNotDD(notDD);
        this.setToplamOgrenciSayisi(this);
    }

    void setNotAA(int notAA) {
        this.notAA = notAA;
    }

    void setNotBA(int notBA) {
        this.notBA = notBA;
    }

    void setNotBB(int notBB) {
        this.notBB = notBB;
    }

    void setNotCB(int notCB) {
        this.notCB = notCB;
    }

    void setNotCC(int notCC) {
        this.notCC = notCC;
    }

    void setNotDC(int notDC) {
        this.notDC = notDC;
    }

    void setNotDD(int notDD) {
        this.notDD = notDD;
    }

    void setToplamOgrenciSayisi(DersIstatistik ders) {
        this.toplamOgrenciSayisi = ders.notAA +
                ders.notBA +
                ders.notBB +
                ders.notCB +
                ders.notCC +
                ders.notDC +
                ders.notDD;
    }

    int getNotAA() {
        return this.notAA;
    }

    int getNotBA() {
        return this.notBA;
    }

    int getNotBB() {
        return this.notBB;
    }

    int getNotCB() {
        return this.notCB;
    }

    int getNotCC() {
        return this.notCC;
    }

    int getNotDC() {
        return this.notDC;
    }

    int getNotDD() {
        return this.notDD;
    }

    int getToplamOgrenciSayisi() {
        return this.toplamOgrenciSayisi;
    }

    void baslikYazdir() {
        System.out.println("****************************************");
        System.out.println("*** DERS NOTLARI İSTATİSTİK PROGRAMI ***");
        System.out.println("****************************************");
    }

    void menuYazdir() {
        System.out.println("MENÜ:");
        System.out.println("(1) Her bir harfli başarı notu için öğrenci sayısı gir");
        System.out.println("(2) Metinsel istatistik yazdır");
        System.out.println("(3) Grafiksel istatistik yazdır");
        System.out.println("(4) Tüm verileri sıfırla");
        System.out.println("(5) Programı sonlandır");
    }

    void notSayisiGir(DersIstatistik ders) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("AA alan öğrenci sayısını giriniz: ");
        this.setNotAA(sc.nextInt());
        System.out.printf("BA alan öğrenci sayısını giriniz: ");
        this.setNotBA(sc.nextInt());
        System.out.printf("BB alan öğrenci sayısını giriniz: ");
        this.setNotBB(sc.nextInt());
        System.out.printf("CB alan öğrenci sayısını giriniz: ");
        this.setNotCB(sc.nextInt());
        System.out.printf("CC alan öğrenci sayısını giriniz: ");
        this.setNotCC(sc.nextInt());
        System.out.printf("DC alan öğrenci sayısını giriniz: ");
        this.setNotDC(sc.nextInt());
        System.out.printf("DD alan öğrenci sayısını giriniz: ");
        this.setNotDD(sc.nextInt());
        this.setToplamOgrenciSayisi(this);

        System.out.println("Toplam öğrenci sayısı: " + this.getToplamOgrenciSayisi());

    }

    void metinselIstatistikYazdir(DersIstatistik ders) {

        if (this.getToplamOgrenciSayisi() == 0) {
            System.out.println("UYARI: Harfli başarı notları için henüz sayısal veriler girilmemiştir!");
        } else {
            System.out.printf("AA: %% %.2f\n", (double) this.getNotAA() / (double) this.getToplamOgrenciSayisi());
            System.out.printf("BA: %% %.2f\n", (double) this.getNotBA() / (double) this.getToplamOgrenciSayisi());
            System.out.printf("BB: %% %.2f\n", (double) this.getNotBB() / (double) this.getToplamOgrenciSayisi());
            System.out.printf("CB: %% %.2f\n", (double) this.getNotCB() / (double) this.getToplamOgrenciSayisi());
            System.out.printf("CC: %% %.2f\n", (double) this.getNotCC() / (double) this.getToplamOgrenciSayisi());
            System.out.printf("DC: %% %.2f\n", (double) this.getNotDC() / (double) this.getToplamOgrenciSayisi());
            System.out.printf("DD: %% %.2f\n", (double) this.getNotDD() / (double) this.getToplamOgrenciSayisi());
        }
    }

    void grafikselIstatistikYazdir(DersIstatistik ders) {
        if (this.getToplamOgrenciSayisi() == 0) {
            System.out.println("UYARI: Harfli başarı notları için henüz sayısal veriler girilmemiştir!");
        } else {

            System.out.println("    0    10   20   30   40   50   60   70   80   90   100");
            System.out.println("    |    |    |    |    |    |    |    |    |    |    |");
            System.out.println("    ***************************************************");
            System.out.println("AA: " + this
                    .yildizHesapla(
                            (int) Math
                                    .round((double) getNotAA() * 100 / ((double) this.getToplamOgrenciSayisi() * 2))));
            System.out.println("BA: " + this
                    .yildizHesapla(
                            (int) Math
                                    .round((double) getNotBA() * 100 / ((double) this.getToplamOgrenciSayisi() * 2))));
            System.out.println("BB: " + this
                    .yildizHesapla(
                            (int) Math
                                    .round((double) getNotBB() * 100 / ((double) this.getToplamOgrenciSayisi() * 2))));
            System.out.println("CB: " + this
                    .yildizHesapla(
                            (int) Math
                                    .round((double) getNotCB() * 100 / ((double) this.getToplamOgrenciSayisi() * 2))));
            System.out.println("CC: " + this
                    .yildizHesapla(
                            (int) Math
                                    .round((double) getNotCC() * 100 / ((double) this.getToplamOgrenciSayisi() * 2))));
            System.out.println("DC: " + this
                    .yildizHesapla(
                            (int) Math
                                    .round((double) getNotDC() * 100 / ((double) this.getToplamOgrenciSayisi() * 2))));
            System.out.println("DD: " + this
                    .yildizHesapla(
                            (int) Math
                                    .round((double) getNotDD() * 100 / ((double) this.getToplamOgrenciSayisi() * 2))));
        }
    }

    String yildizHesapla(int yildizCount) {
        String yildiz = "";
        for (int i = 0; i < yildizCount; i++) {
            yildiz += "*";
        }

        return yildiz;
    }

    void veriSifirla(DersIstatistik ders) {
        this.setNotAA(0);
        this.setNotBA(0);
        this.setNotBB(0);
        this.setNotCB(0);
        this.setNotCC(0);
        this.setNotDC(0);
        this.setNotDD(0);
        this.setToplamOgrenciSayisi(this);
    }

}
