package list;

import common.domains.Person;
import common.utility.DataPopulator;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ListImpl {
    private List<Person> personList;

    public void sortPersonOnAge(int n){
        personList = DataPopulator.generateRandomPersonsList(n);
        System.out.println("************ Before Sorting based on Age *****************");
        System.out.println(personList.toString());
        personList = personList.stream().sorted(Comparator.comparingInt(Person::getAge)).collect(Collectors.toList());;
        System.out.println("************ After Sorting based on Age *****************");
        System.out.println(personList.toString());
    }

    public void sortPersonOnName(int n){
        personList = DataPopulator.generateRandomPersonsList(n);
        System.out.println("************ Before Sorting based on Name *****************");
        System.out.println(personList.toString());
        personList = personList.stream().sorted(Comparator.comparing(Person::getName)).collect(Collectors.toList());;
        System.out.println("************ After Sorting based on Name *****************");
        System.out.println(personList.toString());
    }

    public void removeDuplicatesFromList(int n){
        personList = DataPopulator.generateRandomPersonsList(n);
        System.out.println("Before adding duplicates "+personList.size());
        System.out.println(personList.toString());
        personList.addAll(personList);
        System.out.println("After adding duplicates "+personList.size());
        System.out.println(personList.toString());
        personList = personList.stream().distinct().collect(Collectors.toList());
        System.out.println("After removing duplicates "+personList.size());
        System.out.println(personList.toString());
    }

    public void removeDuplicatesBasedOnName(int n){
        personList = DataPopulator.generateRandomPersonsList(n);
        System.out.println("Before adding duplicates "+personList.size());
        System.out.println(personList.toString());
        Person person = new Person();
        person.setAge(20);
        person.setName(personList.get(0).getName());
        person.setAddress(personList.get(1).getAddress());
;        personList.add(person);
        System.out.println("After adding duplicates "+personList.size());
        System.out.println(personList.toString());
        personList = personList.stream().filter(distinctByKey(p->p.getName())).peek(person1 -> {
            System.out.println(person1.getName() +":"+ person1.equals(person));
        }).collect(Collectors.toList());
        System.out.println("After removing duplicates "+personList.size());
        System.out.println(personList.toString());
    }

    public <T> Predicate<T> distinctByKey(Function<? super T, ?> keyExtractor) {

        Map<Object, Boolean> seen = new ConcurrentHashMap<>();
        return t -> seen.putIfAbsent(keyExtractor.apply(t), Boolean.TRUE) == null;
    }


}
