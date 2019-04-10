package test;

import beans.Employee;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Client {
    public static void main(String[] args) {
        Resource res = new ClassPathResource("resources/applicationContext.xml");
        BeanFactory factory = new XmlBeanFactory(res);

        Employee emp1 = (Employee) factory.getBean("emp1");
        Employee emp2 = (Employee) factory.getBean("emp2");
        Employee emp3 = (Employee) factory.getBean("emp3");

        System.out.println(emp1);
        System.out.println(emp2);
        System.out.println(emp3);
    }
}
