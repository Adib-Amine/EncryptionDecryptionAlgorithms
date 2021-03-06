##### Description

Write a program that reads an English message and an integer number (**key**) from the standard input and shifts each letter by the specified number according to its order in the alphabet. If you reach the end of the alphabet, start back at the beginning (**a** follows **z**).

The English alphabet is below:

    abcdefghijklmnopqrstuvwxyz

The program should not modify non-letter characters.

The key is assumed to mean that if a person knows the value of the key, they will be able to decrypt the text, and if they do not know, they will not be able to decrypt the text. It's like a real key that can open up access to the message text.

**Note,** key is just a special parameter that controls the behavior of our encryption algorithm. See the picture below for more information.

![](https://ucarecdn.com/60ec14dd-7cef-4895-b147-8115e83c533e/)

**The encryption process**

##### Input example

    welcome to hyperskill
    5

##### Output example

    bjqhtrj yt mdujwxpnqq