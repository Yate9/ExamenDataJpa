package edu.lucas.examenreal;

import edu.lucas.examenreal.Entity.Asignatura;
import edu.lucas.examenreal.Entity.Estudiante;
import edu.lucas.examenreal.Entity.Matricula;
import edu.lucas.examenreal.Repository.IAsignaturaRepository;
import edu.lucas.examenreal.Repository.IEstudianteRepository;
import edu.lucas.examenreal.Repository.IMatriculaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Optional;

@SpringBootApplication
public class ExamenrealApplication implements CommandLineRunner {
	@Autowired
	IAsignaturaRepository asignaturaRepository;
	@Autowired
	IEstudianteRepository estudianteRepository;
	@Autowired
	IMatriculaRepository matriculaRepository;

	public static void main(String[] args) {
		SpringApplication.run(ExamenrealApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		System.out.println("Hay un total de: "+asignaturaRepository.count()+" asignaturas");
		System.out.println("Hay un total de: "+estudianteRepository.count()+" estudiantes");
		System.out.println("Hay un total de: "+matriculaRepository.count()+" matriculas");


		//No se porque estos dos metodos hace que me pete el programa(creo que estan correctos)

		/*Optional<Estudiante> estudiante1=estudianteRepository.findById(1L);
		if(estudiante1.isPresent()){
			estudiante1.get().getExpedienteAcademico().toString();
		}else {
			System.out.println("No se encontro el estudiante con id 1");
		}

		Optional<Estudiante> estudiante2=estudianteRepository.findByDni("23456789B");
		if(estudiante2.isPresent()){
			System.out.println(estudiante2.get().toString());
		}else {
			System.out.println("No se encontro el estudiante con dni 23456789B");
		}

		 */

		for(Matricula matricula:matriculaRepository.findByCalificacionGreaterThanEqual(5.0)){
			System.out.println("Fecha: "+matricula.getFechaMatriculacion());
			System.out.println("Nota: "+matricula.getCalificacion());
			System.out.println("Alumno: "+matricula.getEstudiante().getNombre());
		}

		long asignatura=asignaturaRepository.countByCreditos(6);
		System.out.println("Hay un total de: "+asignatura+" asignaturas con 6 creditos");

		

	}
}
