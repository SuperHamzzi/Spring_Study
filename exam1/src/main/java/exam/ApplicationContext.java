package exam;

//import java.io.FileInputStream;
//import java.io.FileReader;
//import java.io.IOException;
//import java.lang.reflect.Method;
//import java.util.HashMap;
//import java.util.Map;
//import java.util.Properties;
//
//public class ApplicationContext {
//    private static ApplicationContext instance = new ApplicationContext();
//    private  Properties props;
//    private   Map objectMap;
//
//    public static ApplicationContext getInstance(){
//        return instance;
//    }
//
//  private ApplicationContext(){
//       props = new Properties();
//        objectMap = new HashMap<String, Object>();
//        try {
//            props.load(new FileInputStream("src/main/resources/Beans.properties"));
//        } catch (IOException e) {
//           e.printStackTrace();
//        }
//        props.getProperty("book");
//
//    }
//    public Object getBean(String id) throws Exception {
//        Object o1 = objectMap.get(id);
//        if(o1 == null) {
//            String className = props.getProperty(id);
//            Class clazz = Class.forName(className);
//
////        ClassLoader를 이용한 인스턴스 생성, 기본생성자가 있어야 된다.
//            Object o = clazz.newInstance(); // clazz정보를 이용해 인스턴스를 생성한다.
//        objectMap.put(id, o);
//        o1 = objectMap.get(id);
//        }
//        return o1;
//    }
//
//}
