package com.coding.src;

import com.coding.src.entitys.Patient;
import com.coding.src.repository.PatientRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;

@SpringBootApplication
public class SrcApplication {

	public static void main(String[] args) {
		SpringApplication.run(SrcApplication.class, args);
	}
 	@Bean
	public CommandLineRunner start(PatientRepository patientRepository){
			return args -> {
				// 1 er methode Instancaition donne
				Patient p1 = new Patient();
				p1.setNom("anouar");
				p1.setPrenom("nejjari");
				p1.setDateNaissance(new Date());
				p1.setMalade(true);
				p1.setScore(360);
				// 2 éme methode Instancaition
				Patient p2 = new Patient(null, "tariq","el ogri", new Date(), true, 200 );
				Patient p3 = new Patient(null, "tariq","el ogri", new Date(), true, 200 );
				Patient p4 = new Patient(null, "tariq","el ogri", new Date(), true, 200 );
				Patient p5 = new Patient(null, "tariq","el ogri", new Date(), true, 200 );
				Patient p6 = new Patient(null, "tariq","el ogri", new Date(), true, 200 );

				Patient p7 = Patient.builder()
						.nom("youness")
						.prenom("boutahr")
						.score(340)
						.dateNaissance(new Date())
						.malade(true)
						.build();
				Patient p8 = Patient.builder()
						.nom("youness")
								.prenom("bouttahr")
										.dateNaissance(new Date())
												.malade(true)
														.score(1000).build();
			patientRepository.save(p1);
			patientRepository.save(p2);
			patientRepository.save(p3);
				patientRepository.save(p4);
				patientRepository.save(p5);
				patientRepository.save(p6);
				patientRepository.save(p7);
				patientRepository.save(p8);
				System.out.println("1 er objet "+p1.toString()+" 2 eme objet " +p2+ "3 éme Objet"+p3.toString());
		};
	}

}
