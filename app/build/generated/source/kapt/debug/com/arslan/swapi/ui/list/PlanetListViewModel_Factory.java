package com.arslan.swapi.ui.list;

import com.arslan.swapi.data.repository.PlanetRepository;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@ScopeMetadata
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
public final class PlanetListViewModel_Factory implements Factory<PlanetListViewModel> {
  private final Provider<PlanetRepository> repositoryProvider;

  public PlanetListViewModel_Factory(Provider<PlanetRepository> repositoryProvider) {
    this.repositoryProvider = repositoryProvider;
  }

  @Override
  public PlanetListViewModel get() {
    return newInstance(repositoryProvider.get());
  }

  public static PlanetListViewModel_Factory create(Provider<PlanetRepository> repositoryProvider) {
    return new PlanetListViewModel_Factory(repositoryProvider);
  }

  public static PlanetListViewModel newInstance(PlanetRepository repository) {
    return new PlanetListViewModel(repository);
  }
}
