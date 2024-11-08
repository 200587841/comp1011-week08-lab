import java.util.HashSet;

public class HashSetStudent {
    public static void main(String[] args) {
        /*
        //Task 1 - Store a collection of students
        HashSet<Student> studentHashSet = new HashSet<>();

        //Task 2 - Adding students
        addStudent(studentHashSet, new Student(10050, "Natalia Dias", "natalia@hotmail.com"));
        addStudent(studentHashSet, new Student(10051, "Marcos Mota", "marcos@hotmail.com"));
        addStudent(studentHashSet, new Student(10052, "Aynur Vuran", "aynur@hotmail.com"));
        addStudent(studentHashSet, new Student(10050, "Sergio Cutrim", "sergio@hotmail.com"));

        //Task 3 - Display
        System.out.println("The following students are in the system: ");
        for (Student student : studentHashSet) {
            System.out.println("ID: " + student.getId() + ", Name: " + student.getName() + ", Email: " + student.getEmail());
        }
    }

    //Task 2 - Method to add students and check before for same ID
    public static void addStudent(HashSet<Student> studentHashSet, Student student) {
        if (studentHashSet.contains(student)) {
            for (Student existingStudent : studentHashSet) {
                if (existingStudent.getId() == student.getId()) {
                    System.out.println("Attention! Student with ID " + student.getId()
                            + " is already in the system as " + existingStudent.getName());
                    return;
                }
            }
        } else {
            studentHashSet.add(student);
            System.out.println("Student " + student.getName() + " added.");
        }*/
    }
}
