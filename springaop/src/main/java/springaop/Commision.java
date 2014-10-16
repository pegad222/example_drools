package springaop;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;

/**
 * Encoder option
 * 
 * @author BEEVA
 * 
 */
@Documented
@Constraint(validatedBy = {})
@Target({ ElementType.ANNOTATION_TYPE, ElementType.TYPE, ElementType.FIELD, ElementType.METHOD })
@Retention(RetentionPolicy.RUNTIME)
public @interface Commision {
    
    int type();
    
    int active();
   
}
