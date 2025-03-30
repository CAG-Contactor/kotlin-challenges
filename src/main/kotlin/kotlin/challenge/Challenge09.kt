package kotlin.challenge

/*
Java:
class Person {
    String name;
    Person(String name) {
        this.name = name;
    }
    void sayHello() {
        System.out.println("Hello " + name);
    }
}
new Person("Alice").sayHello();
*/

/**
 * Uppgift:
 * Skapa en dataklass `Person` med ett namn och en funktion som skriver ut "Hello <namn>".
 */
data class Person(val name: String) {
    // Din funktion här
}

fun challenge09() {
    // Anropa din klass här
}

fun main() {
    challenge09()
}
