package com.kickstarter;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {InternalDebugApplicationModule.class})
public interface ApplicationComponent extends ApplicationGraph {
}