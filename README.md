# Java Core Project

## New Year Gift — ООП-задача

Учебная задача: спроектировать объектную модель «Новогодний подарок».

## Что демонстрирует

- **Абстрактный класс** `AbstractSweets` — общий контракт для всех сладостей.
- **Наследование** — `Candy`, `Chocolate`, `JellyBean`, `Waffle` наследуют `AbstractSweets`.
- **Интерфейсы** — `SweetsInterface` (что-то сладкое), `GiftInterface` (что-то подарочное).
- **Полиморфизм** — `List<AbstractSweets>` содержит объекты разных типов, каждый выводится по-своему через `getDescription()`.
- **Инкапсуляция** — поля `private final`, доступ через геттеры, валидация в конструкторе.
- **Коллекции** — `List<AbstractSweets>` в `Gift`, стримы для сортировки и поиска.
- **Исключения** — кастомное `InvalidSweetParameterException` при невалидных параметрах.
- **Enum** — `CandiesEnum` для предопределённых конфет.
- **Компаратор** — `SortByCalories` для сортировки по калорийности.

## Предметная область

Программа:
1. Создаёт объекты разных типов конфет.
2. Собирает детский подарок.
3. Считает общий вес подарка (с упаковкой и без).
4. Сортирует сладости по калорийности.
5. Ищет сладости по диапазону калорий и веса.
6. Находит сладость по имени.

## Запуск

```bash
mvn clean test    # юнит-тесты

mvn compile exec:java -Dexec.mainClass="app.Main"  # демо
```

Или просто запусти `Main.java` в IDE.

## Структура

```
src/main/java/
├── interfaces/      # SweetsInterface, GiftInterface
├── gift/            # Gift
├── sweets/          # AbstractSweets, Candy, Chocolate, JellyBean, Waffle, CandiesEnum
├── exceptions/      # InvalidSweetParameterException
├── utils/           # SortByCalories
├── report/          # Report
└── app/             # Main
```