class Prime implements Runnable{

	@Override
	public void run() {
		
		for(int i=1;i<10;i++){
			
			if(i==2||i==3||i==5||i==7)
				
			try {
			Thread.sleep(1000);
			System.out.println(i + "" + "is a " + " prime number");
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}	
				
			}
		
	
	}
}
	class NonPrime implements Runnable{
		@Override
		public void run() {
			
			for(int i=1;i<10;i++){
				
				if(i==4||i==6||i==8||i==9||i==10)
					
				try {
				Thread.sleep(1000);
				System.out.println(i +"" + "is a " + "non prime number");
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
					
		}
			
	}
}


class PrimeTest {
	public static void main(String[] args) {

	
	Prime  p=new Prime();
	NonPrime np=new NonPrime();
	
	Thread t=new Thread(p);
	Thread t2=new Thread(np);
	t.start();
	t2.start();
	
}
}
