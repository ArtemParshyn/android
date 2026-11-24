# Яндекс Практикум — «Введение в программирование, Kotlin»

## Scope

Keep / merge course solutions from **topic 4 onward** (`04-strings-functions`, `05-conditionals`, `06-loops`, `07-arrays`). Topics 02–03 were dropped from open PRs by request.

Решения практических задач и конспекты кода из уроков.

- Файлы `*-lesson*.kt` — блоки из теории (не обязательно компилируются целиком).
- Файлы `*-practice-*` — решения задач; прошли проверку на платформе.

Заметки: в 05-03 тренажёр использует Java (`05-03-practice-hamlet.java`);
в 06-01 ожидаемый ответ 377 (Фибоначчи, 12 итераций); в 07-03-practice-2 нужен `mapValues()`.
Тема 7, урок 6/6 — анкета обратной связи, не заполнялась.

## Layout

```
kotlin-intro/
  NN-<slug>/     # one folder per урок/тема (lesson)
    *.kt
```

- One git branch / PR per урок (e.g. `06-loops`, `07-arrays`)
- Not per sprint; not per small assignment inside a lesson
- Do not force-push `main`
