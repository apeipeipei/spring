package com.hr.serviceImpl;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.env.Environment;
import org.springframework.core.type.AnnotatedTypeMetadata;

public class DevConditional implements Condition {

	@Override
	public boolean matches(ConditionContext context, AnnotatedTypeMetadata metaData) {
		Environment environment = context.getEnvironment();
		String[] defaultProfiles = environment.getDefaultProfiles();
		return defaultProfiles[0] == "dev"?  true : false;
	}

}
;