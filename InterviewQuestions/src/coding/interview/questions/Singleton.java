package coding.interview.questions;

public class Singleton {

	public static void main(String[] args) {
		SingletonEx ex1 = SingletonEx.getInstance();
		SingletonEx ex2 = SingletonEx.getInstance();
		System.out.println(ex1.hashCode()+" "+ex2.hashCode());
		System.out.println(ex1.equals(ex2));
		System.out.println(ex1==ex2);
	}
}

class SingletonEx{
	private SingletonEx() {}
	private static SingletonEx singleton;
	public static SingletonEx getInstance() {
		if(singleton ==null) {
			synchronized(SingletonEx.class) {
				if(singleton ==null) {
					singleton = new SingletonEx();
				}
			}
		}
		return singleton;
		
	}
	
}
