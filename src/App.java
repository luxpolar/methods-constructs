import ar.com.ada.oop.instantiation.Person;
import ar.com.ada.oop.overloading.Arithmetic;

public class App {

    public static void main(String[] args) {
        Person person1 = new Person();
        Person person2 = new Person("Luciana");
        Person person3 = new Person("Emanuel", "Yuliano");
        Person person4 = new Person("Natalia", "Consiglio", 26);

        person1.setName("Clara");
        person1.setLastName("Bazet");
        person1.setAge(26);
        person2.setLastName("Consiglio");
        person2.setAge(24);
        person3.setAge(31);

        System.out.println("person1 name: " + person1.getName() + ", last name: " + person1.getLastName() + ", age: " + person1.getAge());
        System.out.println("person2 name: " + person2.getName() + ", last name: " + person2.getLastName() + ", age: " + person2.getAge());
        System.out.println("person3 name: " + person3.getName() + ", last name: " + person3.getLastName() + ", age: " + person3.getAge());
        System.out.println("person4 name: " + person4.getName() + ", last name: " + person4.getLastName() + ", age: " + person4.getAge());


        Arithmetic sumVariable = new Arithmetic();

        int a = 4;
        int b = 5;
        int sum = sumVariable.sum(a, b);
        System.out.println("sumVariable 1 = " + sum);

        Double a1 = 4.5;
        double b1 = 5.1;
        double sum2 = sumVariable.sum(a1, b1);
        System.out.println("sumVariable 2 = " + sum2);

        Double a2 = 3.4;
        Double b2 = 3.3;
        Double sum3 = sumVariable.sum(a2, b2);
        System.out.println("sumVariable 3 = " + sum3);

        Integer a3 = 13;
        int b3 = 12;
        Integer sum4 = sumVariable.sum(a3, b3);
        System.out.println("sumVariable 4 = " + sum4);


    }

    }

