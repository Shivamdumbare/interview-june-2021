package exam;

public class ConvertToBinary {

  public String toBinary(final int n) {
    //TODO write your code here to achieve the desired result as explained in Readme file for this problem.
    try
    {
      int n = integer.parselnt(br.readLine());
      if(n<0)
        throw new MyException("Number is negative doesn't support binary");
      else
      {
        for (int i=31; i>=0; i--)
        {
          int k=n>>i;
          if(k & 1)
            cout<<"1";
          else
            cout<<"0";
        }
      }
      catch(MyException m )
      {
        System.out.printn(m);
      }
          return "";
  }
}
}
