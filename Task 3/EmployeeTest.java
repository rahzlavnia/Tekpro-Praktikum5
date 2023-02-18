
public class EmployeeTest {
	public static void main(String[] args) {
		 int i;

  		 Employee[] staff = new Employee[3];
		 staff[0] = new Employee("Antonio Rossi", 2000000, 1, 10, 1989);
		 staff[1] = new Employee("Maria Bianchi", 2500000, 1, 12, 1991);
		 staff[2] = new Employee("Isabel Vidal", 3000000, 1, 11, 1993);
		 Sortable.shell_sort(staff);		 
		 for (i = 0; i < 3; i++) 
			 staff[i].raiseSalary(5);
		 System.out.println("    Name\t" + " Salary\t" + "\tHire Year\tHire Month\tHire Day");
		 for (i = 0; i < 3; i++) 
			 staff[i].print();
		 
		 Employee[] staff2 = new Employee[3];
		 System.out.println("\n");
		 staff2[0] = new Employee("Antonio Rossi", 2000000, 1, 10, 1989);
		 staff2[1] = new Employee("Maria Bianchi", 2500000, 1, 12, 1991);
		 staff2[2] = new Employee("Isabel Vidal", 1500000, 1, 11, 1993);
		 Sortable.shell_sort(staff2);		 
		 for (i = 0; i < 3; i++) 
			 staff2[i].raiseSalary(5);
		 System.out.println("    Name\t" + " Salary\t" + "\tHire Year\tHire Month\tHire Day");
		 for (i = 0; i < 3; i++) 
			 staff2[i].print();
		
	}

}
