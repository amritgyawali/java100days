package com.java100.day6;

// Abstract class Page
abstract class Page {
    // Abstract methods to be implemented by subclasses
    abstract void load();
    abstract void render();
}

// Interface Clickable with a method click()
interface Clickable {
    void click();
}

// HomePage class extends Page and implements Clickable
class HomePage extends Page implements Clickable {
    @Override
    void load() {
        System.out.println("Loading the homepage...");
    }

    @Override
    void render() {
        System.out.println("Rendering the homepage...");
    }

    @Override
    public void click() {
        System.out.println("Clicked on the homepage!");
    }
}

// LoginPage class extends Page and implements Clickable
class LoginPage extends Page implements Clickable {
    @Override
    void load() {
        System.out.println("Loading the login page...");
    }

    @Override
    void render() {
        System.out.println("Rendering the login page...");
    }

    @Override
    public void click() {
        System.out.println("Clicked on the login page!");
    }
}

// SignUpPage class extends Page and implements Clickable
class SignUpPage extends Page implements Clickable {
    @Override
    void load() {
        System.out.println("Loading the sign-up page...");
    }

    @Override
    void render() {
        System.out.println("Rendering the sign-up page...");
    }

    @Override
    public void click() {
        System.out.println("Clicked on the sign-up page!");
    }
}

// Main class to demonstrate the application framework
public class Exercise {
    public static void main(String[] args) {
        // Create instances of different pages
        Page homePage = new HomePage();
        Page loginPage = new LoginPage();
        Page signUpPage = new SignUpPage();

        // Simulate loading and rendering the pages
        homePage.load();
        homePage.render();

        loginPage.load();
        loginPage.render();

        signUpPage.load();
        signUpPage.render();

        // Demonstrate clicking behavior
        Clickable clickableHomePage = (Clickable) homePage;
        Clickable clickableLoginPage = (Clickable) loginPage;
        Clickable clickableSignUpPage = (Clickable) signUpPage;

        clickableHomePage.click();
        clickableLoginPage.click();
        clickableSignUpPage.click();
    }
}
