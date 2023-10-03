import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.Scanner;

class UpperBoundWildCard <T extends Number>{
	private List<T> numbers = new ArrayList<>();
	public void add(T number){
		numbers.add(number);
		}
	public List<T> getNumbers(){
		return numbers;
		}
	}
public class lab8{
	public static <T extends Number> double sum(List <T> numbers){
	double total = 0.0;
	for(T number: numbers){
	total+= number.doubleValue();
	}
	return total;
	}
	public static <T extends Comparable <T>> void sort (List <T> list){
		Collections.sort(list);
	}
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		UpperBoundWildCard<Integer> intList = new UpperBoundWildCard<>();
		UpperBoundWildCard<Double> doubleList = new UpperBoundWildCard<>();
		while(true){
		System.out.println("Menu");
		System.out.println("1. Insert Integer");
		System.out.println("2. Insert Double");
		System.out.println("3. Sum Integer");
		System.out.println("4. Sum Double");
		System.out.println("5. Sort Integer");
		System.out.println("6. Sort Double");
		
		int choice = scan.nextInt();
		switch(choice){
			case 1:
				System.out.print("Enter the integer:- ");
				int intInput = scan.nextInt();
				intList.add(intInput);
				break;
			case 2: 
				System.out.print("Enter the Double type integer:- ");
				double doubleInput = scan.nextInt();
				doubleList.add(doubleInput);
				break;
			case 3:
				System.out.println("Sum of Integer: " + sum(intList.getNumbers()));
				break;
			case 4:
				System.out.println("Sum of Double:- " + sum(doubleList.getNumbers()));
				break;
			case 5:
				sort(intList.getNumbers());
				System.out.println("Sorted Numbers: " + intList.getNumbers());
				break;
			case 6:
				sort(doubleList.getNumbers());
				System.out.println("Sorted Double:- " + doubleList.getNumbers());
				break;
			default: 
				System.out.println("Invalid Choice");
				
			}
		}
	}
}	
