
import javax.swing.JPanel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Oğuzhan
 */
public class Basketbolcu extends JPanel{
    
     int kullanim;
    int kullanim2;
    String basketbolcuID;
    String basketbolcuAdi;
    String basketbolcuTip;
    int guc1;
    int guc2;
    int guc3;
    boolean kullanildimi=false;
    boolean k;
    public Basketbolcu(){
        
    }
    
    
    public Basketbolcu(String basketbolcuAdi,String basketbolcuTip,int guc1,int guc2,int guc3){
        this.kullanim=0;
        this.kullanim2=0;
        this.basketbolcuID=basketbolcuID;
        this.basketbolcuAdi=basketbolcuAdi;
        this.basketbolcuTip=basketbolcuTip;
        this.guc1=guc1;
        this.guc2=guc2;
        this.guc3=guc3;
    }
    public void setKullanim(){
        this.kullanim=1;
    }

    public int getKullanim() {
        return this.kullanim;
    }

    public int getGuc(){
        return this.guc1;
    }
    
    private String dosyayolu;
    public String getDosyayolu(){
        return dosyayolu;
    }

    public String getFutbolcuID() {
        return this.basketbolcuID;
    }

    public void setBasketbolcuID(String basketbolcuID) {
        this.basketbolcuID = basketbolcuID;
    }

    public String getBasketbolcuAdi() {
        return this.basketbolcuAdi;
    }

    public void setBasketbolcuAdi(String basketbolcuAdi) {
        this.basketbolcuAdi = basketbolcuAdi;
    }

    public String getBasketbolcuTip() {
        return this.basketbolcuTip;
    }

    public void setBasketbolcuTip(String basketbolcuTip) {
        this.basketbolcuTip = basketbolcuTip;
    }
    
    
    public void showInfos(){
      
        System.out.println(""+getBasketbolcuAdi());
        System.out.println(""+getBasketbolcuTip());
    }
   
    public void hasarPuaniGoster(){
        System.out.println(""+this.guc1+""+this.guc2+""+this.guc3);
    }
    
    public boolean kullanildiMi(int x){
        if(x==1){
            System.out.println("kullanildi");
            return true;
        }else{
            return false;
        }
    }
    
    public boolean kullanildiMi2(int x){
        if(x==1){
            System.out.println("kullanildi");
            return true;
        }else{
            return false;
        }
    }
    
    public void setKullanim2(){
        this.kullanim2=1;
    }

    public int getKullanim2() {
        return this.kullanim2;
    }
    
    void setDosyayolu(String dosyayolu){
        this.dosyayolu=dosyayolu;
    }

    void kullanildimi(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
