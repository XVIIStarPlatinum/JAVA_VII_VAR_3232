# Threadmorber: if TCPlatinum could fly

[![CodeFactor](https://www.codefactor.io/repository/github/xviistarplatinum/java_vii_var_3232/badge)](https://www.codefactor.io/repository/github/xviistarplatinum/java_vii_var_3232)
___

## Лабораторная работа `#7`

<p align="center">
    <img src="https://media.giphy.com/media/v1.Y2lkPTc5MGI3NjExNGM2enl5ajNuczh2cjNjdzlmZ2tzM2VxNXk5a3lvYjZ3OXl0bmk4cyZlcD12MV9pbnRlcm5hbF9naWZfYnlfaWQmY3Q9Zw/h9rBcBywX895S/giphy.gif"  alt="DB and Multithreading"/>
</p>

### `Вариант 3232`

## Результат: ${\color{green}?\\%}$

## _Внимание! У разных вариантов разный текст задания!_

## Доработать [программу из лабораторной работы №6](https://github.com/XVIIStarPlatinum/JAVA_VI_VAR_543534) следующим образом:

1. Организовать хранение коллекции в реляционной СУБД (PostgreSQL). Убрать хранение коллекции в файле.
2. Для генерации поля id использовать средства базы данных (sequence).
3. Обновлять состояние коллекции в памяти только при успешном добавлении объекта в БД.
4. Все команды получения данных должны работать с коллекцией в памяти, а не в БД.
5. Организовать возможность регистрации и авторизации пользователей. У пользователя есть возможность указать пароль.
6. Пароли при хранении хэшировать алгоритмом `SHA-1`.
7. Запретить выполнение команд не авторизованным пользователям.
8. При хранении объектов сохранять информацию о пользователе, который создал этот объект.
9. Пользователи должны иметь возможность просмотра всех объектов коллекции, но модифицировать могут только принадлежащие им.
10. Для идентификации пользователя отправлять логин и пароль с каждым запросом.

## **Необходимо реализовать многопоточную обработку запросов.**

1. Для многопоточного чтения запросов использовать `создание нового потока (java.lang.Thread)`.
2. Для многопоточной обработки полученного запроса использовать `ForkJoinPool`.
3. Для многопоточной отправки ответа использовать `Cached thread pool`.
4. Для синхронизации доступа к коллекции использовать `синхронизацию чтения и записи с помощью java.util.concurrent.locks.ReentrantLock`.

## **Порядок выполнения работы:**

В качестве базы данных использовать PostgreSQL.
Для подключения к БД на кафедральном сервере использовать хост `pg`, имя базы данных - `studs`, имя пользователя/пароль совпадают с таковыми для подключения к серверу.

## **Отчёт по работе должен содержать:**

1. Текст задания.
2. Диаграмма классов разработанной программы.
3. Исходный код программы.
4. Выводы по работе.

## **Вопросы к защите лабораторной работы:**

1. Многопоточность. Класс `Thread`, интерфейс `Runnable`. Модификатор `synchronized`.
2. Методы `wait()`, `notify()` класса `Object`, интерфейсы `Lock` и `Condition`.
3. Классы-синхронизаторы из пакета `java.util.concurrent`.
4. Модификатор `volatile`. Атомарные типы данных и операции.
5. Коллекции из пакета `java.util.concurrent`.
6. Интерфейсы `Executor`, `ExecutorService`, `Callable`, `Future`.
7. Пулы потоков.
8. JDBC. Порядок взаимодействия с базой данных. Класс `DriverManager`. Интерфейс `Connection`.
9. Интерфейсы `Statement`, `PreparedStatement`, `ResultSet`, `RowSet`.
10. Шаблоны проектирования.

___

### Диаграмма классов: [UML](Lab7-UML.png)
