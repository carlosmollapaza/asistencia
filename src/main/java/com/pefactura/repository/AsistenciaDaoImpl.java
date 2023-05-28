package com.pefactura.repository;

import com.pefactura.domain.Asistencia;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.JoinType;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.List;

@Repository
public class AsistenciaDaoImpl implements AsistenciaDao
{
    @Autowired
    private EntityManager entityManager;

    @Override
    public List<Asistencia> getByRolList(Integer rolId)
    {
        CriteriaBuilder builder = entityManager.getCriteriaBuilder();
        CriteriaQuery<Asistencia> criteriaQuery = builder.createQuery(Asistencia.class);
        Root<Asistencia> root = criteriaQuery.from(Asistencia.class);
        root.fetch("rol", JoinType.LEFT);

        List<Predicate> predicateList = new ArrayList<>();
        predicateList.add(root.get("rol").get("id").in(rolId));
        criteriaQuery.where(predicateList.toArray(Predicate[]::new));

        TypedQuery<Asistencia> typedQuery = entityManager.createQuery(criteriaQuery);
        return typedQuery.getResultList();
    }
}