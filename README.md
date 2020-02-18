# Excavations-Bruteforce
Java program to bruteforce w41k3r excavations keypad, but skipping known codes

## Setting the mouse positions:
If your screen is not 1920x1080 pixels like mine is, you may experience issues in running this application

To fix this open the project settings in IntelliJ and go to artifacts

Here, change the artifact's main module to go to the GetMousePos class

Then hover your mouse over each of the keypad buttons with the program running (preferably with the console window of the program visible)

When the console prints an x and y, move to the next button (any order works)

Take note of which order you held your mouse over the buttons

Copy each of the x and y positions from the console in the order that you held over the buttons, and set them in the switch statement of the Bruteforce class

Now simply go to project settings and set the artifact's main module back to the Bruteforce class and rebuild the program

The newly created jar file will be customized to your screen
