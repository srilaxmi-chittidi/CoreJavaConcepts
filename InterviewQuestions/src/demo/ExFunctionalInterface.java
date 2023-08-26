package demo;

public class ExFunctionalInterface {

	public static void main(String[] args) {
		MyClass obj = new MyClass();
        obj.parentMethod(); // Output: Parent method implementation
        obj.childMethod(); // Output: Child method implementation
	}

}
@FunctionalInterface
interface ParentInterface {
    void parentMethod();
}

@FunctionalInterface
interface ChildInterface  {
    void childMethod();
}

class MyClass implements ChildInterface {
    public void parentMethod() {
        System.out.println("Parent method implementation");
    }

    public void childMethod() {
        System.out.println("Child method implementation");
    }
}


