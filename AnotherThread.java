class AnotherThread extends Thread{
   public void run(){
    for(int i=10;i>=0;i--){
        System.out.println("Another i is = "+i);
    }
   } 
}