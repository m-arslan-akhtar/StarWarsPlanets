# SWAPIAssessment

Android app scaffold that lists Star Wars planets using SWAPI and Picsum photos.


The app uses **MVVM** with **Hilt** for dependency injection, **Retrofit** for network,
and **Jetpack Compose** for the list screen with a traditional XML fragment for details.

### Key Layers
- **UI Layer:** Compose List + XML Details Fragment
- **ViewModel:** Manages UI state via Kotlin Flows
- **Repository:** Fetches data from SWAPI using Retrofit
- **DI (Hilt):** Provides repository and network instances

## Trade-offs & Decisions
- Chose **Compose for List** + **XML for Details** to demonstrate hybrid UI interoperability.
- Skipped full **Room caching** for simplicity; the repository can easily add it.
- No SafeArgs navigation (manual navigation via fragment manager for brevity).
- Basic ViewModel & Repository unit tests included; UI tests omitted for time.
- Retrofit with coroutines chosen for simplicity over Flow-based paging.

## Testing
- ViewModel tests ensure both success and failure scenarios.
- Repository tested using Mockito stubbing.
- Coroutine TestDispatcher used for deterministic results.

## How to Run
1. Open in Android Studio (latest stable)
2. Sync Gradle (Gradle 8.7+, Kotlin 1.9.10)
3. Run on an emulator/device with internet
4. Tap a planet → see details page


## Notes
- compose list + xml fragment details as required.
- Version catalog used: gradle/libs.versions.toml
- targetSdk 35, minSdk 24