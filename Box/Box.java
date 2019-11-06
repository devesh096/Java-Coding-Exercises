class Example
{
	private int length;
	private int breath;
	private int height;

	public void setDimention(int x,int y,int z)
	{
		length=x;breath=y;height=z;
	}
	public void showDimension()
	{
		System.out.println("length ="+length);
		System.out.println("breath ="+breath);
		System.out.println("height ="+height);
	}
}

class Box
{
	
public static void main(String[] args)
{
Example b1 = new Example();
b1.setDimention(12,18,15);
b1.showDimension();

}

}