class Ex5
{
    int i,n=10,sum=0;
    void calculateSum()
    {
        for(i=1;i<=n;i++)
        {
            if(i%3==0 || i%5==0)
            {
                sum=sum+i;
            }
        }
        System.out.println("Sum:"+sum);
    }
}
class Exercise5
{
	public static void main(String[] args) {
	    Ex5 ex5=new Ex5();
	    ex5.calculateSum();
	}
}