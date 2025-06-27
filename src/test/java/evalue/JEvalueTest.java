package evalue;

import com.github.paohaijiao.factory.JAnnontationResultProviderFactory;
import org.junit.Test;

import java.io.IOException;

public class JEvalueTest {

    @Test
    public void tesstAction() throws IOException {
        JAnnontationResultProviderFactory router = new JAnnontationResultProviderFactory();
        router.scanAndRegister("com.github.paohaijiao.evalue.impl");
        System.out.println(router.route(String.class, "hello"));
        System.out.println(router.route(Integer.class, 42));
    }
}
