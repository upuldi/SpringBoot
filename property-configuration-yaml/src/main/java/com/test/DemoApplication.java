package com.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties
public class DemoApplication {

    @Value("${anonhierarchicalval}")
    private String nonHierarchicalValueFromYaml;

    @Value("${configuration.someprop.someotherprop.anotherprop}")
    private String propertyFromAHierarchicalRepresentation;

    @Value("${profile.based.property.currentvalue}")
    private String aProfileBasedProperty;

    @Autowired
    private APropertyBean aPropertyBean;


    /**
     * This method is used to set properties from the property files
     *
     * Do not put the code inside this inside the main method as it will not work correctly
     *
     *
     * @param notToBeUsedString
     */
    @Value("${configuration.projectName}")
    public void setPropertiesDumMethod(String notToBeUsedString) {

        System.out.println(" \n\n\n********************* Prop Value **************************************");

        System.out.println("Some non hierarchical value is : " + nonHierarchicalValueFromYaml);
        System.out.println("Hierarchical property from yaml is : " + propertyFromAHierarchicalRepresentation);
        System.out.println("A profile based property : " + aProfileBasedProperty);

        System.out.println("Property from a bean : " + aPropertyBean.getPropertyOne());
        System.out.println("Property from a bean : " + aPropertyBean.getPropertyTwo());
        System.out.println("Property from a bean : " + aPropertyBean.getPropertyThree());

        System.out.println(" ********************* Prop Value **************************************\n\n\n");
    }

    @Value("${aPropertyDirectlyToAMethod}")
    public void setAPropertyToAMethod(String aPropertyDirectlyToAMethod) {
        System.out.println("A Property Directly set to a method : " + aPropertyDirectlyToAMethod);
    }




    public static void main(String[] args) {

        SpringApplication.run(DemoApplication.class, args);
        DemoApplication demoApplication = new DemoApplication();
    }


    public String getNonHierarchicalValueFromYaml() {
        return nonHierarchicalValueFromYaml;
    }
}
