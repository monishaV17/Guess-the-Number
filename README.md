# Number Guessing Game 🎯

A fun and interactive Java project that implements a classic number guessing game with enhanced features!

## 🎮 Game Description

The Number Guessing Game is a short Java project that allows the user to guess a randomly generated number by the computer. The game involves the following core mechanics:

### Core Game Steps:
1. **Random Number Generation**: The system generates a random number from 1 to 100
2. **User Input**: The user is prompted to enter their guess in the console
3. **Feedback System**: The computer tells if the entered number matches the target number or if it's higher/lower
4. **Game Continuation**: The game continues until the user guesses the number correctly

### Enhanced Features:
- ✅ **Attempt Limiting**: Players have a maximum of 7 attempts per round
- ✅ **Multiple Rounds**: Play as many rounds as you want
- ✅ **Scoring System**: Points awarded based on the number of attempts used
- ✅ **Score Display**: Real-time score tracking and final statistics
- ✅ **Performance Rating**: Get rated based on your average performance

## 🚀 How to Run

### Prerequisites:
- Java Development Kit (JDK) 8 or higher
- A terminal or command prompt

### Running the Game:
1. **Compile the Java file:**
   ```bash
   javac NumberGuessingGame.java
   ```

2. **Run the game:**
   ```bash
   java NumberGuessingGame
   ```

## 🎯 How to Play

1. **Start the Game**: Run the program and you'll see a welcome message
2. **Read Instructions**: The game will explain the rules and number range
3. **Make Your Guess**: Enter a number between 1 and 100
4. **Get Feedback**: The game will tell you if your guess is too high, too low, or correct
5. **Track Attempts**: You have 7 attempts to guess the correct number
6. **Score Points**: Earn points based on how quickly you guess correctly
7. **Play Multiple Rounds**: Choose to play again for more fun!

## 📊 Scoring System

- **Base Score**: 100 points per round
- **Penalty**: -10 points for each extra attempt beyond the first
- **Minimum Score**: 0 points (if you don't guess correctly)

### Score Examples:
- **1 attempt**: 100 points (Perfect!)
- **2 attempts**: 90 points
- **3 attempts**: 80 points
- **4 attempts**: 70 points
- **5 attempts**: 60 points
- **6 attempts**: 50 points
- **7 attempts**: 40 points

## 🏆 Performance Ratings

Based on your average score per round:
- **80+ points**: 🌟 EXCELLENT! 🌟
- **60-79 points**: ⭐ GREAT! ⭐
- **40-59 points**: 👍 GOOD! 👍
- **20-39 points**: 👌 OKAY! 👌
- **Below 20**: 💪 KEEP PRACTICING! 💪

## 🎨 Features

- **User-Friendly Interface**: Clear prompts and colorful output
- **Input Validation**: Handles invalid inputs gracefully
- **Error Handling**: Robust error checking for edge cases
- **Statistics Tracking**: Detailed game statistics and performance metrics
- **Replayability**: Play multiple rounds with cumulative scoring
- **Visual Feedback**: Emojis and formatting for better user experience

## 🔧 Technical Details

- **Language**: Java
- **Number Range**: 1-100 (configurable via constants)
- **Max Attempts**: 7 per round (configurable)
- **Random Generation**: Uses Java's `Random` class
- **Input Method**: Console-based input using `Scanner`

## 📁 Project Structure

```
number_guessing_game/
├── NumberGuessingGame.java    # Main game implementation
└── README.md                   # This documentation
```

## 🎯 Game Flow Example

```
🎯 Welcome to the NUMBER GUESSING GAME! 🎯
==========================================
I'm thinking of a number between 1 and 100
You have 7 attempts to guess it!
Good luck! 🍀

🎲 Round 1 - Let's begin!
Attempt 1/7 - Enter your guess (1-100): 50
📈 Too low! The number is higher than 50
💡 You have 6 attempt(s) remaining

Attempt 2/7 - Enter your guess (1-100): 75
📉 Too high! The number is lower than 75
💡 You have 5 attempt(s) remaining

Attempt 3/7 - Enter your guess (1-100): 63
🎉 Congratulations! You guessed it right!
🎯 The number was: 63
📈 You used 3 attempt(s)
⭐ Round Score: 80 points
```

## 🎮 Enjoy the Game!

Have fun playing the Number Guessing Game! Challenge yourself to get the highest score possible and see how many rounds you can play. The game is perfect for practicing logical thinking and number estimation skills.

**Happy Guessing!** 🎯✨
