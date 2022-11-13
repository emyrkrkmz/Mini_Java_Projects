public class idman{
    
    private int Burpee;
    private int Pushup;
    private int Situp;
    private int Squad;

    public idman(int Burpee, int Pushup, int Situp, int Sqaud){
        this.Burpee = Burpee;
        this.Pushup = Pushup;
        this.Situp = Situp;
        this.Squad = Squad;

    }

    public void hareketYap(String hareket, int sayi){
        if(hareket.equals("Burpee")){
            BurpeeYap(sayi);
        }
        else if(hareket.equals("Pushup")){
            PushupYap(sayi);
        }
        else if(hareket.equals("Situp")){
            SitupYap(sayi);
        }
        else if(hareket.equals("Squad")){
            SquadYap(sayi);
        }
        else{
            System.out.println("Geçersiz hareket...");
        }

    }
    public void SitupYap(int x){
        if(this.Situp == 0){
            System.out.println("Yapacak situp kalmadı.");
        }
        if(x > Situp){
            System.out.println("Hedeflediğin situp sayısını geçtin tebrikler.");
            this.Situp = 0;
            System.out.println("Kalan situp: " + Situp);
        }
        else{
            Situp -= x;
            System.out.println("Kalan situp: " + Situp);
        }
    }

    public void SquadYap(int x){
        if(this.Squad == 0){
            System.out.println("Yapacak squad kalmadı.");
        }
        if(x > Squad){
            System.out.println("Hedeflediğin  sayısını geçtin tebrikler.");
            this.Squad = 0;
            System.out.println("Kalan squad: " + Squad);
        }
        else{
            Squad -= x;
            System.out.println("Kalan squad: " + Squad);
        }
    }

    public void BurpeeYap(int x){
        if(this.Burpee == 0){
            System.out.println("Yapacak burpee kalmadı.");
        }
        if(x > Burpee){
            System.out.println("Hedeflediğin burpee sayısını geçtin tebrikler.");
            this.Burpee = 0;
            System.out.println("Kalan burpee: " + Burpee);
        }
        else{
            Burpee -= x;
            System.out.println("Kalan burpee: " + Burpee);
        }
    }

    public void PushupYap(int x){
        if(this.Pushup == 0){
            System.out.println("Yapacak pushup kalmadı.");
        }
        if(x > Pushup){
            System.out.println("Hedeflediğin pushup sayısını geçtin tebrikler.");
            this.Pushup = 0;
            System.out.println("Kalan pushup: " + Pushup);
        }
        else{
            Pushup -= x;
            System.out.println("Kalan pushup: " + Pushup);
        }
    }


    public int getBurpee() {
        return Burpee;
    }
    public void setBurpee(int x){
        this.Burpee = x;
    }

    public int getPushup(){
        return Pushup;
    }
    public void setPushup(int x){
        this.Pushup = x;
    }

    public int getSitup(){
        return Situp;
    }
    public void setSitup(int x){
        this.Situp = x;
    }

    public int getSquad(){
        return Squad;
    }
    public void setSquad(int x){
        this.Squad = x;
    }

    public boolean idmanbitti(){
        return (Burpee == 0) && (Pushup == 0) && (Situp == 0) && (Squad == 0);
    }
}