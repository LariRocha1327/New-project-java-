public class Registro {
        public static void main(String[] args) {

            Scanner l = new Scanner(System.in);

            System.out.println("BEM VINDO AO CADASTRO DE USUÁRIOS");
            System.out.println("REGISRATION OPTION");
            System.out.println("-----------------------------------------");
            System.out.println("1 - DOCTOR REGISTRATION \n 2 -PATIENT REGISTRATION ");;
            int n = input.nextInt()


            if (n == 1) {
                float p =getMedico;

            } else {
                float p =getPaciente;
            }





            Dados Medico;

            medico = new Medico();

            medico.setNome(name_doctor);
            medico.setLogin(login);
            medico.setCargo(specialty);


            ArrayList<Dados> medico = new ArrayList<Dados>();

            medico.add(medico);

            System.out.println(medico.getName()+"\n"+medico.getlogin()+"\n"+medico.getspecialty());
            Dados Paciente;

            paciente = new Paciente();

            paciente.setName(name_doctor);
            paciente.setspecialty2(specialty);


            ArrayList<Dados> paciente = new ArrayList<Dados>();

            paciente.add(paciente);

            System.out.println(paciente.getName()+"\n"+paciente.getspecialty2());}
    }
}
