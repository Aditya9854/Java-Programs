class Demo extends Thread
{
    public void run()
    {
        int i = 0;
        for(i =1; i < 10; i++)
        {
           System.out.println("Inside Thread : "+Thread.currentThread().getName()+" : "+i);
        }
    }
}
class ThreadDemo6
{
    public static void main(String A[]) throws Exception
    {
        System.out.println("Inside Main Thread");

        Demo obj1 = new Demo();
        Demo obj2 = new Demo();

        obj1.setName("First");
        obj2.setName("Second");

        obj1.start();
        obj2.start();

        obj1.join();
        obj2.join();
       
        System.out.println("End of main");

    }
}