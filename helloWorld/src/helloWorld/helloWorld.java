package helloWorld;

public class helloWorld {
    private String name;
    private int age;
    private String address;
    private double height;
    private boolean isStudent;

    // Default constructor
    public helloWorld() {
    }

    // Parameterized constructor
    public helloWorld(String name, int age, String address, double height, boolean isStudent) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.height = height;
        this.isStudent = isStudent;
    }

    // Getter and setter methods for name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Getter and setter methods for age
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // Getter and setter methods for address
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    // Getter and setter methods for height
    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    // Getter and setter methods for isStudent
    public boolean isStudent() {
        return isStudent;
    }

    public void setStudent(boolean student) {
        isStudent = student;
    }

    // Override toString() method for printing object information
    @Override
    public String toString() {
        return "HelloWorld{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                ", height=" + height +
                ", isStudent=" + isStudent +
                '}';
    }

    // Main method
    public static void main(String[] args) {
        // Instantiate HelloWorld object
        helloWorld hello = new helloWorld("John", 25, "123 Main St", 5.9, true);
        
        // Print object information
        System.out.println(hello);
    }
}
