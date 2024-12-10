/* Semaphore Example->
Here Semaphore class in concurrent package is used as a pool that can be acuired and released, very much like lock but with a difference. When a thread acquires a lock not other thread can enter the synchronise block.
1. Here in Semaphore we can define the poolsize and threads can acuire locks till there is resource left in the pool. Lets see how it works.
The organization needs to recruit 4 Java developers. HR Manager asks 4 Tech Leads to conduct test and recruit the canditates. The problem here is that the Tech Leads have only 2 test paper and the photo copy machine is down. That means at a time only two candidates can give the test and other 2 have to wait.
-Lets simulate this by Semaphore example.
*/

import java.util.concurrent.Semaphore;
public class HRManagerSemaphore {
    public static void main(String[] args) {
        Semaphore questionPaperPool = new Semaphore(2);
        TechLead techLead1= new TechLead(questionPaperPool,"Arman Khan");
        TechLead techLead2= new TechLead(questionPaperPool,"Atif ");
        TechLead techLead3= new TechLead(questionPaperPool,"Arif");
        TechLead techLead4= new TechLead(questionPaperPool,"Arsad");

        techLead1.start();
        techLead2.start();
        techLead3.start();
        techLead4.start();

        System.out.println("No Work for HR Manager");
    }
}
class TechLead extends Thread{
    Semaphore questionPaperPool;
    public TechLead(Semaphore questionPaperPool,String name){
        super(name);
        this.questionPaperPool =questionPaperPool;
    }
    public void run(){
        try{
            System.out.println(Thread.currentThread().getName()+" Waiting for question paper");

            //Acquiring one question paper
            questionPaperPool.acquire();
            System.out.println(Thread.currentThread().getName()+" Acquired test paper");
            System.out.println(Thread.currentThread().getName()+" Conducting");
            Thread.sleep(3000);
            //Giving back the acquired question paper
            questionPaperPool.release();
        }
        catch(InterruptedException e){
            e.printStackTrace();
        }
    }
}


/*The above class represent Tech Lead. The Tech Lead here needs test paper to conduct the test. For this it calls questionPaperPool acquire() if any test paper is available it will acquire the test paper and conduct the test and only release the test paper when test is completed by calling questionPaperPool. release ().
Other Tech Leads will wait on calling questionPaperPool acquire() if no test papers are available. */