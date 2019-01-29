package com.spring.model;

import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

import com.spring.model.Person;

/**
 * A  meta model class used to create type safe queries from person
 * information.
 */
@StaticMetamodel(Person.class)
public class Person_ {
    public static volatile SingularAttribute<Person, String> lastName;
}
