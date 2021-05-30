package listeners;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.testng.IMethodInstance;
import org.testng.IMethodInterceptor;
import org.testng.ITestContext;
import org.testng.annotations.Test;

public class PriorityInterceptor implements IMethodInterceptor {

	@Override
	public List<IMethodInstance> intercept(List<IMethodInstance> methods, ITestContext arg1) {
		List<IMethodInstance> result = new ArrayList<IMethodInstance>();
		for (IMethodInstance method : methods) {
			Set<String>groups=new HashSet<>();
			Test testMethod = method.getMethod().getConstructorOrMethod().getMethod().getAnnotation(Test.class);
			for(String groupname:testMethod.groups())
			{
				groups.add(groupname);
			}
					
			if (testMethod.priority() ==2 && (groups.contains("regression")|| groups.contains("smoke"))) {
				result.add(method);
			}
		}
		return result;	}

}
