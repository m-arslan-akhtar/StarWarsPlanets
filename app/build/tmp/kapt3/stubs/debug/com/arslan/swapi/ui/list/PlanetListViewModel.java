package com.arslan.swapi.ui.list;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\u000e\u001a\u00020\u000fR \u0010\u0005\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R#\u0010\n\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00070\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r\u00a8\u0006\u0010"}, d2 = {"Lcom/arslan/swapi/ui/list/PlanetListViewModel;", "Landroidx/lifecycle/ViewModel;", "repository", "Lcom/arslan/swapi/data/repository/PlanetRepository;", "(Lcom/arslan/swapi/data/repository/PlanetRepository;)V", "_state", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/arslan/swapi/util/Resource;", "", "Lcom/arslan/swapi/data/model/Planet;", "state", "Lkotlinx/coroutines/flow/StateFlow;", "getState", "()Lkotlinx/coroutines/flow/StateFlow;", "fetchPlanets", "", "app_debug"})
@dagger.hilt.android.lifecycle.HiltViewModel
public final class PlanetListViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull
    private final com.arslan.swapi.data.repository.PlanetRepository repository = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.MutableStateFlow<com.arslan.swapi.util.Resource<java.util.List<com.arslan.swapi.data.model.Planet>>> _state = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.StateFlow<com.arslan.swapi.util.Resource<java.util.List<com.arslan.swapi.data.model.Planet>>> state = null;
    
    @javax.inject.Inject
    public PlanetListViewModel(@org.jetbrains.annotations.NotNull
    com.arslan.swapi.data.repository.PlanetRepository repository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.StateFlow<com.arslan.swapi.util.Resource<java.util.List<com.arslan.swapi.data.model.Planet>>> getState() {
        return null;
    }
    
    public final void fetchPlanets() {
    }
}