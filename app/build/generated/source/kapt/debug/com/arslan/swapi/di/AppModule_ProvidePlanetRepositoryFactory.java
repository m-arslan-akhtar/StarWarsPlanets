package com.arslan.swapi.di;

import com.arslan.swapi.data.network.SwapiService;
import com.arslan.swapi.data.repository.PlanetRepository;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

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
public final class AppModule_ProvidePlanetRepositoryFactory implements Factory<PlanetRepository> {
  private final Provider<SwapiService> serviceProvider;

  public AppModule_ProvidePlanetRepositoryFactory(Provider<SwapiService> serviceProvider) {
    this.serviceProvider = serviceProvider;
  }

  @Override
  public PlanetRepository get() {
    return providePlanetRepository(serviceProvider.get());
  }

  public static AppModule_ProvidePlanetRepositoryFactory create(
      Provider<SwapiService> serviceProvider) {
    return new AppModule_ProvidePlanetRepositoryFactory(serviceProvider);
  }

  public static PlanetRepository providePlanetRepository(SwapiService service) {
    return Preconditions.checkNotNullFromProvides(AppModule.INSTANCE.providePlanetRepository(service));
  }
}
