class Course {

    // Instance variables
    String courseName;
    int enrolledStudents;

    // Static variable
    // Shared by all Course objects
    static int maxCapacity;

    // Static block
    // Runs once when class is loaded
    static {
        maxCapacity = 100;
    }

    // Constructor
    // Used to initialize course name
    Course(String courseName) {
        this.courseName = courseName;
        this.enrolledStudents = 0;
    }

    // Static method
    // Used to change maximum capacity
    static void setMaxCapacity(int capacity) {
        maxCapacity = capacity;
    }

    // Instance method
    // Enrolls a student if seats are available
    void enrollStudent(String studentName) {

        if (enrolledStudents < maxCapacity) {

            enrolledStudents++;

            System.out.println(
                studentName + " enrolled in " + courseName
            );
        } 
        
        else {
            System.out.println("Course capacity is full.");
        }
    }

    // Instance method
    // Removes a student from course
    void unenrollStudent(String studentName) {

        if (enrolledStudents > 0) {

            enrolledStudents--;

            System.out.println(
                studentName + " unenrolled from " + courseName
            );
        } 
        
        else {
            System.out.println("No students to remove.");
        }
    }

    public static void main(String[] args) {

        // Changing maximum capacity
        Course.setMaxCapacity(2);

        // Creating Course objects
        Course javaCourse = new Course("Java");

        // Enrolling students
        javaCourse.enrollStudent("Rahul");
        javaCourse.enrollStudent("Amit");

        // Capacity full
        javaCourse.enrollStudent("Priya");

        // Removing student
        javaCourse.unenrollStudent("Rahul");
    }
}

