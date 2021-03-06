package <%= appPackage %>.injection.module;

import android.app.Application;
import android.content.Context;

import dagger.Module;
import dagger.Provides;
import <%= appPackage %>.injection.ApplicationContext;

@Module
public class ApplicationModule {
    protected final Application mApplication;

    public ApplicationModule(Application application) {
        mApplication = application;
    }

    @Provides
    Application provideApplication() {
        return mApplication;
    }

    @Provides
    @ApplicationContext
    Context provideContext() {
        return mApplication;
    }
}
