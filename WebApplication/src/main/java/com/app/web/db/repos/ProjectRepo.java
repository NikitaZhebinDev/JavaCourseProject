package com.app.web.db.repos;

import com.app.web.db.entity.Project;
import org.springframework.data.repository.CrudRepository;

/**
 * This will be AUTO IMPLEMENTED by Spring into a Bean called Project Repository
 * CRUD refers Create, Read, Update, Delete
 */
public interface ProjectRepo extends CrudRepository<Project, Integer> {
}
