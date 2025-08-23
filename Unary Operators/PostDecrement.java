public class PostDecrement {
    public static void main(String[] args) {
       
/*        int i=10;				
		int j = i-- + i--;		
		System.out.println(i);
		System.out.println(j);
      */  
//================================================
        int i=10;			
		int j = i-- + i++ + i-- + i--;	
		System.out.println(i);
		System.out.println(j);
    }
}
