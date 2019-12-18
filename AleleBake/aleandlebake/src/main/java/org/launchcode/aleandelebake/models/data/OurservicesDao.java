package org.launchcode.aleandelebake.models.data;

import org.launchcode.aleandelebake.models.Ourservices;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
@Transactional
public interface OurservicesDao extends CrudRepository<Ourservices, Integer> {
}
