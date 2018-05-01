package de.mte.receipt;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoSwingApplication {

    /**
     * Application main() method.
     *
     * Uses the fluent {@link SpringApplicationBuilder} to create and run the
     * {@link SpringApplication} object.
     *
     * The options specified:
     *
     * <ul>
     * <li>headless(false) - allow AWT classes to be instantiated</li>
     * <li>web(false) - prevents the bundling of Tomcat or other Web components
     * </ul>
     *
     * Execution is picked up by the {@link Runner} class, which implements
     * {@link CommandLineRunner}.
     *
     * @param args
     */
    public static void main(String[] args) {
        new SpringApplicationBuilder(DemoSwingApplication.class)
                .headless(false)
                .web(WebApplicationType.NONE)
                .run(args);
    }

    /**
     * Creates the {@link MainGuiFrame} object and returns it.
     *
     * This @Bean could have been replaced by a @Component annotation being
     * added to the {@link MainGuiFrame} class.
     *
     * @return the application window
     */
    @Bean
    public MainGuiFrame frame() {
        return new MainGuiFrame();
    }
}
