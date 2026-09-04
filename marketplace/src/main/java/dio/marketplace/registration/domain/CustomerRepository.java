package dio.marketplace.registration.domain;

import java.util.List;

public interface CustomerRepository {
    Customer sabe(Customer customer);
    List<Customer> findAll();
}
