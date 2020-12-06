package springintro;

import java.time.LocalDate;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import springintro.bean.Employee;
import springintro.bean.Product;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext(new String[] {"spring-config.xml"});
        Product product1 = context.getBean("product", Product.class);
        product1.setName("Excellent snake oil");
        product1.setPrice(5);
        System.out.println(product1);
        
        Product product2 = context.getBean("product", Product.class);
        product1.setName("Excellent mish oil");
        product1.setPrice(6);
        System.out.println(product2);
        
        Product featuredProduct = context.getBean("featuredProduct", Product.class);
        System.out.println(featuredProduct);
        Product featuredProduct2 = context.getBean("featuredProduct2", Product.class);
        System.out.println(featuredProduct2);
        
        LocalDate localDate = context.getBean("localDate", LocalDate.class);
        System.out.println(localDate);
        
        Employee employee1 = context.getBean("employee1", Employee.class);
        System.out.println(employee1);
        Employee employee2 = context.getBean("employee2", Employee.class);
        System.out.println(employee2);
    }
}
