class Exercise1
{
    int getSecondSmallest(int arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                int temp=0;
                if(arr[i]>arr[j])
                {
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        return arr[1];
    }
    public static void main(String[] args)
    {
        int array[]=new int[]{10,20,30,40,50};
        
        Exercise1 ex1=new Exercise1();
        int r=ex1.getSecondSmallest(array);
        System.out.println(r);
    }
}