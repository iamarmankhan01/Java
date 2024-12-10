class Phone {
    public void on(){
        System.out.println("The Phone is Turnig on");
    }
    public void showTime(){
        System.out.println("Time is 10:30 am");
    }
}
class SmartPhone extends Phone{
    public void music(){
        System.out.println("On the music of the phone");
    }
    public void onPhone(){
        System.out.println("ON the Smart Phone ");
    }
}

public class Dynamic_method_Dispatch {
    public static void main (String args[]){
        Phone redmi = new SmartPhone();
        redmi.showTime();
        redmi.on();
        SmartPhone obj = new SmartPhone();
        obj.music();
    }
    
}
