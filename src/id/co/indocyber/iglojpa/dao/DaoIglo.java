/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.co.indocyber.iglojpa.dao;

import id.co.indocyber.iglojpa.model.Employee;
import id.co.indocyber.iglojpa.model.Person;
import id.co.indocyber.iglojpa.model.Project;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

/**
 *
 * @author user
 */
public class DaoIglo {

    private EntityManager em;

    public DaoIglo() {
    }

    public DaoIglo(EntityManager em) {
        this.em = em;
    }

    private List<Person> getPerson() {
     
        Query q = em.createQuery("Select p From Person p");
        List<Person> persons = q.getResultList();
        em.close();
        return persons;
    }

    private List<Employee> getEmployee() {
        
        Query q = em.createQuery("Select e from Employee e");
        List<Employee> employees = q.getResultList();
        em.close();
        return employees;
    }

    private List<Project> getProject() {
        
        Query q = em.createQuery("Select p from Project");
        List<Project> projects = q.getResultList();
        em.close();
        return projects;
    }
    
    
    
    

    }

