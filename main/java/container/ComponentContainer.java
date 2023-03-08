package container;

import dto.Profile;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import repository.CardRepository;
import repository.ProfileRepository;
import repository.TerminalRepository;
import repository.TransactionRepository;
import service.*;

public class ComponentContainer {
    public static Profile currentProfile = null;
    static ApplicationContext context=new ClassPathXmlApplicationContext("spring-config.xml");
    public static CardRepository cardRepository = (CardRepository) context.getBean("cardRepository");
    public static ProfileRepository profileRepository = (ProfileRepository) context.getBean("profileRepository");
    public static TerminalRepository terminalRepository = (TerminalRepository) context.getBean("terminalRepository");
    public static TransactionRepository transactionRepository = (TransactionRepository) context.getBean("transactionRepository");
    public static CardService cardService = (CardService) context.getBean("cardService");
    public static ProfileService profileService = (ProfileService) context.getBean("profileService");
    public static TerminalService terminalService = (TerminalService) context.getBean("terminalService");
    public static TransactionService transactionService = (TransactionService) context.getBean("transactionService");
}