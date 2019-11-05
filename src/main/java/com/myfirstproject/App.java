package com.myfirstproject;

import com.myfirstproject.dao.PersonDao;
import java.util.List;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext cntxt=new ClassPathXmlApplicationContext("Spring.xml");
        PersonDao personDao=cntxt.getBean(PersonDao.class);
        
        Person person=new Person();
        Person person2=new Person();
        person.setName("Name");
        person.setCountry("Belarus");
        person2.setName("Vasia");
        person2.setCountry("Russia");
        
        personDao.save(person);
        personDao.save(person2);
        
        System.out.println("Person"+person);
        
        List<Person> list=personDao.list();
        
        for(Person p:list){
            System.out.println("Person List::"+p);
            
        }
        
        cntxt.close();
    }
}
