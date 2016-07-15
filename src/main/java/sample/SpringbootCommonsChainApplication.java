package sample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.apache.commons.chain.impl.ChainBase;
import org.apache.commons.chain.impl.ContextBase;

@SpringBootApplication
public class SpringbootCommonsChainApplication {

	public static void main(String[] args) throws Exception {
        Object[] sources = new Object[] {SpringbootCommonsChainApplication.class, new ClassPathResource("applicationContext.groovy")};
        ApplicationContext appContext = SpringApplication.run(sources, args);
        ChainBase sellVehicleChain = (ChainBase)appContext.getBean("sellVehicleChain");
        ContextBase context = new ContextBase();
        sellVehicleChain.execute(context);
	}
}
