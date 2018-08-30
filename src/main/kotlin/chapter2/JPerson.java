package chapter2;
public class JPerson {

    String name;
    int age;
    double height;

    JPerson(String n, int a, double h){
        name = n;
        age = a;
        height = h;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
