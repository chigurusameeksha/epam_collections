package Collections;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
             CustomList<String> list = new CustomList<String>();
             list.add("Hey Hi");
             list.add("I am");
             list.add("Sameeksha");
             list.add("Chiguru");
             
             
             System.out.println("My List is: "+list.toString());
             list.delete(0);
             System.out.println("After Deleting List is: "+list.toString());

             
            	 
             
	}

}