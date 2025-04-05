package Javase8_9features;
//reference to a constructor.....
interface Hello
{
	Message sayhello(String msg);
}
class Message
{
	Message(String msg)
	{
	System.out.println(msg);
	}
}
public class Pro105 {

	public static void main(String[] args) {
		Hello h=Message::new;
		//Message m=new Message("ss");
		h.sayhello("welcome in itvedant");

	}

}
