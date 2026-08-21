package br.com.dio;

import br.com.dio.persistence.EmployeeAuditDAO;
import br.com.dio.persistence.EmployeeDAO;
import br.com.dio.persistence.EmployeeParamDAO;
import br.com.dio.persistence.entity.EmployeeEntity;
import net.datafaker.Faker;
import org.flywaydb.core.Flyway;

import java.math.BigDecimal;
import java.time.LocalTime;
import java.time.OffsetDateTime;
import java.util.Locale;
import java.util.stream.Stream;

import static java.time.ZoneOffset.UTC;

public class Main {

    private final static EmployeeDAO employeeDAO = new EmployeeDAO();
    private final static EmployeeAuditDAO employeeAuditDAO = new EmployeeAuditDAO();
    private final static EmployeeParamDAO employeeParamDAO = new EmployeeParamDAO();
    private final static Faker faker = new Faker(Locale.of("pt", "BR"));

    public static void main(String[] args) {
        var flyway = Flyway.configure()
                .dataSource("jdbc:mysql://localhost/jdbc_sample", "dbeaver", "test")
                .load();
        flyway.migrate();

        /*var employee = new EmployeeEntity();
        employee.setName("João");
        employee.setSalary(new BigDecimal("4800"));
        employee.setBirthday(OffsetDateTime.now().minusYears(30));
        System.out.println(employee);
        employeeDAO.insert(employee);
        System.out.println(employee);*/

        //employeeDAO.findAll().forEach(System.out::println);

        //System.out.println(employeeDAO.findById(1));

        /*var update = new EmployeeEntity();
        update.setId(3);
        update.setName("Gabriel");
        update.setSalary(new BigDecimal("5500"));
        update.setBirthday(OffsetDateTime.now().minusYears(36).minusDays(10));
        employeeDAO.update(update);

        employeeDAO.delete(update.getId());

        employeeAuditDAO.findAll().forEach(System.out::println);*/

       var entities = Stream.generate(() -> {
            var employee = new EmployeeEntity();
            employee.setName((faker.name().fullName()));
            employee.setSalary(new BigDecimal(faker.number().digits(4)));
            employee.setBirthday(OffsetDateTime.of(faker.timeAndDate().birthday(18, 55), LocalTime.MIN, UTC));
            return employee;
        }).limit(4000).toList();

        employeeParamDAO.insertBath(entities);

    }
}
