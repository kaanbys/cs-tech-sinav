   
    import java.io.BufferedReader;
    import java.io.FileReader;
    import java.util.Scanner;
    
    
    public class satranc {
        
    public static int puan(String a){
        switch (a) {
            case "p":
                return 1;
            case "a":
                return 3;
            case "f":
                return 3;
            case "k":
                return 5;
            case "v":
                return 9;
            case "s":
                return 100;
            default:
                break;
        }
        return 0;
    }
        
    public static int [][] beyaz_at_tehdit(String [][] arr){//beyaz at tarafindan tehdit altinda olan siyah taslara 2 boyutlu bir matriste 1 degeri ataniyor.
        int [][] kontrolsiyah = new int[8][8];
        for (int i = 0; i < 8; i++){
            for (int j = 0 ;j < 8; j++){
                if ((i-2>=0)&&(j-1>=0)&&arr[i][j].equals("ab")&&(arr[i-2][j-1].substring(1,2).equals("s")))
                    kontrolsiyah[i-2][j-1] = 1;
                if ((i-2>=0)&&(j+1<8)&&arr[i][j].equals("ab")&&(arr[i-2][j+1].substring(1,2).equals("s")))
                    kontrolsiyah[i-2][j+1] = 1;
                if ((i-1>=0)&&(j-2>=0)&&arr[i][j].equals("ab")&&(arr[i-1][j-2].substring(1,2).equals("s")))
                    kontrolsiyah[i-1][j-2] = 1;
                if ((i-1>=0)&&(j+2<8)&&arr[i][j].equals("ab")&&(arr[i-1][j+2].substring(1,2).equals("s")))
                    kontrolsiyah[i-1][j+2] = 1;
                if ((j-2>=0)&&(i+1<8)&&arr[i][j].equals("ab")&&(arr[i+1][j-2].substring(1,2).equals("s")))
                    kontrolsiyah[i+1][j-2] = 1;
                if ((i+1<8)&&((j+2)<8)&&arr[i][j].equals("ab")&&(arr[i+1][j+2].substring(1,2).equals("s")))
                    kontrolsiyah[i+1][j+2] = 1;
                if ((j-1>=0)&&(i+2<8)&&arr[i][j].equals("ab")&&(arr[i+2][j-1].substring(1,2).equals("s")))
                    kontrolsiyah[i+2][j-1] = 1;
                if ((j+1<8)&&(i+2<8)&&arr[i][j].equals("ab")&&(arr[i+2][j+1].substring(1,2).equals("s")))
                    kontrolsiyah[i+2][j+1] = 1;
            }
        }
        return kontrolsiyah;
    }
    
    public static int [][] siyah_at_tehdit(String [][] arr){//siyah at tarafindan tehdit altinda olan beyaz taslara 2 boyutlu bir matriste 1 degeri ataniyor.
        int [][] kontrolbeyaz = new int[8][8];
        for (int i = 0; i < 8; i++){
            for (int j = 0 ;j < 8; j++){
                if ((i-2>0)&&(j-1>0)&&arr[i][j].equals("as")&&(arr[i-2][j-1].substring(1,2).equals("b")))
                    kontrolbeyaz[i-2][j-1] = 1;
                if ((i-2>0)&&(j+1<8)&&arr[i][j].equals("as")&&(arr[i-2][j+1].substring(1,2).equals("b")))
                    kontrolbeyaz[i-2][j+1] = 1;
                if ((j-2>=0)&&(j-1>0)&&arr[i][j].equals("as")&&(arr[i-1][j-2].substring(1,2).equals("b")))
                    kontrolbeyaz[i-1][j-2] = 1;
                if ((i-1>=0)&&(j+2<8)&&arr[i][j].equals("as")&&(arr[i-1][j+2].substring(1,2).equals("b")))
                    kontrolbeyaz[i-1][j+2] = 1;
                if ((j-2>=0)&&(i+1<8)&&arr[i][j].equals("as")&&(arr[i+1][j-2].substring(1,2).equals("b")))
                    kontrolbeyaz[i+1][j-2] = 1;
                if ((i+1<8)&&(j+2<8)&&arr[i][j].equals("as")&&(arr[i+1][j+2].substring(1,2).equals("b")))
                    kontrolbeyaz[i+1][j+2] = 1;
                if ((j-1>=0)&&(i+2<8)&&arr[i][j].equals("as")&&(arr[i+2][j-1].substring(1,2).equals("b")))
                    kontrolbeyaz[i+2][j-1] = 1;
                if ((j+1<8)&&(i+2<8)&&arr[i][j].equals("as")&&(arr[i+2][j+1].substring(1,2).equals("b")))
                    kontrolbeyaz[i+2][j+1] = 1;
            }
        }
        return kontrolbeyaz;
    }
    
    public static int [][] beyaz_fil_tehdit(String [][] arr){
        int [][] kontrolsiyah = new int[8][8];
        for (int i = 0; i < 8; i++){
            for (int j = 0; j < 8; j++){
                for (int x = 0; x < 8;  x++){
                        if ((i+x<8)&&(j+x<8)&&arr[i][j].equals("fb")&&arr[i+x][j+x].substring(1,2).equals("s")&&!arr[i+x][j+x].substring(1,2).equals("b")){
                            kontrolsiyah[i+x][i+x] = 1;
                            break;
                        }
                }
            }
        }
        for (int i = 0; i < 8; i++){
            for (int j = 0; j < 8; j++){
                for (int x = 0; x < 8;  x++){
                        if ((i-x>=0)&&(j-x>=0)&&arr[i][j].equals("fb")&&arr[i-x][j-x].substring(1,2).equals("s")&&!arr[i-x][j-x].substring(1,2).equals("b")){
                            kontrolsiyah[i-x][j-x] = 1;
                            break;
                        }
                }
            }
        }
        for (int i = 0; i < 8; i++){
            for (int j = 0; j < 8; j++){
                for (int x = 0; x < 8;  x++){
                        if ((i-x>=0)&&(j+x<8)&&arr[i][j].equals("fb")&&arr[i-x][j+x].substring(1,2).equals("s")&&!arr[i-x][j+x].substring(1,2).equals("b")){
                            kontrolsiyah[i-x][j+x] = 1;
                            break;
                        }
                }
            }
        }
        for (int i = 0; i < 8; i++){
            for (int j = 0; j < 8; j++){
                for (int x = 0; x < 8;  x++){
                        if ((i+x<8)&&(j-x>=0)&&arr[i][j].equals("fb")&&arr[i+x][j-x].substring(1,2).equals("s")&&!arr[i+x][j-x].substring(1,2).equals("b")){
                            kontrolsiyah[i-x][j+x] = 1;
                            break;
                        }
                }
            }
        }
        return kontrolsiyah;
    }
    
    public static int [][] siyah_fil_tehdit(String [][] arr){
        int [][] kontrolbeyaz = new int[8][8];
        for (int i = 0; i < 8; i++){
            for (int j = 0; j < 8; j++){
                for (int x = 0; x < 8;  x++){
                        if ((i+x<8)&&(j+x<8)&&arr[i][j].equals("fs")&&arr[i+x][j+x].substring(1,2).equals("b")&&!arr[i+x][j+x].substring(1,2).equals("s")){
                            kontrolbeyaz[i+x][i+x] = 1;
                            break;
                        }
                }
            }
        }
        for (int i = 0; i < 8; i++){
            for (int j = 0; j < 8; j++){
                for (int x = 0; x < 8;  x++){
                        if ((i-x>=0)&&(j-x>=0)&&arr[i][j].equals("fs")&&arr[i-x][j-x].substring(1,2).equals("b")&&!arr[i-x][j-x].substring(1,2).equals("b")){
                            kontrolbeyaz[i-x][j-x] = 1;
                            break;
                        }
                }
            }
        }
        for (int i = 0; i < 8; i++){
            for (int j = 0; j < 8; j++){
                for (int x = 0; x < 8;  x++){
                        if ((i-x>=0)&&(j+x<8)&&arr[i][j].equals("fs")&&arr[i-x][j+x].substring(1,2).equals("b")&&!arr[i-x][j+x].substring(1,2).equals("b")){
                            kontrolbeyaz[i-x][j+x] = 1;
                            break;
                        }
                }
            }
        }
        for (int i = 0; i < 8; i++){
            for (int j = 0; j < 8; j++){
                for (int x = 0; x < 8;  x++){
                        if ((i+x<8)&&(j-x>=0)&&arr[i][j].equals("fs")&&arr[i+x][j-x].substring(1,2).equals("b")&&!arr[i+x][j-x].substring(1,2).equals("b")){
                            kontrolbeyaz[i+x][j-x] = 1;
                            break;
                        }
                }
            }
        }
        return kontrolbeyaz;
    }
    
    public static void main(String[] args) throws Exception {
        
        int [][] siyah_kontrol_son = new int [8][8];
        int [][] beyaz_kontrol_son = new int [8][8];
        
        double beyaz_sonuc = 0d;
        double siyah_sonuc = 0d;
        
        Scanner scanner = new Scanner(new BufferedReader(new FileReader("C:/Users/kaan_/OneDrive/Masaüstü/cs-tech/Applicant Assesment Test_4_EK_AtFil/board3.txt")));
        
        int satir = 8;
        int sutun = 8;
        String [][] konum = new String[satir][sutun];
        while(scanner.hasNextLine()) {
            for (int i=0; i<konum.length; i++) {
                String[] line = scanner.nextLine().split(" ");
                System.arraycopy(line, 0, konum[i], 0, line.length);
            }
        }
        
        int siyah_kontrol [][] = beyaz_fil_tehdit(konum);
        int siyah_kontrol2 [][] = beyaz_at_tehdit(konum);
        
        for(int i = 0; i < 8; i++){
            for (int j = 0; j <8 ; j++){
                siyah_kontrol_son [i][j] = siyah_kontrol [i][j] + siyah_kontrol2 [i][j];
            }
        }
        
        int beyaz_kontrol [][] = siyah_fil_tehdit(konum);
        int beyaz_kontrol2 [][] = siyah_at_tehdit(konum);
        
        for(int i = 0; i < 8; i++){
            for (int j = 0; j <8 ; j++){
                beyaz_kontrol_son [i][j] = beyaz_kontrol [i][j] + beyaz_kontrol2 [i][j];
            }
        }
        
        for(int i = 0; i < 8; i++){
            for (int j = 0; j <8 ; j++){
                if (beyaz_kontrol_son[i][j] > 0 && konum[i][j].substring(1,2).equals("b"))
                    beyaz_sonuc += beyaz_kontrol_son[i][j]*puan(konum[i][j].substring(0,1))/2d;
                else if (beyaz_kontrol_son[i][j] == 0 && konum[i][j].substring(1,2).equals("b"))
                    beyaz_sonuc += puan(konum[i][j].substring(0,1));
            }
        }
        System.out.println("Beyaz: " + beyaz_sonuc);
        
        for(int i = 0; i < 8; i++){
            for (int j = 0; j <8 ; j++){
                if (siyah_kontrol_son[i][j] > 0 && konum[i][j].substring(1,2).equals("s"))
                    siyah_sonuc += siyah_kontrol_son[i][j]*puan(konum[i][j].substring(0,1))/2d;
                else if (siyah_kontrol_son[i][j] == 0 && konum[i][j].substring(1,2).equals("s"))
                    siyah_sonuc += puan(konum[i][j].substring(0,1));
            }
        }
        
        System.out.println("Siyah: " + siyah_sonuc);
   }
    
}
