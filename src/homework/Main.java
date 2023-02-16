package homework;

public class Main {
    public static void main(String[] args) {
        Address adr = new Address();

        adr.setApartment(13);
        adr.setStreet("Набережна");
        adr.setCountry("Україна");
        adr.setCity("Луцьк");
        adr.setIndex(1345);
        adr.setHouse(12);



        System.out.println("\n"+ adr);
    }
}
