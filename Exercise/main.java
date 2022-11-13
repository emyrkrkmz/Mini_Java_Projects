import java.util.Scanner;

public class main {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        System.out.println("Programa Hoşgeldiniz");
        System.out.println("----------------------------");
        String idmanlar = "Geçerli Hareketler...\n"
        + "Burpee\n"
        +"Pushup(Şınav)\n"
        +"Situp(Mekik)\n"
        +"Squat";
        System.out.println(idmanlar);
        System.out.println("----------------------------");

        System.out.println("Bir idman oluşturun...");

        System.out.print("Burpee Sayısı : ") ;
        int burpee = s.nextInt();
        System.out.print("Pushup Sayısı : ") ;
        int pushup = s.nextInt();
        System.out.print("Situp Sayısı : ") ;
        int situp = s.nextInt();
        System.out.print("Squat Sayısı : ") ;
        int squad = s.nextInt();
        
        s.nextLine();

        idman i = new idman(burpee, pushup, situp, squad);

        System.out.println("Idmanınız başlıyor...");

        while (i.idmanbitti() == false){
            
            System.out.print("Hareket Türü(Burpee,Pushup,Situp,Squad) : ");
            String tur = s.nextLine();
            System.out.print("Bu hareketten kaç tane yapacaksınız ? : ");
            int sayi = s.nextInt();
            s.nextLine();
            i.hareketYap(tur, sayi);
            
            
            
        }
        System.out.println("Idmanını başarıyla bitirdin....");
    }
    
}
