public class ConRec {

 	ConRec(){
			
			this(10);
			// in one constructor we can create one this()
			
			
		}
		ConRec(int a){
			
			
		}
ConRec(String s){
			
			
		}

	static int	n(){
		return m();
	}
	static int m() {
		return n();
	}
	public static void main(String[] args) 
	{
		//m();
	}
}

