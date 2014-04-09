import java.util.Scanner;

public class Calculator{

    public static void main(String[] args){
	MyStack stack = new MyStack();
	Scanner scan = new Scanner(System.in);
	int first = 0;
	int second = 0;
	int input = 0;

	System.out.println("Input numbers and basic operations (+,-,/,*)");

	while (true){
	    if (scan.hasNextInt()){
		stack.push(scan.nextInt());
		System.out.println("Correct input");
	    }
	    else if (scan.hasNextLine()){
		String data = scan.nextLine();
		data.replaceAll("\\s+","");	
		if (data == "+"){
		    if (stack.size() < 2){
			System.out.println("Not enough numbers");
			break;
		    }
		    else{
			first = stack.pop();
			second = stack.pop();
			input = first+second;
			stack.push(input);
			System.out.println(""+first+" + "+second+" equals "+input);
		    }
		}
		else if (data == "-"){
		    if (stack.size() < 2){
			System.out.println("Not enough numbers");
			break;
		    }
		    else{
			first = stack.pop();
			second = stack.pop();
			input = first-second;
			stack.push(input);
			System.out.println(""+first+" - "+second+" equals "+input);
		    }
		}
		else if (data == "*"){
		    if (stack.size() < 2){
			System.out.println("Not enough numbers");
			break;
		    }
		    else{
			first = stack.pop();
			second = stack.pop();
			input = first*second;
			stack.push(input);
			System.out.println(""+first+" * "+second+" equals "+input);
		    }
		}
		else if (data == "/"){
		    if (stack.size() < 2){
			System.out.println("Not enough numbers");
			break;
		    }
		    else{
			first = stack.pop();
			second = stack.pop();
			input = first/second;
			stack.push(input);
			System.out.println(""+first+" / "+second+" equals "+input);
		    }
		}
		else{
		    System.out.println(data);
		    System.out.println("Please input something correct");
		}
	    }
	}
    }

    /*
      read a string
      if it's an operator
      -pop the appropriate number of items
      -do the equation
      -push the answer
      else
      -push the number
    */


}
