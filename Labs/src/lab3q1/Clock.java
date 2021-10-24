package lab3q1;
import java.util.Calendar;

public class Clock {
	
	public static void main (String args[])
	{
		Calendar cal = Calendar.getInstance();
		Time t = new Time (cal.get(Calendar.HOUR_OF_DAY), cal.get(Calendar.MINUTE));
		
		//System.out.print(t.toString());
			
		long current = System.currentTimeMillis();
		
			
		do{
			long current2 = System.currentTimeMillis();
			
			if(current2 - current < 1000)
			{
				t.tick();
				System.out.println(t.toString());
				current = current2;
			}
		}while(t.getSecond() !=0);
			
			
			
			
			
			
			
		/*do
		{
				long current2 = System.currentTimeMillis();
				
				if(current2 - current > 1000)
				{
					t.tick();
					System.out.println(t.toString());
					current = current2;
				}
		}
		while(t.getSecond() !=0);*/
		
		
	}
}
