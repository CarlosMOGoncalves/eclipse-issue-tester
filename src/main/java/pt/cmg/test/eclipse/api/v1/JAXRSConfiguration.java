package pt.cmg.test.eclipse.api.v1;

import java.util.HashSet;
import java.util.Set;
import javax.enterprise.context.ApplicationScoped;
import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;
import pt.cmg.test.eclipse.api.v1.resources.users.TestResource;

@ApplicationPath("/v1")
@ApplicationScoped
public class JAXRSConfiguration extends Application {

    @Override
    public Set<Class<?>> getClasses() {
        Set<Class<?>> resources = new HashSet<>();

        // Resources
        resources.add(TestResource.class);

        return resources;
    }

}
