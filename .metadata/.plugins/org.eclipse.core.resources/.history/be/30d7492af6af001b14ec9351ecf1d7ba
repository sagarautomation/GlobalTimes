package listenerusecase;

import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.LinkedHashMap;

import org.testng.IAnnotationTransformer;
import org.testng.IMethodInstance;
import org.testng.annotations.IConfigurationAnnotation;

public class MyAnnotationTransformer implements IAnnotationTransformer {

	@Override
	public void transform(IConfigurationAnnotation annotation, Class testClass, Constructor testConstructor,
			Method testMethod) 
	{
		
		System.out.println(testMethod.getName());
		
	}

}
