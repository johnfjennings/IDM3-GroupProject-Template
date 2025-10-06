package idm3.project.gallery.repository;

import idm3.project.gallery.model.Project;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProjectRepository extends CrudRepository<Project, Long> {
    // Find all projects ordered by creation date descending
    List<Project> findAllByOrderByCreationDateDesc();
}

