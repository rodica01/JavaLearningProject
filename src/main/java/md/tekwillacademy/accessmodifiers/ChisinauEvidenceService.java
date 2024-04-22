package md.tekwillacademy.accessmodifiers;

import md.tekwillacademy.accessmodifiers.peopleevidence.Person;

public class ChisinauEvidenceService {
    public static void main(String[] args) {
        Person samBestFootballer = new Person();

        Person royBestTrainer = new Person("Roy First", 790908769, 65, "Unknown");

        System.out.println(royBestTrainer.getAge());
        System.out.println(samBestFootballer.getAge());

        samBestFootballer.name = "Sam Obisanya";

        royBestTrainer.name = "Roy Kent";

        Person raisaPacalo001 = new Person("Raisa Pacalo", "F");
        System.out.println(raisaPacalo001.getGender());
        System.out.println(raisaPacalo001.toString());
        System.out.println("Numele obiectului raisa Pacalo: " + raisaPacalo001.name);


        Person.nationality = "Edited moldovean";
        System.out.println(Person.nationality);

    }
}
