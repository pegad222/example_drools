package springaop;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.reflect.MethodSignature;

 
@Aspect
public class DoAfterReturningAspect {
	
	private ServiceCommisionImpl comision;
	
	public DoAfterReturningAspect() {
		super();
	}
	
	@AfterReturning(pointcut = "@annotation(springaop.Commision)", returning= "result")
	public void doAfterReturning(JoinPoint joinPoint, Object result) throws IOException, NoSuchMethodException, SecurityException
	   , IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		
		CommisionValue comisionValue = null;
		
		MethodSignature signature = (MethodSignature) joinPoint.getSignature();
	    String methodName = signature.getMethod().getName();
	    Class<?>[] parameterTypes = signature.getMethod().getParameterTypes();
	    Annotation[] annotations = joinPoint.getTarget().getClass().getMethod(methodName,parameterTypes).getAnnotations();
	    
	    for(Annotation annotation : annotations){
		    if(annotation instanceof Commision){
		    	Commision myAnnotation = (Commision) annotation;
		    	comisionValue = new CommisionValue(myAnnotation.active(),myAnnotation.type(),(Double) result);
		    }
		}
	    
	    comision.obtenerComision(comisionValue);
		
	   }

	public ServiceCommisionImpl getComision() {
		return comision;
	}

	public void setComision(ServiceCommisionImpl comision) {
		this.comision = comision;
	}

 
}
