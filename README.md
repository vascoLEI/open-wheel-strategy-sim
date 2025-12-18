# Open Wheel Strategy Simulator

A desktop racing strategy simulator inspired by modern open-wheel motorsport.  
The player assumes the role of a race strategist, making real-time decisions on tyre usage, pit stops, and race strategy to maximize race performance.

> **Disclaimer**  
> This project is an independent educational simulation.  
> It is **not affiliated with, endorsed by, or connected to** Formula 1, FIA, or any real-world teams, drivers, or circuits.  
> All entities used in this project are fictional.

---

##  Project Objective
The goal of this project is to design and implement a **rule-based race simulation engine** that models strategic decision-making in open-wheel motorsport, focusing on:
- tyre degradation
- pit stop timing
- stochastic race events
- AI-driven opponent strategies

This project is intended for **academic and portfolio purposes**, demonstrating software engineering principles, simulation modeling, and clean architecture in Java.

---

##  Core Features
- Lap-by-lap race simulation
- Tyre compounds with degradation models
- Pit stop strategy and time loss
- Race events (incidents, cautions – planned)
- AI opponents with different strategic profiles
- Deterministic simulation via seeded randomness
- JavaFX graphical interface (planned)

---

##  Tech Stack
- **Java**
- **Maven** (dependency & build management)
- **JavaFX** (desktop UI – planned)
- **JUnit** (testing – planned)

---

## Architecture Overview
The application follows a layered architecture with clear separation of concerns:

domain/ → Core entities (Driver, Car, Tyre, Track, RaceState)  
engine/ → Race simulation logic (laps, pits, events)  
strategy/ → Strategy decision models (player + AI)  
ui/ → JavaFX interface and controllers  
persistence/ → Save/Load and replay mechanisms


Design principles applied:
- Single Responsibility Principle
- Strategy Pattern (AI behaviors)
- Observer/Event-Driven architecture (engine → UI)

---

##  Roadmap
- [ ] Core domain model
- [ ] Lap timing and tyre degradation engine
- [ ] Pit stop logic
- [ ] Event system (incidents, cautions)
- [ ] AI strategy profiles
- [ ] JavaFX live race UI
- [ ] Save / Load race states
- [ ] Replay mode

---

## Developer
**Vasco Azevedo**  
Student in Informatics Engineering – ISEP

- GitHub: https://github.com/vascoLEI
- Interests: Software Engineering, Simulation Systems, Game Logic, Java, Algorithms

---


