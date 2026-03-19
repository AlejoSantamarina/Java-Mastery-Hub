public class UserProfile {
    @Autowired
    private EmailService emailService;

    public UserProfile(EmailService emailService) {
        this.emailService = emailService;
    }

    public void saludar() {
        return emailService;
    }
}
