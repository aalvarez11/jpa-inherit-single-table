package com.perscholas.jpainheritance.repository;

import com.perscholas.jpainheritance.model.ArtPiece;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface ArtPieceRepository extends JpaRepository<ArtPiece, Long> {

}
