class Employee {
   	int salary;
   	Employee(int salary){
      		this.salary = salary;
  	 }
}
public class Neelesh {
	public static void main(String []args){
   		Employee em1 = new Employee(100);
   		Employee em2 = new Employee(100);
   
   		System.out.println(em1 ==em2);  
   		System.out.println(em1.equals(em2));      
	}
}
