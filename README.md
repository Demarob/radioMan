# Задание 1. Радиоман (обязательное к выполнению)

Проект "Умный дом" развивается и было решено улучшить часть, отвечающую за Радио.

Что нужно сделать: внедрить изменения в сам класс и тесты.



* Создайте в Git в том же репозитории новую ветку: flexible (возьмите проект к ДЗ про радио, в который уже подключен CI и нужные плагины)
* Модифицируете класс `Radio` под новые требования
* Делаете тест-дизайн новой версии класса, модифицируете или добавляете новые тесты
* Пушите всё на Github и делаете Pull Request (мёржить его НЕ НУЖНО!)
* Удостоверьтесь, что все тесты в CI запускаются на Pull Request и проходят
* Ссылку на Pull Request пришлите в качестве результата ДЗ.

Требования к работе с радиостанциями:

1. Можно задавать **количество радиостанций** при создании объекта (по умолчанию - 10).
1. Номер текущей радиостанции изменяется в пределах от 0 до количества радиостанций невключительно (т.е. если станций 10, то номер последней - 9).
1. Если текущая радиостанция - максимальная, и клиент нажал на кнопку next (следующая) на пульте, то текущей должна стать 0-ая.
1. Если текущая радиостанция - 0, и клиент нажал на кнопку prev (предыдущая) на пульте, то текущей должна стать максимальная.
1. Всё также должен присутствовать сеттер текущей станции.



ВНИМАНИЕ: конструктором с параметром задаётся именно количество радиостанций, а не номер максимальной, это разные вещи - если станций 10 (количество), то последней будет 9 (номер максимальной), тк нумеруем с нуля.


