import java.util.Scanner;

/**
 * Öğrenci No: 220706052
 * Adı Soyadı: Doğukan Önder
 */
public class MainClass {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    DersIstatistik dersIstatistik = new DersIstatistik(10, 10, 0, 0, 0, 0, 0, 0);
    dersIstatistik.baslikYazdir();
    dersIstatistik.menuYazdir();
    int seciliIslem = 0;

    do {
      System.out.println("İşlem seçiniz: ");
      seciliIslem = sc.nextInt();
      System.out.println("--------------------");
      if (seciliIslem > 5) {
        System.out.println("UYARI: İşlem yapabilmek için 1 ile 5 arasında bir sayı seçilmelidir!\n");
        System.out.println("Devam etmek için bir tuşa ve sonrasında ENTER tuşuna basınız:");
        sc.next();
      } else {
        switch (seciliIslem) {
          case 1:
            dersIstatistik.notSayisiGir(dersIstatistik);
            break;
          case 2:
            dersIstatistik.metinselIstatistikYazdir(dersIstatistik);
            break;
          case 3:
            dersIstatistik.grafikselIstatistikYazdir(dersIstatistik);
            break;
          case 4:
            dersIstatistik.veriSifirla(dersIstatistik);
            break;
        }
      }
    } while (seciliIslem != 5);
  }
}