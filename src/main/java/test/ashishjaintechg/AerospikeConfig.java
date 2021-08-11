package test.ashishjaintechg;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.aerospike.core.AerospikeTemplate;
import org.springframework.data.aerospike.repository.config.EnableAerospikeRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.aerospike.client.AerospikeClient;
import com.aerospike.client.policy.ClientPolicy;

@Configuration
@EnableTransactionManagement
@EnableAerospikeRepositories(basePackages= {"test.ashishjaintechg.repo"})
public class AerospikeConfig {
	
	@Bean
	public AerospikeTemplate aerospikeTemplate() {
		return new AerospikeTemplate(aerospikeClient(), "test");
		
	}

	@Bean
	public AerospikeClient aerospikeClient() {
		ClientPolicy cp = new ClientPolicy();
		cp.failIfNotConnected = true;
		return new AerospikeClient(cp,"172.17.0.2", 3000);
	}

}
