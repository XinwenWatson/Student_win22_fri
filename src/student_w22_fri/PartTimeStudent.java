package student_w22_fri;

/**
 * This class +++Insert Description Here+++
 * 
 * @author Xinwen Li
 */
public class PartTimeStudent extends Student {
    private int numCourses;

    public PartTimeStudent(String studentId, String studentName, int numCourses) {
        super(studentId, studentName);
        this.numCourses = numCourses;
    }  

    public int getNumCourses() {
        return numCourses;
    }

    public void setNumCourses(int numCourses) {
        this.numCourses = numCourses;
    }
}
