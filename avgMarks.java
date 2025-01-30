//calculate the avg marks of the student.
// consider marks of 3 subs are maximum 
// Calculate the average marks of the student
public class avgMarks {

    // Method to calculate average marks
    float calMarks(int a, int b, int c) {
        float ans = (a + b + c) / 3.0f; // Corrected formula with float division
        return ans;
    }

    public static void main(String[] args) {
        avgMarks d = new avgMarks(); // Create an instance of AvgMarks
        float gg = d.calMarks(5, 6, 7); // Call the method
        System.out.println("Average marks: " + gg); // Print the average
    }
}
