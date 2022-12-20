public class Paciente {
    System.out.println("PATIENT REGISTRATION");
    System.out.println("--------------------------------");
    System.out.println("Enter the patient's name: ");
    String name_patient = input.nextString();
    System.out.println("Desired specialty:");
    String specialty2 = input.nextString();

    System.out.println("Registration confirmation: ");
    System.out.println("--------------------------------");
    System.out.println("%s\n %s\n", name_patient, getspecialty2);
    System.out.println("1-Confirm\n 2- back");

    int j = input.nextInt();

        if (j == 1) {
        System.out.println("Registration confirmed");

    } else {
        cadpatient();
    }
}
