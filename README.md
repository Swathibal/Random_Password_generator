# Random_Password_generator
Android application which provides secure password

## Abstract
It provides a secure password of certain length specified by the user.

## Application:
It works in an android phone with API level above 19 : Android 4.4 (KitKat)

## Tools & Languages used:
Java, XML, Android Studio, Android SDK

## How does it work?
- It gets input from the user about the required length that the password contains.
- If the length is less than 4 ,it shows to give a length above 4
- Here, the passwords are generated using [SecureRandom](https://developer.android.com/reference/java/security/SecureRandom) class which is cryptographically strong random number generator (RNG). 
- Each password contains atleast 1 uppercase letter, 1 lowercase letter,1 number and 1 special character.
- Here the passwords are generated randomly.
