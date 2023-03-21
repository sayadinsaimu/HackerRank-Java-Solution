package Java_SingletonPattern;

public class Singleton {
	static Singleton instance = new Singleton();
	
	private Singleton() {
		
	}
	
	public String str;
	
	static Singleton getSingleInstance() {
		return instance;
	}


}
