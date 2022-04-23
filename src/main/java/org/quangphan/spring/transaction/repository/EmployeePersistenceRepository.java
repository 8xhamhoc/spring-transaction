package org.quangphan.spring.transaction.repository;

import org.quangphan.spring.transaction.domain.Employee;

public interface EmployeePersistenceRepository {

    Employee findByCustomId(String id);

}
