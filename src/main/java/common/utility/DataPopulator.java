package common.utility;

import com.github.javafaker.Faker;
import common.domains.Address;
import common.domains.Person;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class DataPopulator {
    public static List<Person> generateRandomPersonsList(int n){
        Faker faker = new Faker();
        List<Person> personList = new ArrayList<>();
        for(int i =0;i<n;i++){
            Address address = new Address();
            address.setCity(faker.address().cityName());
            address.setHouseNumber(faker.address().buildingNumber());
            address.setPinCode(faker.address().zipCode());

            Person person = new Person();
            person.setAddress(address);
            person.setName(faker.name().fullName());
            person.setAge(faker.number().numberBetween(1,100));
            personList.add(person);
        }

        return personList;
    }
}
