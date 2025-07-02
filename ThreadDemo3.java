class Demo implements Runnable
{
    public void run()
    {
        System.out.println("inside Thread");
    }

}
class ThreadDemo3
{
    public static void main(String A[])
    {
        System.out.println("Inside main");
       
        Demo dobj = new Demo();
        Thread tobj = new Thread(dobj);

        tobj.start();

        System.out.println("End of Main");
    }
}