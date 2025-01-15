package `2_ObjectOrientedProgramming`._66_AbstractClass

// this abstract class we make cant be made into an object, but automatically will be child class

// 1. this abstract class will be automatically open, bcs the functionality of this class just will be inherited
abstract class Location (val name: String)
// 2. this class will be inherit from the abstract class above
class City(name: String) : Location(name)
class Country(name: String) : Location(name)