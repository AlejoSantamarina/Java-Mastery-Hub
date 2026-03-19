import java.lang.reflect.Field;

public class DependencyInjector {
    public static void inject(Object obj) { //A el objeto obj le asignamos un nuevo objeto como atributo.
        for(Field field : obj.getClass().getDeclaredFields()) {
            if(field.isAnnotationPresent(Autowired.class)) {
                try {
                    field.setAccessible(true);
                    Class <?> type = field.getType();

                    Object instance = type.getDeclaredConstructor().newInstance();

                    field.set(obj, instance);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
