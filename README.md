## Задание 2 — обязательное

В этой задаче мы считаем, что пользователь вводит корректные значения входных данных.

Один из сотовых операторов решил сделать своим клиентам приятный бонус: если клиент пополняет счёт более чем на 1000 рублей, то сотовый оператор дарит ему по 1 рублю за каждые полные 100 рублей пополнения.

Примеры. Начальные данные: у клиента на счету 100 рублей.
1. Клиент пополнил счёт на 300 рублей — бонусов нет, итоговая сумма на счету клиента — 400 рублей.
2. Клиент пополнил счёт на 1100 рублей — бонус равен 11 рублям, итоговая сумма на счету клиента — 1211 рублей.

Нужно создать приложение, выводящее итоговый счёт и количество бонусных рублей.
Количество денег на текущем счету клиента и сумму пополнения вы выбираете сами — создайте переменные, в которых эти данные будут храниться.

Приложение должно быть написано так, чтобы при замене значений переменных — начальной суммы счёта и суммы пополнения — итоговый счёт и бонусные рубли рассчитывались правильно.

### Схема вашего приложения

```java
public class Main {
  public static void main(String[] args) {
  
    // Объявляете переменные для входных данных и
    // параметров программы: начального счёта, 
    // суммы пополнения и тп
    
    // Условным оператором проверяете, превысила ли
    // сумма пополнения порог, и для этих двух разных
    // сценариев рассчитываете сумму бонуса и выводите
    // на экран.
  }
}
```

------
