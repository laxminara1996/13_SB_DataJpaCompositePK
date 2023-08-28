package in.laxmi;

import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.laxmi.entity.Account;
import in.laxmi.entity.AccountPk;
import in.laxmi.repo.AccountRepository;

@SpringBootApplication
public class SbDataJpaCompositePkAppApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctxt = SpringApplication.run(SbDataJpaCompositePkAppApplication.class, args);
		AccountRepository repo = ctxt.getBean(AccountRepository.class);
		AccountPk acp = new AccountPk();
		acp.setAccNum(123456);
		acp.setAccType("savings");
		Account ac = new Account();
		ac.setAccountpk(acp);
		ac.setBranch("tdp");
		ac.setHolderName("laxmi");
		repo.save(ac);
		Optional<Account> findById = repo.findById(acp);
		if(findById.isPresent()) {
			System.out.println(findById.get());
		}
		
		
	}

}
