package listenerusecase;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.testng.IMethodInstance;
import org.testng.IMethodInterceptor;
import org.testng.ITestContext;

public class MethodInterceptor implements IMethodInterceptor {

	@Override
	public List<IMethodInstance> intercept(List<IMethodInstance> methods, ITestContext arg1) {
		
		List<IMethodInstance>testcases=new ArrayList<>();
			
		for(IMethodInstance method:methods)
		{
			
			try 
			{
				for(LinkedHashMap<String, String>testdetails:ExcelReader.readData())
				{
					if(method.getMethod().getMethodName().equalsIgnoreCase(testdetails.get("Name")))
					{
						if(testdetails.get("Execute").equalsIgnoreCase("Yes"))
						{
							method.getMethod().setPriority(Integer.parseInt(testdetails.get("Priority")));
							method.getMethod().setInvocationCount(Integer.parseInt(testdetails.get("InvocationCount")));
							testcases.add(method);
						}
						
						
						
					}
				}
			}
			catch (IOException e) 
			{
				e.printStackTrace();
			}
			
				
		}
		
		
		
		return testcases;
	}

}
