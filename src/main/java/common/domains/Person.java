package common.domains;

public class Person {
    private String name;
    private Integer age;
    private Address address;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString(){
        StringBuilder builder = new StringBuilder(500);
        builder.append("Name: "+name +"\t");
        builder.append("Age: "+age +"\t");
        builder.append(address.toString());
        return builder.toString();
    }

    @Override
    public boolean equals(Object o){
        if(o instanceof Person){
            Person p = (Person) o;
            if(p.getName().equalsIgnoreCase(this.name))
                return true;
        }
        return false;
    }

    @Override
    public int hashCode(){
        final int prime = 31;
        int result = 1;
        result = prime * result +this.getAge()+(int)Math.random();
        return result;
    }
}

