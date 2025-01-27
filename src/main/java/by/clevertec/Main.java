package by.clevertec;

import by.clevertec.model.*;
import by.clevertec.util.Util;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
        task9();
        task10();
        task11();
        task12();
        task13();
        task14();
        task15();
        task16();
        task17();
        task18();
        task19();
        task20();
        task21();
        task22();
    }

    public static void task1() {
        List<Animal> animals = Util.getAnimals();
//        animals.stream()
//                .filter(animal -> animal.getAge() >= 10 && animal.getAge() <= 20)
//                .sorted(Comparator.comparingInt(Animal::getAge))
//                .skip(14)
//                .limit(7)
//                .forEach(System.out::println);
    }

    public static void task2() {
        List<Animal> animals = Util.getAnimals();
//        animals.stream()
//                .filter(animal -> animal.getOrigin().equals("Japanese") && animal.getGender().equalsIgnoreCase("female"))
//                .map(Animal::getBread)
//                .map(String::toUpperCase)
//                .forEach(System.out::println);
    }

    public static void task3() {
        List<Animal> animals = Util.getAnimals();
//        animals.stream()
//                .filter(animal -> animal.getAge() >= 30)
//                .map(Animal::getOrigin)
//                .distinct()
//                .sorted()
//                .filter(animal -> animal.toLowerCase().startsWith("a"))
//                .forEach(System.out::println);
    }

    public static void task4() {
        List<Animal> animals = Util.getAnimals();

//        System.out.println(
//                animals.stream()
//                .filter(animal -> animal.getGender().equalsIgnoreCase("female"))
//                .count()
//        );
    }

    public static void task5() {
        List<Animal> animals = Util.getAnimals();

//        System.out.println(
//                animals.stream()
//                .filter(animal -> animal.getAge() >= 20 && animal.getAge() <= 30)
//                .anyMatch(animal -> animal.getOrigin().equalsIgnoreCase("Hungarian"))
//        );
    }

    public static void task6() {
        List<Animal> animals = Util.getAnimals();

//        System.out.println(
//                animals.stream()
//                        .allMatch(animal ->
//                                animal.getGender().equalsIgnoreCase("male") ||
//                                        animal.getGender().equalsIgnoreCase("female"))
//        );

    }

    public static void task7() {
        List<Animal> animals = Util.getAnimals();

//        System.out.println(
//                animals
//                        .stream()
//                        .anyMatch(animal -> animal.getOrigin().equalsIgnoreCase("oceania")));
    }

    public static void task8() {
        List<Animal> animals = Util.getAnimals();
//        animals.stream()
//                .sorted(Comparator.comparing(Animal::getBread))
//                .limit(100)
//                .sorted(Comparator.comparingInt(Animal::getAge))
//                .skip(99)
//                .forEach(animal -> System.out.println(animal.getAge()));
    }

    public static void task9() {
        List<Animal> animals = Util.getAnimals();
//        animals.stream()
//                .map(Animal::getBread)
//                .map(String::toCharArray)
//                .sorted(Comparator.comparingInt(animal -> animal.length))
//                .limit(1)
//                .forEach(System.out::println);
    }

    public static void task10() {
        List<Animal> animals = Util.getAnimals();
//        System.out.println(animals.stream().collect(Collectors.summingInt(Animal::getAge)));
    }

    public static void task11() {
        List<Animal> animals = Util.getAnimals();
//        System.out.println(
//                animals.stream()
//                        .filter(animal -> animal.getOrigin().equalsIgnoreCase("Indonesian"))
//                        .collect(Collectors.averagingInt(Animal::getAge))
//        );
    }

    public static void task12() {
//        List<Person> persons = Util.getPersons();
//        persons.stream()
//                .filter(person ->
//                        (LocalDate.now().getYear() - person.getDateOfBirth().getYear()) >= 18
//                                && ((LocalDate.now().getYear() - person.getDateOfBirth().getYear()) <= 27))
//                .sorted(Comparator.comparingInt(Person::getRecruitmentGroup))
//                .limit(200)
//                .forEach(System.out::println);
    }

    public static void task13() {
        List<House> houses = Util.getHouses();
//        Stream<Person> hospital = houses.stream()
//                .filter(house -> Objects.equals(house.getBuildingType(), "Hospital"))
//                .map(House::getPersonList)
//                .flatMap(List::stream);
//
//        Stream<Person> childrenElder = houses.stream()
//                .filter(house -> !house.getBuildingType().equalsIgnoreCase("hospital"))
//                .map(House::getPersonList)
//                .flatMap(List::stream)
//                .filter(person -> (LocalDate.now().getYear() - person.getDateOfBirth().getYear() < 18) || (person.getGender().equalsIgnoreCase("male") && (LocalDate.now().getYear() - person.getDateOfBirth().getYear() >=  63)) || (person.getGender().equalsIgnoreCase("female") && (LocalDate.now().getYear() - person.getDateOfBirth().getYear() >= 58)));
//
//        Stream<Person> others = houses.stream()
//                .filter(house -> !house.getBuildingType().equalsIgnoreCase("hospital"))
//                .map(House::getPersonList)
//                .flatMap(List::stream)
//                .filter(person -> !((LocalDate.now().getYear() - person.getDateOfBirth().getYear() < 18) || (person.getGender().equalsIgnoreCase("male") && (LocalDate.now().getYear() - person.getDateOfBirth().getYear() >=  63)) || (person.getGender().equalsIgnoreCase("female") && (LocalDate.now().getYear() - person.getDateOfBirth().getYear() >= 58))));
//
//        Stream.concat(Stream.concat(hospital, childrenElder), others)
//                .limit(500)
//                .forEach(System.out::println);
    }

    public static void task14() {
//        final double pricePerTon = 7.14;
//        List<Car> cars = Util.getCars();
//        List<Car> turkmenistan = cars.stream()
//                .filter(car -> car.getCarMake().equalsIgnoreCase("Jaguar") || car.getColor().equalsIgnoreCase("White"))
//                .sorted(Comparator.comparing(Car::getCarMake))
//                .toList();
////      turkmenistan.forEach(System.out::println);
//        Integer turkmenistanSumMass = turkmenistan.stream().map(Car::getMass).reduce(0, Integer::sum);
//        System.out.println("turkmenistan mass: " + turkmenistanSumMass + "; Total Price: " + turkmenistanSumMass * pricePerTon);
//
//
//        System.out.println();
//
//        List<Car> uzbekistan = cars.stream()
//                .filter(car -> !turkmenistan.contains(car))
//                .filter(car -> car.getMass() < 1500 && (car.getCarMake().equalsIgnoreCase("BMW") || car.getCarMake().equalsIgnoreCase("Lexus") || car.getCarMake().equalsIgnoreCase("Chrysler") || car.getCarMake().equalsIgnoreCase("Toyota")))
//                .sorted(Comparator.comparing(Car::getCarMake))
//                .toList();
////      uzbekistan.forEach(System.out::println);
//        Integer uzbekistanSumMass = uzbekistan.stream().map(Car::getMass).reduce(0, Integer::sum);
//        System.out.println("uzbekistan mass: " + uzbekistanSumMass + "; Total Price: " + uzbekistanSumMass * pricePerTon);
//
//        System.out.println();
//
//        List<Car> kazakhstan = cars.stream()
//                .filter(car -> !turkmenistan.contains(car))
//                .filter(car -> !uzbekistan.contains(car))
//                .filter(car -> (car.getColor().equalsIgnoreCase("Black") && (car.getMass() >= 4000)) || car.getCarMake().equalsIgnoreCase("BMW") || car.getCarMake().equalsIgnoreCase("GMC") || car.getCarMake().equalsIgnoreCase("Dodge"))
//                .sorted(Comparator.comparing(Car::getCarMake))
//                .toList();
////      kazakhstan.forEach(System.out::println);
//        Integer kazakhstanSumMass = kazakhstan.stream().map(Car::getMass).reduce(0, Integer::sum);
//        System.out.println("Kazakhstan mass: " + kazakhstanSumMass + "; Total Price: " + kazakhstanSumMass * pricePerTon);
//
//        System.out.println();
//
//        List<Car> kyrgyzstan = cars.stream()
//                .filter(car -> !turkmenistan.contains(car))
//                .filter(car -> !uzbekistan.contains(car))
//                .filter(car -> !kazakhstan.contains(car))
//                .filter(car -> (car.getReleaseYear() < 1982) || car.getCarModel().equalsIgnoreCase("Civic") || car.getCarModel().equalsIgnoreCase("Cherokee"))
//                .sorted(Comparator.comparing(Car::getCarMake))
//                .toList();
////      kyrgyzstan.forEach(System.out::println);
//        Integer kyrgyzstanSumMass = kyrgyzstan.stream().map(Car::getMass).reduce(0, Integer::sum);
//        System.out.println("kyrgyzstan mass: " + kyrgyzstanSumMass + "; Total Price: " + kyrgyzstanSumMass * pricePerTon);
//
//        System.out.println();
//
//        List<Car> russia = cars.stream()
//                .filter(car -> !turkmenistan.contains(car))
//                .filter(car -> !uzbekistan.contains(car))
//                .filter(car -> !kazakhstan.contains(car))
//                .filter(car -> !kyrgyzstan.contains(car))
//                .filter(car -> !(car.getColor().equalsIgnoreCase("Yellow") || car.getColor().equalsIgnoreCase("Red") || car.getColor().equalsIgnoreCase("Green") || car.getColor().equalsIgnoreCase("Blue")) || (car.getPrice() >= 40000))
//                .sorted(Comparator.comparing(Car::getCarMake))
//                .toList();
////      russia.forEach(System.out::println);
//        Integer russiaSumMass = russia.stream().map(Car::getMass).reduce(0, Integer::sum);
//        System.out.println("russia mass: " + russiaSumMass + "; Total Price: " + russiaSumMass * pricePerTon);
//
//        System.out.println();
//
//        List<Car> mongolia = cars.stream()
//                .filter(car -> !turkmenistan.contains(car))
//                .filter(car -> !uzbekistan.contains(car))
//                .filter(car -> !kazakhstan.contains(car))
//                .filter(car -> !kyrgyzstan.contains(car))
//                .filter(car -> !russia.contains(car))
//                .filter(car -> car.getVin().endsWith("59"))
//                .sorted(Comparator.comparing(Car::getCarMake))
//                .toList();
////      mongolia.forEach(System.out::println);
//        Integer mongoliaSumMass = mongolia.stream().map(Car::getMass).reduce(0, Integer::sum);
//        System.out.println("mongolia mass: " + mongoliaSumMass + "; Total Price: " + mongoliaSumMass * pricePerTon);
//
//        List<Car> remainingCars = cars.stream()
//                .filter(car -> !turkmenistan.contains(car))
//                .filter(car -> !uzbekistan.contains(car))
//                .filter(car -> !kazakhstan.contains(car))
//                .filter(car -> !kyrgyzstan.contains(car))
//                .filter(car -> !russia.contains(car))
//                .filter(car -> !mongolia.contains(car))
//                .sorted(Comparator.comparing(Car::getCarMake))
//                .toList();
//        remainingCars.forEach(System.out::println);
    }

    public static void task15() {
        List<Flower> flowers = Util.getFlowers();

//        Map<String, Double> collect = flowers.stream()
//                .sorted(Comparator.comparing(Flower::getOrigin).reversed())
//                .sorted(Comparator.comparing(Flower::getPrice).reversed())
//                .sorted(Comparator.comparing(Flower::getWaterConsumptionPerDay).reversed())
//                .filter(flower -> flower.getCommonName().matches("[c-sC-S].*"))
////                .sorted(Comparator.comparing(Flower::getCommonName))
//                .filter(flower -> flower.isShadePreferred() && flower.getFlowerVaseMaterial().stream().anyMatch(x -> Objects.equals(x.toLowerCase(), "steel") || Objects.equals(x.toLowerCase(), "aluminum") || Objects.equals(x.toLowerCase(), "glass")))
//                .collect(Collectors.groupingBy(Flower::getCommonName, Collectors.summingDouble(sum -> sum.getPrice() + sum.getWaterConsumptionPerDay() * 365 * 5)));
//
//        System.out.println(collect);
//
//        System.out.println(collect.values().stream().reduce(0.0, Double::sum));
    }

    public static void task16() {
        List<Student> students = Util.getStudents();
//        students.stream()
//                .filter(student -> student.getAge() <= 18)
//                .sorted(Comparator.comparing(Student::getSurname))
//                .map(student -> student.getSurname() + " " + student.getAge())
//                .forEach(System.out::println);
    }

    public static void task17() {
        List<Student> students = Util.getStudents();
//        students.stream()
//                .map(Student::getGroup)
//                .distinct()
//                .sorted()
//                .forEach(System.out::println);
    }

    public static void task18() {
//        List<Student> students = Util.getStudents();
//        List<Examination> examinations = Util.getExaminations();
//        Map<String, Double> collect = students.stream()
//                .collect(Collectors.groupingBy(
//                        Student::getGroup, // Группировка по группе
//                        Collectors.averagingInt(Student::getAge) // Средний возраст
//                ))
//                .entrySet()
//                .stream()
//                .sorted((e1, e2) -> Double.compare(e2.getValue(), e1.getValue())) // Сортировка по убыванию среднего возраста
//                .collect(Collectors.toMap(
//                        Map.Entry::getKey, // Ключ — группа
//                        Map.Entry::getValue, // Значение — средний возраст
//                        (e1, e2) -> e1, // Если ключи совпадают, выбираем первое значение
//                        LinkedHashMap::new // Сохраняем порядок сортировки
//                ));
//        System.out.println(collect);
    }

    public static void task19() {
//        List<Student> students = Util.getStudents();
//        List<Examination> examinations = Util.getExaminations();
//        List<Examination> passedExams = examinations.stream()
//                .filter(exam -> exam.getExam1() > 4 && exam.getExam2() > 4 && exam.getExam3() > 4)
//                .toList();
//
//        List<Student> passedStudents = students.stream()
//                .filter(student -> passedExams.stream().anyMatch(exam -> exam.getStudentId() == student.getId()))
//                .toList();
//        passedStudents.forEach(System.out::println);
    }

    public static void task20() {
//        List<Student> students = Util.getStudents();
//        List<Examination> examinations = Util.getExaminations();
//        students = students.stream().sorted(Comparator.comparing(Student::getGroup)).toList();
//        students.stream().collect(Collectors.groupingBy(Student::getGroup, Collectors.averagingDouble()));
//        хз бля
    }

    public static void task21() {
        List<Student> students = Util.getStudents();
//        System.out.println(
//                students.stream()
//                        .collect(Collectors.groupingBy(Student::getGroup, Collectors.counting())));
    }

    public static void task22() {
        List<Student> students = Util.getStudents();
//        System.out.println(
//                students.stream()
//                        .sorted(Comparator.comparing(Student::getGroup))
//                        .collect(Collectors.groupingBy(Student::getGroup, Collectors.minBy(Comparator.comparing(Student::getAge))))
//        );
    }
}
