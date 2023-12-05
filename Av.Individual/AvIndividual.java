package hopital;

import java.util.ArrayList;
import java.util.List;

	class Pessoa {
	    private String nome;
	    private int idade;

	    public Pessoa(String nome, int idade) {
	        this.setNome(nome);
	        this.setIdade(idade);
	    }

		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public int getIdade() {
			return idade;
		}

		public void setIdade(int idade) {
			this.idade = idade;
		}


	}

	class Paciente extends Pessoa {
	    private String tipoAtendimento;
	    private boolean urgencia;

	    public Paciente(String nome, int idade, String tipoAtendimento, boolean urgencia) {
	        super(nome, idade);
	        this.setTipoAtendimento(tipoAtendimento);
	        this.setUrgencia(urgencia);
	    }

		public String getTipoAtendimento() {
			return tipoAtendimento;
		}

		public void setTipoAtendimento(String tipoAtendimento) {
			this.tipoAtendimento = tipoAtendimento;
		}

		public boolean isUrgencia() {
			return urgencia;
		}

		public void setUrgencia(boolean urgencia) {
			this.urgencia = urgencia;
		}


	}

	class AgenteSaude extends Pessoa {
	    public AgenteSaude(String nome, int idade) {
	        super(nome, idade);
	    }
	}

	class Medico extends AgenteSaude {
	    private List<Procedimento> procedimentosRealizados;

	    public Medico(String nome, int idade) {
	        super(nome, idade);
	        this.procedimentosRealizados = new ArrayList<>();
	    }

	    public void realizarProcedimento(Procedimento procedimento) {
	        procedimentosRealizados.add(procedimento);
	    }

	    
	}

	class Enfermeiro extends AgenteSaude {

		public Enfermeiro(String nome, int idade) {
			super(nome, idade);
		}
	 
	}

	class Procedimento {
	    private String nome;
	    private List<Medicamento> medicamentosUtilizados;
	    private List<Insumo> insumosUtilizados;
	    private List<AgenteSaude> equipe;
	    private List<Procedimento> procedimentosParte; 

	    public Procedimento(String nome) {
	        this.setNome(nome);
	        this.medicamentosUtilizados = new ArrayList<>();
	        this.insumosUtilizados = new ArrayList<>();
	        this.equipe = new ArrayList<>();
	        this.procedimentosParte = new ArrayList<>();
	    }

	    public void adicionarMedicamento(Medicamento medicamento) {
	        medicamentosUtilizados.add(medicamento);
	    }

	    public void adicionarInsumo(Insumo insumo) {
	        insumosUtilizados.add(insumo);
	    }

	    public void adicionarMembroEquipe(AgenteSaude membro) {
	        equipe.add(membro);
	    }

	    public void adicionarProcedimentoParte(Procedimento procedimento) {
	        procedimentosParte.add(procedimento);
	    }

		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

	}

	class Medicamento {
	    private String nome;
	    private int quantidade;

	    public Medicamento(String nome, int quantidade) {
	        this.setNome(nome);
	        this.setQuantidade(quantidade);
	    }

		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public int getQuantidade() {
			return quantidade;
		}

		public void setQuantidade(int quantidade) {
			this.quantidade = quantidade;
		}


	}

	class Insumo {
	    private String nome;
	    private int quantidade;

	    public Insumo(String nome, int quantidade) {
	        this.setNome(nome);
	        this.setQuantidade(quantidade);
	    }

		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public int getQuantidade() {
			return quantidade;
		}

		public void setQuantidade(int quantidade) {
			this.quantidade = quantidade;
		}


	}


	class Triagem {
	    private Enfermeiro enfermeiroResponsavel;
	    private Paciente paciente;

	    public Triagem(Enfermeiro enfermeiroResponsavel, Paciente paciente) {
	        this.setEnfermeiroResponsavel(enfermeiroResponsavel);
	        this.setPaciente(paciente);
	    }

		public Enfermeiro getEnfermeiroResponsavel() {
			return enfermeiroResponsavel;
		}

		public void setEnfermeiroResponsavel(Enfermeiro enfermeiroResponsavel) {
			this.enfermeiroResponsavel = enfermeiroResponsavel;
		}

		public Paciente getPaciente() {
			return paciente;
		}

		public void setPaciente(Paciente paciente) {
			this.paciente = paciente;
		}

	    
	}


	class RegistroProcedimento {
	    private Medico medico;
	    private Enfermeiro enfermeiro;
	    private Procedimento procedimento;
	    private List<Medicamento> medicamentosUtilizados;
	    private List<Insumo> insumosUtilizados;

	    public RegistroProcedimento(Medico medico, Enfermeiro enfermeiro, Procedimento procedimento) {
	        this.setMedico(medico);
	        this.setEnfermeiro(enfermeiro);
	        this.setProcedimento(procedimento);
	        this.medicamentosUtilizados = new ArrayList<>();
	        this.insumosUtilizados = new ArrayList<>();
	    }

	    public void adicionarMedicamento(Medicamento medicamento) {
	        medicamentosUtilizados.add(medicamento);
	    }

	    public void adicionarInsumo(Insumo insumo) {
	        insumosUtilizados.add(insumo);
	    }

		public Medico getMedico() {
			return medico;
		}

		public void setMedico(Medico medico) {
			this.medico = medico;
		}

		public Enfermeiro getEnfermeiro() {
			return enfermeiro;
		}

		public void setEnfermeiro(Enfermeiro enfermeiro) {
			this.enfermeiro = enfermeiro;
		}

		public Procedimento getProcedimento() {
			return procedimento;
		}

		public void setProcedimento(Procedimento procedimento) {
			this.procedimento = procedimento;
		}

	   
	}

	class HospitalApp {
	    private List<Paciente> pacientes;
	    private List<Medico> medicos;
	    private List<Enfermeiro> enfermeiros;
	    private List<Medicamento> medicamentos;
	    private List<Insumo> insumos;
	    private List<Procedimento> procedimentos;
	    private List<Triagem> triagens;
	    private List<RegistroProcedimento> registrosProcedimentos;

	    public HospitalApp() {
	        this.pacientes = new ArrayList<>();
	        this.medicos = new ArrayList<>();
	        this.enfermeiros = new ArrayList<>();
	        this.medicamentos = new ArrayList<>();
	        this.insumos = new ArrayList<>();
	        this.procedimentos = new ArrayList<>();
	        this.triagens = new ArrayList<>();
	        this.registrosProcedimentos = new ArrayList<>();
	    }


	    public void cadastrarMedicamento(Medicamento medicamento) {
	        medicamentos.add(medicamento);
	    }

	    public void cadastrarInsumo(Insumo insumo) {
	        insumos.add(insumo);
	    }

	    public void cadastrarProcedimento(Procedimento procedimento) {
	        procedimentos.add(procedimento);
	    }

	    public void cadastrarMedico(Medico medico) {
	        medicos.add(medico);
	    }

	    public void cadastrarEnfermeiro(Enfermeiro enfermeiro) {
	        enfermeiros.add(enfermeiro);
	    }

	    public void cadastrarPaciente(Paciente paciente) {
	        pacientes.add(paciente);
	    }

	    
	    public void registrarTriagem(Triagem triagem) {
	        triagens.add(triagem);
	    }

	 
	    public void registrarAtendimento(RegistroProcedimento registroProcedimento) {
	        registrosProcedimentos.add(registroProcedimento);
	    }


	    public void registrarProcedimentoParteDeOutro(Procedimento procedimentoPai, Procedimento procedimentoFilho) {
	        procedimentoPai.adicionarProcedimentoParte(procedimentoFilho);
	    }

 
	    public static void main(String[] args) {
	        HospitalApp hospital = new HospitalApp();

	        Medicamento paracetamol = new Medicamento("Paracetamol", 100);
	        hospital.cadastrarMedicamento(paracetamol);

	        Insumo gazeEstéril = new Insumo("Gaze Estéril", 50);
	        hospital.cadastrarInsumo(gazeEstéril);

	        Procedimento consulta = new Procedimento("Consulta");
	        hospital.cadastrarProcedimento(consulta);

	        Medico drSilva = new Medico("Dr. Silva", 40);
	        hospital.cadastrarMedico(drSilva);

	        Enfermeiro enfermeiraRosa = new Enfermeiro("Enfermeira Rosa", 35);
	        hospital.cadastrarEnfermeiro(enfermeiraRosa);

	        Paciente paciente1 = new Paciente("João", 30, "Clínica", false);
	        hospital.cadastrarPaciente(paciente1);

	        Triagem triagemPaciente1 = new Triagem(enfermeiraRosa, paciente1);
	        hospital.registrarTriagem(triagemPaciente1);


	        RegistroProcedimento registroConsultaPaciente1 = new RegistroProcedimento(drSilva, enfermeiraRosa, consulta);
	        hospital.registrarAtendimento(registroConsultaPaciente1);


	        Medicamento antibiotico = new Medicamento("Antibiótico", 50);
	        Insumo seringaDescartavel = new Insumo("Seringa Descartável", 30);

	        Procedimento exameSangue = new Procedimento("Exame de Sangue");
	        exameSangue.adicionarMedicamento(antibiotico);
	        exameSangue.adicionarInsumo(seringaDescartavel);

	        RegistroProcedimento registroExameSangue = new RegistroProcedimento(drSilva, enfermeiraRosa, exameSangue);
	        hospital.registrarAtendimento(registroExameSangue);

	        Procedimento cirurgia = new Procedimento("Cirurgia");
	        hospital.cadastrarProcedimento(cirurgia);

	        hospital.registrarProcedimentoParteDeOutro(cirurgia, consulta);
	    }
	}



