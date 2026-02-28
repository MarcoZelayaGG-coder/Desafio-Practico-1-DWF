package sv.edu.udb.spring_esencial.repository.domain.implementation;

public interface AccountRepository {
    String findAccountNumber(final Integer userId);
}
