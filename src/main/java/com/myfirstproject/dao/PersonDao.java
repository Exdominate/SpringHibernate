
package com.myfirstproject.dao;
import com.myfirstproject.Person;
import java.util.List;

public interface PersonDao {
    void save(Person p);
    List<Person> list();

    
}
