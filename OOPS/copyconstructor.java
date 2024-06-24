public class CopyConstructor {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Anil Yadav";
        s1.age = 20;
        s1.address = "Janakpurdham";
        s1.phone = 4098604;
        s1.marks = new int[4];
        s1.marks[0] = 40;
        s1.marks[1] = 70;
        s1.marks[2] = 90;
        s1.marks[3] = 100;

        //Shallow copy constructor

        // now copying object s1 to s2 :
        Student s2 = new Student(s1); // Using the copy constructor

        s1.marks[0] = 79; // Although s1 copied to s2 this line will execute because here value changes through
                          // reference (address)

        for (int i = 0; i < 4; i++) {
            System.out.println(s2.marks[i]);
        }

    }
}

class Student {
    String name;
    String address;
    int age;
    int phone;
    int marks[];

    // Default constructor
    public Student() {
    }

    // Copy constructor
    public Student(Student s1) {
        this.name = s1.name;
        this.address = s1.address;
        this.age = s1.age;
        this.phone = s1.phone;
        this.marks = s1.marks; // Copy by reference
    }
}

