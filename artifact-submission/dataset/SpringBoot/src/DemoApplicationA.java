@SpringBootApplication
@ComponentScan // Reports 'Redundant declaration: @SpringBootApplication already implies @ComponentScan'
public class DemoApplicationA {
    public static void main(String[] args) {
        SpringApplication.run(DemoApplicationA.class, args);
    }
}