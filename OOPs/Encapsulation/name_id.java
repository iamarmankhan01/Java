
class emp{
    private int id;
    private String name;
    public emp(){
        id =555;
        name="Arman khan";
       
    }
    // public emp(){
    //     id =44;
    //     name="Atif siddique";
    // }
    public String  getName(){
        return name;
        
    }
    public void setName (String n){
        name = n;
    }
    public void setId(int i){
        id= i;
    }
    public int getId(){
           return id;
    }
}
public class name_id  {
    public static void main (String args[]){
        emp arm =new emp();
    
        // arm.setName("ARMAN KHAN");
        System.out.println(arm.getName());
        // arm.setId(37);
         System.out.println(arm.getId());

    }
    
}
