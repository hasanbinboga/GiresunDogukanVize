public class DersIstatistik {
    int notAA;
    int notBA;
    int notBB;
    int notBC;
    int notCB;
    int notCC;
    int notDD;
    int toplamOgrenciSayisi;

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
        this.toplamOgrenciSayisi = ders.notAA + ders.notBA;
    }

    int getNotAA() {
        return this.notAA;
    }

    int getNotBA() {
        return this.notBA;
    }

    int getToplamOgrenciSayisi(){
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
        System.out.println("AA alan öğrenci sayısını giriniz: ");
        
    }

    void metinselIstatistikYazdir(DersIstatistik ders) {

    }

    void grafikselIstatistikYazdir(DersIstatistik ders) {

    }

    void veriSifirla(DersIstatistik ders) {

    }

}
