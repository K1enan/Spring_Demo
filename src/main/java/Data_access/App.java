package Data_access;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App
{

    public static void main( String[] args )
    {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(ComponentScanConfig.class);
        StudentDao studentDao = context.getBean(StudentDao.class);

    }
}
