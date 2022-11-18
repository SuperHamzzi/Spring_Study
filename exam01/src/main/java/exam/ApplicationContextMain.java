package exam;

public class ApplicationContextMain {
    public static void main(String[] args) throws Exception {
        ApplicationContext context = new ApplicationContext();
        Object book1 = context.getBean("book1");
    }
}
