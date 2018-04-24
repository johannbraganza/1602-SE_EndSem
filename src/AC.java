
public class AC {

	int on=1;
	int initial_temp=28;
	String name="Haier AC";
	
	public void on()
	{
		on=0;
		System.out.println("The AC is Now On");
	}
	
	public void off()
	{
		on=1;
		System.out.println("The AC is Now Off");
	}
	
	public void increaseTemp()
	{
		initial_temp++;
		System.out.println("The Temperature is:"+initial_temp);
		
	}
	
	public void decreaseTemp()
	{
		initial_temp--;
		System.out.println("The Temperature is:"+initial_temp);
		
	}
	
	
}
