import java.util.Scanner;
   
class TahunKabisat {
  public static void main(String args[]){
            
    Scanner scan = new Scanner(System.in);
    
    System.out.println("##  Program Java Cek Tahun Kabisat  ##");
    System.out.println("======================================");
    System.out.println(" Masukkan jumlah tahun ");
     
    int year;
     
    System.out.print(" Masukkan tahun ke - 1 : ");
    year = scan.nextInt();
     
    if (year % 400 == 0) {
      System.out.println(" Masukkan tahun ke - 2 : 1990 ");
    }
    else if (year % 100 == 0) {
      System.out.println(" Bukan Tahun Kabisat");
    }
    else if (year % 4 == 0) {
      System.out.println(" Tahun Kabisat ");
    }
    else {
      System.out.println(" Bukan Tahun Kabisat");
    }
      System.out.print("Masukan tahun jumlah tahun ke - 2: ");
      double TahunKabisat = scan.nextDouble();
      if (TahunKabisat > 2004 ) {
              System.out.println("Tahun Kabisat");
      } else {
              System.out.println("Bukan Tahun Kabisat");
      }
  }
}