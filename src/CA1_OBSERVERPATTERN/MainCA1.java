package CA1_OBSERVERPATTERN;

public class MainCA1 {
    public static void main(String[] args) {
        Stream stream = Stream.getInstance();

        Client clientA = new Client(stream);

        System.out.println("Adding courses:");
        stream.addEvent("Math");
        stream.addEvent("Physics");

        System.out.println("\nUpdating course:");
        stream.updateEvent("Math", "Advanced Math");

        System.out.println("\nDeleting course:");
        stream.deleteEvent("Physics");

        clientA.detach();

        stream.addEvent("Chemistry");

        Client clientB = new Client(stream);

        stream.addEvent("Biology");

        clientB.detach();

        stream.addEvent("Computer Science");

        Client clientC = new Client(stream);

        stream.addEvent("Artificial Intelligence");

        clientC.detach();

        stream.addEvent("Machine Learning");
    }
}