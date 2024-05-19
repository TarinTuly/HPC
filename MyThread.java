class MyThread implements Runnable{
   public void run(){
    for(int i=1;i<=10;i++){
        System.out.println("value of i is"+i);
    }
   } 
   public static void main(String[] args){
     MyThread t=new MyThread();
     Thread th=new Thread(t);
     AnotherThread t1=new AnotherThread();
     th.start();
     t1.start();

   }
}