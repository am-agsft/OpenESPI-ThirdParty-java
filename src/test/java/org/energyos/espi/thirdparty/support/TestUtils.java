/*
 * Copyright 2013, 2014, 2015 EnergyOS.org
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */

package org.energyos.espi.thirdparty.support;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;

import javax.validation.constraints.Size;

@SuppressWarnings("rawtypes")
public class TestUtils {

	public static void assertAnnotationPresent(Class clazz, String fieldName,
			Class annotationClass) {
		if (getAnnotation(clazz, fieldName, annotationClass) == null)
			throw new AssertionError(String.format(
					"'%s' annotation is missing for field '%s'",
					annotationClass.getCanonicalName(), fieldName));
	}

	public static void assertAnnotationPresent(Class clazz,
			Class annotationClass) {
		if (getAnnotation(clazz, annotationClass) == null)
			throw new AssertionError(String.format(
					"'%s' annotation is missing for class '%s'",
					annotationClass.getCanonicalName(), clazz));
	}

	public static void assertSizeValidation(Class clazz, String fieldName,
			int min, int max) {
		assertAnnotationPresent(clazz, fieldName, Size.class);

		Annotation annotation = getAnnotation(clazz, fieldName, Size.class);

		int minValue = ((Size) annotation).min();
		if (min != minValue)
			throw new AssertionError(String.format(
					"@Size annotation minimum does not match expected '%s'",
					min));

		int maxValue = ((Size) annotation).max();
		if (max != maxValue)
			throw new AssertionError(String.format(
					"@Size annotation maximum does not match expected '%s'",
					max));
	}

	private static Annotation getAnnotation(Class clazz, String fieldName,
			Class annotationClass) {
		Field field;

		try {
			field = clazz.getDeclaredField(fieldName);
		} catch (NoSuchFieldException e) {
			throw new AssertionError(String.format(
					"'%s' is missing field '%s'", clazz.getCanonicalName(),
					fieldName));
		}

		Annotation[] annotations = field.getAnnotations();
		return findAnnotation(annotationClass, annotations);
	}

	private static Annotation getAnnotation(Class clazz, Class annotationClass) {
		Annotation[] annotations = clazz.getAnnotations();

		return findAnnotation(annotationClass, annotations);
	}

	private static Annotation findAnnotation(Class annotationClass,
			Annotation[] annotations) {
		Annotation foundAnnotation = null;

		for (Annotation annotation : annotations) {
			if (annotation.annotationType().equals(annotationClass)) {
				foundAnnotation = annotation;
				break;
			}
		}

		return foundAnnotation;
	}
}
