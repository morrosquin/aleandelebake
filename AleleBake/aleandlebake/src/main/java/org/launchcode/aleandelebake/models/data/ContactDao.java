package org.launchcode.aleandelebake.models.data;

import org.launchcode.aleandelebake.models.Contact;
import org.springframework.data.repository.CrudRepository;

public interface ContactDao extends CrudRepository<Contact, Integer> {
}
