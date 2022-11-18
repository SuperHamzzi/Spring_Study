package exam;

import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.Properties;

public class ApplicationContext {
    Properties props;
    public ApplicationContext(){
        try {
            props.load(new FileInputStream("src/main/resources/Beans.properties"));
        } catch (IOException e) {
            e.printStackTrace();
        }
     
    }
    public Object getBean(String id) throws Exception{
        String className = props.getProperty(id);
        Class clazz = Class.forName(className);
        Method[] methods = clazz.getMethods();
        for(Method m : methods){
            System.out.println(m.getName());
        }
        clazz
        return null;
    }
}
