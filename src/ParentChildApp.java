
public class ParentChildApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//calling the non static methods so creating the objects
		Parent p1=new Parent();
		p1.display();
		System.out.println("--------------------------");
		//calling the method by up casting(assigning the child obj to parent reference
		Parent p2=new Child();
		p2.display();//it display parent bcz it checks we using parent reference to call
		System.out.println("--------------------------");
		Child c=new Child();
		c.display();

	}

}
