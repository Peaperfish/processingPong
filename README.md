# Pong

A two-player Pong game in Java, built with the [Processing](https://processing.org) library (2022).

## How to play

- **Player 1** (left paddle) follows the mouse.
- **Player 2** (right paddle) moves with the **↑** and **↓** keys.
- The ball bounces off the top and bottom walls. When it gets past a paddle, the other player scores, and a new ball is served from the centre at a slightly random angle.
- Scores are shown at the top of the screen.

## Running it

1. Open the folder in IntelliJ IDEA. `core.jar` (Processing's core library) is included, and `Processing.iml` adds it to the classpath.
2. Run `main` in `src/pong.java`.

## What I practised

- A game loop with Processing's `setup()` / `draw()`
- Ball movement and wall and paddle collision
- Mouse and keyboard input
- Drawing text and shapes
