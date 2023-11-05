package labwork;
public class person {
    String name ;
    int age ;
    public static void main(String[] args) {
        person print=new person();
    }
    person()
    {
        firstperson();
        secondperson();
    }
    void firstperson()
    {
        name="Shom";
        age=21;
        System.out.println("First person name : "+name);
        System.out.println("First person age : "+age);
    }
    void secondperson()
    {
        name="Shovon";
        age=23;
        System.out.println("First person name : "+name);
        System.out.println("First person age : "+age);
    }
}
