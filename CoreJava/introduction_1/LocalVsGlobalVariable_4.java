
package introduction_1;


/*Class Variables / Global Variables :
These are variables declared inside a class but outside any method. 
Java automatically initializes them with default values if you don’t assign one.

Local Variables (Declared in Methods)
Java does not assign default values to local variables. 
You must initialize them before using, otherwise the compiler throws an error.
*/



public class LocalVsGlobalVariable_4 {

 //Class Variables / Global Variables  
	int age= 25;
	String name ="Abhishek"; 

	public static void main(String[] args) {
		//Local Variable 
		int i =10;

		System.out.println(i ); //This will print 10
		System.out.println("Calling Sum() Function");
		sum(); //This will call the sum() function

		LocalVsGlobalVariable_4 L =new LocalVsGlobalVariable_4(); // To access class/global variable we need to create 
		// the object of that class and call via '.' operator

		System.out.println(L.age);
		System.out.println(L.name);

	}

	public static void sum() {
		//Local Variables
		int i=100;
		int j=20;
		/////int age=1000;


		System.out.println(i); ////This will print 100
		System.out.println(j);//This will print 20
		//System.out.println();

		LocalVsGlobalVariable_4 L =new LocalVsGlobalVariable_4();
		System.out.println(L.age);
		System.out.println(L.name);

	}

}
