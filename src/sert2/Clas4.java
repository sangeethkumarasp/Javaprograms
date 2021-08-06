package sert2;

public class Clas4 {
	int a;
	int b;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Clas4 c=new Clas4();
c.a=60;
c.b=70;
c.swap(c);
System.out.println(c.a+""+c.b);


	}
	
	public void swap(Clas4 t)
	{
		int e;
		e=t.a;//60
		t.a=t.b;//70
		t.b=e;//60		
		
		
	}

}
