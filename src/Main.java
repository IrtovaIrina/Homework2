public class Main {
    public static void main(String[] args) {
        //задача 1
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        //задача 2
        dog += 4;
        cat += 4;
        paper += 4;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        //задача 3
        dog -= 3.5;
        cat -= 1.6;
        paper -= 7639;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        //задача 4
        var friend = 19;
        System.out.println(friend);
        friend += 2;
        System.out.println(friend);
        friend /= 7;
        System.out.println(friend);
        //задача 5
        var frog = 3.5;
        System.out.println(frog);
        frog *= 10;
        System.out.println(frog);
        frog /= 3.5;
        System.out.println(frog);
        frog += 4;
        System.out.println(frog);
        //задача 6
        var firstBoxerWeight = 78.2;
        var secondBoxerWeight = 82.7;
        var totalWeight = firstBoxerWeight + secondBoxerWeight;
        var weightDifference = secondBoxerWeight - firstBoxerWeight;
        System.out.println(totalWeight);
        System.out.println(weightDifference);
        //задача 7
        var weightDifference1 = secondBoxerWeight - firstBoxerWeight;
        var weightDifference2 = secondBoxerWeight % firstBoxerWeight;
        System.out.println(weightDifference1);
        System.out.println(weightDifference2);
        //задача 8
        var sharedHours = 640;
        var employeeWorkingHours = 8;
        var employeesNumber = sharedHours / employeeWorkingHours;
        System.out.println("Всего работников в компании - " + employeesNumber + " человек");
        employeesNumber += 94;
        sharedHours = employeesNumber * employeeWorkingHours;
        System.out.println("Если в компании работает " + employeesNumber + " человек, то всего " + sharedHours +" часов работы может быть поделено между сотрудниками");
    }
}