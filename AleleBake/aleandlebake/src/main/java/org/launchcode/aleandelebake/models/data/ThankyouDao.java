package org.launchcode.aleandelebake.models.data;

import org.launchcode.aleandelebake.models.Thankyou;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
@Transactional
public interface ThankyouDao extends CrudRepository<Thankyou, Integer> {
}
