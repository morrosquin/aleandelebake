package org.launchcode.aleandelebake.models.data;

import org.launchcode.aleandelebake.models.Msg;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
@Transactional
public interface MsgDao extends CrudRepository<Msg, Integer> {
}
