public class DiamondPattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user for the number of rows in the top half of the diamond
        System.out.print("Enter the number of rows for the diamond (odd number): ");
        int n =5;
        
        // Check if the number entered is odd
        if (n % 2 == 0) {
            System.out.println("Please enter an odd number.");
            return;
        }
        
        int space = n / 2;  // Initial spaces
        
        // Upper part of the diamond
        for (int i = 1; i <= n; i += 2) {
            // Print leading spaces
            for (int j = 0; j < space; j++) {
                System.out.print(" ");
            }
            
            // Print stars
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            
            System.out.println();  // Move to the next line
            space--;  // Decrease the spaces after each row
        }
        
        // Lower part of the diamond
        space = 1;  // Reset space to 1 for the lower part
        for (int i = n - 2; i >= 1; i -= 2) {
            // Print leading spaces
            for (int j = 0; j < space; j++) {
                System.out.print(" ");
            }
            
            // Print stars
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            
            System.out.println();  // Move to the next line
            space++;  // Increase the spaces after each row
        }
    }
}

