
import java.util.Objects;

public class Student {

    private static int nextStudentId = 1;
    private String name;
    private int studentId;
    private int numberOfCredits = 0;
    private double gpa = 0.0;

    public Student (String name, int studentId, int numberOfCredits, double gpa) {
        this.name = name;
        this.studentId = studentId;
        this.numberOfCredits = numberOfCredits;
        this.gpa = gpa;
    }

    public Student(String name, int studentId) {
        this(name, studentId, 0, 0);
    }

    public Student(String name) {
        this(name, nextStudentId);
        nextStudentId++;
    }

    public String studentInfo() {
        return (this.name + " has a GPA of: " + this.gpa);
    }

    public String getGradeLevel() {
        if (this.numberOfCredits < 30) {
            return "Freshman";
        } else if (this.numberOfCredits < 60) {
            return "Sophomore";
        } else if (this.numberOfCredits < 90) {
            return "Junior";
        } else {
            return "Senior";
        }
    }

    public void addGrade(int courseCredits, double grade) {
        double qualityScore = this.gpa * this.numberOfCredits;
        qualityScore += courseCredits * grade;
        this.numberOfCredits += courseCredits;
        this.gpa = qualityScore / this.numberOfCredits;
    }

    // TODO: Add your custom 'toString' method here. Make sure it returns a well-formatted String rather
    //  than just the class fields.

    // TODO: Add your custom 'equals' method here. Consider which fields should match in order to call two
    //  Student objects equal.

    public String getName() {
        return name;
    }

    public int getStudentId() {
        return studentId;
    }

    public int getNumberOfCredits() {
        return numberOfCredits;
    }

    public double getGpa() {
        return gpa;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    private void setNumberOfCredits(int numberOfCredits) {
        this.numberOfCredits = numberOfCredits;
    }

    public String toString() {
        return this.name + " (ID: " + this.studentId + ", " + this.gpa + " GPA)";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return studentId == student.studentId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(studentId);
    }

    public static void main(String[] args) {
        Student sally = new Student("Sally",1,1,4.0);
        System.out.println("The Student class works! " + sally.getName() + " is a student!");
        System.out.println(sally);
        sally.addGrade(12, 3.5);
        System.out.println(sally);
        sally.addGrade(25, 3.8);
        System.out.println(sally);
    }
}
//    public Student(String name) {
//        this(name, nextStudentId);
//        nextStudentId++;
//    }
//
//    public String studentInfo() {
//        return (this.name + " has a GPA of: " + this.gpa);
//    }
//
//
//     //TODO: Uncomment and complete the getGradeLevel method here:
//    public String getGradeLevel(int numberOfCredits) {
//        // Determine the grade level of the student based on numberOfCredits
//        //This method returns the student’s level based on the number of credits they have earned:
//        // Freshman (0-29 credits),
//        // Sophomore (30-59 credits), Junior (60-89 credits), or Senior (90+ credits)
//
//        if (this.numberOfCredits<29) {
//            return "Freshman";
//        } else if (numberOfCredits>29 && numberOfCredits<60) {
//            return "Sophomore";
//        } else if(numberOfCredits>59 && numberOfCredits<90){
//            return "Junior";
//        }else{
//            return "Senior";
//    }
//}
//    // TODO: Complete the addGrade method.
//    public void addGrade(int courseCredits, double grade) {
//        // Update the appropriate fields: numberOfCredits, gpa
//
//        public void qualityScore(char grade1,int credit){
//            if (grade1.equals ("A"))
//                gradeValue= 4.00;
//
//        }
//    }
//
//    // TODO: Add your custom 'toString' method here. Make sure it returns a well-formatted String rather
//    //  than just the class fields.
//
//    // TODO: Add your custom 'equals' method here. Consider which fields should match in order to call two
//    //  Student objects equal.
//
//    public String getName() {
//        return name;
//    }
//
//    public int getStudentId() {
//        return studentId;
//    }
//
//    public int getNumberOfCredits() {
//        return numberOfCredits;
//    }
//
//    public double getGpa() {
//        return gpa;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public void setStudentId(int studentId) {
//        this.studentId = studentId;
//    }
//
//    public void setGpa(double gpa) {
//        this.gpa = gpa;
//    }
//
//    private void setNumberOfCredits(int numberOfCredits) {
//        this.numberOfCredits = numberOfCredits;
//    }
//
//    public static void main(String[] args) {
//        Student sally = new Student("Sally",1,1,4.0);
//        System.out.println("The Student class works! " + sally.getName() + " is a student!");
//        System.out.println(sally);
//        sally.addGrade(12, 3.5);
//        System.out.println(sally);
//        sally.addGrade(25, 3.8);
//        System.out.println(sally);
//    }
//}
