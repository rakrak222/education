import java.util.Set;
import javax.servlet.ServletContainerInitializer;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.HandlesTypes;

@HandlesTypes(WebServlet.class)
public class ServletMappingPrinter implements ServletContainerInitializer {

    @Override
    public void onStartup(Set<Class<?>> c, ServletContext ctx) throws ServletException {
        if (c != null) {
            for (Class<?> clazz : c) {
                WebServlet webServlet = clazz.getAnnotation(WebServlet.class);
                if (webServlet != null) {
                    System.out.println("Class: " + clazz.getName() + " -> URL Patterns: " + String.join(", ", webServlet.urlPatterns()));
                }
            }
        }
    }
}
