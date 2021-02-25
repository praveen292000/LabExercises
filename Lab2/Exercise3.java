class Exercise3
{
    void getSorted(int arr[],int l)
    {   
        int j=l;
        int b[]=new int[l];
        for(int i=0;i<l;i++)
        {
            b[j-1]=arr[i];
            j=j-1;
        }
        
        for(int i=0;i<b.length;i++)
        {
            for(int m=i+1;m<b.length;m++)
            {
                int temp=0;
                if(b[i]>b[m])
                {
                    temp=b[i];
                    b[i]=b[m];
                    b[m]=temp;
                }
            }
        }
        for(int k=0;k<b.length;k++)
        {
            System.out.println(b[k]);
        }
        
    }
    public static void main(String[] args)
    {
        int array[]=new int[]{10,30,40,20,50};
        
        Exercise3 ex3=new Exercise3();
        ex3.getSorted(array,array.length);
    }
}