public class TV 
{
	int on=0;
	int channel_no=1;
	int volume=100;
	String name="MI Smart TV";
	
	public void on()
	{
		on=0;
		System.out.println("TV Is Now On");
	}
	
	public void off()
	{
		on=1;
		System.out.println("TV Is Now Off");
	}
	
	public void next_channel()
	{
		channel_no++;
		System.out.println("The Channel is:"+channel_no);
	}
	
	public void previous_channel()
	{
		channel_no--;
		System.out.println("The Channel is:"+channel_no);
	}
	
	public void increaseVolume()
	{
		volume++;
		System.out.println("The Volume is:"+volume);
	}
	
	public void decreaseVolume()
	{
		volume--;
		System.out.println("The Volume is:"+volume);
	}
}
