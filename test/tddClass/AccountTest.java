package tddClass;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class AccountTest {
    @Test
    public void accountCanBeCreatedTest(){
        Account account = new Account();
        assertNotNull(account);
    }
    @Test
    public void accountCanBeCreatedWithAllDetails(){
       Account account = new Account();
        assertEquals("2093797237",account.getAccountNumber());
        assertEquals("Dami Akinson", account.getName());
    }
}
