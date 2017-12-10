package session3assignments; //Package declaration

/**
 * This class shows the use of super and this keyword with a constructor,
 * methods, variables.
 *
 */
public class SuperThis {
	String super_variable = "Super Variable"; // Declaration & Initialization of super variable
	String this_variable_1 = "This Variable One"; // Declaration & Initialization of this variable
	String this_variable_2 = "This Variable Two"; // Declaration & Initialization of this variable

	SuperThis() // Default Constructor
	{
		System.out.println(
				"SuperThis Constructor can be accessed via super keyword in child class and this keyword in the same class");
	} // End of SuperThis

	public void super_method() // Method to be accessed using super keyword
	{
		System.out.println("Super Method");
	}// End of super_method

	SuperThis(String this_variable_1, String this_variable_2) // Parameterized Constructor
	{
		this(); // SuperThis default constructor accessed using this keyword
		this.this_variable_1 = this_variable_1; // Avoiding naming conflict of variables using this keyword
		this.this_variable_2 = this_variable_2; // Avoiding naming conflict of variables using this keyword
	} // End of SuperThis(String,String) constructor

	public void this_display_variable() // This method to be accessed using this keyword via another method
	{
		System.out.println();
		System.out.println("This method is called using this keyword");
		System.out.println();
		System.out.println("Displaying the variables accessed using this keyword:");
		System.out.println(this.this_variable_1 + " " + this.this_variable_2); // variable access using this keyword

	}// End of this_display_variable method

	void this_method() // this method to be demonstrate this keyword
	{
		this.this_display_variable(); // this_display_variable method accessed using this keyword
	} // End of this_method

	public static void main(String[] args) // Main method
	{
		System.out.println("Calling default constructor using this keyword:");

		// Object creation & passing arguments to parameterized constructor
		SuperThis parent_class_object = new SuperThis("this", "keyword");

		parent_class_object.this_method(); // call to method using this keyword
	} // End of main method
} // End of class
