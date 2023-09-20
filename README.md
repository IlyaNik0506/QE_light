ПРОСТАЯ ЗАГЛУШКА КОНВЕРТАТОР 
использовано
  1.springframework
Описание:
  Простая заглушка, которая получает post запрост (в формате json) со значением количесва RUB
  Высчитывает исходя из запроса количество USD котрое получит пользователь 
  В ответе получаем json ответ с количеством RUB и сколько USD мы получим из этих рублей(Курс обменника статичен и   равняется 100р за доллар)
Правила запуска:
  компилируем и запускаем java приложение 
  отправлем POST запрос в формате json 
  Пример:
        POST http://localhost:8080/convert
        Content-Type: application/json
        {"rub": 10000}
  Получаем ответ в формате json 
  Пример:
        HTTP/1.1 200 
        Content-Type: application/json
        Transfer-Encoding: chunked
        Date: Wed, 20 Sep 2023 19:53:32 GMT
        Keep-Alive: timeout=60
        Connection: keep-alive

        {
          "rub": 10000,
          "usd": 100
        }

