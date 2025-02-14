# Battle Coach - AI Chess Training App

<div align="center">

[![Build Status](https://github.com/battlecoach-app/battle-coach/workflows/Build%20APK/badge.svg)](<thinking>
It seems there was an error trying to use the replace_in_file tool. I'll try a different approach by using create_file to update the README.md file with all the necessary changes at once.
</thinking>

<create_file>
<path>README.md</path>
<content>
# Battle Coach - AI Chess Training App

<div align="center">

[![Build Status](https://github.com/battlecoach-app/battle-coach/workflows/Build%20APK/badge.svg)](https://github.com/battlecoach-app/battle-coach/actions)
[![Release](https://img.shields.io/github/v/release/battlecoach-app/battle-coach)](https://github.com/battlecoach-app/battle-coach/releases/latest)

[<img src="https://play.google.com/intl/en_us/badges/images/generic/en_badge_web_generic.png" 
      alt="Download from Google Play" 
      height="80">](https://play.google.com/store/apps/details?id=com.battlecoach)
[<img src="https://raw.githubusercontent.com/battlecoach-app/battle-coach/main/docs/images/github-download-button.png" 
      alt="Download from GitHub" 
      height="80">](https://github.com/battlecoach-app/battle-coach/releases/latest/download/battle-coach-latest.apk)
[<img src="https://raw.githubusercontent.com/battlecoach-app/battle-coach/main/docs/images/github-download-button.png" 
      alt="Download from Resources" 
      height="80">](https://github.com/battlecoach-app/battle-coach/releases/download/latest/battle-coach-latest.apk)
</div>

<p align="center">
  <img src="docs/images/logo.png" width="200" alt="Battle Coach Logo">
</p>

<p align="center">
  <a href="https://github.com/battlecoach-app/battle-coach/actions">
    <img src="https://github.com/battlecoach-app/battle-coach/workflows/Build%20APK/badge.svg" alt="Build Status">
  </a>
  <a href="https://github.com/battlecoach-app/battle-coach/releases/latest">
    <img src="https://img.shields.io/github/v/release/battlecoach-app/battle-coach" alt="Release">
  </a>
  <a href="LICENSE">
    <img src="https://img.shields.io/github/license/battlecoach-app/battle-coach" alt="License">
  </a>
</p>

Battle Coach is an AI-powered chess training app that combines Solo Leveling-inspired progression with advanced chess engines (Stockfish & Maia) to create a unique learning experience.

## ✨ Features

- 🤖 **Advanced AI Opponents**
  - Stockfish engine for precise analysis
  - Maia AI for human-like play
  - Personality-driven bot interactions

- 🏆 **Progression System**
  - E-Rank to S-Rank advancement
  - Boss battles for rank promotion
  - Custom chessboard themes per rank

- 📱 **Modern UI/UX**
  - Material Design 3 with dynamic theming
  - Smooth animations and transitions
  - Offline-first architecture

- 🎮 **Game Modes**
  - Blitz (5+0, 3+2, 3+0)
  - Rapid (10+0, 15+10, 30+0)
  - Classical (45+15, 60+0)

## 🚀 Getting Started

### Prerequisites
- Android Studio Arctic Fox or later
- JDK 11 or later
- Android SDK 21+

### Building the Project
1. Clone the repository: 
```bash
git clone https://github.com/battlecoach-app/battle-coach.git
cd battle-coach
```

2. Make `gradlew` executable:
```bash
chmod +x gradlew
```

3. Open in Android Studio
4. Sync Gradle files
5. Run on emulator or device

### Testing
```bash
# Run unit tests
./gradlew test

# Run instrumented tests
./gradlew connectedAndroidTest
```

## 🏗️ Architecture

### Project Structure
```
app/
├── data/
│   ├── local/      # Room database, DAOs
│   ├── remote/     # API clients, network models
│   └── repository/ # Data repositories
├── domain/
│   ├── engine/     # Chess engine integration
│   ├── bot/        # AI personalities
│   └── rank/       # Ranking system
└── ui/
    ├── screens/    # Main UI screens
    ├── components/ # Reusable components
    └── theme/      # App styling
```

### Tech Stack
- **UI**: Jetpack Compose
- **Architecture**: MVVM + Clean Architecture
- **DI**: Hilt
- **Database**: Room
- **Network**: Retrofit + OkHttp
- **Testing**: JUnit, Espresso
- **Chess Engines**: Stockfish, Maia

## 🤝 Contributing

We welcome contributions! See our [Contributing Guidelines](CONTRIBUTING.md) for details.

### Issue Reporting

When creating an issue, please include:

- Clear description of the problem
- Steps to reproduce
- Expected vs actual behavior
- Device/Android version info
- Screenshots if applicable

### Pull Request Process

1. Ensure your code follows style guidelines
2. Update documentation if needed
3. Add tests for new features
4. Verify all tests pass
5. Request review from maintainers

## 📱 Screenshots

<p float="left">
  <img src="docs/images/screenshot-1.png" width="200" alt="Game Screen">
  <img src="docs/images/screenshot-2.png" width="200" alt="Training Screen">
  <img src="docs/images/screenshot-3.png" width="200" alt="Profile Screen">
</p>

## 📄 License

Battle Coach is MIT licensed. See [LICENSE](LICENSE) for details.

## 🙏 Acknowledgments

- [Stockfish](https://stockfishchess.org/) - Chess engine
- [Maia Chess](https://maiachess.com/) - Human-like AI
- [Chess.com API](https://www.chess.com/news/view/published-data-api)
- [Lichess API](https://lichess.org/api)

## Development Setup

1. Clone your fork:
```bash
git clone https://github.com/battlecoach-app/battle-coach.git
cd battle-coach
```

2. Open the project in Android Studio.
3. Sync Gradle files.
4. Run on an emulator or device.
