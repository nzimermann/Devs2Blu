package br.com.exer11;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ProjetoPesquisa {
	private String codigo;
	private String titulo;
	private LocalDate dtInicio;
	private LocalDate dtFim;
	private Professor professorResponsavel;
	private List<Pesquisador> equipe;

	public ProjetoPesquisa(String codigo, String titulo, LocalDate dtInicio, LocalDate dtFim,
			Professor professorResponsavel) {
		super();
		this.setCodigo(codigo);
		this.setTitulo(titulo);
		this.setDtInicio(dtInicio);
		this.setDtFim(dtFim);
		this.setProfessorResponsavel(professorResponsavel);
		this.setEquipe(new ArrayList<Pesquisador>());
	}

	public ProjetoPesquisa(String codigo, String titulo, LocalDate dtInicio, LocalDate dtFim,
			Professor professorResponsavel, List<Pesquisador> equipe) {
		super();
		this.setCodigo(codigo);
		this.setTitulo(titulo);
		this.setDtInicio(dtInicio);
		this.setDtFim(dtFim);
		this.setProfessorResponsavel(professorResponsavel);
		this.setEquipe(equipe);
	}

	public ProjetoPesquisa(String codigo, String titulo, Professor professorResponsavel) {
		super();
		this.setCodigo(codigo);
		this.setTitulo(titulo);
		this.setDtInicio(LocalDate.now());
		this.setProfessorResponsavel(professorResponsavel);
		this.setEquipe(new ArrayList<Pesquisador>());
	}

	public ProjetoPesquisa(String codigo, String titulo, Professor professorResponsavel, List<Pesquisador> equipe) {
		super();
		this.setCodigo(codigo);
		this.setTitulo(titulo);
		this.setDtInicio(LocalDate.now());
		this.setProfessorResponsavel(professorResponsavel);
		this.setEquipe(equipe);
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public LocalDate getDtInicio() {
		return dtInicio;
	}

	public void setDtInicio(LocalDate dtInicio) {
		this.dtInicio = dtInicio;
	}

	public LocalDate getDtFim() {
		return dtFim;
	}

	public void setDtFim(LocalDate dtFim) {
		this.dtFim = dtFim;
	}

	public Professor getProfessorResponsavel() {
		return professorResponsavel;
	}

	public void setProfessorResponsavel(Professor professorResponsavel) {
		this.professorResponsavel = professorResponsavel;
	}

	public List<Pesquisador> getEquipe() {
		return equipe;
	}

	public void setEquipe(List<Pesquisador> equipe) {
		this.equipe = equipe;
	}

	public void addMembroEquipe(Pesquisador membro) {
		this.getEquipe().add(membro);
	}

	public void removeMembroEquipe(Pesquisador membro) {
		this.getEquipe().remove(membro);
	}

	public String getInfoParticipantes() {
		Professor prof = this.getProfessorResponsavel();
		String msg = "Responsável: " + prof.getNome() + " (" + prof.getTipo() + ")\n";
		for (Pesquisador p : equipe) {
			msg += "Nome: " + p.getNome() + " (" + p.getTipo() + ")\n";
		}
		return msg.substring(0, msg.length() - 1);
	}

}
