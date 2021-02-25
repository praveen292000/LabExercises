class Ex6
{
    int i,n=5,sum1=0,sum2=0,diff=0;
    void calculateDifference()
    {
        for(i=1;i<=n;i++)
        {
            sum1=sum1+(i*i);
            sum2=sum2+i;
        }
        diff=sum1-(sum2*sum2);
        System.out.println("Difference: "+diff);
    }
}
class Exercise6
{
	public static void main(String[] args) {
	    Ex6 ex6=new Ex6();
	    ex6.calculateDifference();
	}
}