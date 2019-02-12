package java8;


        import java.util.Arrays;
        import java.util.List;
        import java.util.function.BiFunction;
        import java.util.stream.Collectors;

public class PersonTest {
    public static void main(String[] args) {
        Person person1 = new Person("zhangsan",20);
        Person person2 = new Person("lisi",30);
        Person person3 = new Person("wangwu",40);

        List<Person> personList = Arrays.asList(person1,person2,person3);

        PersonTest personTest = new PersonTest();

        List<Person> persons = personTest.getPersonListByUsername("zhangsan",personList);
        persons.forEach(person -> System.out.println(person.getUsername()));

        System.out.println("-----------------------");

        List<Person> persons1 = personTest.getPersonListByAge(25,personList);
        persons1.forEach(person -> System.out.println(person.getUsername()+","+person.getAge()));

        System.out.println("-----------------------");
        List<Person> persons2 = personTest.getPersonListByAge2(25,personList,(age,personList2)->
             personList2.stream().filter(person -> person.getAge() > age).collect(Collectors.toList()));
        persons2.forEach(person -> System.out.println(person.getUsername()+","+person.getAge()));

        System.out.println("-----------------------");

        List<Person> persons3 = personTest.getPersonListByAge2(25,personList,(age,personList2)->
                personList2.stream().filter(person -> person.getAge() <= age).collect(Collectors.toList()));
        persons3.forEach(person -> System.out.println(person.getUsername()+","+person.getAge()));

    }

    private List<Person> getPersonListByUsername(String username,List<Person> personList){
        return personList.stream().filter(person -> person.getUsername().equals(username)).collect(Collectors.toList());
    }

    private List<Person> getPersonListByAge(int age,List<Person> personList){
        BiFunction<Integer,List<Person>,List<Person>> biFunction = (ageOfPerson,personList1)->
             personList1.stream().filter(person -> person.getAge()>ageOfPerson).collect(Collectors.toList());

        return biFunction.apply(age,personList);
    }

    private List<Person> getPersonListByAge2(int age,List<Person> personList,BiFunction<Integer,List<Person>,List<Person>> biFunction){
        return biFunction.apply(age,personList);
    }
}
