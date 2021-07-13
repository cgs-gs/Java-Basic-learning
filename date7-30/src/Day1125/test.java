package Day1125;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

public class test {
    @myannotation("chenleo")
    public void test2(){

    }
}

@Target({ElementType.TYPE,ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@interface myannotation{
    //注解的参数，不是方法，格式：参数类型+参数名();
    String value();
}