class Task implements Runnable
{
    int number;

    public Task(int n) {
        this.number = n;
    }
    
    @Override
    public void run() {
        System.out.println(this.number);
    }
    
}