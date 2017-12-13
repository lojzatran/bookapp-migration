module bookapp {
    requires hibernate.core;
    requires hibernate.jpa;
    requires spring.context;
    requires javax.inject;
    requires spring.tx;

    opens books.impl.entities;
    opens books.impl.service;
    opens bookstore.impl.service;
    opens books.api.service;
    opens books.api.entities;
}