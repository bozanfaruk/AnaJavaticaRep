package anajavatica.annotation;

import java.lang.reflect.Method;

@SuppressWarnings("javadoc")
public class AnnotationMain {

	public static void main(String[] args) {

		ClassAnnotation[] caList = CustomAnn.class.getAnnotationsByType(ClassAnnotation.class);
		for (ClassAnnotation ca : caList)
			System.out.println(ca.IDE());

		for (Method method : CustomAnn.class.getDeclaredMethods()) {
			MethodAnnotation[] maList = method.getAnnotationsByType(MethodAnnotation.class);
			for (MethodAnnotation ma : maList)
				System.out.println(ma.author() + " - " + ma.rate());
		}
	}

}
