# Excavations-Bruteforce
Java program to bruteforce Walker Excavations keypad, but skipping known codes

If you know what the Walker Excavations are, skip to "Customizing to your screen size", otherwise continue reading

## What is this? What are the Walker Excavations?
The Walker Excavations were released a couple weeks ago, and it's a puzzle game that contains many secrets to the world of walker, which is a fictional universe that all of Alan Walker's music videos take place in

In the first room there is a keypad, on which you can type out a code found elsewhere in the level to progress to the next room

At first i thought nothing of this, but a couple weeks after the Walker Excavations were released, Alan Walker hosted a giveaway 

The first one THOUSAND people to find a hidden secret in the first room (a red youtube play button) would get a free hoodie, free shipping and all

This play button was found by entering an alternate code into the aformentioned keypad, 7685

The other day i thought "hey what if there's more?" so i made this, Enjoy!

Here's a demo of this program in action, as of the 20th of february, 2020: https://youtu.be/pEkg3fOQ4cs

Oh, and you can totally use this to bruteforce any other base10 combination lock in any other game super easily

## Where can i try the Walker Excavations for myself?
You can experience the Walker Excavations for yourself at [this webpage](https://experience.alanwalker.no) - your browser will need to be able to run WebGL

From Mozilla: Support for WebGL is present in Firefox 4+, Google Chrome 9+, Opera 12+, Safari 5.1+, Internet Explorer 11+, and Microsoft Edge build 10240+; however, the user's device must also have hardware that supports these features.

## How can i join world of walker?
Look at every piece of text you can find in room 2 of the excavations

## Customizing to your screen size:
If your screen is not 1920x1080 pixels like mine is, you may experience issues in running this application

To fix this open the project settings in IntelliJ and go to artifacts

Here, change the artifact's main module to go to the GetMousePos class

Then hover your mouse over each of the keypad buttons with the program running (preferably with the console window of the program visible)

When the console prints an x and y, move to the next button (any order works)

Take note of which order you held your mouse over the buttons

Copy each of the x and y positions from the console in the order that you held over the buttons, and set them in the switch statement of the Bruteforce class

Now simply go to project settings and set the artifact's main module back to the Bruteforce class and rebuild the program

The newly created jar file will be customized to your screen

I will refine this process to be easier in the future
