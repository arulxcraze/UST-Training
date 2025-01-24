class Person {
    private String name;
    private int age;
  
    public Person(String name, int age) {
      this.name = name;
      this.age = age;
    }
  
    void getName() {
      System.out.println("Name: " + name);
    }
  
    void getAge() {
      System.out.println("Age: " + age);
    }
  }
  
  class Main {
    public static void main(String[] args) {
      Person p1 = new Person("Sanjay", 20);
      Person p2 = new Person("Kumar", 19);
      p1.getName();
      p1.getAge();
      p2.getName();
      p2.getAge();
    }
  }
  