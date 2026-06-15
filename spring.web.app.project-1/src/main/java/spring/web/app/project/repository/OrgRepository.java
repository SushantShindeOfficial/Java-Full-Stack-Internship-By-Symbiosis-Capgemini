package spring.web.app.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import spring.web.app.project.entity.Org;

public interface OrgRepository extends JpaRepository<Org, Integer>{

}
