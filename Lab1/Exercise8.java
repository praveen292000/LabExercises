class Ex8
{
    int i,n=7;
    boolean checkNumber()
    {
        for(i=0;i<n;i++)
        {
            if((2*i)==n)
            {
                return true;
            }
        }return false;
    }
}
class Exercise8
{
	public static void main(String[] args) {
	    Ex8 ex8=new Ex8();
	    System.out.println(ex8.checkNumber());
	}
}