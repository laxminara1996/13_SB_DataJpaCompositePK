package in.laxmi.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.laxmi.entity.Account;
import in.laxmi.entity.AccountPk;

public interface AccountRepository extends JpaRepository<Account, AccountPk> {

}
