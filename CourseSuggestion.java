import javafoundations.LinkedBinaryTree;
import java.util.*;
/**
 * CS230 Final Project
 * @author Zoe Allen
 * @version 5/6/18
 * 
 * The CourseSuggestion class creates a Decision Tree that gives suggestions of what course to take next
 * based on a user's answers.
 */
public class CourseSuggestion
{
    // instance variables 
    private LinkedBinaryTree<String> tree;
    protected CourseList userCourses;
    
    /**
     * Constructor for objects of class CourseSuggestion
     * Creates the decision tree
     * 
     * @param CourseList of pastCourses
     */
    public CourseSuggestion(CourseList courses)
    {
        // initialise instance variables
        userCourses = courses;
        
        // set up all of the questions:
        String q1 = "Is this for fall semester?";
        String q23 = "Are you looking for an intro course?";
        // q3 is a repeat of q2
        String q46 = "Are you looking for a 300 level course?";
        String q57 = "Are you looking to take lots of CS classes in the future?";
        // q6 is a repeat of q4
        // q7 is a repeat of q5
        String q891011 = "Do you want to take MAS specific courses?";
        // q9, 10, and 11 are repeats of q8
        String q1213 = "Do you want to take classes that fulfill CS major requirements?";
        // q13 is a repeat of q12
        
        // each group corresponds to a linked list (will convert this string to a LL back to a string
        String e14 = "Group 14";
        String e15 = "Group 15";
        String e16 = "Group 16";
        String e17 = "Group 17";
        String e18 = "Group 18";
        String e19 = "Group 19";
        String e20 = "Group 20";
        String e21 = "Group 21";
        String e22 = "Group 22";
        String e23 = "Group 23";
        String e24 = "Group 24";
        String e25 = "Group 25";
        String e26 = "Group 26";
        String e27 = "Group 27";
        
        
        LinkedBinaryTree<String> n2, n3, n4, n5, n6, n7, n8, n9, n10, n11, n12, n13, n14, n15, n16, n17, n18, n19, n20;
        LinkedBinaryTree<String> n21, n22, n23, n24, n25, n26, n27;
        
        //Lowest levels - results
        n14 = new LinkedBinaryTree<String>(e14);
        n15 = new LinkedBinaryTree<String>(e15);
        n16 = new LinkedBinaryTree<String>(e16);
        n17 = new LinkedBinaryTree<String>(e17);
        n18 = new LinkedBinaryTree<String>(e18);
        n19 = new LinkedBinaryTree<String>(e19);
        n20 = new LinkedBinaryTree<String>(e20);
        n21 = new LinkedBinaryTree<String>(e21);
        n22 = new LinkedBinaryTree<String>(e22);
        n23 = new LinkedBinaryTree<String>(e23);
        n24 = new LinkedBinaryTree<String>(e24);
        n25 = new LinkedBinaryTree<String>(e25);
        n26 = new LinkedBinaryTree<String>(e26);
        n27 = new LinkedBinaryTree<String>(e27);
        
        //left tree from bottom to top
        n12 = new LinkedBinaryTree<String>(q1213, n19, n20); //Spring, 200, not MAS, cs major requirement?
        n8 = new LinkedBinaryTree<String>(q891011, n12, n18); //Spring, 200, MAS? 
        n9 = new LinkedBinaryTree<String>(q891011, n21, n22);  // Spring, 300, MAS?
        n4 = new LinkedBinaryTree<String>(q46, n8, n9); // Spring, 300 level?
        n5 = new LinkedBinaryTree<String>(q57, n14, n15); // Spring, intro, lots of cs?
        n2 = new LinkedBinaryTree<String>(q23, n4, n5); //Spring, intro?
        
        //right tree from bottom to top
        n13 = new LinkedBinaryTree<String>(q1213, n23, n24); //Fall, 200, not MAS, cs major requirement?
        n10 = new LinkedBinaryTree<String>(q891011, n13, n25); //Fall, 200, MAS?
        n11 = new LinkedBinaryTree<String>(q891011, n26, n27);  // Fall, 300, MAS?
        n6 = new LinkedBinaryTree<String>(q46, n10, n11); // Fall, 300?
        n7 = new LinkedBinaryTree<String>(q57, n16, n17); // Fall, intro, lots of CS?
        n3 = new LinkedBinaryTree<String>(q23, n6, n7); // Fall, intro?
        
        
        //top level
        tree = new LinkedBinaryTree<String>(q1, n2, n3);
    }
 
    public LinkedBinaryTree<String> getTree(){
        return tree;
    }
    
    /**
     * Given that the Decision Tree is of Strings, the resulting String must be converted to 
     * its corresponding Linked List.  This corresponding Linked List will then be iterated over
     * to print out the suggested courses
     * 
     * @param suggestString - the String starting with "Group" that corresponds to a particular LL
     * @return LinkedList - the list of suggested courses that will be printed later in a nicely 
     *                      formatted string in the suggest() method
     */
    public LinkedList<Course> convertToLL (String suggestString){
        LinkedList<Course> group14 = new LinkedList<Course>();
        group14.add(new Course("CS", 115, "Computing for the Socio-Techno Web", "Both"));
        
        LinkedList<Course> group15 = new LinkedList<Course>();
        group15.add(new Course("CS", 111, "Programming and Problem Solving", "Both"));
        
        LinkedList<Course> group16 = new LinkedList<Course>();
        group16.add(new Course("CS", 115, "Computing for the Socio-Techno Web", "Both")); 
        group16.add(new Course("CS", 112, "Computing for the Sciences", "Spring"));
        
        LinkedList<Course> group17 = new LinkedList<Course>();
        group17.add(new Course("CS", 111, "Programming and Problem Solving", "Both"));
        
        LinkedList<Course> group18 = new LinkedList<Course>();
        group18.add(new Course("CS", 220, "Human-Computer Interaction", "Both")); 
        group18.add(new Course("CS", 230, "Data Structures", "Both")); 
        group18.add(new Course("CS", 232, "Artificial Intelligence", "Spring"));
        
        LinkedList<Course> group19 = new LinkedList<Course>();
        group19.add(new Course("CS", 251, "Programming Languages", "Both"));
        
        LinkedList<Course> group20 = new LinkedList<Course>();
        group20.add(new Course("CS", 230, "Data Structures", "Both")); 
        group20.add(new Course("CS", 231, "Fundamental Algorithms", "Both")); 
        group20.add(new Course("CS", 235, "Languages and Automata", "Both")); 
        group20.add(new Course("CS", 240, "Foundations of Computer Systems with Laboratory", "Both"));
        
        LinkedList<Course> group21 = new LinkedList<Course>();
        group21.add(new Course("CS", 301, "Compiler and Runtime System Design", "Neither")); 
        group21.add(new Course("CS", 310, "Foundations of Cryptology", "Neither")); 
        group21.add(new Course("CS", 332, "Visual Processing", "Neither")); 
        group21.add(new Course("CS", 341, "Operating Systems", "Spring")); 
        group21.add(new Course("CS", 242, "Computer Security", "Fall"));
        
        LinkedList<Course> group22 = new LinkedList<Course>();
        group22.add(new Course("CS", 304, "Databases with Web Interfaces", "Both")); 
        group22.add(new Course("CS", 315, "Data and Text Mining for the Web", "Neither"));
        
        LinkedList<Course> group23 = new LinkedList<Course>();
        group23.add(new Course("CS", 234, "Data, Analytics, and Visualization", "Fall")); 
        group23.add(new Course("CS", 242, "Computer Networks", "Fall")); 
        
        LinkedList<Course> group24 = new LinkedList<Course>();
        group24.add(new Course("CS", 230, "Data Structures", "Both")); 
        group24.add(new Course("CS", 231, "Fundamental Algorithms", "Both")); 
        group24.add(new Course("CS", 235, "Languages and Automata", "Both")); 
        group24.add(new Course("CS", 240, "Foundations of Computer Systems with Laboratory", "Both"));
        group24.add(new Course("CS", 251, "Programming Languages", "Both"));
        
        LinkedList<Course> group25 = new LinkedList<Course>();
        group25.add(new Course("CS", 204, "Introduction to Front-End Web Development", "Fall")); 
        group25.add(new Course("CS", 220, "Human-Computer Interaction", "Both")); 
        group25.add(new Course("CS", 225, "Making and Fabrication", "Fall")); 
        group25.add(new Course("CS", 230, "Data Structures", "Both"));
        
        LinkedList<Course> group26 = new LinkedList<Course>();
        group26.add(new Course("CS", 301, "Compiler and Runtime System Design", "Neither")); 
        group26.add(new Course("CS", 310, "Foundations of Cryptology", "Neithe")); 
        group26.add(new Course("CS", 313, "Computational Biology", "Fall")); 
        group26.add(new Course("CS", 332, "Visual Processing", "Neither"));
        
        LinkedList<Course> group27 = new LinkedList<Course>();
        group27.add(new Course("CS", 304, "Databases with Web Interfaces", "Both")); 
        group27.add(new Course("CS", 307, "Computer Graphics", "Fall")); 
        group27.add(new Course("CS", 315, "Data and Text Mining for the Web", "Neither")); 
        group27.add(new Course("CS", 320, "Tangible User Interfaces", "Fall"));
        
        if (suggestString.equals("Group 14")){
            return group14;
        }
        else if (suggestString.equals("Group 15")){
            return group15;
        }
        else if (suggestString.equals("Group 16")){
            return group16;
        }
        else if (suggestString.equals("Group 17")){
            return group17;
        }
        else if (suggestString.equals("Group 18")){
            return group18;
        }
        else if (suggestString.equals("Group 19")){
            return group19;
        }
        else if (suggestString.equals("Group 20")){
            return group20;
        }
        else if (suggestString.equals("Group 21")){
            return group21;
        }
        else if (suggestString.equals("Group 22")){
            return group22;
        }
        else if (suggestString.equals("Group 23")){
            return group23;
        }
        else if (suggestString.equals("Group 24")){
            return group24;
        }
        else if (suggestString.equals("Group 25")){
            return group25;
        }
        else if (suggestString.equals("Group 26")){
            return group26;
        }
        else{
            return group27;
        }
    }

    /**
     * main method to test the class
     */
    public static void main (String[] args){
        CourseList coursesTest1 = new CourseList();
        System.out.println("Add CS 111, 115, & 220 to CourseList");
        Course c1 = new Course("CS", 111, "Computer Programming and Problem Solving", "Both");
        Course c2 = new Course("CS", 115, "Computing for the Socio-Techno Web", "Both");
        Course c3 = new Course("CS", 220, "Human-Computer Interaction", "Both");
        
        coursesTest1.addCourse(c1); coursesTest1.addCourse(c3); coursesTest1.addCourse(c2);
        
        CourseSuggestion test1 = new CourseSuggestion(coursesTest1);
        //test1.suggest();
    }
}
