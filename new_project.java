import java.util.Scanner;

public class New_project {

    // main method
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("REGISRATION OPTION");
        System.out.println("-----------------------------------------");
        System.out.println("1 - DOCTOR REGISTRATION \n 2 -PATIENT REGISTRATION ");
        int n = input.nextInt();

        if (n == 1) {
            float p = cadmedico();

        } else {
            float p = cadpaciente();
        }

    }

    // resgistration method
    public static void cadmedico() {
        System.out.println("DOCTOR REGISTRATION");
        System.out.println("--------------------------------");

        System.out.println("Enter the doctor's name:");
        float name_doctor = input.nextFloat();
        System.out.println("Enter the doctor's identification number");
        int code = input.nextInt();
        System.out.println("specialty:");
        float spc1 = input.nextFloat();

        System.out.println("Registration confirmation: ");
        System.out.println("--------------------------------");
        System.out.println("%f\n %d\n %f\n ", name_doctor, code, spc1);
        System.out.println("1-Confirm\n 2- back");

        int i = input.nextInt();

        if (i == 1) {
            System.out.println("Registration confirmed");

        } else {
            cadmedico();
        }

    }

    public static void cadpatient() {
        System.out.println("PATIENT REGISTRATION");
        System.out.println("--------------------------------");
        System.out.println("Enter the patient's name: ");
        float name_patient = input.nextFloat();
        System.out.println("Desired specialty:");
        float spc2 = input.nextFloat();

        System.out.println("Registration confirmation: ");
        System.out.println("--------------------------------");
        System.out.println("%f\n %d\n", name_patient, spc2);
        System.out.println("1-Confirm\n 2- back");

        int j = input.nextInt();

        if (j == 1) {
            System.out.println("Registration confirmed");

        } else {
            cadpatient();
        }
    }

    /*
     * public static void cadmedico(float nome, float numcadastro, float
     * especialidade) {
     * System.out.println("DOCTOR REGISTRATION");
     * System.out.println("--------------------------------");
     * System.out.println("Enter the doctor's name:");
     * float name_doctor = input.nextFloat();
     * System.out.println("Enter the doctor's identification number");
     * int code = input.nextInt();
     * 
     * }
     * 
     * public static void cadpaciente(float nome, float especialidade) {
     * System.out.println("CADASTRO PACIENTE");
     * System.out.println("--------------------------------");
     * System.out.println("Enter the patient's name: ");
     * float name_patient = input.nextFloat();
     * System.out.println("Desired specialty:");
     * float spc = input.nextFloat();
     * 
     */
}