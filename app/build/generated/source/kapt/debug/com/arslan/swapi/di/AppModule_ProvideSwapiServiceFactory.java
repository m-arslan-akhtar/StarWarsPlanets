package com.arslan.swapi.di;

import com.arslan.swapi.data.network.SwapiService;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import retrofit2.Retrofit;

@ScopeMetadata("javax.inject.Singleton")
@QualifierMetadata
@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes",
    "KotlinInternal",
    "KotlinInternalInJava"
})
public final class AppModule_ProvideSwapiServiceFactory implements Factory<SwapiService> {
  private final Provider<Retrofit> retrofitProvider;

  public AppModule_ProvideSwapiServiceFactory(Provider<Retrofit> retrofitProvider) {
    this.retrofitProvider = retrofitProvider;
  }

  @Override
  public SwapiService get() {
    return provideSwapiService(retrofitProvider.get());
  }

  public static AppModule_ProvideSwapiServiceFactory create(Provider<Retrofit> retrofitProvider) {
    return new AppModule_ProvideSwapiServiceFactory(retrofitProvider);
  }

  public static SwapiService provideSwapiService(Retrofit retrofit) {
    return Preconditions.checkNotNullFromProvides(AppModule.INSTANCE.provideSwapiService(retrofit));
  }
}
