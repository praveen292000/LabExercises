class Exercise7 {
 boolean checkNumber(int n)
 {
  int digit=n%10;
  n=n/10;
  while(n>0)
  {
   if(digit<=n%10)
   {
    return false;
   }
   digit=n%10;
   n=n/10;
  }
  return true;
}

public static void main(String[] args)
{
 Exercise7 ex7=new Exercise7();
 System.out.println(ex7.checkNumber(134468));
}
}
