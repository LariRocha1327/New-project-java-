public class Medico {
        System.out.println("DOCTOR REGISTRATION");
        System.out.println("--------------------------------");

        System.out.println("Enter the doctor's name:");
        String name_doctor = input.nextString();
        System.out.println("Enter the doctor's login");
        int code = input.nextInt();
        System.out.println("specialty:");
        String cargo = input.nextString();

        System.out.println("Registration confirmation: ");
        System.out.println("--------------------------------");
        System.out.println("%s\n %d\n %s\n ", name_doctor, code, cargo);
        System.out.println("1-Confirm\n 2- back");

        int i = input.nextInt();

        if (i == 1) {
            System.out.println("Registration confirmed");

        } else {
            cadmedico();
        }
}
