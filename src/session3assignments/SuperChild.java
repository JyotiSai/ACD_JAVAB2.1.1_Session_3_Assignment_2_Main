package session3assignments; //Package declaration

/**
 * This is the child class of of parent class SuperThis.
 *
 */
public class SuperChild extends SuperThis {
	public SuperChild() // Default constructor of child class
	{
		super(); // call to Parent class constructor using super keyword
	} // End of SuperParentChild

	/**
	 * Method to demonstrate access of parent class variable and method super
	 * keyword
	 */
	public void print_super() {
		System.out.println();
		System.out.println("Displaying the parent variable accessed using super keyword:");
		System.out.println(super.super_variable); // Accessing parent class variable using super keyword
		System.out.println();
		System.out.println("This method is called using super keyword:");
		super.super_method(); // Accessing parent class method using super keyword
	} // End of print_super method

	public static void main(String[] args) // main method
	{
		System.out.println("Calling default constructor using super keyword:");
		SuperChild child_class_object = new SuperChild(); // Object creation of child class SuperParentChild
		child_class_object.print_super(); // Call to print_super method to print the output
	} // End of main method
} // End of class SuperThis
