import java.lang.reflect.Field;

public class SecurityEngine {
    public static void maskData(Object o) {
        try {
            Class<?> cls = o.getClass();
            for (Field a : cls.getDeclaredFields()) {
                System.out.println("Analizando campo: " + a.getName());
                if (a.isAnnotationPresent(SensitiveInfo.class)) {
                    if (a.getType().equals(String.class)) {
                        a.setAccessible(true);
                        String valorOriginal = (String) a.get(o);
                        if (valorOriginal != null) {
                            SensitiveInfo annotation = a.getAnnotation(SensitiveInfo.class);
                            char maskChar = annotation.maskChar();
                            String resultado;

                            if (annotation.showVisible()) {
                                if (valorOriginal.length() <= 2) {
                                    resultado = valorOriginal;
                                } else {
                                    String starts = valorOriginal.substring(0, 2);
                                    int maskLength = valorOriginal.length() - 2;
                                    resultado = starts + String.valueOf(maskChar).repeat(maskLength);
                                }
                            } else {
                                resultado = String.valueOf(maskChar).repeat(valorOriginal.length());
                            }
                            System.out.println(resultado);
                        }
                    } else {
                        System.out.println("El tipo no es soportado para enmascaramiento.");
                    }
                } else {
                    System.out.println("Campo sin protección.");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}