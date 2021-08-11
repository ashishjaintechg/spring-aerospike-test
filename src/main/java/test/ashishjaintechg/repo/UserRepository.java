package test.ashishjaintechg.repo;

import org.springframework.data.aerospike.repository.AerospikeRepository;

public interface UserRepository extends AerospikeRepository<User, Integer> {

}
