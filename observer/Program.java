package ru.geekbrains.oop.lesson7.observer;

public class Program {

    /**
     *  TODO: Доработать приложение, которое разрабатывалось на семинаре,
     *  поработать с шаблоном проектирования Observer,
     *  добавить новый тип соискателя.
     *  Добавить новую сущность "Вакансия", компания должна рассылать вакансии.
     *  Только после этого вы можете усложнить ваше приложение (при желании), например,
     *  добавить тип вакансии (enum),
     *  учитывать тип вакансии при отправке предложения соискателю.
     *  ***. Добавить возможность отписаться от рассылки новых вакансий.
     * @param args
     */
    public static void main(String[] args) {

        Publisher publisher = new JobAgency();

        Vacancy worker1 = new Vacancy("Worker", 20000, 70000);
        Vacancy freelancer1 = new Vacancy("Freelancer", 50000, 70000);

        Company google = new Company("Google", publisher);
        Company yandex = new Company("Yandex", publisher);
        Company geekBrains = new Company("GeekBrains", publisher);

        Student student1 = new Student("Студент #1");
        Master master1 = new Master("Мастер #1");
        Master master2 = new Master("Мастер #2");
        Intern intern0 = new Intern("Интерн #1");

        publisher.registerObserver(student1);
        publisher.registerObserver(master1);
        publisher.registerObserver(master2);
        publisher.registerObserver(intern0);

        for (int i = 0; i < 1; i++){
            google.needEmployee(worker1);
            yandex.needEmployee(worker1);
            geekBrains.needEmployee(freelancer1);
        }

    }

}
