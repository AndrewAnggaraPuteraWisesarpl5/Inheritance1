/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas.pratikum.pkg2;

/**
 *
 * @author Angga
 */
public class NamaKota extends Covid {
    public String tanggal;
    public String Kota1;
    public String Kota2;
    public String Kota3;        
    public String Kota4;
    public String Kota5;
    public int TotalksspositivKota1;
    public int TotalksspositivKota2;
    public int TotalksspositivKota3;
    public int TotalksspositivKota4;
    public int TotalksspositivKota5;
    //overiding
    public void namaKota(){
    System.out.println("tanggal kejadian "+tanggal);
    System.out.println("Nama Kota 1 "+Kota1);
    System.out.println("Nama Kota 2 "+Kota2);
    System.out.println("Nama Kota 3 "+Kota3);
    System.out.println("Nama Kota 4 "+Kota4);
    System.out.println("Nama Kota 5 "+Kota5);
    
    }
public void JumlahKasus(){
    
System.out.println(""+super.bidang);
}
//overloading
        
public int totalkss1(int TotalkasuspostivKota1){
    this.TotalksspositivKota1=TotalksspositivKota1;
    return TotalkasuspostivKota1;
}
public int totalkss2(int TotalkasuspostivKota2){
    this.TotalksspositivKota2=TotalksspositivKota2;
    return TotalkasuspostivKota2;
}
public int totalkss3(int TotalkasuspostivKota3){
    this.TotalksspositivKota3=TotalksspositivKota3;
    return TotalkasuspostivKota3;
}
public int totalkss4(int TotalkasuspostivKota4){
    this.TotalksspositivKota4=TotalksspositivKota4;
    return TotalkasuspostivKota4;
}
public int totalkss5(int TotalkasuspostivKota5){
    this.TotalksspositivKota5=TotalksspositivKota5;
    return TotalkasuspostivKota5;
}
}
  
