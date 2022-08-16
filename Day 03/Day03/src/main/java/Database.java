public class Database {
    public static void main(String[] args) {
        Emp dataOne = new Emp();
        Emp dataTwo = new Emp();
        Emp dataThree = new Emp(123,987654321,"srinath");
        dataThree.setEmail("18@gmail.com");
        dataThree.setRole("Trainee");

        dataOne.setId(123);
        dataOne.setName("Srinath");
        dataOne.setRole("Trainee");
        dataOne.setPhone(98765);
        dataOne.setEmail("abc@gmail.com");


        dataTwo.setId(321);
        dataTwo.setName("Sreenath");
        dataTwo.setRole("Trainee");
        dataTwo.setPhone(1234);
        dataTwo.setEmail("sri@gmail.com");

        dataThree.showDetails();
    }
}
