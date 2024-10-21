package day8;

public class TestQuestionTwo {
    public static void main(String[] args) {
              // Generate a random valid index for "Alphabet Soup"
              int randomIndex = (int)(Math.random() * "Computer Science Rocks".length());
        
              // Construct a Mystery object called fun
              Mystery fun = new Mystery("Computer Science Rocks", randomIndex);
              
              // Print the initial string and index of fun
              System.out.println("Initial String: " + fun.getStr());
              System.out.println("Initial Index: " + fun.getNum());
      
              // Get the length of the initial string
              int length = fun.getStr().length(); 
              
              // Calculate the maximum number of characters to remove
              int charsToRemove = (int)(Math.random() * (length - fun.getNum())) + 1; 
              
              // Get the current string
              String currentStr = fun.getStr(); 
              
              // Create the new string by replacing the portion with "happy"
              String prefix = currentStr.substring(0, fun.getNum()); // Get the substring before the index
              String suffix = currentStr.substring(fun.getNum() + charsToRemove); // Get the substring after the removed characters
              
              // Update the string by replacing the specified portion with "happy"
              currentStr = prefix + "happy" + suffix; 
              
              // Set the updated string back to fun
              fun.setStr(currentStr); 
      
              // Print the modified string
              System.out.println("Modified String: " + fun.getStr());
    }
}







