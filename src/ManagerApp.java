import java.util.*;

public class ManagerApp {
    //Initializing the HashSet, TreeSet, and studentStack
    private Set<Student> studentHashSet = new HashSet<>();
    private Set<Student> studentTreeSet = new TreeSet<>(Comparator.comparing(student -> student.name));
    private Stack<Student> studentStack = new Stack<>();

    //2.**HashSet Operations**
    //Method to add students in the HashSet -> The system will check if the ID is already in the system and inform the user the name of the student associated to existing ID
    public void addStudentHashSet(Student student) {
        if (studentHashSet.contains(student)) {
            for (Student existingStudent : studentHashSet) {
                if (existingStudent.getId() == student.getId()) {
                    System.out.println("*** Attention! Student with ID " + student.getId()
                            + " is already in the system as " + existingStudent.getName() + ". Please, include the Student with a different ID.");
                    return;
                }
            }
        } else {
            studentHashSet.add(student);
            System.out.println(student.getName() + " added with 'id' = " + student.getId() + " and 'email address' = " + student.getEmail());
            //registering the student in the stack
            studentStack.push(student);
        }
    }

    //Method to display the students in the HashSet
    public void displayStudentHashSet() {
        System.out.println("\nThe following students are in the HashSet: ");
        for (Student student : studentHashSet) {
            System.out.println("ID: " + student.getId() + ", Name: " + student.getName() + ", Email: " + student.getEmail());
        }
    }

    //3.**TreeSet Operations**
    //Method to add students in the TreeSet
    public void addStudentTreeSet(Student student) {
        studentTreeSet.add(student);
        //registering the student in the stack
        studentStack.push(student);
    }

    //Method to display the students in the TreeSet
    public void displayStudentTreeSet() {
        System.out.println("\nThe following students are in the TreeSet (Sorted by Name):");
        studentTreeSet.forEach(System.out::println);
    }

    //4. **Stack Operations**
    public void popLastAddedStudent() {
        if (!studentStack.isEmpty()) {
            Student lastAddedStudent = studentStack.pop();
            System.out.println("\nLast added student: " + lastAddedStudent);
        } else {
            System.out.println("\nNo students to pop.");
        }
    }

    // Bonus: Remove a student + show it in the collections
    public void removeStudent(Student student) {
        if (studentHashSet.remove(student)) {
            System.out.println("\nStudent removed from HashSet: " + student);
        } else {
            System.out.println("*** Sorry. Student ID: " + student.getId() + ", Name: " + student.getName() + ", and Email: " + student.getEmail() + " not found in HashSet to be deleted.");
        }

        if (studentTreeSet.remove(student)) {
            System.out.println("Student removed from TreeSet: " + student);
        } else {
            System.out.println("*** Sorry. Student ID: " + student.getId() + ", Name: " + student.getName() + ", and Email: " + student.getEmail() + " not found in TreeSet to be deleted.");
        }
    }

    public static void main(String[] args) {
        //Initializing a new manage app
        ManagerApp system = new ManagerApp();

        //Adding students and displaying a HashSet
        System.out.println("Adding students. Please check bellow for updates:");
        system.addStudentHashSet(new Student(10050, "Natalia Dias", "natalia@hotmail.com"));
        system.addStudentHashSet(new Student(10051, "Marcos Mota", "marcos@hotmail.com"));
        system.addStudentHashSet(new Student(10052, "Aynur Vuran", "aynur@hotmail.com"));
        //Duplicated id - Should not be added
        system.addStudentHashSet(new Student(10050, "Sergio Cutrim", "sergio@hotmail.com"));
        //Same student, new id - It will be added
        system.addStudentHashSet(new Student(10053, "Sergio Cutrim", "sergio@hotmail.com"));
        system.displayStudentHashSet();

        //Adding students and displaying a TreeSet
        system.addStudentTreeSet(new Student(10050, "Natalia Dias", "natalia@hotmail.com"));
        system.addStudentTreeSet(new Student(10051, "Marcos Mota", "marcos@hotmail.com"));
        system.addStudentTreeSet(new Student(10052, "Aynur Vuran", "aynur@hotmail.com"));
        //Duplicated id - It will be added to the TreeSet (different adding method)
        system.addStudentTreeSet(new Student(10050, "Sergio Cutrim", "sergio@hotmail.com"));
        system.displayStudentTreeSet();

        //Testing pop the last student added (Stack operations)
        system.popLastAddedStudent();

        //Testing the bonus (remove student)
        system.removeStudent(new Student(10050, "Natalia Dias", "natalia@hotmail.com"));
        system.removeStudent(new Student(10054, "Natalia Dias", "natalia@hotmail.com"));
        system.displayStudentHashSet();
        system.displayStudentTreeSet();
    }
}
