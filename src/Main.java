import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int n1, n2, select;

        Scanner inp = new Scanner(System.in);

        System.out.print("Ilk sayiyi giriniz : ");
        n1 = inp.nextInt();

        System.out.print("Ikinci sayiyi giriniz : ");
        n2 = inp.nextInt();

        System.out.println("toplama icin 1");
        System.out.println("cikarma icin 2");
        System.out.println("carpma icin 3");
        System.out.println("bolme icin 4'e basiniz.");
        System.out.print("Secim : ");
        select = inp.nextInt();

        if (select == 1){
            System.out.println("Sonuc = " + (n1 + n2));
        }else if (select == 2){
            System.out.println("Sonuc = " + (n1 - n2));
        }else if (select == 3){
            System.out.println("Sonuc = " + (n1 * n2));
        }else if (select == 4){
            System.out.println("Sonuc = " + n1 / n2);
        }else {
            System.out.println("Hatali giris yaptiniz.");
        }


    }
}