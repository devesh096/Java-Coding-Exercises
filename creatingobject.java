class Box
{
private int length,breadth,height;
public void setDimension(int 1,int b,int h)
{ length=1; breadth=b; height=h; }

public void showDimension()
{
system.out.println("L="+length);
system.out.println("B="+breadth;
system.out.println("H="+height);
}
}
class example
{
public static void main()
{
Box smallBox=new Box();
smallBox.setDimension(12,10,5);
smallBox.showDimension();
}
}