package strategy;

public class Sub implements Strategy{

	@Override
	public int doOperation(int a, int b) {
		// TODO Auto-generated method stub
		if(a>b) {
			return a-b;
		}else
		{
			return b-a;
		}
	}

}
