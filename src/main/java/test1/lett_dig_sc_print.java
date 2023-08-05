package test1;
public class lett_dig_sc_print 
{

	public static void main(String[] args) throws Exception
	{
        String str = "yuh67dfd56$kfr@y9";
		char ch1;
		
        for(int i=str.length()-1; i>=0; i--)
        {
        	ch1= str.charAt(i);
        	
        	if(Character.isDigit(ch1))
        			{
        		System.out.println(ch1 + " is a number");
        			}
        	else if(Character.isAlphabetic(ch1))
        	  {
        		System.out.println(ch1 + " is an alphabet");
        	  }
        	else
        	{
        		System.out.println(ch1 + " is a special character");	
        	}
        }
	}

}
