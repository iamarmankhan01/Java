class cellphone{
    String ringing;
    String vibrating;
    public void ringing(){
        System.out.println("Cellphone are ringing");
    }
    public void vibrating(){
        System.out.println("Cellphone are vibrating mode ");
    }

}
public class Cphone {
    public static void main (String args[]){
        cellphone apple = new cellphone();
        apple.vibrating();
        apple.ringing();
       

    }
} 
     