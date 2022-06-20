package com.perscholas.jpainheritance;

import com.perscholas.jpainheritance.model.*;
import com.perscholas.jpainheritance.repository.ArtPieceRepository;
import com.perscholas.jpainheritance.repository.PaintingRepository;
import com.perscholas.jpainheritance.repository.SculptureRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class JpaInheritSingleTableApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext configurableApplicationContext = SpringApplication.run(JpaInheritSingleTableApplication.class, args);
		ArtPieceRepository paintingRepository = configurableApplicationContext.getBean(PaintingRepository.class);
		ArtPieceRepository sculptureRepository = configurableApplicationContext.getBean(SculptureRepository.class);

		ArtPiece sculpture = new Sculpture("Juan", Material.WOOD, 200.2);
		ArtPiece painting = new Painting("Michael", PaintingTechnique.OIL, 25.5, 44.9);

		sculptureRepository.save(sculpture);
		paintingRepository.save(painting);
	}

}
