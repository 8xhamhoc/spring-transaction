package org.quangphan.spring.transaction.repository;

import org.quangphan.spring.transaction.domain.Employee;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public class EmployeePersistenceRepositoryImpl implements EmployeePersistenceRepository {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public Employee findByCustomId(String id) {
        return (Employee) entityManager.createQuery("FROM Employee e WHERE e.id=:id")
                .setParameter("id", id)
                .getSingleResult();
    }
}
