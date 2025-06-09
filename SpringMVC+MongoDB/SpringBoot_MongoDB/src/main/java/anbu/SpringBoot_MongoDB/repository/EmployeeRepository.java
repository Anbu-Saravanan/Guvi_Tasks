package anbu.SpringBoot_MongoDB.repository;


import anbu.SpringBoot_MongoDB.model.Employee;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface EmployeeRepository extends MongoRepository<Employee,String> {

}
