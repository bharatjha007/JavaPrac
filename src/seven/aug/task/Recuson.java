package seven.aug.task;

public class Recuson {
	 static int i=1;
	public static void main(String[] args) {
		
		recusr();
		
	}
	public static void recusr()
	{
		System.out.print(" "+"Yahoooooooo");
		i++;
		if(i<=10)
		{
			recusr();
		}
		else 
			return;
	}
}
