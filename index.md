# Simulation of Multiple Bus Architecture

## Technology Stack
Java Swing, Java Applets

## Introduction
This project is used to demonstrate the execution of assembly level instructions in multiple bus architecture, using a Java-based animation. An interactive diagram of the multiple bus architecture system is implemented using Java Swing and applets. Two instructions are executed using the diagram and an animated, moving controller. The two instructions are: 
1) MOV (R2), R1 
2) ADD R4, R5, R6. 
The controller traces the path of the instructions to explicitly display each step of the command sequence specified. 

## Description
On running the program, a window with two buttons, containing the ADD and the MOV instruction respectively, is displayed. Upon clicking one of the buttons, the execution of the command sequence corresponding to the assembly level instruction, is demonstrated. A clear, descriptive diagram of multiple bus architecture appears, drawn using Java applets and the paint method. Using the paint functions- drawLine, drawRect and drawPolygon, the figure and all its components are displayed, along with an animated controller represented by a small ball. The animation is designed using Java Swing. The actionListener is used to change the coordinates of the controller so that it would trace the instruction path for every step of the command sequence. Moreover, a timer is included which pauses the controller for a period of ten seconds before it performs the next step. Furthermore, before every step in the instruction sequence is performed by the controller, an audio explains the corresponding step. This informs the user of the step being performed and contributes to making the simulation more user friendly.

## Application
Through this simulation, the user can develop a clear visual and conceptual understanding of the structure of Multiple Bus Architecture. The user will also be able to perceive the path of the movement of data during the execution of the control sequence of the provided assembly level instructions.

### Main Window
![1](https://raw.githubusercontent.com/yashprash/Multiple-Bus-Architecture/gh-pages/1.png)

### ADD R4,R5,R6 Instruction
![2](https://raw.githubusercontent.com/yashprash/Multiple-Bus-Architecture/gh-pages/2.png)

![3](https://raw.githubusercontent.com/yashprash/Multiple-Bus-Architecture/gh-pages/3.png)

### MOV (R1),R2 Instruction
![4](https://raw.githubusercontent.com/yashprash/Multiple-Bus-Architecture/gh-pages/4.png)

![5](https://raw.githubusercontent.com/yashprash/Multiple-Bus-Architecture/gh-pages/5.png)
